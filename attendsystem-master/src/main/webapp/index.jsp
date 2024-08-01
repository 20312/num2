<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.aboluo.attend.pojo.Emp" %>
<%@ page import="org.springframework.ui.Model" %>
<%@ page import="com.sun.org.apache.xpath.internal.operations.Mod" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page isELIgnored="false"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName()
            + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>职员考勤系统</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/jl_zui.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/jl_login.css" media="all">
    <link href="<%=basePath%>css/jl_font-awesome.min.css" rel="stylesheet">
    <style> body { background-image:url(static/assets/imgs/3.gif);}</style>
    <script src="<%=basePath%>js/jl_jquery.js"></script>
    <script src="<%=basePath%>js/jl_verificationNumbers.js" tppabs="<%=basePath%>js/jl_verificationNumbers.js"></script>
    <script src="<%=basePath%>js/jl_Particleground.js" tppabs="<%=basePath%>js/jl_Particleground.js"></script>
    <script>
        $(document).ready(function(e) {
            var counter = 0;
            if (window.history && window.history.pushState) {
                $(window).on('popstate', function () {
                    window.history.pushState('forward', null, '#');
                    window.history.forward(1);
                    //alert("不可回退");
                });
            }

            window.history.pushState('forward', null, '#'); //在IE中必须得有这两行
            window.history.forward(1);
        });
    </script>
</head>
<body>
<div id="main-box"></div>
<div id="main-content">
    <div class="login-body  animated fadeInLeft">
        <div class="login-main pr">
            <%--<c:set var="error" value="${error}" />--%>
            <c:choose>
                <c:when test="${empty error}">
                    <span id="error" style="font-size: 14px; margin-left:35%;color:red;"></span>
                </c:when>
                <c:otherwise>
                    <span id="error" style="font-size: 14px; margin-left:35%;color:red;">${error}</span>
                </c:otherwise>
            </c:choose>
            <form action="${pageContext.request.contextPath}/index" method="post" id="index_form" class="login-form">

                <h3> 职员考勤系统 </h3>
                <h5 style="padding-bottom: 10px"> Management Center staff </h5>
                <!-- 账号登陆 -->
                <div id="MobileBox" class="item-box"  >
                    <div class="input-group user-name"> <span class="input-group-addon"><i class="icon-user"></i></span>
                        <input type="text" name="emp_name" class="form-control" placeholder="用户名/工号">
                    </div>
                    <div class="input-group password"> <span class="input-group-addon"><i class="icon-lock"></i></span>
                        <input type="password" name="password" class="form-control" placeholder="密码">
                    </div>

                    <div class="input-group password">
                        <!-- <input id="J_codetext" style="height: 40px;width: 115px;"  type="text" name="verify" id="verify"  placeholder="请选择身份信息" required> -->
                        <label style="font-size: 15px; color: #f7f6f6;margin-top: 10px;">请选择相应身份信息</label>
                        <select style="width: 110px;float: right;"name="level">
                            <option value="3" style="height: 36px;">职员</option>
                            <option value="2">管理员</option>
                            <option value="1">超级管理员</option>
                        </select>
                    </div>

                    <div class="login_btn_panel" >
                        <button class="btn btn-primary btn-block btn-lg"  type="submit" onClick="validate();">登录</button>

                        <a style="float: right;margin-top: 10px;" href="${pageContext.request.contextPath}/manager/register">没有账号？点击注册</a>
                        <div class="check-tips"></div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
