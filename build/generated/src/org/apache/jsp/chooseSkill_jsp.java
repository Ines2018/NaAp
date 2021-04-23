package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Nanny;

public final class chooseSkill_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
      out.write("        ");

            Nanny n = (Nanny) request.getSession().getAttribute("nannies");

            if (n == null) {
                response.sendRedirect("RegisterNanny.jsp");
            }


        
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("         <header id=\"header\" class=\"d-flex align-items-center\">\n");
      out.write("    <div class=\"container d-flex align-items-center justify-content-between\">\n");
      out.write("\n");
      out.write("      <a href=\"index.html\" class=\"logo mr-auto\"><img src=\"assets/img/logo.png\" alt=\"\"></a>\n");
      out.write("      <!-- Uncomment below if you prefer to use a text logo -->\n");
      out.write("      <!-- <h1 class=\"logo mr-auto\"><a href=\"index.html\">Imperial</a></h1> -->\n");
      out.write("\n");
      out.write("      <nav id=\"navbar\" class=\"navbar\">\n");
      out.write("        <ul>\n");
      out.write("          <li><a class=\"nav-link scrollto active\" href=\"#hero\">Home</a></li>\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#about\">About</a></li>\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#services\">Services</a></li>\n");
      out.write("          \n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#testimonials\">Testimonials</a></li>\n");
      out.write("          \n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#contact\">Contact</a></li>\n");
      out.write("          <li><a class=\"btn-get-started\" href=\"Login.jsp\">Login</a></li>\n");
      out.write("     \n");
      out.write("        </ul>\n");
      out.write("        <i class=\"bi bi-list mobile-nav-toggle\"></i>\n");
      out.write("      </nav><!-- .navbar -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("        \n");
      out.write("        <ul class=\"list-group\">\n");
      out.write("            <li class=\"list-group-item d-flex justify-content-between align-items-center\">\n");
      out.write("                A list item\n");
      out.write("                <span class=\"badge badge-primary badge-pill\">14</span>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-group-item d-flex justify-content-between align-items-center\">\n");
      out.write("                A second list item\n");
      out.write("                <span class=\"badge badge-primary badge-pill\">2</span>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-group-item d-flex justify-content-between align-items-center\">\n");
      out.write("                A third list item\n");
      out.write("                <span class=\"badge badge-primary badge-pill\">1</span>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
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
