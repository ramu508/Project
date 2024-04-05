import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
public class contact extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
PrintWriter out=res.getWriter();
String f=req.getParameter("t1");
String l=req.getParameter("t2");
String m=req.getParameter("t3");
String w=req.getParameter("t4");
res.setContentType("text/html");
try
{
 Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
 PreparedStatement pst=con.prepareStatement("insert into contact values(?,?,?,?)");
 pst.setString(1,f);
 pst.setString(2,l);
 pst.setString(3,m);
 pst.setString(4,w);
 int i=pst.executeUpdate();
 if(i==1)
{
	out.println("Report Sucessfully Submitted");
}
}
catch(Exception e)
{
	out.println(e);
}
}
}




