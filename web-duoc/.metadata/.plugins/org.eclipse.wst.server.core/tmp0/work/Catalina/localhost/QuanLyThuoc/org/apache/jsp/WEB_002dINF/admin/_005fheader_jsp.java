/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.30
 * Generated at: 2018-05-02 03:26:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _005fheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \r\n");
      out.write("<meta name=\"description\" content=\"Bootstrap Metro Dashboard\">\r\n");
      out.write("<meta name=\"author\" content=\"Dennis Ji\">\r\n");
      out.write("<meta name=\"keyword\"\r\n");
      out.write("\tcontent=\"Metro, Metro UI, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina\">\r\n");
      out.write("<!-- end: Meta -->\r\n");
      out.write("\r\n");
      out.write("<!-- start: Mobile Specific -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- end: Mobile Specific -->\r\n");
      out.write("\r\n");
      out.write("<!-- start: CSS -->\r\n");
      out.write("<link id=\"bootstrap-style\" href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link id=\"base-style\" href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link id=\"base-style-responsive\" href=\"css/style-responsive.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"img/favicon.ico\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"navbar\">\r\n");
      out.write("\t\t<div class=\"navbar-inner\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t<a class=\"btn btn-navbar\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\tdata-target=\".top-nav.nav-collapse,.sidebar-nav.nav-collapse\">\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</a> <a class=\"brand\" href=\"index.html\"><span>Quản Lý\r\n");
      out.write("\t\t\t\t\t\tThuốc</span></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- start: Header Menu -->\r\n");
      out.write("\t\t\t\t<div class=\"nav-no-collapse header-nav\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav pull-right\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown hidden-phone\"><a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-bell\"></i> <span class=\"badge red\"> 7 </span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu notifications\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown-menu-title\"><span>You have 11\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tnotifications</span> <a href=\"#refresh\"><i class=\"icon-repeat\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"icon blue\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"icon-user\"></i></span> <span class=\"message\">New user\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tregistration</span> <span class=\"time\">1 min</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"icon green\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"icon-comment-alt\"></i></span> <span class=\"message\">New\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcomment</span> <span class=\"time\">7 min</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"icon green\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"icon-comment-alt\"></i></span> <span class=\"message\">New\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcomment</span> <span class=\"time\">8 min</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"icon green\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"icon-comment-alt\"></i></span> <span class=\"message\">New\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcomment</span> <span class=\"time\">16 min</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"icon blue\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"icon-user\"></i></span> <span class=\"message\">New user\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tregistration</span> <span class=\"time\">36 min</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"icon yellow\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"icon-shopping-cart\"></i></span> <span class=\"message\">2\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\titems sold</span> <span class=\"time\">1 hour</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"warning\"><a href=\"#\"> <span class=\"icon red\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"icon-user\"></i></span> <span class=\"message\">User\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdeleted account</span> <span class=\"time\">2 hour</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"warning\"><a href=\"#\"> <span class=\"icon red\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"icon-shopping-cart\"></i></span> <span class=\"message\">New\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcomment</span> <span class=\"time\">6 hour</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"icon green\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"icon-comment-alt\"></i></span> <span class=\"message\">New\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcomment</span> <span class=\"time\">yesterday</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"icon blue\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"icon-user\"></i></span> <span class=\"message\">New user\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tregistration</span> <span class=\"time\">yesterday</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown-menu-sub-footer\"><a>View all\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tnotifications</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t<!-- start: Notifications Dropdown -->\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown hidden-phone\"><a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-calendar\"></i> <span class=\"badge red\"> 5\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu tasks\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown-menu-title\"><span>You have 17\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttasks in progress</span> <a href=\"#refresh\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"icon-repeat\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"header\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"title\">iOS Development</span> <span class=\"percent\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"taskProgress progressSlim red\">80</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"header\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"title\">Android Development</span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"percent\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"taskProgress progressSlim green\">47</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"header\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"title\">ARM Development</span> <span class=\"percent\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"taskProgress progressSlim yellow\">32</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"header\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"title\">ARM Development</span> <span class=\"percent\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"taskProgress progressSlim greenLight\">63</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"header\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"title\">ARM Development</span> <span class=\"percent\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"taskProgress progressSlim orange\">80</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"dropdown-menu-sub-footer\">View all tasks</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t<!-- end: Notifications Dropdown -->\r\n");
      out.write("\t\t\t\t\t\t<!-- start: Message Dropdown -->\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown hidden-phone\"><a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-envelope\"></i> <span class=\"badge red\"> 4\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu messages\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown-menu-title\"><span>You have 9\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tmessages</span> <a href=\"#refresh\"><i class=\"icon-repeat\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"avatar\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"img/avatar.jpg\" alt=\"Avatar\"></span> <span class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"from\"> Dennis Ji </span> <span class=\"time\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t6 min </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <span class=\"message\"> Lorem ipsum dolor sit amet\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsectetur adipiscing elit, et al commore </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"avatar\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"img/avatar.jpg\" alt=\"Avatar\"></span> <span class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"from\"> Dennis Ji </span> <span class=\"time\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t56 min </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <span class=\"message\"> Lorem ipsum dolor sit amet\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsectetur adipiscing elit, et al commore </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"avatar\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"img/avatar.jpg\" alt=\"Avatar\"></span> <span class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"from\"> Dennis Ji </span> <span class=\"time\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t3 hours </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <span class=\"message\"> Lorem ipsum dolor sit amet\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsectetur adipiscing elit, et al commore </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"avatar\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"img/avatar.jpg\" alt=\"Avatar\"></span> <span class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"from\"> Dennis Ji </span> <span class=\"time\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tyesterday </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <span class=\"message\"> Lorem ipsum dolor sit amet\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsectetur adipiscing elit, et al commore </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"avatar\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"img/avatar.jpg\" alt=\"Avatar\"></span> <span class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"from\"> Dennis Ji </span> <span class=\"time\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tJul 25, 2012 </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <span class=\"message\"> Lorem ipsum dolor sit amet\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsectetur adipiscing elit, et al commore </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"dropdown-menu-sub-footer\">View all\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tmessages</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- start: User Dropdown -->\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a class=\"btn dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"halflings-icon white user\"></i> Dennis Ji <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown-menu-title\"><span>Account\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tSettings</span></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"halflings-icon user\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tProfile</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login.html\"><i class=\"halflings-icon off\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tLogout</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t<!-- end: User Dropdown -->\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- end: Header Menu -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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