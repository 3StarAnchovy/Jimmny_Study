/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.24
 * Generated at: 2019-10-30 11:59:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<!-- 뷰포트 -->\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width\" initial-scale=\"1\">\r\n");
      out.write("\r\n");
      out.write("<!-- 스타일시트 참조  -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<title>jsp 게시판 웹사이트</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <!-- 네비게이션  -->\r\n");
      out.write("\r\n");
      out.write(" <nav class=\"navbar navbar-default\">\r\n");
      out.write("\r\n");
      out.write("  <div class=\"navbar-header\">\r\n");
      out.write("\r\n");
      out.write("   <button type=\"button\" class=\"navbar-toggle collapsed\" \r\n");
      out.write("\r\n");
      out.write("    data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\"\r\n");
      out.write("\r\n");
      out.write("    aria-expaned=\"false\">\r\n");
      out.write("\r\n");
      out.write("     <span class=\"icon-bar\"></span>\r\n");
      out.write("\r\n");
      out.write("     <span class=\"icon-bar\"></span>\r\n");
      out.write("\r\n");
      out.write("     <span class=\"icon-bar\"></span>\r\n");
      out.write("\r\n");
      out.write("    </button>\r\n");
      out.write("\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"main.jsp\">JSP 게시판</a>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("\r\n");
      out.write("   <ul class=\"nav navbar-nav\">\r\n");
      out.write("\r\n");
      out.write("    <li><a href=\"main.jsp\">메인</a></li>\r\n");
      out.write("\r\n");
      out.write("    <li><a href=\"bbs.jsp\">게시판</a></li>\r\n");
      out.write("\r\n");
      out.write("   </ul>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("   <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\r\n");
      out.write("    <li class=\"dropdown\">\r\n");
      out.write("\r\n");
      out.write("     <a href=\"#\" class=\"dropdown-toggle\"\r\n");
      out.write("\r\n");
      out.write("      data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\r\n");
      out.write("\r\n");
      out.write("      aria-expanded=\"false\">접속하기<span class=\"caret\"></span></a>\r\n");
      out.write("\r\n");
      out.write("     <ul class=\"dropdown-menu\">\r\n");
      out.write("\r\n");
      out.write("      <li class=\"active\"><a href=\"login.jsp\">로그인</a></li>\r\n");
      out.write("\r\n");
      out.write("      <li><a href=\"join.jsp\">회원가입</a></li>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("     </ul>\r\n");
      out.write("\r\n");
      out.write("    </li>\r\n");
      out.write("\r\n");
      out.write("   </ul>\r\n");
      out.write("\r\n");
      out.write("  </div> \r\n");
      out.write("\r\n");
      out.write(" </nav>\r\n");
      out.write("\r\n");
      out.write(" <!-- 로긴폼 -->\r\n");
      out.write("\r\n");
      out.write(" <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("  <div class=\"col-lg-4\"></div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"col-lg-4\">\r\n");
      out.write("\r\n");
      out.write("  <!-- 점보트론 -->\r\n");
      out.write("\r\n");
      out.write("   <div class=\"jumbotron\" style=\"padding-top: 20px;\">\r\n");
      out.write("\r\n");
      out.write("   <!-- 로그인 정보를 숨기면서 전송post -->\r\n");
      out.write("\r\n");
      out.write("   <form method=\"post\" action=\"loginAction.jsp\">\r\n");
      out.write("\r\n");
      out.write("    <h3 style=\"text-align: center;\"> 로그인화면 </h3>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("     <input type=\"text\" class=\"form-control\" placeholder=\"아이디\" name=\"userID\" maxlength=\"20\">\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("     <input type=\"password\" class=\"form-control\" placeholder=\"비밀번호\" name=\"userPassword\" maxlength=\"20\">\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <input type=\"submit\" class=\"btn btn-primary form-control\" value=\"로그인\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("   </form>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write(" </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" <!-- 애니매이션 담당 JQUERY -->\r\n");
      out.write("\r\n");
      out.write(" <script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script> \r\n");
      out.write("\r\n");
      out.write(" <!-- 부트스트랩 JS  -->\r\n");
      out.write("\r\n");
      out.write(" <script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
