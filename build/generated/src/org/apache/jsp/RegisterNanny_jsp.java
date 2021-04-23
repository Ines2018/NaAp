package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegisterNanny_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("\n");
      out.write("        <title>Imperial Bootstrap Template</title>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Raleway:300,400,500,700,800\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Vendor CSS Files -->\n");
      out.write("        <link href=\"assets/vendor/aos/aos.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/glightbox/css/glightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Template Main CSS File -->\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            \n");
      out.write("            <div style=\"width: 700px;margin: auto;padding: 80px; margin: inherit\">\n");
      out.write("                \n");
      out.write("                <label for=\"Name\" class=\"form-label\">Name</label>\n");
      out.write("                <input type=\"name\" class=\"form-control\" id=\"InputName\">\n");
      out.write("                \n");
      out.write("                <label for=\"Gender\" class=\"form-label\">Gender</label>\n");
      out.write("                <input type=\"gender\" class=\"form-control\" id=\"InputGender\">\n");
      out.write("                \n");
      out.write("                <label for=\"Dob\" class=\"form-label\">DoB</label>\n");
      out.write("                <input type=\"dob\" class=\"form-control\" id=\"InputDate\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <label for=\"Phone\" class=\"form-label\">Phone</label>\n");
      out.write("                <input type=\"phone\" class=\"form-control\" id=\"InputPhone\">\n");
      out.write("                \n");
      out.write("                <label for=\"Location\" class=\"form-label\">Location</label>\n");
      out.write("                <input type=\"location\" class=\"form-control\" id=\"InputLocation\">\n");
      out.write("                \n");
      out.write("                <label for=\"Price\" class=\"form-label\">Price</label>\n");
      out.write("                <input type=\"price\" class=\"form-control\" id=\"InputPrice\">\n");
      out.write("                \n");
      out.write("                <label for=\"Email\" class=\"form-label\">Email address</label>\n");
      out.write("                <input type=\"email\" class=\"form-control\" id=\"InputEmail\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <label for=\"Password\" class=\"form-label\">Password</label>\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"InputPassword\">\n");
      out.write("\n");
      out.write("                <div id=\"passwordHelpBlock\" class=\"form-text\">\n");
      out.write("                    Your password must be 8-20 characters long, contain letters and numbers, and must not contain spaces, special characters, or emoji.\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <br>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Create my Account</button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
