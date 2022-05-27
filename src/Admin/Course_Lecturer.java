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
public class Course_Lecturer extends DBConnect{
    
    private  Integer id;
    private String course;
    private String lecturer;
    private Vector data;

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
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
    
    
    

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }
    
    
    
    public void insert(){
        super._connection();
         String sql="INSERT INTO course_lecturer(course,lecturer) VALUES(?,?)";
         
         try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, course);
            pst.setString(2, lecturer);
            
            pst.executeUpdate();
            pst.close();
            
            message("Data added sucess");
             
        } catch (Exception e) {
             message(e.getMessage());
        }
    
    }
    
    
    public void display() {
            setData(new Vector());
            super._connection();
            byte rowCounter=0;
            String sql="SELECT *FROM course_lecturer";
            try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
                while (rs.next()) {                    
                    rowCounter++;
                    Integer id=rs.getInt("id");
                    String course=rs.getString("course");
                    String lecturer=rs.getString("lecturer");
                    
                    
                    Vector row=new Vector();
                    row.add(id);
                    row.add(course);
                    row.add(lecturer);
                    
                    this.getData().add(row);
                    
                }
                rs.close();
                pst.close();
            
        } catch (Exception e) {
                message(e.getMessage());
        }
    }
    
    
    public void select(int id) {
            super._connection();
       
            String sql="SELECT *FROM course_lecturer WHERE id="+id;
            try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
                if(rs.next()) {                    
                    
                    id=rs.getInt("id");
                    String course=rs.getString("course");
                    String lecturer=rs.getString("lecturer");
                    
                    setId(id);
                    setCourse(course);
                    setLecturer(lecturer);
                }
                rs.close();
                pst.close();
            
        } catch (Exception e) {
                message(e.getMessage());
        }
    }
    
    public void update() {
         super._connection();
         String sql="UPDATE course_lecturer SET course=? ,lecturer=?"+ "WHERE id=?";
         try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, course);
            pst.setString(2, lecturer);
            pst.setInt(3, id);
            
            pst.executeUpdate();
            pst.close();
            
            message("Data Updated success");
             
        } catch (Exception e) {
             message(e.getMessage());
        }
    }
    
    
    
     private void message(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
}
