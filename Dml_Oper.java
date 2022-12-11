package jdbc1;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//For Insert Operation in the database

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//public class Dml_Oper {
//    public static void main(String[] args) {
//        String qry="insert into student.info values(1,'Abhi')";
//
//        String url="jdbc:mysql://localhost:3306?user=root&password=Sumal@777";
//
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Step 1 is done");
//
//            Connection con= DriverManager.getConnection(url);
//            System.out.println("Step 2 is done");
//
//            Statement stmt=con.createStatement();
//            System.out.println("Step 3 is done");
//
//            stmt.executeUpdate(qry);
//            System.out.println("Step 4 is done");
//
//        }catch(Exception e){
//            System.out.println(e);
//        }
//    }
//}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//For Update Operation In the Database

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//public class Dml_Oper {
//    public static void main(String[] args) {
//        String qry="update student.info set name='Anup' where id=1";
//
//        String url="jdbc:mysql://localhost:3306?user=root&password=Sumal@777";
//
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Step 1 is done");
//
//            Connection con= DriverManager.getConnection(url);
//            System.out.println("Step 2 is done");
//
//            Statement stmt=con.createStatement();
//            System.out.println("Step 3 is done");
//
//            stmt.executeUpdate(qry);
//            System.out.println("Step 4 is done");
//
//        }catch(Exception e){
//            System.out.println(e);
//        }
//    }
//}

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//For Delete Operation in the Database

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//public class Dml_Oper {
//    public static void main(String[] args) {
//        String qry="delete from student.info  where id=1";
//
//        String url="jdbc:mysql://localhost:3306?user=root&password=Sumal@777";
//
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Step 1 is done");
//
//            Connection con= DriverManager.getConnection(url);
//            System.out.println("Step 2 is done");
//
//            Statement stmt=con.createStatement();
//            System.out.println("Step 3 is done");
//
//            stmt.executeUpdate(qry);
//            System.out.println("Step 4 is done");
//
//        }catch(Exception e){
//            System.out.println(e);
//        }
//    }
//}