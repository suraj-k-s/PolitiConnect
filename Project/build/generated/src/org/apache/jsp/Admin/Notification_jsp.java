package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Notification_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Admin/SessionValidator.jsp");
    _jspx_dependants.add("/Admin/Header.jsp");
    _jspx_dependants.add("/Admin/Footer.jsp");
  }

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
      DB.ConnectionClass con = null;
      synchronized (_jspx_page_context) {
        con = (DB.ConnectionClass) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Notification</title>\n");
      out.write("        ");

        response.setHeader("Cache-Control", "no-cache, no-store");
        if(session.getAttribute("aid") == null)
        {
            response.sendRedirect("../");
        }
    
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("<title>User - Connect</title>\n");
      out.write("\n");
      out.write("<!-- <link rel=\"icon\" href=\"../Assets/admin/img/favicon.png\" type=\"image/png\"> -->\n");
      out.write("<!-- Bootstrap CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/css/bootstrap.min.css\" />\n");
      out.write("<!-- themefy CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/vendors/themefy_icon/themify-icons.css\" />\n");
      out.write("<!-- swiper slider CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/vendors/swiper_slider/css/swiper.min.css\" />\n");
      out.write("<!-- select2 CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/vendors/select2/css/select2.min.css\" />\n");
      out.write("<!-- select2 CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/vendors/niceselect/css/nice-select.css\" />\n");
      out.write("<!-- owl carousel CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/vendors/owl_carousel/css/owl.carousel.css\" />\n");
      out.write("<!-- gijgo css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/vendors/gijgo/gijgo.min.css\" />\n");
      out.write("<!-- font awesome CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/vendors/font_awesome/css/all.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/vendors/tagsinput/tagsinput.css\" />\n");
      out.write("<!-- datatable CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/vendors/datatable/css/jquery.dataTables.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/vendors/datatable/css/responsive.dataTables.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/vendors/datatable/css/buttons.dataTables.min.css\" />\n");
      out.write("<!-- text editor css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/vendors/text_editor/summernote-bs4.css\" />\n");
      out.write("<!-- morris css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/vendors/morris/morris.css\">\n");
      out.write("<!-- metarial icon css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/vendors/material_icon/material-icons.css\" />\n");
      out.write("\n");
      out.write("<!-- menu css  -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/css/metisMenu.css\">\n");
      out.write("<!-- style CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/css/style.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"../Assets/admin/css/colors/default.css\" id=\"colorSkinCSS\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"sidebar\">\n");
      out.write("    <div class=\"logo d-flex justify-content-between\">\n");
      out.write("        <a href=\"HomePage.jsp\"><h4 align=\"center\">Welcome<br>");
      out.print(session.getAttribute("aname"));
      out.write("</h4></a>\n");
      out.write("        <div class=\"sidebar_close_icon d-lg-none\">\n");
      out.write("            <i class=\"ti-close\"></i>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <ul id=\"sidebar_menu\">\n");
      out.write("        <li class=\"side_menu_title\">\n");
      out.write("            <span>Dashboard</span>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"mm-active\">\n");
      out.write("            <a  href=\"HomePage.jsp\"  aria-expanded=\"false\">\n");
      out.write("                <img src=\"../Assets/admin/img/menu-icon/1.svg\" alt=\"\">\n");
      out.write("                <span>Dashboard</span>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("        </li>\n");
      out.write("        <li class=\"side_menu_title\">\n");
      out.write("            <span>User Management</span>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"\">\n");
      out.write("            <a   class=\"has-arrow\" href=\"#\" aria-expanded=\"false\">\n");
      out.write("                <img src=\"../Assets/admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                <span>User</span>\n");
      out.write("            </a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"NewUserList.jsp\">New User List</a></li>\n");
      out.write("                <li><a href=\"AcceptedUserList.jsp\">Accepted User List</a></li>\n");
      out.write("                <li><a href=\"RejectedUserList.jsp\">Rejected User List</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"side_menu_title\">\n");
      out.write("              \n");
      out.write("             \n");
      out.write("            <span>Notification</span>\n");
      out.write("        </li>\n");
      out.write("         <li class=\"\">\n");
      out.write("            <a   class=\"has-arrow\" href=\"Notification.jsp\" aria-expanded=\"false\">\n");
      out.write("                <img src=\"../Assets/admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                <span>Sent Message</span>\n");
      out.write("            </a>\n");
      out.write("         </li>\n");
      out.write("         <li class=\"side_menu_title\">\n");
      out.write("              \n");
      out.write("             \n");
      out.write("            <span>Timeline</span>\n");
      out.write("        </li>\n");
      out.write("         <li class=\"\">\n");
      out.write("            <a   class=\"has-arrow\" href=\"Timeline.jsp\" aria-expanded=\"false\">\n");
      out.write("                <img src=\"../Assets/admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                <span>Add post</span>\n");
      out.write("            </a>\n");
      out.write("         </li>\n");
      out.write("         <li class=\"side_menu_title\" >\n");
      out.write("            <span>Payment</span>\n");
      out.write("             <li class=\"\">\n");
      out.write("            \n");
      out.write("            <a   class=\"has-arrow\" href=\"partyfund.jsp\" aria-expanded=\"false\">\n");
      out.write("                <img src=\"../Assets/admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                <span>Add payment scheme</span>\n");
      out.write("            </a>\n");
      out.write("            <a   class=\"has-arrow\" href=\"viewpayment.jsp\" aria-expanded=\"false\">\n");
      out.write("                <img src=\"../Assets/admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                <span>View payments</span>\n");
      out.write("            </a>\n");
      out.write("             \n");
      out.write("            \n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("        <li class=\"side_menu_title\">\n");
      out.write("            <span>Basic Data's</span>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"\">\n");
      out.write("            <a   class=\"has-arrow\" href=\"#\" aria-expanded=\"false\">\n");
      out.write("                <img src=\"../Assets/admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                <span>Location</span>\n");
      out.write("            </a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"District.jsp\">District</a></li>\n");
      out.write("                <li><a href=\"Place.jsp\">Place</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <li class=\"\">\n");
      out.write("            <a   class=\"has-arrow\" href=\"ViewUserComplaint.jsp\" aria-expanded=\"false\">\n");
      out.write("                <img src=\"../Assets/admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                <span>Complaints</span>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("        </li>\n");
      out.write("         \n");
      out.write("        <li class=\"\">\n");
      out.write("            <a   class=\"has-arrow\" href=\"../logout.jsp\" aria-expanded=\"false\">\n");
      out.write("                <img src=\"../Assets/admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                <span>Logout</span>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("</nav>");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    ");
        if (request.getParameter("btn_save") != null) {

            String insQry = "insert into tbl_notification(notification_title,notification_content,notification_datettime)values('" + request.getParameter("txt_content") + "','" + request.getParameter("txt_notification") + "','" + request.getParameter("txt_date") + "')";
            con.executeCommand(insQry);
            response.sendRedirect("Notification.jsp");

        }

        if (request.getParameter("del") != null) {
            String delQry = "delete from tbl_notification where notification_id='" + request.getParameter("del") + "'";
            con.executeCommand(delQry);
            response.sendRedirect("Notification.jsp");
        }


    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <section class=\"main_content dashboard_part\">\n");
      out.write("\n");
      out.write("            <!--/ menu  -->\n");
      out.write("            <div class=\"main_content_iner \">\n");
      out.write("                <div class=\"container-fluid p-0\">\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <div class=\"QA_section\">\n");
      out.write("                                <!--Form-->\n");
      out.write("                                <div class=\"white_box_tittle list_header\">\n");
      out.write("                                    <div class=\"col-lg-12\">\n");
      out.write("                                        <div class=\"white_box mb_30\">\n");
      out.write("                                            <div class=\"box_header \">\n");
      out.write("                                                <div class=\"main-title\">\n");
      out.write("                                                    <h3 class=\"mb-0\" >Table Notification</h3>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <form>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label for=\"txt_notification\">Title</label>\n");
      out.write("                                                    <input required=\"\" type=\"text\" class=\"form-control\" id=\"txt_notification\" name=\"txt_notification\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label for=\"txt_content\">Content</label>\n");
      out.write("                                                    <textarea class=\"form-control\" name=\"txt_content\"></textarea>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label for=\"txt_date\">Date</label>\n");
      out.write("                                                    <input required=\"\" type=\"date\" class=\"form-control\" id=\"txt_date\" name=\"txt_date\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\" align=\"center\">\n");
      out.write("                                                    <input type=\"submit\" class=\"btn-dark\" style=\"width:100px; border-radius: 10px 5px \" name=\"btn_save\" value=\"Save\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"QA_table mb_30\">\n");
      out.write("                                    <!-- table-responsive -->\n");
      out.write("                                    <table class=\"table lms_table_active\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr style=\"background-color: #74CBF9\">\n");
      out.write("                                                <td align=\"center\" scope=\"col\">Sl.No</td>\n");
      out.write("                                                <td align=\"center\" scope=\"col\">Title</td>\n");
      out.write("                                                <td align=\"center\" scope=\"col\">Content</td>\n");
      out.write("                                                <td align=\"center\" scope=\"col\">Date</td>\n");
      out.write("                                                <td align=\"center\" scope=\"col\">Action</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            ");
                                                int i = 0;
                                                String selQry = "select * from tbl_notification";
                                                ResultSet rs = con.selectCommand(selQry);
                                                while (rs.next()) {

                                                    i++;

                                            
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td align=\"center\">");
      out.print(i);
      out.write("</td>\n");
      out.write("                                                <td align=\"center\">");
      out.print(rs.getString("notification_title"));
      out.write("</td>\n");
      out.write("                                                <td align=\"center\">");
      out.print(rs.getString("notification_content"));
      out.write("</td>\n");
      out.write("                                                <td align=\"center\">");
      out.print(rs.getString("notification_datettime"));
      out.write("</td>\n");
      out.write("                                                <td align=\"center\">\n");
      out.write("                                                    <a href=\"Notification.jsp?del=");
      out.print(rs.getString("notification_id"));
      out.write("\" class=\"status_btn\">Delete</a> \n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            ");
                      }


                                            
      out.write("\n");
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("    ");
      out.write("        <!-- jquery slim -->\n");
      out.write("        <script src=\"../Assets/admin/js/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <!-- popper js -->\n");
      out.write("        <script src=\"../Assets/admin/js/popper.min.js\"></script>\n");
      out.write("        <!-- bootstarp js -->\n");
      out.write("        <script src=\"../Assets/admin/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- sidebar menu  -->\n");
      out.write("        <script src=\"../Assets/admin/js/metisMenu.js\"></script>\n");
      out.write("        <!-- waypoints js -->\n");
      out.write("        <script src=\"../Assets/admin/vendors/count_up/jquery.waypoints.min.js\"></script>\n");
      out.write("        <!-- waypoints js -->\n");
      out.write("        <script src=\"../Assets/admin/vendors/chartlist/Chart.min.js\"></script>\n");
      out.write("        <!-- counterup js -->\n");
      out.write("        <script src=\"../Assets/admin/vendors/count_up/jquery.counterup.min.js\"></script>\n");
      out.write("        <!-- swiper slider js -->\n");
      out.write("        <script src=\"../Assets/admin/vendors/swiper_slider/js/swiper.min.js\"></script>\n");
      out.write("        <!-- nice select -->\n");
      out.write("        <script src=\"../Assets/admin/vendors/niceselect/js/jquery.nice-select.min.js\"></script>\n");
      out.write("        <!-- owl carousel -->\n");
      out.write("        <script src=\"../Assets/admin/vendors/owl_carousel/js/owl.carousel.min.js\"></script>\n");
      out.write("        <!-- gijgo css -->\n");
      out.write("        <script src=\"../Assets/admin/vendors/gijgo/gijgo.min.js\"></script>\n");
      out.write("        <!-- responsive table -->\n");
      out.write("        <script src=\"../Assets/admin/vendors/datatable/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"../Assets/admin/vendors/datatable/js/dataTables.responsive.min.js\"></script>\n");
      out.write("        <script src=\"../Assets/admin/vendors/datatable/js/dataTables.buttons.min.js\"></script>\n");
      out.write("        <script src=\"../Assets/admin/vendors/datatable/js/buttons.flash.min.js\"></script>\n");
      out.write("        <script src=\"../Assets/admin/vendors/datatable/js/jszip.min.js\"></script>\n");
      out.write("        <script src=\"../Assets/admin/vendors/datatable/js/pdfmake.min.js\"></script>\n");
      out.write("        <script src=\"../Assets/admin/vendors/datatable/js/vfs_fonts.js\"></script>\n");
      out.write("        <script src=\"../Assets/admin/vendors/datatable/js/buttons.html5.min.js\"></script>\n");
      out.write("        <script src=\"../Assets/admin/vendors/datatable/js/buttons.print.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"../Assets/admin/js/chart.min.js\"></script>\n");
      out.write("        <!-- progressbar js -->\n");
      out.write("        <script src=\"../Assets/admin/vendors/progressbar/jquery.barfiller.js\"></script>\n");
      out.write("        <!-- tag input -->\n");
      out.write("        <script src=\"../Assets/admin/vendors/tagsinput/tagsinput.js\"></script>\n");
      out.write("        <!-- text editor js -->\n");
      out.write("        <script src=\"../Assets/admin/vendors/text_editor/summernote-bs4.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"../Assets/admin/vendors/apex_chart/apexcharts.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- custom js -->\n");
      out.write("        <script src=\"../Assets/admin/js/custom.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"../Assets/admin/vendors/apex_chart/bar_active_1.js\"></script>\n");
      out.write("        <script src=\"../Assets/admin/vendors/apex_chart/apex_chart_list.js\"></script>");
      out.write("\n");
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
