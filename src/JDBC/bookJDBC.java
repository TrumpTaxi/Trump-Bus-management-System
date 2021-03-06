package JDBC;

import domain.Booking;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class bookJDBC {
    Statement stmt;
    PreparedStatement stmt2;
    Connection con;
    
    public bookJDBC() throws SQLException{    
        String url = "jdbc:mysql://localhost:3306/easyexpress";
        String username = "root";
        String password="";
        con = DriverManager.getConnection(url,username,password);
        stmt= con.createStatement();            
    }
    
    public String getId()throws SQLException{
        String b_id="B";
        
        String sql = "select * as highestId from booking";
        
        stmt2 = con.prepareStatement(sql);
        
        String newId=null;
        ResultSet rs = stmt2.executeQuery();
        boolean found=false;
        while (rs.next()){
            String temp = rs.getString("highestId");
                  if (temp!=null){
                 found = true;
             temp = temp.substring(1);
                 int iid = Integer.parseInt(temp) + 1;
           newId =b_id +iid;
           } 
        }
                
        if (!found)
            newId="B10001";
    
        return newId;
    }
    
    public boolean storeBooking(Booking b) throws SQLException{
              String sql2 = "insert into booking(bookID,memID,scheID,seatType,seatBook,price) values(?,?,?,?,?,?)";
              stmt2 = con.prepareStatement(sql2);
              stmt2.setString(1,b.getBookID());
              stmt2.setString(2,b.getMemID());
              stmt2.setString(3,b.getScheID());
              stmt2.setString(4,b.getSeatType());
	      stmt2.setInt(5,b.getSeatBook());
              stmt2.setDouble(6,b.getPrice());


                            
              int result= stmt2.executeUpdate();
              
              if (result > 0)
                   return true;
              else
                  return false;
    }
    
    public boolean deleteBook(String bookID)throws SQLException{
        String sql = "delete from booking where bookID='"+bookID+"'";
        stmt2=con.prepareStatement(sql);
        int result2 = stmt.executeUpdate(sql);
        
        if (result2 > 0)
            return true;
        else
            return false;
        
    }
    
    public ArrayList<Booking> retrieveBook()throws SQLException{
        
        ArrayList<Booking> bookarray  = new ArrayList<Booking>();
                
            String sql2 = "select * from booking";
        
            stmt2 = con.prepareStatement(sql2);
            ResultSet rs = stmt2.executeQuery();
            
            while(rs.next()){
            Booking b = new Booking();
            b.setBookID(rs.getString("bookID"));
            b.setMemID(rs.getString("memID"));
            b.setScheID(rs.getString("scheID"));
            b.setSeatType(rs.getString("seatType"));
            b.setSeatBook(rs.getInt("seatBook"));
            b.setPrice(rs.getDouble("price"));
            
                   
            bookarray.add(b);
            
        
    }
      
    return bookarray;
    
}
    
    
    
}
