/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-08-02 04:57:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.patient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/patient/../header.jsp", Long.valueOf(1470046054299L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://cdn.staticfile.org/twitter-bootstrap/2.3.2/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://cdn.staticfile.org/font-awesome/4.1.0/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"navbar navbar-static-top\">\r\n");
      out.write("    <div class=\"navbar-inner\">\r\n");
      out.write("        <a class=\"brand\" href=\"/home\">凯盛医疗</a>\r\n");
      out.write("        <ul class=\"nav\">\r\n");
      out.write("            <li class=\"active\"><a href=\"/user/home\"><i class=\"fa fa-home\"></i> 首页</a></li>\r\n");
      out.write("            <li><a href=\"/patient/home\"><i class=\"fa fa-building\"></i> 病人档案</a></li>\r\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-stethoscope\"></i>  就诊记录</a></li>\r\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-bell-o\"></i> 复诊提醒</a></li>\r\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-bar-chart-o\"></i> 数据统计</a></li>\r\n");
      out.write("            <li class=\"dropdown\">\r\n");
      out.write("                <a href=\"\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" ><i class=\"fa fa-cogs\"></i> 系统设置 <b class=\"caret\"></b></a>\r\n");
      out.write("                <ul class=\"dropdown-menu\">\r\n");
      out.write("                    <li><a href=\"/install/list\"><i class=\"fa fa-sitemap\"></i> 科室设置</a></li>\r\n");
      out.write("                    <li><a href=\"/install/disease\"><i class=\"fa fa-medkit\"></i> 病种设置</a></li>\r\n");
      out.write("                    <li><a href=\"\"><i class=\"fa fa-bars\"></i> 医保类型设置</a></li>\r\n");
      out.write("                    <li><a href=\"\"><i class=\"fa fa-child\"></i> 患者状态设置</a></li>\r\n");
      out.write("                    <li class=\"divider\"></li>\r\n");
      out.write("                    <li><a href=\"/\"><i class=\"fa fa-user-md\"></i> 账号设置</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul class=\"nav pull-right\">\r\n");
      out.write("            <li class=\"divider-vertical\"></li>\r\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-cog\"></i> 个人设置</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row-fluid\">\r\n");
      out.write("        <div class=\"span12\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                <div class=\"box-header\">\r\n");
      out.write("                    <span class=\"title\">搜索</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"box-body search-box\">\r\n");
      out.write("                    <form action=\"\" class=\"form-search\">\r\n");
      out.write("                        <input type=\"text\" placeholder=\"姓名\">\r\n");
      out.write("                        <input type=\"text\" placeholder=\"身份证号\">\r\n");
      out.write("                        <input type=\"text\" placeholder=\"电话\">\r\n");
      out.write("                        <button class=\"button button-flat-primary button-pill\"><i class=\"fa fa-search\"></i> 搜索</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                <div class=\"box-header\">\r\n");
      out.write("                    <span class=\"title\"><i class=\"fa fa-building\"></i> 患者列表</span>\r\n");
      out.write("                    <ul class=\"unstyled inline pull-right\">\r\n");
      out.write("                        <li><a href=\"/patient/new\"><i class=\"fa fa-plus\"></i> 新建</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"box-body\">\r\n");
      out.write("                    <table class=\"table\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            <th width=\"100\">姓名</th>\r\n");
      out.write("                            <th width=\"50\">性别</th>\r\n");
      out.write("                            <th width=\"150\">电话</th>\r\n");
      out.write("                            <th width=\"200\">医保类型</th>\r\n");
      out.write("                            <th>地址</th>\r\n");
      out.write("                            <th width=\"50\">状态</th>\r\n");
      out.write("                            <th width=\"100\">创建日期</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            <td><a href=\"/patient/list\">张晓明</a></td>\r\n");
      out.write("                            <td>男</td>\r\n");
      out.write("                            <td>13898767098</td>\r\n");
      out.write("                            <td>市职工医保</td>\r\n");
      out.write("                            <td>解放区普希顿小区4号楼</td>\r\n");
      out.write("                            <td>在诊</td>\r\n");
      out.write("                            <td>2014-07-09</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://cdn.staticfile.org/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"http://cdn.staticfile.org/twitter-bootstrap/3.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}