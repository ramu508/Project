import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class reg extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
PrintWriter out=res.getWriter();
String fname=req.getParameter("t1");
String uname=req.getParameter("t2");
Long mobileno=Long.parseLong(req.getParameter("t3"));
String email=req.getParameter("t4");
String addre=req.getParameter("t5");
String password=req.getParameter("t6");
String confirmpass=req.getParameter("t7");

res.setContentType("text/html");
try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
Connection c1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
PreparedStatement pst=c1.prepareStatement("insert into register values(?,?,?,?,?,?,?)");
pst.setString(1,fname);
pst.setString(2,uname);
pst.setLong(3,mobileno);
pst.setString(4,email);
pst.setString(5,addre);
pst.setString(6,password);
pst.setString(7, confirmpass);

int i=pst.executeUpdate();
if(i==1)
{
	out.println("Register successful");
}
}
catch(Exception e)
{
	out.println(e);
}
}
}




