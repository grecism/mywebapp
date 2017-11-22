package com.test.controller.system.buttonrights;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.test.common.base.admin.controller.BaseController;
import com.test.entity.admin.system.Role;
import util.admin.AppUtil;
import util.admin.PageData;
import com.test.common.base.admin.shiro.Jurisdiction;
import util.admin.Tools;
import com.test.service.admin.system.buttonrights.ButtonrightsManager;
import com.test.service.admin.system.button.ButtonManager;
import com.test.service.admin.system.log.LogManager;
import com.test.service.admin.system.role.RoleManager;

/**
 * 
 *<p>Title	: ButtonrightsController</p>
 * @Description	: 按钮权限
 * @author	: admin
 * @date	: 2017年11月21日下午7:08:58
 */
@Controller
@RequestMapping(value="/buttonrights")
public class ButtonrightsController extends BaseController {
	
	String menuUrl = "buttonrights/list.do"; //菜单地址(权限用)
	@Resource(name="buttonrightsService")
	private ButtonrightsManager buttonrightsService;
	@Resource(name="adminRoleService")
	private RoleManager roleService;
	@Resource(name="buttonService")
	private ButtonManager buttonService;
	@Resource(name="logService")
	private LogManager LOG;
	
	/**列表
	 * @throws Exception
	 */
	@RequestMapping(value="/list")
	public ModelAndView list() throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"列表Buttonrights");
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		try {
			String type = pd.getString("type");
			type = Tools.isEmpty(type)?"0":type;
			if(pd.getString("ROLE_ID") == null || "".equals(pd.getString("ROLE_ID").trim())){
				pd.put("ROLE_ID", "1");										//默认列出第一组角色(初始设计系统用户和会员组不能删除)
			}
			PageData fpd = new PageData();
			fpd.put("ROLE_ID", "0");
			List<Role> roleList = roleService.listAllRolesByPId(fpd);			//列出组(页面横向排列的一级组)
			List<Role> roleList_z = roleService.listAllRolesByPId(pd);			//列出此组下架角色
			List<PageData> buttonlist = buttonService.listAll(pd);			//列出所有按钮
			List<PageData> roleFhbuttonlist = buttonrightsService.listAll(pd);	//列出所有角色按钮关联数据
			pd = roleService.findObjectById(pd);								//取得点击的角色组(横排的)
			mv.addObject("pd", pd);
			mv.addObject("roleList", roleList);
			mv.addObject("roleList_z", roleList_z);
			mv.addObject("buttonlist", buttonlist);
			mv.addObject("roleButtonlist", roleFhbuttonlist);
			logger.info(Jurisdiction.getHC());
			mv.addObject("QX",Jurisdiction.getHC());	//按钮权限
			if("2".equals(type)){
				mv.setViewName("system/buttonrights/buttonrights_list_r");
			}else{
				mv.setViewName("system/buttonrights/buttonrights_list");
			}
		} catch(Throwable e){
			logger.error(e.toString(), e);
		}
		return mv;
	}
	
	/**点击按钮处理关联表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/upRb")
	@ResponseBody
	public Object updateRolebuttonrightd()throws Exception{
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "edit")){return null;} //校验权限
		logBefore(logger, Jurisdiction.getUsername()+"分配按钮权限");
		Map<String,String> map = new HashMap<String,String>();
		try {
			PageData pd = new PageData();
			pd = this.getPageData();
			String errInfo = "success";
			if(null != buttonrightsService.findById(pd)){	//判断关联表是否有数据 是:删除/否:新增
				buttonrightsService.delete(pd);		//删除
				LOG.save(Jurisdiction.getUsername(), "删除按钮权限"+pd);
			}else{
				pd.put("RB_ID", this.get32UUID());	//主键
				buttonrightsService.save(pd);		//新增
				LOG.save(Jurisdiction.getUsername(), "新增按钮权限pd"+pd);
			}
			map.put("result", errInfo);
		} catch(Throwable e){
			logger.error(e.toString(), e);
		}
		return AppUtil.returnObject(new PageData(), map);
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format,true));
	}
}
