<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div style="color:red;text-align: center;font-size: 15px;">
    <tfoot>
    <tr>
        <td></td>
        <td style="color: red">总记录数${page.count}&nbsp;&nbsp;</td>
        <td style="color: red">当前第${page.pageNo}页&nbsp;&nbsp;</td>
        <td>每页显示${page.pageSize}条记录&nbsp;&nbsp;</td>
        <td>共<fmt:formatNumber type="number" value="${page.totalPage}"
                               maxFractionDigits="0"/>页&nbsp;&nbsp;</td>
        <td>
            <c:if test="${page.totalPage>1}">
                <a id="firstPage" style=" cursor:pointer" onclick="skipPage(1)">首页</a>
            </c:if>
            <c:if test="${page.pageNo>2 }">
                <a id="backPage" style=" cursor:pointer" onclick="skipPage(${page.pageNo-1})">上一页</a>
            </c:if>
            <c:if test="${page.pageNo<page.totalPage}">
                <a id="nextPage" style=" cursor:pointer" onclick="skipPage(${page.pageNo+1})">下一页</a>
            </c:if>
            <c:if test="${page.totalPage>1}">
                <a id="lastPage" style=" cursor:pointer" onclick="skipPage(${page.totalPage})">尾页</a>
                <input type="text" style="width:45px" value="" name="_pageNum" id="_pageNum"
                       onkeyup="value=value.replace(/[^\d]/g,'')"/>
                <input  type="button" value="go" id="_goPage" onclick="goPointPage()"/>
            </c:if>
        </td>
    </tr>
    </tfoot>
</div>
<script>
    function goPointPage() {
        var currentPage = $("#_pageNum").val();
        var totalPage =${page.totalPage};
        if (currentPage == "") {
            alert("请输入页数!");
            return;
        }
        if (currentPage > totalPage) {
            currentPage = totalPage;
        }
        if (currentPage < 1) {
            currentPage = 1;
        }
        skipPage(currentPage);
    }

    function skipPage(currentPage) {
        console.log(currentPage);
        var form = $("#formList");
        if (form == null) {
            form = $('<form method="post"></form>');
        }
        var url = "${requestScope['javax.servlet.forward.request_uri']}?${pageContext.request.queryString}";
        form.attr('action', url);
        var currentPageHtml = '<input type="hidden" name="pageNo" value="' + currentPage + '"/>';
        console.log(currentPageHtml);
        var pageSizeHtml = '<input type="hidden" name="pageSize" value="${page.pageSize}"/>';
        form.append(pageSizeHtml);
        form.append(currentPageHtml);
        $('body').append(form);
        form.submit();
    }
</script>