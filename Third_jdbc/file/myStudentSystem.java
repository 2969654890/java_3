package Third_jdbc.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class myStudentSystem implements StudentSystem{
    @Override
    public void StudentsTable(String sql) throws Exception {
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_test","root","123456");

        Statement stmt = conn.createStatement();

        int count=  stmt.executeUpdate(sql);

        System.out.println(count);

        stmt.close();

        conn.close();
    }

    @Override
    public void ClassesTable(String sql) throws Exception {
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_test","root","123456");

        Statement stmt = conn.createStatement();

        int count=  stmt.executeUpdate(sql);

        System.out.println(count);

        stmt.close();

        conn.close();
    }

    @Override
    public void StudentMessage(String sql)throws Exception {
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_test","root","123456");

        Statement stmt = conn.createStatement();

        int count=  stmt.executeUpdate(sql);

        System.out.println(count);

        stmt.close();

        conn.close();
    }

    @Override
    public void ClassMessage(String sql)throws Exception {
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_test","root","123456");

        Statement stmt = conn.createStatement();

        int count=  stmt.executeUpdate(sql);

        System.out.println(count);

        stmt.close();

        conn.close();
    }



    @Override
    public void UpdateStudentOrClassMessage(String sql)throws Exception {
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_test","root","123456");

        Statement stmt = conn.createStatement();

        int count=  stmt.executeUpdate(sql);

        System.out.println(count);

        stmt.close();

        conn.close();
    }


}
