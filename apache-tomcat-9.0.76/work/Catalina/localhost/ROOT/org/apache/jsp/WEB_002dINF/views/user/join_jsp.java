/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-10-30 11:47:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1682261928999L));
    _jspx_dependants.put("jar:file:/C:/Users/ehdrm/Desktop/하루방/apache-tomcat-9.0.76/wtpwebapps/harubang/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>하루방</title>\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Noto+Serif+KR:wght@200;300;400;500;600;700;900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js\"></script>\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/reset.css\" rel=\"stylesheet\"/>    \r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/join.css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.4.10/dist/sweetalert2.min.css\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.4.10/dist/sweetalert2.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
 
   String id=(String)request.getSession().getAttribute("id");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("const Toast = Swal.mixin({\r\n");
      out.write("    toast: true,\r\n");
      out.write("    position: 'center-center',\r\n");
      out.write("    showConfirmButton: false,\r\n");
      out.write("    timer: 1000,\r\n");
      out.write("    timerProgressBar: true,\r\n");
      out.write("    didOpen: (toast) => {\r\n");
      out.write("        toast.addEventListener('mouseenter', Swal.stopTimer);\r\n");
      out.write("        toast.addEventListener('mouseleave', Swal.resumeTimer);\r\n");
      out.write("    },\r\n");
      out.write("    didClose: () => {\r\n");
      out.write("\r\n");
      out.write("    	setTimeout(() => {\r\n");
      out.write("    		$(\"#joinPage\").submit();\r\n");
      out.write("        }, 200);\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function idCheck() {\r\n");
      out.write("   if ($(\"#id\").val() == \"\") {\r\n");
      out.write("      var html = \"\";\r\n");
      out.write("      html +=   \"<div>\"\r\n");
      out.write("      html +=   \"<p>아이디를 입력해주세요</p>\"\r\n");
      out.write("      html += \"</div>\"   \r\n");
      out.write("      $(\".textWrap\").html(html);\r\n");
      out.write("      return;\r\n");
      out.write("   }\r\n");
      out.write("   $.ajax({\r\n");
      out.write("      dataType : \"text\",\r\n");
      out.write("      type : \"POST\",\r\n");
      out.write("      url : \"/user\",\r\n");
      out.write("      data : {\r\n");
      out.write("         \"id\" : $(\"#id\").val(),\r\n");
      out.write("      },\r\n");
      out.write("      success : function(result) {\r\n");
      out.write("         if (result == \"F\") {\r\n");
      out.write("            var html = \"\";\r\n");
      out.write("              html +=   \"<div>\"\r\n");
      out.write("              html +=   \"<p>사용가능한 아이디 입니다</p>\"\r\n");
      out.write("              html += \"</div>\"   \r\n");
      out.write("            } else if(result == \"T\") {\r\n");
      out.write("            var html = \"\";\r\n");
      out.write("            html +=   \"<div>\"\r\n");
      out.write("            html +=   \"<p>중복된 아이디 입니다</p>\"\r\n");
      out.write("            html += \"</div>\"   \r\n");
      out.write("         }else if(result == \"\"){\r\n");
      out.write("            var html = \"\";\r\n");
      out.write("            html +=   \"<div>\"\r\n");
      out.write("            html +=   \"<p>아이디를 입력해주세요</p>\"\r\n");
      out.write("            html += \"</div>\"   \r\n");
      out.write("         }\r\n");
      out.write("         $(\".textWrap\").html(html);\r\n");
      out.write("      },\r\n");
      out.write("      error : function(e) {\r\n");
      out.write("         alert(e);\r\n");
      out.write("      }\r\n");
      out.write("   })\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function joinStart(){\r\n");
      out.write("   if ($(\"#id\").val() ==\"\") {\r\n");
      out.write("      var html = \"\";\r\n");
      out.write("	   html +=   \"<div>\"\r\n");
      out.write("	   html +=   \"<p>아이디를 입력해주세요</p>\"\r\n");
      out.write("	   html += \"</div>\"   \r\n");
      out.write("	   $(\".textWrap\").html(html);\r\n");
      out.write("      $(\"#id\").focus();\r\n");
      out.write("      return;\r\n");
      out.write("   }\r\n");
      out.write("   if ($(\"#pw\").val() ==\"\") {\r\n");
      out.write("      var html = \"\";\r\n");
      out.write("	   html +=   \"<div>\"\r\n");
      out.write("	   html +=   \"<p>비밀번호를 입력해주세요</p>\"\r\n");
      out.write("	   html += \"</div>\"   \r\n");
      out.write("	   $(\".textWrap\").html(html);\r\n");
      out.write("       $(\"#pw\").focus();\r\n");
      out.write("      return;\r\n");
      out.write("   }\r\n");
      out.write("   if ($(\"#pw2\").val() ==\"\") {\r\n");
      out.write("      var html = \"\";\r\n");
      out.write("	   html +=   \"<div>\"\r\n");
      out.write("	   html +=   \"<p>비밀번호를 입력해주세요</p>\"\r\n");
      out.write("	   html += \"</div>\"   \r\n");
      out.write("	   $(\".textWrap\").html(html);\r\n");
      out.write("      $(\"#pw2\").focus();\r\n");
      out.write("      return;\r\n");
      out.write("   }\r\n");
      out.write("   if ($(\"#pw2\").val() !=$(\"#pw\").val()) {\r\n");
      out.write("      var html = \"\";\r\n");
      out.write("      html +=   \"<div>\"\r\n");
      out.write("      html +=   \"<p>비밀번호가 서로 다릅니다.</p>\"\r\n");
      out.write("      html += \"</div>\"   \r\n");
      out.write("      $(\".textWrap\").html(html);\r\n");
      out.write("      $(\"#pw\").focus();\r\n");
      out.write("      return;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   if ($(\"#name\").val() == \"\") {\r\n");
      out.write("      var html = \"\";\r\n");
      out.write("	   html +=   \"<div>\"\r\n");
      out.write("	   html +=   \"<p>이름을 입력해주세요.</p>\"\r\n");
      out.write("	   html += \"</div>\"   \r\n");
      out.write("	   $(\".textWrap\").html(html);\r\n");
      out.write("         $(\"#name\").focus();\r\n");
      out.write("      return;\r\n");
      out.write("   }\r\n");
      out.write("   if ($(\"#email\").val() == \"\") {\r\n");
      out.write("	   var html = \"\";\r\n");
      out.write("	   html +=   \"<div>\"\r\n");
      out.write("	   html +=   \"<p>이메일을 입력해주세요.</p>\"\r\n");
      out.write("	   html += \"</div>\"   \r\n");
      out.write("	   $(\".textWrap\").html(html);\r\n");
      out.write("      return;\r\n");
      out.write("   }\r\n");
      out.write("   if ($(\"#phone\").val() == \"\") {\r\n");
      out.write("	  var html = \"\";\r\n");
      out.write("	   html +=   \"<div>\"\r\n");
      out.write("	   html +=   \"<p>전화번호를 입력해주세요.</p>\"\r\n");
      out.write("	   html += \"</div>\"   \r\n");
      out.write("	   $(\".textWrap\").html(html);\r\n");
      out.write("      return;\r\n");
      out.write("   }\r\n");
      out.write("   if ($(\"#birthday\").val() == \"\") {\r\n");
      out.write("	   var html = \"\";\r\n");
      out.write("	   html +=   \"<div>\"\r\n");
      out.write("	   html +=   \"<p>생년월일을 입력해주세요.</p>\"\r\n");
      out.write("	   html += \"</div>\"   \r\n");
      out.write("	    $(\".textWrap\").html(html);\r\n");
      out.write("      $(\"#birthday\").focus();\r\n");
      out.write("      return;\r\n");
      out.write("   }\r\n");
      out.write("   Toast.fire({\r\n");
      out.write("	    icon: 'success',\r\n");
      out.write("	    title: '회원가입이 완료되었습니다.',\r\n");
      out.write("	});\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<body oninput=   \"idCheck()\">\r\n");
      out.write("<form action=\"/user/join\" method=\"post\" id=\"joinPage\">\r\n");
      out.write("    <div class=\"joinWrap\">\r\n");
      out.write("        <div class=\"logo\"><a href=\"/\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/logo/logo.png\" alt=\"#\"></a></div>\r\n");
      out.write("        <div class=\"joinBox\">\r\n");
      out.write("            <div class=\"itemBox\">\r\n");
      out.write("                <input id=\"id\" name=\"id\" type=\"text\" placeholder=\"아이디\"><br>\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/icon/user.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"itemBox\">\r\n");
      out.write("                <input id=\"pw\" name=\"pw\" type=\"password\" placeholder=\"비밀번호\" onclick=\"idCheck()\"><br>\r\n");
      out.write("                \r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/icon/password.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"itemBox\">\r\n");
      out.write("                <input id=\"pw2\" name=\"pw2\"type=\"password\" placeholder=\"비밀번호 확인\" onclick=\"idCheck()\"><br>\r\n");
      out.write("                \r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/icon/password.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"itemBox\">\r\n");
      out.write("                <input id=\"email\" name=\"email\" type=\"text\" placeholder=\"비밀번호 분실 시 확인용 이메일\"><br>\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/icon/email.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"textWrap\">\r\n");
      out.write("                <p>* 아이디 : 필수 정보입니다.</p>\r\n");
      out.write("                <p>* 비밀번호 : 필수 정보입니다.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"itemBox\">\r\n");
      out.write("                <input id=\"name\" name=\"name\" type=\"text\" placeholder=\"이름\"><br>\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/icon/user.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"itemBox\">\r\n");
      out.write("                <input id=\"birthday\" name=\"birthday\" type=\"text\" placeholder=\"생년월일 6자리 (예 : 1996-10-15)\"><br>\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/icon/calendars.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"genderBox\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li class=\"gender\"><input type=\"radio\" name=\"gender\" value=\"man\" />남자\r\n");
      out.write("                    <li><input type=\"radio\" name=\"gender\" value=\"women\"/>여자\r\n");
      out.write("                </ul>\r\n");
      out.write("                <!-- <input id=\"male\" type=\"button\" value=\"남자\">\r\n");
      out.write("                <input id=\"female\" type=\"button\" value=\"여자\"> -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"itemBox\">\r\n");
      out.write("                <input id=\"phone\" name=\"phone\" type=\"text\" placeholder=\"(예: 010 5287 4567)\"><br>\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/icon/mobile-phone.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <input type=\"button\" id =\"join\" value=\"회원가입\" onclick=\"joinStart()\">\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("</form>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(\".genderBox li\").click(function(){\r\n");
      out.write("                console.log($(this).index())\r\n");
      out.write("                let i =  $(this).index()\r\n");
      out.write("                $(\".genderBox li\").removeClass(\"active\")\r\n");
      out.write("                $(\".genderBox li\").eq(i).addClass(\"active\")\r\n");
      out.write("            })\r\n");
      out.write("        </script>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
