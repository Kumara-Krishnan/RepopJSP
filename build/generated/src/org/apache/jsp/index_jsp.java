package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User Details</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        ArrayList<String> errors = (ArrayList<String>) request.getAttribute("err");
        String sname=request.getParameter("sname");
        String sno=request.getParameter("sno");
        String sage=request.getParameter("sage");
        sname=(sname==null)?"eer":sname;
        sno=(sno==null)?"32423":sno;
        sage=(sage==null)?"34":sage;
         if (errors != null) {
                for (String e : errors) {
      out.write("\n");
      out.write("                    ");
      out.print(e);
      out.write("<br/>\n");
      out.write("               ");
 }}
      out.write("\n");
      out.write("        <h1>Enter the user details</h1>\n");
      out.write("        <form action=\"Check.do\" method=\"get\">\n");
      out.write("            ");
      out.write("\n");
      out.write("Student name:<input type=\"text\" name=\"sname\" /><br/>\n");
      out.write("            Student phone no:<input type=\"text\" name=\"sno\" /><br/>\n");
      out.write("            Student age:<input type=\"text\" name=\"sage\"/><br/>\n");
      out.write("<input type=\"submit\" value=\"Register\"/><br/>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
