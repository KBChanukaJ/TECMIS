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
public class Course extends DBConnect implements CourseImp{
    
    private Integer id;
    private String title;
    private String coordinator;
    private Integer credit;
    private String department;
    private String level;
    private Vector data;
    
    

    public Vector getData() {
        return data;
    }

    public void setData(Vector data) {
        this.data = data;
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

    public String getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(String coordinator) {
        this.coordinator = coordinator;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    

  
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    @Override
    public void insert() {
         super._connection();
         String sql="INSERT INTO course(title,coordinator,credit,department_fk,level) VALUES(?,?,?,?,?)";
         
         try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, title);
            pst.setString(2, coordinator);
            pst.setInt(3, credit);
            pst.setString(4, department);
            pst.setString(5, level);
            
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
            String sql="SELECT *FROM course";
            try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
                while (rs.next()) {                    
                    rowCounter++;
                    Integer id=rs.getInt("id");
                    String title=rs.getString("title");
                    String coordinator=rs.getString("coordinator");
                    Integer credit=rs.getInt("credit");
                    String department=rs.getString("department_fk");
                    String level=rs.getString("level");
                    
                    Vector row=new Vector();
                    row.add(id);
                    row.add(title);
                    row.add(coordinator);
                    row.add(credit);
                    row.add(department);
                    row.add(level);
                    
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
       
            String sql="SELECT *FROM course WHERE id="+id;
            try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
                if(rs.next()) {                    
                    
                    id=rs.getInt("id");
                    String title=rs.getString("title");
                    String coordinator=rs.getString("coordinator");
                    Integer credit=rs.getInt("credit");
                    String department=rs.getString("department_fk");
                    String level=rs.getString("level");
                    
                    setId(id);
                    setTitle(title);
                    setCoordinator(coordinator);
                    setCredit(credit);
                    setDepartment(department);
                    setLevel(level);
                    
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
         String sql="UPDATE course SET title=? ,coordinator=? ,credit=? ,department_fk=? ,level=?"+ "WHERE id=?";
         try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, title);
            pst.setString(2, coordinator);
            pst.setInt(3, credit);
            pst.setString(4, department);
            pst.setString(5, level);
            pst.setInt(6, id);
            
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
         String sql="DELETE FROM course WHERE id=?";
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
