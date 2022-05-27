/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Admin;

import com.mysql.jdbc.Connection;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author warun
 */
public class Privileges extends javax.swing.JInternalFrame {
    
    java.sql.Connection con;
    
    /**
     * Creates new form Profiles
     */
    public Privileges() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        con=DBConnect.connect();
        PreparedStatement pst;
        ResultSet rs;
        
        this.setSize(1000,600);
        
        displayTable();
        displayStudent();
        displayLecturer();
        displayTechofficer();
        setDepartment();
    }
    
    public void tableClick(){
       
    }
    
    public void displayTable(){
        Admin admin=new Admin();
        
       DefaultTableModel model=(DefaultTableModel) admins.getModel();
        
         model.setRowCount(0);
         admin.display();
         
         for (Object data : admin.getData()) {
            model.addRow((Vector)data);
        }
    }
    
    
    public void setDepartment(){   
        
        try {
            String sql="select * from department";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next()) { 
           department.addItem(rs.getString("name"));
           lecturer_department.addItem(rs.getString("name"));
           tof_department.addItem(rs.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
        
    }
    
     public void displayStudent(){
         Users std=new Users();
        
         DefaultTableModel model=(DefaultTableModel) student.getModel();
        
         model.setRowCount(0);
         std.display();
         
         for (Object data : std.getData()) {
            model.addRow((Vector)data);
        }
    }
     
     
     public void displayLecturer(){
         Lecturer lec=new Lecturer();
        
       DefaultTableModel model=(DefaultTableModel) lecturer.getModel();
        
         model.setRowCount(0);
         lec.display();
         
         for (Object data : lec.getData()) {
            model.addRow((Vector)data);
        }
    }
     
     
     public void displayTechofficer(){
         Techofficer tec=new Techofficer();
        
       DefaultTableModel model=(DefaultTableModel) techofficer.getModel();
        
         model.setRowCount(0);
         tec.display();
         
         for (Object data : tec.getData()) {
            model.addRow((Vector)data);
        }
    } 
    
    public void clear(){
            f_name.setText("");
            l_name.setText("");
            Date date=new Date(01/01/1999);
            dob.setDate(date);
            gender.setSelectedItem("");
            nic.setText("");
            address.setText("");
            contact.setText("");
            email.setText("");
            imageLbl.setIcon(null);
            imgPath.setText("");
            
            stu_f_name.setText("");
            stu_l_name.setText("");
            stu_dob.setDate(date);
            stu_gender.setSelectedItem("");
            stu_nic.setText("");
            stu_address.setText("");
            stu_contact.setText("");
            stu_email.setText("");
            stu_imageLbl.setIcon(null);
            stu_imgPath.setText("");
            
            lecturer_f_name.setText("");
            lecturer_l_name.setText("");
            lecturer_dob.setDate(date);
            lecturer_gender.setSelectedItem("");
            lecturer_nic.setText("");
            lecturer_address.setText("");
            lecturer_contact.setText("");
            lecturer_email.setText("");
            lecturer_imageLbl.setIcon(null);
            lecturer_imgPath.setText("");
            
            tof_f_name.setText("");
            tof_l_name.setText("");
            tof_dob.setDate(date);
            tof_gender.setSelectedItem("");
            tof_nic.setText("");
            tof_address.setText("");
            tof_contact.setText("");
            tof_email.setText("");
            tof_imageLbl.setIcon(null);
            tof_imgPath.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        admins = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        imageLbl = new javax.swing.JLabel();
        imgPath = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        l_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        f_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nic = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        stu_f_name = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        stu_l_name = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        stu_dob = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        stu_gender = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        stu_nic = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        stu_address = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        stu_contact = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        stu_email = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        student = new javax.swing.JTable();
        stu_imageLbl = new javax.swing.JLabel();
        stu_imgPath = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        department = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        lecturer_f_name = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        lecturer_l_name = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        lecturer_dob = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        lecturer_gender = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        lecturer_nic = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lecturer_address = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        lecturer_contact = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        lecturer_email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lecturer_department = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        lecturer_imageLbl = new javax.swing.JLabel();
        lecturer_imgPath = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        lecturer = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        tof_f_name = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        tof_l_name = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tof_dob = new com.toedter.calendar.JDateChooser();
        jLabel30 = new javax.swing.JLabel();
        tof_gender = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        tof_nic = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tof_address = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        tof_contact = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        tof_email = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        tof_department = new javax.swing.JComboBox<>();
        jButton16 = new javax.swing.JButton();
        tof_imgPath = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        techofficer = new javax.swing.JTable();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        tof_imageLbl = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        admins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "DOB", "Gender", "NIC", "Address", "Contact", "E-mail"
            }
        ));
        admins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(admins);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Image"));

        imageLbl.setMaximumSize(new java.awt.Dimension(200, 300));
        imageLbl.setMinimumSize(new java.awt.Dimension(200, 300));
        imageLbl.setPreferredSize(new java.awt.Dimension(200, 300));

        jButton5.setText("Add Img");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgPath, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imgPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jButton5)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Information"));

        jLabel1.setText("First Name");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel3.setText("Date of birth");

        jLabel6.setText("Address");

        jLabel5.setText("NIC");

        jLabel2.setText("Last Name");

        jLabel7.setText("Contact");

        jLabel4.setText("Gender");

        jLabel8.setText("E-mail");

        address.setColumns(20);
        address.setRows(5);
        jScrollPane2.setViewportView(address);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(f_name)
                    .addComponent(l_name)
                    .addComponent(nic)
                    .addComponent(contact)
                    .addComponent(email)
                    .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(f_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(l_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("Admin", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("First Name");

        jLabel12.setText("Last Name");

        jLabel13.setText("Date of birth");

        jLabel14.setText("Gender");

        stu_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel15.setText("NIC");

        jLabel16.setText("Address");

        stu_address.setColumns(20);
        stu_address.setRows(5);
        jScrollPane3.setViewportView(stu_address);

        jLabel17.setText("Contact");

        jLabel18.setText("E-mail");

        jButton6.setText("Save");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Delete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Clear");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "DOB", "Gender", "NIC", "Address", "Contact", "E-mail", "Department"
            }
        ));
        student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(student);

        stu_imageLbl.setMaximumSize(new java.awt.Dimension(200, 300));
        stu_imageLbl.setMinimumSize(new java.awt.Dimension(200, 300));
        stu_imageLbl.setPreferredSize(new java.awt.Dimension(200, 300));

        jButton10.setText("Add Img");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel9.setText("Department");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(stu_f_name)
                            .addComponent(stu_l_name)
                            .addComponent(stu_nic)
                            .addComponent(stu_contact)
                            .addComponent(stu_email, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(stu_gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stu_dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addComponent(department, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jButton10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stu_imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stu_imgPath, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(stu_f_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(stu_l_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(stu_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(stu_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(stu_nic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(stu_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(stu_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton7)
                            .addComponent(jButton8)
                            .addComponent(jButton9)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stu_imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stu_imgPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButton10)))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Student", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setText("First Name");

        jLabel20.setText("Last Name");

        jLabel21.setText("Date of birth");

        jLabel22.setText("Gender");

        lecturer_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel23.setText("NIC");

        jLabel24.setText("Address");

        lecturer_address.setColumns(20);
        lecturer_address.setRows(5);
        jScrollPane5.setViewportView(lecturer_address);

        jLabel25.setText("Contact");

        jLabel26.setText("E-mail");

        jLabel10.setText("Department");

        jButton11.setText("Save");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Update");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Delete");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Clear");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Add Img");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        lecturer_imageLbl.setMaximumSize(new java.awt.Dimension(200, 300));
        lecturer_imageLbl.setMinimumSize(new java.awt.Dimension(200, 300));
        lecturer_imageLbl.setPreferredSize(new java.awt.Dimension(200, 300));

        lecturer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "DOB", "Gender", "NIC", "Address", "Contact", "E-mail", "Department"
            }
        ));
        lecturer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecturerMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(lecturer);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel10))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lecturer_f_name)
                            .addComponent(lecturer_l_name)
                            .addComponent(lecturer_nic)
                            .addComponent(lecturer_contact)
                            .addComponent(lecturer_email, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(lecturer_gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lecturer_dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane5)
                            .addComponent(lecturer_department, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton14))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jButton15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lecturer_imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lecturer_imgPath, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(lecturer_f_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(lecturer_l_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(lecturer_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(lecturer_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(lecturer_nic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(lecturer_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(lecturer_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(lecturer_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton11)
                            .addComponent(jButton12)
                            .addComponent(jButton13)
                            .addComponent(jButton14)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lecturer_imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lecturer_imgPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButton15)))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(" Lecturer", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setText("First Name");

        jLabel28.setText("Last Name");

        jLabel29.setText("Date of birth");

        jLabel30.setText("Gender");

        tof_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel31.setText("NIC");

        jLabel32.setText("Address");

        tof_address.setColumns(20);
        tof_address.setRows(5);
        jScrollPane7.setViewportView(tof_address);

        jLabel33.setText("Contact");

        jLabel34.setText("E-mail");

        jLabel35.setText("Department");

        jButton16.setText("Add Img");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        techofficer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "DOB", "Gender", "NIC", "Address", "Contact", "E-mail", "Department"
            }
        ));
        techofficer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                techofficerMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(techofficer);

        jButton17.setText("Save");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Update");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Delete");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("Clear");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        tof_imageLbl.setMaximumSize(new java.awt.Dimension(200, 300));
        tof_imageLbl.setMinimumSize(new java.awt.Dimension(200, 300));
        tof_imageLbl.setPreferredSize(new java.awt.Dimension(200, 300));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tof_f_name)
                            .addComponent(tof_l_name)
                            .addComponent(tof_nic)
                            .addComponent(tof_contact)
                            .addComponent(tof_email)
                            .addComponent(tof_gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tof_dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane7)
                            .addComponent(tof_department, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(229, 229, 229)
                        .addComponent(tof_imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton17)
                        .addGap(18, 18, 18)
                        .addComponent(jButton18)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19)
                        .addGap(18, 18, 18)
                        .addComponent(jButton20)))
                .addContainerGap(285, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(558, 558, 558)
                            .addComponent(jButton16))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(529, 529, 529)
                            .addComponent(tof_imgPath, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(355, 355, 355)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(50, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tof_f_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(tof_l_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(tof_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(tof_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(tof_nic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(tof_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(tof_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tof_imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(tof_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17)
                    .addComponent(jButton18)
                    .addComponent(jButton19)
                    .addComponent(jButton20))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(217, 217, 217)
                    .addComponent(tof_imgPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)
                    .addComponent(jButton16)
                    .addContainerGap(175, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Technical Officer", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Admin admin=new Admin();
       
      
       String f_name=this.f_name.getText();
       String l_name=this.l_name.getText();
       //Data Format
       SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
       String dob=sdf.format(this.dob.getDate());
       String gender=this.gender.getSelectedItem().toString();
       String nic=this.nic.getText();
       String address=this.address.getText();
       Integer contact=Integer.parseInt(this.contact.getText());
       String email=this.email.getText();
       String image=imgPath.getText();
       image=image.replace("\\", "\\\\");
       
       
       admin.setF_name(f_name);
       admin.setL_name(l_name);
       admin.setDob(dob);
       admin.setGender(gender);
       admin.setNic(nic);
       admin.setAddress(address);
       admin.setContact(contact);
       admin.setEmail(email);
       admin.setImage(image);
       admin.insert();
       displayTable();
       clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void adminsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminsMouseClicked
         try {
            Admin admin=new Admin();
            DefaultTableModel d = (DefaultTableModel)admins.getModel();
            int row=admins.getSelectedRow();
            int id=(int) admins.getValueAt(row, 0);
            //JOptionPane.showMessageDialog(null, row);
            int count=admins.getRowCount();
            
            //JOptionPane.showMessageDialog(null, id);
            admin.select(id);
            f_name.setText(admin.getF_name());
            l_name.setText(admin.getL_name());
            Date date=new SimpleDateFormat("yyyy-MM-dd").parse(admin.getDob());
            dob.setDate(date);
            gender.setSelectedItem(admin.getGender());
            nic.setText(admin.getNic());
            address.setText(admin.getAddress());
            contact.setText(admin.getContact().toString());
            email.setText(admin.getEmail());
            
           
       String filname=admin.getImage();
       imgPath.setText(filname);
       Image getAbsolutePath=null;
       ImageIcon icon=new ImageIcon(filname);
       Image image=icon.getImage().getScaledInstance(imageLbl.getWidth(),imageLbl.getHeight(), Image.SCALE_SMOOTH);
       imageLbl.setIcon(new ImageIcon(image));
         
            
            jButton1.setEnabled(false);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         
    }//GEN-LAST:event_adminsMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Admin admin=new Admin();
            DefaultTableModel d = (DefaultTableModel)admins.getModel();
            int row=admins.getSelectedRow();
            int id=(int) admins.getValueAt(row, 0);
            //JOptionPane.showMessageDialog(null, row);
            int count=admins.getRowCount();
            
            //JOptionPane.showMessageDialog(null, id);
           
            String f_name=this.f_name.getText();
            String l_name=this.l_name.getText();
            //Data Format
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            String dob=sdf.format(this.dob.getDate());
            String gender=this.gender.getSelectedItem().toString();
            String nic=this.nic.getText();
            String address=this.address.getText();
            Integer contact=Integer.parseInt(this.contact.getText());
            String email=this.email.getText();
            String image=imgPath.getText();
            image=image.replace("\\", "\\\\");
        
            
            admin.setF_name(f_name);
            admin.setL_name(l_name);
            admin.setDob(dob);
            admin.setGender(gender);
            admin.setNic(nic);
            admin.setAddress(address);
            admin.setContact(contact);
            admin.setEmail(email);
            admin.setImage(image);
            admin.setId(id);
            admin.update();
            displayTable();
            clear();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try {
            Admin admin=new Admin();
            DefaultTableModel d = (DefaultTableModel)admins.getModel();
            int row=admins.getSelectedRow();
            int id=(int) admins.getValueAt(row, 0);
            //JOptionPane.showMessageDialog(null, row);
            int count=admins.getRowCount();
            
            //JOptionPane.showMessageDialog(null, id);
          
            admin.delete(id);
            displayTable();
            clear();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       JFileChooser chooser= new JFileChooser();
       chooser.showOpenDialog(null);
       File f=chooser.getSelectedFile();
       String filname=f.getAbsolutePath();
       imgPath.setText(filname);
       Image getAbsolutePath=null;
       ImageIcon icon=new ImageIcon(filname);
       Image image=icon.getImage().getScaledInstance(imageLbl.getWidth(),imageLbl.getHeight(), Image.SCALE_SMOOTH);
       imageLbl.setIcon(new ImageIcon(image));
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       Users std=new Users();
       
    
       String f_name=stu_f_name.getText();
       String l_name=stu_l_name.getText();
       //Data Format
       SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
       String dob=sdf.format(stu_dob.getDate());
       String gender=stu_gender.getSelectedItem().toString();
       String nic=stu_nic.getText();
       String address=stu_address.getText();
       Integer contact=Integer.parseInt(stu_contact.getText());
       String email=stu_email.getText();
       String image=stu_imgPath.getText();
       String department=this.department.getSelectedItem().toString();
       image=image.replace("\\", "\\\\");
       
       
     
       std.setF_name(f_name);
       std.setL_name(l_name);
       std.setDob(dob);
       std.setGender(gender);
       std.setNic(nic);
       std.setAddress(address);
       std.setContact(contact);
       std.setEmail(email);
       std.setImage(image);
       std.setDepartment(department);
       std.insert();
       displayLecturer();
       clear();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          try {
            Users std=new Users();
            DefaultTableModel d = (DefaultTableModel)student.getModel();
            int row=student.getSelectedRow();
            int id=(int) student.getValueAt(row, 0);
            //JOptionPane.showMessageDialog(null, row);
            int count=student.getRowCount();
            
            //JOptionPane.showMessageDialog(null, id);
            std.select(id);
            String f_name=stu_f_name.getText();
            String l_name=stu_l_name.getText();
            //Data Format
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            String dob=sdf.format(stu_dob.getDate());
            String gender=stu_gender.getSelectedItem().toString();
            String nic=stu_nic.getText();
            String address=stu_address.getText();
            Integer contact=Integer.parseInt(stu_contact.getText());
            String email=stu_email.getText();
            String image=stu_imgPath.getText();
            image=image.replace("\\", "\\\\");
            String department=this.department.getSelectedItem().toString();
           
            std.setF_name(f_name);
            std.setL_name(l_name);
            std.setDob(dob);
            std.setGender(gender);
            std.setNic(nic);
            std.setAddress(address);
            std.setContact(contact);
            std.setEmail(email);
            std.setImage(image);
            std.setDepartment(department);
            std.setId(id);
            std.update();
            displayLecturer();
            clear();
         
            
            jButton6.setEnabled(false);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }  
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
             try {
            Users std=new Users();
            DefaultTableModel d = (DefaultTableModel)student.getModel();
            int row=student.getSelectedRow();
            int id=(int) student.getValueAt(row, 0);
            //JOptionPane.showMessageDialog(null, row);
            int count=student.getRowCount();
            
            //JOptionPane.showMessageDialog(null, id);
          
            std.delete(id);
            displayStudent();
            clear();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       clear();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMouseClicked
         try {
            Users std=new Users();
            DefaultTableModel d = (DefaultTableModel)student.getModel();
            int row=student.getSelectedRow();
            int id=(int) student.getValueAt(row, 0);
            //JOptionPane.showMessageDialog(null, row);
            int count=student.getRowCount();
            
            //JOptionPane.showMessageDialog(null, id);
            std.select(id);
            stu_f_name.setText(std.getF_name());
            stu_l_name.setText(std.getL_name());
            Date date=new SimpleDateFormat("yyyy-MM-dd").parse(std.getDob());
            stu_dob.setDate(date);
            stu_gender.setSelectedItem(std.getGender());
            stu_nic.setText(std.getNic());
            stu_address.setText(std.getAddress());
            stu_contact.setText(std.getContact().toString());
            stu_email.setText(std.getEmail());
            department.setSelectedItem(std.getDepartment());
           
            String filname=std.getImage();
            stu_imgPath.setText(filname);
            Image getAbsolutePath=null;
            ImageIcon icon=new ImageIcon(filname);
            Image image=icon.getImage().getScaledInstance(stu_imageLbl.getWidth(),stu_imageLbl.getHeight(), Image.SCALE_SMOOTH);
            stu_imageLbl.setIcon(new ImageIcon(image));
         
            
            jButton6.setEnabled(false);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_studentMouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       JFileChooser chooser= new JFileChooser();
       chooser.showOpenDialog(null);
       File f=chooser.getSelectedFile();
       String filname=f.getAbsolutePath();
       stu_imgPath.setText(filname);
       Image getAbsolutePath=null;
       ImageIcon icon=new ImageIcon(filname);
       Image image=icon.getImage().getScaledInstance(stu_imageLbl.getWidth(),stu_imageLbl.getHeight(), Image.SCALE_SMOOTH);
       stu_imageLbl.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Lecturer lec=new Lecturer();
      
       String f_name=lecturer_f_name.getText();
       String l_name=lecturer_l_name.getText();
       //Data Format
       SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
       String dob=sdf.format(lecturer_dob.getDate());
       String gender=lecturer_gender.getSelectedItem().toString();
       String nic=lecturer_nic.getText();
       String address=lecturer_address.getText();
       Integer contact=Integer.parseInt(lecturer_contact.getText());
       String email=lecturer_email.getText();
       String image=lecturer_imgPath.getText();
       String department=lecturer_department.getSelectedItem().toString();
       image=image.replace("\\", "\\\\");
       
       
     
       lec.setF_name(f_name);
       lec.setL_name(l_name);
       lec.setDob(dob);
       lec.setGender(gender);
       lec.setNic(nic);
       lec.setAddress(address);
       lec.setContact(contact);
       lec.setEmail(email);
       lec.setImage(image);
       lec.setDepartment(department);
       lec.insert();
       displayStudent();
       clear();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
            Lecturer lec=new Lecturer();
            DefaultTableModel d = (DefaultTableModel)lecturer.getModel();
            int row=lecturer.getSelectedRow();
            int id=(int) lecturer.getValueAt(row, 0);
            //JOptionPane.showMessageDialog(null, row);
            int count=lecturer.getRowCount();
            
            //JOptionPane.showMessageDialog(null, id);
            lec.select(id);
            String f_name=lecturer_f_name.getText();
            String l_name=lecturer_l_name.getText();
            //Data Format
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            String dob=sdf.format(lecturer_dob.getDate());
            String gender=lecturer_gender.getSelectedItem().toString();
            String nic=lecturer_nic.getText();
            String address=lecturer_address.getText();
            Integer contact=Integer.parseInt(lecturer_contact.getText());
            String email=lecturer_email.getText();
            String image=lecturer_imgPath.getText();
            image=image.replace("\\", "\\\\");
            String department=lecturer_department.getSelectedItem().toString();
           
            lec.setF_name(f_name);
            lec.setL_name(l_name);
            lec.setDob(dob);
            lec.setGender(gender);
            lec.setNic(nic);
            lec.setAddress(address);
            lec.setContact(contact);
            lec.setEmail(email);
            lec.setImage(image);
            lec.setDepartment(department);
            lec.setId(id);
            lec.update();
            displayStudent();
            clear();
         
            
            jButton6.setEnabled(false);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }  
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
         try {
            Lecturer lec=new Lecturer();
            DefaultTableModel d = (DefaultTableModel)lecturer.getModel();
            int row=lecturer.getSelectedRow();
            int id=(int) lecturer.getValueAt(row, 0);
            //JOptionPane.showMessageDialog(null, row);
            int count=lecturer.getRowCount();
            
            //JOptionPane.showMessageDialog(null, id);
          
            lec.delete(id);
            displayLecturer();
            clear();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        clear();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       JFileChooser chooser= new JFileChooser();
       chooser.showOpenDialog(null);
       File f=chooser.getSelectedFile();
       String filname=f.getAbsolutePath();
       lecturer_imgPath.setText(filname);
       Image getAbsolutePath=null;
       ImageIcon icon=new ImageIcon(filname);
       Image image=icon.getImage().getScaledInstance(lecturer_imageLbl.getWidth(),lecturer_imageLbl.getHeight(), Image.SCALE_SMOOTH);
       lecturer_imageLbl.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_jButton15ActionPerformed

    private void lecturerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturerMouseClicked
        try {
            Users std=new Users();
            DefaultTableModel d = (DefaultTableModel)lecturer.getModel();
            int row=lecturer.getSelectedRow();
            int id=(int) lecturer.getValueAt(row, 0);
            //JOptionPane.showMessageDialog(null, row);
            int count=lecturer.getRowCount();
            
            //JOptionPane.showMessageDialog(null, id);
            std.select(id);
            lecturer_f_name.setText(std.getF_name());
            lecturer_l_name.setText(std.getL_name());
            Date date=new SimpleDateFormat("yyyy-MM-dd").parse(std.getDob());
            lecturer_dob.setDate(date);
            lecturer_gender.setSelectedItem(std.getGender());
            lecturer_nic.setText(std.getNic());
            lecturer_address.setText(std.getAddress());
            lecturer_contact.setText(std.getContact().toString());
            lecturer_email.setText(std.getEmail());
            lecturer_department.setSelectedItem(std.getDepartment());
           
            String filname=std.getImage();
            lecturer_imgPath.setText(filname);
            Image getAbsolutePath=null;
            ImageIcon icon=new ImageIcon(filname);
            Image image=icon.getImage().getScaledInstance(lecturer_imageLbl.getWidth(),lecturer_imageLbl.getHeight(), Image.SCALE_SMOOTH);
            lecturer_imageLbl.setIcon(new ImageIcon(image));
         
            
            jButton6.setEnabled(false);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_lecturerMouseClicked

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        JFileChooser chooser= new JFileChooser();
       chooser.showOpenDialog(null);
       File f=chooser.getSelectedFile();
       String filname=f.getAbsolutePath();
       tof_imgPath.setText(filname);
       Image getAbsolutePath=null;
       ImageIcon icon=new ImageIcon(filname);
       Image image=icon.getImage().getScaledInstance(tof_imageLbl.getWidth(),tof_imageLbl.getHeight(), Image.SCALE_SMOOTH);
       tof_imageLbl.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_jButton16ActionPerformed

    private void techofficerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_techofficerMouseClicked
       try {
            Techofficer tec=new Techofficer();
            DefaultTableModel d = (DefaultTableModel)techofficer.getModel();
            int row=techofficer.getSelectedRow();
            int id=(int) techofficer.getValueAt(row, 0);
            //JOptionPane.showMessageDialog(null, row);
            int count=techofficer.getRowCount();
            
            //JOptionPane.showMessageDialog(null, id);
            tec.select(id);
            tof_f_name.setText(tec.getF_name());
            tof_l_name.setText(tec.getL_name());
            Date date=new SimpleDateFormat("yyyy-MM-dd").parse(tec.getDob());
            tof_dob.setDate(date);
            tof_gender.setSelectedItem(tec.getGender());
            tof_nic.setText(tec.getNic());
            tof_address.setText(tec.getAddress());
            tof_contact.setText(tec.getContact().toString());
            tof_email.setText(tec.getEmail());
            tof_department.setSelectedItem(tec.getDepartment());
           
            String filname=tec.getImage();
            tof_imgPath.setText(filname);
            Image getAbsolutePath=null;
            ImageIcon icon=new ImageIcon(filname);
            Image image=icon.getImage().getScaledInstance(tof_imageLbl.getWidth(),tof_imageLbl.getHeight(), Image.SCALE_SMOOTH);
            tof_imageLbl.setIcon(new ImageIcon(image));
         
            
            jButton6.setEnabled(false);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_techofficerMouseClicked

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        Techofficer tec=new Techofficer();
      
       String f_name=tof_f_name.getText();
       String l_name=tof_l_name.getText();
       //Data Format
       SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
       String dob=sdf.format(tof_dob.getDate());
       String gender=tof_gender.getSelectedItem().toString();
       String nic=tof_nic.getText();
       String address=tof_address.getText();
       Integer contact=Integer.parseInt(tof_contact.getText());
       String email=tof_email.getText();
       String image=tof_imgPath.getText();
       String department=tof_department.getSelectedItem().toString();
       image=image.replace("\\", "\\\\");
       
       
     
       tec.setF_name(f_name);
       tec.setL_name(l_name);
       tec.setDob(dob);
       tec.setGender(gender);
       tec.setNic(nic);
       tec.setAddress(address);
       tec.setContact(contact);
       tec.setEmail(email);
       tec.setImage(image);
       tec.setDepartment(department);
       tec.insert();
       
       displayTechofficer();
       clear();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        try {
            Techofficer tec=new Techofficer();
            DefaultTableModel d = (DefaultTableModel)techofficer.getModel();
            int row=techofficer.getSelectedRow();
            int id=(int) techofficer.getValueAt(row, 0);
            //JOptionPane.showMessageDialog(null, row);
            int count=techofficer.getRowCount();
            
            //JOptionPane.showMessageDialog(null, id);
            tec.select(id);
            String f_name=tof_f_name.getText();
            String l_name=tof_l_name.getText();
            //Data Format
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            String dob=sdf.format(tof_dob.getDate());
            String gender=tof_gender.getSelectedItem().toString();
            String nic=tof_nic.getText();
            String address=tof_address.getText();
            Integer contact=Integer.parseInt(tof_contact.getText());
            String email=tof_email.getText();
            String image=tof_imgPath.getText();
            image=image.replace("\\", "\\\\");
            String department=tof_department.getSelectedItem().toString();
           
            tec.setF_name(f_name);
            tec.setL_name(l_name);
            tec.setDob(dob);
            tec.setGender(gender);
            tec.setNic(nic);
            tec.setAddress(address);
            tec.setContact(contact);
            tec.setEmail(email);
            tec.setImage(image);
            tec.setDepartment(department);
            tec.setId(id);
            tec.update();
            displayTechofficer();
            clear();
         
            
            jButton6.setEnabled(false);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }  
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
       try {
            Techofficer tec=new Techofficer();
            DefaultTableModel d = (DefaultTableModel)techofficer.getModel();
            int row=techofficer.getSelectedRow();
            int id=(int) techofficer.getValueAt(row, 0);
            //JOptionPane.showMessageDialog(null, row);
            int count=techofficer.getRowCount();
            
            //JOptionPane.showMessageDialog(null, id);
          
            tec.delete(id);
            displayTechofficer();
            clear();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
       clear();
    }//GEN-LAST:event_jButton20ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JTable admins;
    private javax.swing.JTextField contact;
    private javax.swing.JComboBox<String> department;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField f_name;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JTextField imgPath;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField l_name;
    private javax.swing.JTable lecturer;
    private javax.swing.JTextArea lecturer_address;
    private javax.swing.JTextField lecturer_contact;
    private javax.swing.JComboBox<String> lecturer_department;
    private com.toedter.calendar.JDateChooser lecturer_dob;
    private javax.swing.JTextField lecturer_email;
    private javax.swing.JTextField lecturer_f_name;
    private javax.swing.JComboBox<String> lecturer_gender;
    private javax.swing.JLabel lecturer_imageLbl;
    private javax.swing.JTextField lecturer_imgPath;
    private javax.swing.JTextField lecturer_l_name;
    private javax.swing.JTextField lecturer_nic;
    private javax.swing.JTextField nic;
    private javax.swing.JTextArea stu_address;
    private javax.swing.JTextField stu_contact;
    private com.toedter.calendar.JDateChooser stu_dob;
    private javax.swing.JTextField stu_email;
    private javax.swing.JTextField stu_f_name;
    private javax.swing.JComboBox<String> stu_gender;
    private javax.swing.JLabel stu_imageLbl;
    private javax.swing.JTextField stu_imgPath;
    private javax.swing.JTextField stu_l_name;
    private javax.swing.JTextField stu_nic;
    private javax.swing.JTable student;
    private javax.swing.JTable techofficer;
    private javax.swing.JTextArea tof_address;
    private javax.swing.JTextField tof_contact;
    private javax.swing.JComboBox<String> tof_department;
    private com.toedter.calendar.JDateChooser tof_dob;
    private javax.swing.JTextField tof_email;
    private javax.swing.JTextField tof_f_name;
    private javax.swing.JComboBox<String> tof_gender;
    private javax.swing.JLabel tof_imageLbl;
    private javax.swing.JTextField tof_imgPath;
    private javax.swing.JTextField tof_l_name;
    private javax.swing.JTextField tof_nic;
    // End of variables declaration//GEN-END:variables

        
    
    
}


