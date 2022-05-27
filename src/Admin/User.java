/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

/**
 *
 * @author warun
 */
public class User extends DBConnect implements UserImp{
    String user_id;
    public Integer id;
    public String password;
    public String role;

    public String getUser_id() {
        return user_id;
    }
    
    public Integer getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    
    
}
