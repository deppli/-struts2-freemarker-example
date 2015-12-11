# struts2-freemarker-example
##freemarker结合struts2入门
* 使用freemarker.properties
* 使用freemarker宏

##增加urlrewrite配置
* 原请求地址为localhost:8080/struts2-freemarker/staff/staff_login.action,使用urlrewrite后可使用localhost:8080/struts2-freemarker/login.html
* 注意使用servlet版本(使用2.5以上，支持dispatcher标签)，并且web.xml的struts2的配置必须是:
```
 <filter-mapping>
  <filter-name>struts2</filter-name>
  <url-pattern>/*</url-pattern>
  <dispatcher>REQUEST</dispatcher>   
  <dispatcher>FORWARD</dispatcher> 
 </filter-mapping>
```
     原因是因为urlrewrite通过forward转发请求，所以要让struts2的过滤器接受来自转发的请求

  
