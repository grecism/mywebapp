package com.test.controller.system.loginimg;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import util.admin.DelAllFile;
import util.admin.PageData;
import util.admin.PathUtil;
import com.test.common.base.admin.controller.BaseController;
import com.test.common.base.admin.shiro.Jurisdiction;
import com.test.common.base.admin.page.Page;
import com.test.service.admin.system.loginimg.LogInImgManager;
 
/**
 * 
 *<p>Title	: LogInImgController</p>
 * @Description	: 登录页面背景图片
 * @author	: admin
 * @date	: 2017年11月21日下午7:10:47
 */
@Controller
@RequestMapping(value="/loginimg")
public class LogInImgController extends BaseController {
	
	String menuUrl = "loginimg/list.do"; //菜单地址(权限用)
	@Resource(name="loginimgService")
	private LogInImgManager loginimgService;
	
	/**保存
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/save")
	public ModelAndView save() throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"新增LogInImg");
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("LOGINIMG_ID", this.get32UUID());	//主键
		try {
			loginimgService.save(pd);
		} catch (Throwable e) {
			logger.error(e.toString(), e);
		}
		mv.addObject("msg","success");
		mv.setViewName("save_result");
		return mv;
	}
	
	/**删除
	 * @param out
	 * @throws Exception
	 */
	@RequestMapping(value="/delete")
	public void delete(PrintWriter out) throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"删除LogInImg");
		PageData pd = new PageData();
		pd = this.getPageData();
		try {
			pd = loginimgService.findById(pd);
			loginimgService.delete(pd);
		} catch (Throwable e) {
			logger.error(e.toString(), e);
		}
		DelAllFile.delFolder(PathUtil.getClasspath()+ "static/login/images/" + pd.getString("FILEPATH")); //删除文件
		out.write("success");
		out.close();
	}
	
	/**修改
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/edit")
	public ModelAndView edit() throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"修改LogInImg");
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		try {
			loginimgService.edit(pd);
		}catch (Throwable e) {
			logger.error(e.toString(), e);
		}
		mv.addObject("msg","success");
		mv.setViewName("save_result");
		return mv;
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(Page page) throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"列表LogInImg");
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		page.setPd(pd);
		try {
			List<PageData>	varList = loginimgService.list(page);	//列出LogInImg列表
			mv.setViewName("system/loginimg/loginimg_list");
			mv.addObject("varList", varList);
		} catch (Throwable e) {
			logger.error(e.toString(), e);
		}
		mv.addObject("pd", pd);
		mv.addObject("QX",Jurisdiction.getHC());	//按钮权限
		return mv;
	}
	
	/**去新增页面
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/goAdd")
	public ModelAndView goAdd()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		mv.setViewName("system/loginimg/loginimg_edit");
		mv.addObject("msg", "save");
		mv.addObject("pd", pd);
		return mv;
	}	
	
	 /**去修改页面
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/goEdit")
	public ModelAndView goEdit()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		try {
			pd = loginimgService.findById(pd);//根据ID读取
		} catch (Throwable e) {
			logger.error(e.toString(), e);
		}	
		mv.setViewName("system/loginimg/loginimg_edit");
		mv.addObject("msg", "edit");
		mv.addObject("pd", pd);
		return mv;
	}	
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format,true));
	}
}
