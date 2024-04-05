import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class disp extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
    PrintWriter out=res.getWriter();
    String age=req.getParameter("t2");
    Cookie c2=new Cookie("age",age);
    res.addCookie(c2);
    res.sendRedirect("last.java");
}
}
