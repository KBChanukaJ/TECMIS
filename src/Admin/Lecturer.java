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
public class Lecturer extends User implements LecturerImp{
    
    private String f_name;
    private String l_name;
    private String dob;
    private String gender;
    private String nic;
    private String address;
    private Integer contact;
    private String email;
    private String image;
    private String department;
    private Vector data;

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getNic() {
        return nic;
    }

    public String getAddress() {
        return address;
    }

    public Integer getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getImage() {
        return image;
    }

    public String getDepartment() {
        return department;
    }

    
    public Vector getData() {
        return data;
    }

    public String getUser_id() {
        return user_id;
    }

    public Integer getId() {
        return id;
    }

    public Connection getCon() {
        return con;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setData(Vector data) {
        this.data = data;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    
    
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    
    //Functions from AdminImp interface
    @Override
    public void insert() {
         super._connection();
         String sql="INSERT INTO lecturer(f_name,l_name,dob,gender,nic,address,contact,email,is_deleted,image,department) VALUES(?,?,?,?,?,?,?,?,1,?,?)";
         
         try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, f_name);
            pst.setString(2, l_name);
            pst.setString(3, dob);
            pst.setString(4, gender);
            pst.setString(5, nic);
            pst.setString(6, address);
            pst.setInt(7, contact);
            pst.setString(8, email);
            pst.setString(9, image);
            pst.setString(10, department);
            
            pst.executeUpdate();
            pst.close();
            
        
            
            message("Data added sucess");
             
        } catch (Exception e) {
             message(e.getMessage());
        }
    }

    @Override
    public void display() {
            this.setData(new Vector());
            super._connection();
            byte rowCounter=0;
            String sql="SELECT *FROM lecturer WHERE is_deleted=1";
            try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
                while (rs.next()) {                    
                    rowCounter++;
                    Integer id=rs.getInt("id");
                    String fname=rs.getString("f_name");
                    String lname=rs.getString("l_name");
                    String dob=rs.getString("dob");
                    String gender=rs.getString("gender"); 
                    String nic=rs.getString("nic");
                    String address=rs.getString("address");
                    Integer contact=rs.getInt("contact");
                    String email=rs.getString("email");
                    String image=rs.getString("image");
                    String department=rs.getString("department");
                    
                    Vector row=new Vector();
                    row.add(id);
                    row.add(fname);
                    row.add(lname);
                    row.add(dob);
                    row.add(gender);
                    row.add(nic);
                    row.add(address);
                    row.add(contact);
                    row.add(email);
                    row.add(image);
                    row.add(department);
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
       
            String sql="SELECT *FROM lecturer WHERE id="+id;
            try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
                if(rs.next()) {                    
                    
                    id=rs.getInt("id");
                    String fname=rs.getString("f_name");
                    String lname=rs.getString("l_name");
                    String dob=rs.getString("dob");
                    String gender=rs.getString("gender"); 
                    String nic=rs.getString("nic");
                    String address=rs.getString("address");
                    Integer contact=rs.getInt("contact");
                    String email=rs.getString("email");
                    String image=rs.getString("image");
                    String department=rs.getString("department");
                    
                    this.setId(id);
                    this.setF_name(fname);
                    this.setL_name(lname);
                    this.setDob(dob);
                    this.setGender(gender);
                    this.setNic(nic);
                    this.setAddress(address);
                    this.setContact(contact);
                    this.setEmail(email);
                    setDepartment(department);
                    setImage(image);
                    
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
         String sql="UPDATE lecturer SET f_name=? ,l_name=? ,dob=? ,gender=? ,nic=? ,address=? ,contact=? ,email=? ,image=? ,department=?"+ "WHERE id=?";
         try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, f_name);
            pst.setString(2, l_name);
            pst.setString(3, dob);
            pst.setString(4, gender);
            pst.setString(5, nic);
            pst.setString(6, address);
            pst.setInt(7, contact);
            pst.setString(8, email);
            pst.setString(9, image);
            pst.setString(10, department);
            pst.setInt(11, id);
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
         String sql="DELETE FROM lecturer WHERE id=?";
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
