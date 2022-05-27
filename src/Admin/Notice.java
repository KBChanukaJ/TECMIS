/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author warun
 */
public class Notice extends DBConnect implements NoticeImp{
    
    private Integer id;
    private String title;
    private String notice;
    private Vector data;
    
    

    public Vector getData() {
        return data;
    }

    public void setData(Vector data) {
        this.data = data;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    @Override
    public void insert() {
        super._connection();
         String sql="INSERT INTO notice(title,notice) VALUES(?,?)";
         
         try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, title);
            pst.setString(2, notice);
            
            
            pst.executeUpdate();
            pst.close();
            
            message("Data added sucess");
             
        } catch (Exception e) {
             message(e.getMessage());
        }
    }

    @Override
    public void display() {
            setData(new Vector());
            super._connection();
            byte rowCounter=0;
            String sql="SELECT *FROM notice";
            try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
                while (rs.next()) {                    
                    rowCounter++;
                    Integer id=rs.getInt("id");
                    String title=rs.getString("title");
                    String notice=rs.getString("notice");
                    
                    Vector row=new Vector();
                    row.add(id);
                    row.add(title);
                    row.add(notice);
                    
                    
                    this.getData().add(row);
                    
                }
                rs.close();
                pst.close();
            
        } catch (Exception e) {
                message(e.getMessage());
        }
    }

    @Override
    public void select(int id) {
            super._connection();
       
            String sql="SELECT *FROM notice WHERE id="+id;
            try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
                if(rs.next()) {                    
                    
                    id=rs.getInt("id");
                    String title=rs.getString("title");
                    String notice=rs.getString("notice");
                    
                    
                    setId(id);
                    setTitle(title);
                    setNotice(notice);
                    
                }
                rs.close();
                pst.close();
            
        } catch (Exception e) {
                message(e.getMessage());
        }
    }

    @Override
    public void update() {
        super._connection();
         String sql="UPDATE notice SET title=? ,notice=?"+ "WHERE id=?";
         try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, title);
            pst.setString(2, notice);
            pst.setInt(3, id);
            
            pst.executeUpdate();
            pst.close();
            
            message("Data Updated success");
             
        } catch (Exception e) {
             message(e.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        super._connection();
         String sql="DELETE FROM notice WHERE id=?";
         try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            pst.close();
            
      
            message("Deleted success");
             
        } catch (Exception e) {
             message(e.getMessage());
        }
        
    }
    
    
    private void message(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
            
    
}
