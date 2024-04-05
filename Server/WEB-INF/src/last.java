import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class last extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
    PrintWriter out=res.getWriter();
    Cookie c[]=req.getCookies();
    out.println("name is:"+c[0].getValue());
    out.println("age is:"+c[1].getValue());
}
}
