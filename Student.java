import sun.awt.geom.AreaOp;
import java.sql.*;

    public class Student {
        public static void main(String[] args) {
            try (
                    Connection conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/student?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                            "root", "");
                    Statement stmt = conn.createStatement();
            ) {
                String strSelect = "select id , name ,  Address, phone from student";
                System.out.println("The SQL statement is: " + strSelect + "\n");
                ResultSet reset = stmt.executeQuery(strSelect);
                System.out.println("The records selected are:");
                int rowCount = 0;
                while(reset.next()) {
                    String id = reset.getString("id");
                    String name = reset.getString("name");
                    String Address = reset.getString("Address");
                    int phone = reset.getInt("phone");
                    System.out.println(id + ","  + name + "," + Address + "," +phone);
                    ++rowCount;
                }
                System.out.println("Total number of records = " + rowCount);

            } catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
    }




