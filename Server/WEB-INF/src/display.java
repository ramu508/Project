import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class display extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
    PrintWriter out=res.getWriter();
    String name=req.getParameter("t1");
    Cookie c1=new Cookie("name",name);
    res.addCookie(c1);
    res.sendRedirect("age.html");
}
}