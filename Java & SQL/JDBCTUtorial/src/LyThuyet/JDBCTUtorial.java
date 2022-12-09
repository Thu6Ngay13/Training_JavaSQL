/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LyThuyet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author wwhac
 */
public class JDBCTUtorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        try{
            String url = "jdbc:sqlserver://TienLe\\SQLEXPRESS;databaseName=LyThuyet_2;encrypt=true;trustServerCertificate=true";
            String username = "sa";
            String password = "sa";
            
            Connection con = DriverManager.getConnection(url, username, password);
            
            if(con != null) System.out.println("Connect successfully");
            else System.out.println("Connect failed");

//            Statement stm = con.createStatement();
//            String sql = "INSERT INTO SinhVien VALUES('SV009', 'Nguyen Van A', 'Phu Tho', 2.2, '2000-01-01')";
//            int res = stm.executeUpdate(sql);
//            if(res > 0) System.out.println("Insert Done!");
//            else System.out.println("Insert failed");

//            Statement stm = con.createStatement();
//            String sql = "SELECT * FROM SinhVien";
//            ResultSet rs = stm.executeQuery(sql);
//            while(rs.next()){
//                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " 
//                    + rs.getString(3) + " " + rs.getString(3) + " " + rs.getString(5));
//            }

//                String sql = "INSERT INTO SinhVien VALUES(?, ?, ?, ?, ?)";
                String sql = "SELECT * FROM SinhVien WHERE dia_chi = ?";
                PreparedStatement stm = con.prepareStatement(sql);
//                stm.setString(1, "SV010");
//                stm.setString(2, "Le Xuan An");
//                stm.setString(3, "Thai Binh");
//                stm.setFloat(4, 3.3f);
//                stm.setDate(5, Date.valueOf("2001-12-8"));
//                stm.execute();
                stm.setString(1, "Thai Binh");
                ResultSet rs = stm.executeQuery();
                while(rs.next()){
                    System.out.println(rs.getString(1) + " " + rs.getString(2) + " " 
                        + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
                }
                
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
}
