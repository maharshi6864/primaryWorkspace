/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2023-06-07 12:25:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Register Page</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\" />\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    />\r\n");
      out.write("    <script\r\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("      integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    ></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("      <div class=\"content\">\r\n");
      out.write("      <form action=\"save.jsp\">\r\n");
      out.write("        <h1>Register Here</h1>\r\n");
      out.write("        <div class=\"apply_box\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"row align-items-center\">\r\n");
      out.write("              <div class=\"col mt-4\">\r\n");
      out.write("                <label for=\"firstName\">First Name:</label>\r\n");
      out.write("                <input\r\n");
      out.write("                  type=\"text\"\r\n");
      out.write("                  class=\"form-control\"\r\n");
      out.write("                  placeholder=\"...\"\r\n");
      out.write("                  aria-label=\"First name\"\r\n");
      out.write("                  id=\"firstName\"\r\n");
      out.write("                  name=\"fn\"\r\n");
      out.write("                />\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col mt-4\">\r\n");
      out.write("                <label for=\"lastname\">LastName:</label>\r\n");
      out.write("                <input\r\n");
      out.write("                  type=\"text\"\r\n");
      out.write("                  class=\"form-control\"\r\n");
      out.write("                  placeholder=\"...\"\r\n");
      out.write("                  aria-label=\"Last name\"\r\n");
      out.write("                  name=\"ln\"\r\n");
      out.write("                />\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col mt-3\">\r\n");
      out.write("                <label for=\"floatingTextarea2\">Address:</label>\r\n");
      out.write("                <textarea\r\n");
      out.write("                  class=\"form-control\"\r\n");
      out.write("                  placeholder=\"Leave your residencial...\"\r\n");
      out.write("                  id=\"floatingTextarea2\"\r\n");
      out.write("                  style=\"height: 100px\"\r\n");
      out.write("                  name=\"address\"\r\n");
      out.write("                ></textarea>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col mt-3\">\r\n");
      out.write("                <label for=\"\">Email:</label>\r\n");
      out.write("                <input\r\n");
      out.write("                  type=\"email\"\r\n");
      out.write("                  class=\"form-control\"\r\n");
      out.write("                  id=\"floatingInput\"\r\n");
      out.write("                  placeholder=\"name@example.com\"\r\n");
      out.write("                  name=\"email\"\r\n");
      out.write("                />\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col mt-3\">\r\n");
      out.write("                <label for=\"\">City:</label>\r\n");
      out.write("                <select\r\n");
      out.write("                  class=\"form-select\"\r\n");
      out.write("                  id=\"floatingSelect\"\r\n");
      out.write("                  aria-label=\"Floating label select example\"\r\n");
      out.write("                  name=\"city\"\r\n");
      out.write("                >\r\n");
      out.write("                  <option selected value=\"\">Select City</option>\r\n");
      out.write("                  <option value=\"Ahemdabad\">Ahemdabad</option>\r\n");
      out.write("                  <option value=\"Surat\">Surat</option>\r\n");
      out.write("                  <option value=\"Mehsana\">Mehsana</option>\r\n");
      out.write("                </select>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col mt-3\">\r\n");
      out.write("                <label for=\"firstName\">UserName:</label>\r\n");
      out.write("                <input\r\n");
      out.write("                  type=\"text\"\r\n");
      out.write("                  class=\"form-control\"\r\n");
      out.write("                  placeholder=\"...\"\r\n");
      out.write("                  aria-label=\"First name\"\r\n");
      out.write("                  id=\"firstName\"\r\n");
      out.write("                  name=\"username\"\r\n");
      out.write("                />\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col mt-3\">\r\n");
      out.write("                <label for=\"lastname\">Password:</label>\r\n");
      out.write("                <input\r\n");
      out.write("                  type=\"password\"\r\n");
      out.write("                  class=\"form-control\"\r\n");
      out.write("                  placeholder=\"***\"\r\n");
      out.write("                  aria-label=\"Last name\"\\\r\n");
      out.write("                  name=\"password\"\r\n");
      out.write("                />\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col mt-3\">\r\n");
      out.write("                <label for=\"flexCheckDefault\">Hobbies:</label>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col mt-3\">\r\n");
      out.write("                <label for=\"flexCheckDefault\">Gender:</label>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col c1\">\r\n");
      out.write("                <input\r\n");
      out.write("                  class=\"form-check-input\"\r\n");
      out.write("                  type=\"checkbox\"\r\n");
      out.write("                  value=\"Dancing\"\r\n");
      out.write("                  id=\"flexCheckDefault\"\r\n");
      out.write("                  name=\"hob\"\r\n");
      out.write("                />\r\n");
      out.write("                <span class=\"form-check-label\" for=\"flexCheckDefault\">\r\n");
      out.write("                  Dancing\r\n");
      out.write("                </span>\r\n");
      out.write("                <input\r\n");
      out.write("                  class=\"form-check-input\"\r\n");
      out.write("                  type=\"checkbox\"\r\n");
      out.write("                  value=\"Eating\"\r\n");
      out.write("                  id=\"flexCheckDefault\"\r\n");
      out.write("                  name=\"hob\"\r\n");
      out.write("                />\r\n");
      out.write("                <span class=\"form-check-label\" for=\"flexCheckDefault\">\r\n");
      out.write("                  Eating\r\n");
      out.write("                </span>\r\n");
      out.write("                <input\r\n");
      out.write("                  class=\"form-check-input\"\r\n");
      out.write("                  type=\"checkbox\"\r\n");
      out.write("                  value=\"Coding\"\r\n");
      out.write("                  id=\"flexCheckDefault\"\r\n");
      out.write("                  name=\"hob\"\r\n");
      out.write("                />\r\n");
      out.write("                <span class=\"form-check-label\" for=\"flexCheckDefault\">\r\n");
      out.write("                  Coding\r\n");
      out.write("                </span>\r\n");
      out.write("                <input\r\n");
      out.write("                  class=\"form-check-input\"\r\n");
      out.write("                  type=\"checkbox\"\r\n");
      out.write("                  value=\"Cooking\"\r\n");
      out.write("                  id=\"flexCheckDefault\"\r\n");
      out.write("                />\r\n");
      out.write("                <span class=\"form-check-label\" for=\"flexCheckDefault\">\r\n");
      out.write("                  Cooking\r\n");
      out.write("                </span>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"col c1\">\r\n");
      out.write("                <input\r\n");
      out.write("                  value=\"male\"\r\n");
      out.write("                  class=\"form-check-input ml-5\"\r\n");
      out.write("                  type=\"radio\"\r\n");
      out.write("                  id=\"flexRadioDefault1\"\r\n");
      out.write("                  name=\"gen\"\r\n");
      out.write("                />\r\n");
      out.write("                <span class=\"form-check-label\" for=\"flexRadioDefault1\">\r\n");
      out.write("                  Male\r\n");
      out.write("                </span>\r\n");
      out.write("                <input\r\n");
      out.write("                \tvalue=\"female\"\r\n");
      out.write("                  class=\"form-check-input\"\r\n");
      out.write("                  type=\"radio\"\r\n");
      out.write("                  id=\"flexRadioDefault1\"\r\n");
      out.write("                  name=\"gen\"\r\n");
      out.write("                />\r\n");
      out.write("                <span class=\"form-check-label\" for=\"flexRadioDefault1\">\r\n");
      out.write("                  Female\r\n");
      out.write("                </span>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col mt-3 text-end\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-dark\">Save</button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
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