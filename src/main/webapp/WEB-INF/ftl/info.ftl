<#assign s=JspTaglibs["/WEB-INF/tld/struts-tags.tld"]/>
<#import  "/WEB-INF/ftl/macro.ftl" as omacro/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">  
<html xmlns="http://www.w3.org/1999/xhtml">  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />  
<title>freemarkerDemo</title>  
</head>  
<body>
	<@omacro.head name="${staff.name}"/>
	姓名:${staff.name}
	<br/>
	登录时间:${staff.loginDate?datetime}
	<br/>
	福利：<#list staff.welfare as we>
			${we}&nbsp;
		</#list>
	<@omacro.foot name="${staff.name}"/>
</body>
</html>