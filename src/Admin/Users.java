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
public class Users extends User implements UsersImp{
    
    private String stu_id;
    private String password;
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

    
    
    public String getStu_id() {
        return stu_id;
    }

    public String getPassword() {
        return password;
    }
    
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

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setData(Vector data) {
        this.data = data;
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
         String sql="INSERT INTO users(f_name,l_name,dob,gender,nic,address,contact,email,is_deleted,image,department,user_id,password,user_role) VALUES(?,?,?,?,?,?,?,?,1,?,?,?,?,?)";
         
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
            pst.setString(11, stu_id);
            pst.setString(12, password);
            pst.setString(13, role);
            
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
            String sql="SELECT *FROM users WHERE is_deleted=1";
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
                    String department=rs.getString("department");
                    String user_id=rs.getString("user_id");
                    String password=rs.getString("password");
                    String role=rs.getString("user_role");
                    
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
                    row.add(department);
                    row.add(user_id);
                    row.add(password);
                    row.add(role);
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
       
            String sql="SELECT *FROM users WHERE id="+id;
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
                    String user_id=rs.getString("user_id");
                    String password=rs.getString("password");
                    String role=rs.getString("user_role");
                    
                    this.setId(id);
                    this.setF_name(fname);
                    this.setL_name(lname);
                    this.setDob(dob);
                    this.setGender(gender);
                    this.setNic(nic);
                    this.setAddress(address);
                    this.setContact(contact);
                    this.setEmail(email);
                    setImage(image);
                    setDepartment(department);
                    setUser_id(user_id);
                    setPassword(password);
                    setRole(role);
                    
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
         String sql="UPDATE users SET f_name=? ,l_name=? ,dob=? ,gender=? ,nic=? ,address=? ,contact=? ,email=? ,image=? ,department=? ,user_id=? ,password=? ,user_role=?"+ "WHERE id=?";
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
            pst.setString(11, stu_id);
            pst.setString(12, password);
            pst.setString(13, role);
            pst.setInt(14, id);
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
         String sql="DELETE FROM users WHERE id=?";
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

    @Override
    public void setPwd() {
       super._connection();
         String sql="INSERT INTO users(user_id,password,user_role) VALUES(?,?,'student')";
         
         try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, stu_id);
            pst.setString(2, password);
            
            pst.executeUpdate();
            pst.close();
            
        
            
            message("Data added sucess");
             
        } catch (Exception e) {
             message(e.getMessage());
        }
    }
    
    
    
    
    
    private void message(String message){
        JOptionPane.showMessageDialog(null, message);
    }

        
    
    
    
    
    
}
