/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.homeaffairs.netbeabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author zwavh
 */
public class BookAppointment extends javax.swing.JFrame {

    /**
     * Creates new form BookAppointment
     */
    public BookAppointment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ComboBox1 = new javax.swing.JComboBox<>();
        ComboBox = new javax.swing.JComboBox<>();
        ComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ToggleButton = new javax.swing.JToggleButton();
        FullNames = new javax.swing.JTextField();
        Identity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();
        ConfirmBt = new javax.swing.JButton();
        BookBt = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\zwavh\\OneDrive\\Pictures\\ben.jpg")); // NOI18N
        jLabel3.setFocusable(false);
        jLabel3.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 51, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("            Book Appointment");
        jLabel1.setToolTipText("   ");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 3, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 600, 64));

        ComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    Select  ", "Eastern Cape", "Free State", "Gauteng", "Kwazulu Natal", "Limpopo", "Mpumalanga", "Northern Cape", "North West", "Westen Cape" }));
        ComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 3));
        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 300, 40));

        ComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "       Select", "SA ID", "Passport" }));
        ComboBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 180, 30));

        ComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "       Select", " ID Application", " ID Collection", "eHome Affairs" }));
        ComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 3));
        ComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 300, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("    Names");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 180, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("     Branch");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 180, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("    Province");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 180, -1));

        ToggleButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ToggleButton.setToolTipText("   Click to view Branch name");
        ToggleButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 3));
        ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ToggleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 300, 40));

        FullNames.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FullNames.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FullNames.setToolTipText("    As appear on ID");
        FullNames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 3));
        FullNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNamesActionPerformed(evt);
            }
        });
        jPanel1.add(FullNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 300, 39));

        Identity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Identity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Identity.setToolTipText("        13 digits");
        Identity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 3));
        Identity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentityActionPerformed(evt);
            }
        });
        jPanel1.add(Identity, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 300, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("   Choose date");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 180, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("      Service");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 180, 30));

        DateChooser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 3));
        DateChooser.setDateFormatString("MMM d y");
        DateChooser.setMaxSelectableDate(new java.util.Date(253370761299000L));
        jPanel1.add(DateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 300, 40));

        ConfirmBt.setBackground(new java.awt.Color(51, 51, 51));
        ConfirmBt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ConfirmBt.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmBt.setText("Confirm Details");
        ConfirmBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBtActionPerformed(evt);
            }
        });
        jPanel1.add(ConfirmBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 220, 30));

        BookBt.setBackground(new java.awt.Color(0, 102, 0));
        BookBt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BookBt.setForeground(new java.awt.Color(255, 255, 255));
        BookBt.setText("Book Appointment");
        BookBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBtActionPerformed(evt);
            }
        });
        jPanel1.add(BookBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 220, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\zwavh\\OneDrive\\Pictures\\ben.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 850, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ComboBox1ActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ComboBoxActionPerformed

    private void ComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ComboBox2ActionPerformed

    private void ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonActionPerformed
        // TODO add your handling code here:
                        
        //2 Get Provice name by Index
            int  provinceIndex =    ComboBox1.getSelectedIndex();
            
            
            //Then convert proviceIndex(int) to String(city)
            
            String city = Integer.toString(provinceIndex);
            
            
            //3 get Brance name
            
            if (ToggleButton.isEnabled()){
                
                //if the selected city matches the case then capital city will be set as branch name
                
                
                switch(city){
                    
                    
                    case "1":
                        ToggleButton.setText("Bhisho");
                        ;
                        
                        break;
                        //2
                        
                        
                    case "2":
                        ToggleButton.setText("Bloemfontein ");
                        break;
                        //3
                        
                    case "3":
                        ToggleButton.setText("Johannesburg");
                        
                        
                        break;
                        
                        // 4
                        
                    case "4":
                        
                        ToggleButton.setText("Pietermaritzburg");
                        
                        break;
                        // 5
                        
                    case "5":
                        
                        ToggleButton.setText("Polokwane");
                        
                        break;
                        // 6
                        
                    case "6":
                        
                        ToggleButton.setText("Mbombela");
                        break;
                        // 7
                        
                    case "7":
                        
                        ToggleButton.setText("Kimberley");
                        break;
                        // 8
                        
                    case "8":
                        
                        ToggleButton.setText("Mahikeng");
                        break;
                        //9
                        
                    case "9":
                        
                        ToggleButton.setText("Cape Town");
                        break;
                        //
                    default :
                        
                }
            }
             
    }//GEN-LAST:event_ToggleButtonActionPerformed

    private void FullNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNamesActionPerformed
        // TODO add your handling code here:
          
         
         
    }//GEN-LAST:event_FullNamesActionPerformed

    private void IdentityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdentityActionPerformed
        // TODO add your handling code here:
        
             // TODO add your handling code here:

 
           
    }//GEN-LAST:event_IdentityActionPerformed

    private void ConfirmBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBtActionPerformed
        // TODO add your handling code here:
        
        //1 get fullnames
        
         String fullNames = FullNames.getText();
           
            Pattern pt =Pattern.compile("^[A-z]*\\s[A-z]*|\\s[A-z]*$");
                   Matcher mt = pt.matcher(fullNames);
                   boolean  condition = mt.matches();
                   
               
            //2 Get Provice name by Index
            int  provinceIndex =    ComboBox1.getSelectedIndex();
            
            //Then convert proviceIndex(int) to String(city)
           String city = Integer.toString(provinceIndex);
            
           //if the button is   then go to Switch statement
            if (ToggleButton.isEnabled()){
                
                //if the selected city matches the case then capital city will be set as branch name
                
                
                switch(city){
                    
                    
                    case "1":
                        ToggleButton.setText("Bhisho");
                        ;
                        
                        break;
                        //2
                        
                        
                    case "2":
                        ToggleButton.setText("Bloemfontein ");
                        break;
                        //3
                        
                    case "3":
                        ToggleButton.setText("Johannesburg");
                        
                        
                        break;
                        
                        // 4
                        
                    case "4":
                        
                        ToggleButton.setText("Pietermaritzburg");
                        
                        break;
                        // 5
                        
                    case "5":
                        
                        ToggleButton.setText("Polokwane");
                        
                        break;
                        // 6
                        
                    case "6":
                        
                        ToggleButton.setText("Mbombela");
                        break;
                        // 7
                        
                    case "7":
                        
                        ToggleButton.setText("Kimberley");
                        break;
                        // 8
                        
                    case "8":
                        
                        ToggleButton.setText("Mahikeng");
                        break;
                        //9
                        
                    case "9":
                        
                        ToggleButton.setText("Cape Town");
                        break;
                        //
                    default :
                        
                }
            }
            
            //3 Get selected item ID/Passport by index
         int  idIndex =  ComboBox.getSelectedIndex();
    
            //4get index of selected Service
            
            int  serviceIndex =   ComboBox2.getSelectedIndex();
       
            
            
            
            // 6 GET user IDENTITY number  then match the pattern
            String identity =Identity.getText();
            
            Pattern PT =Pattern.compile("^\\d{13}$");
            Matcher MT = PT.matcher(identity);
            boolean Condition = MT.matches();
            
        
            
            
            //6 get chosen Date
            
            SimpleDateFormat sdf = new  SimpleDateFormat("dd-MM-yyyy");
            
            String date = sdf.format(DateChooser.getDate());
            
            
                              // the condition must true in oder to display HashMap
            if( Condition && condition ){
            //   Map all the customer s informtion key() and value()
            
            
                    //if the ComboBox is not selected therefore Index is 0
            if(idIndex > 0 && provinceIndex > 0 && serviceIndex > 0 ){
                
                
                    HashMap<String,String> show = new HashMap<>();
            
            show.put("Full Names",fullNames);
            show.put(ComboBox.getItemAt(idIndex),identity);
            show.put("Province ",ComboBox1.getItemAt(provinceIndex));
            show.put("Branch",ToggleButton.getText());
            show.put("Service ",ComboBox2.getItemAt(serviceIndex) );
            show.put("Start Date ", date);
                   
            for(Map.Entry<String,String> e: show.entrySet()){
                
                
                          JOptionPane.showMessageDialog(rootPane,e.getKey()+" : " + e.getValue());}
            }
            else{
                    
                           //if the condition is false
                   JOptionPane.showMessageDialog(rootPane," Select all the ComboBox!!");
                    
                    }
                
                
            }
            else{
                
                
                         
                     //if the condition is false
                   JOptionPane.showMessageDialog(rootPane," Fill As appear on ID!!"); 
                    
                         FullNames.removeAll();
                    
                    }         
            
   
        
    }//GEN-LAST:event_ConfirmBtActionPerformed

    private void BookBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookBtActionPerformed
        // TODO add your handling code here:
        
        
            final String url = "jdbc:mysql://localhost:3306/javaprojects";
             final String user = "root";
             final String password = "";
            

                
        //1 get fullnames
        
         String fullNames = FullNames.getText();
           
            Pattern pt =Pattern.compile("^[A-z]*\\s[A-z]*|\\s[A-z]*$");
                   Matcher mt = pt.matcher(fullNames);
                   boolean  condition = mt.matches();
                   
               
            //2 Get Provice name by Index
            int  provinceIndex =    ComboBox1.getSelectedIndex();
            
            //Then convert proviceIndex(int) to String(city)
           String city = Integer.toString(provinceIndex);
            
           //if the button is   then go to Switch statement
            if (ToggleButton.isEnabled()){
                
                //if the selected city matches the case then capital city will be set as branch name
                
                
                switch(city){
                    
                    
                    case "1":
                        ToggleButton.setText("Bhisho");
                        ;
                        
                        break;
                        //2
                        
                        
                    case "2":
                        ToggleButton.setText("Bloemfontein ");
                        break;
                        //3
                        
                    case "3":
                        ToggleButton.setText("Johannesburg");
                        
                        
                        break;
                        
                        // 4
                        
                    case "4":
                        
                        ToggleButton.setText("Pietermaritzburg");
                        
                        break;
                        // 5
                        
                    case "5":
                        
                        ToggleButton.setText("Polokwane");
                        
                        break;
                        // 6
                        
                    case "6":
                        
                        ToggleButton.setText("Mbombela");
                        break;
                        // 7
                        
                    case "7":
                        
                        ToggleButton.setText("Kimberley");
                        break;
                        // 8
                        
                    case "8":
                        
                        ToggleButton.setText("Mahikeng");
                        break;
                        //9
                        
                    case "9":
                        
                        ToggleButton.setText("Cape Town");
                        break;
                        //
                    default :
                        
                }
            }
            
            //3 Get selected item ID/Passport by index
         int  idIndex =  ComboBox.getSelectedIndex();
    
            //4get index of selected Service
            
            int  serviceIndex =   ComboBox2.getSelectedIndex();
       
            
            
            
            // 6 GET user IDENTITY number  then match the pattern
            String identity =Identity.getText();
            
            Pattern PT =Pattern.compile("^\\d{13}$");
            Matcher MT = PT.matcher(identity);
            boolean Condition = MT.matches();
            
        
            
            
            //6 get chosen Date
            
            SimpleDateFormat sdf = new  SimpleDateFormat("dd-MM-yyyy");
            
            String Date = sdf.format(DateChooser.getDate());
            
            
                  //for HashCode
                   if(idIndex > 0 && provinceIndex > 0 && serviceIndex > 0 ){
                
                
                    HashMap<String,String> show = new HashMap<>();
            
            show.put("Full Names",fullNames);
            show.put(ComboBox.getItemAt(idIndex),identity);
            show.put("Province ",ComboBox1.getItemAt(provinceIndex));
            show.put("Branch",ToggleButton.getText());
            show.put("Service ",ComboBox2.getItemAt(serviceIndex) );
            show.put("Start Date ", Date);
             
           
             

              //
             Connection con = null;
             PreparedStatement stm ;
             //
        
        // //INSERT INTO `booking`(`Names, `Type`, `ID NO`, `Province`, `Branch`, `Service`, `Date`)
             
             String values = "INSERT INTO booking  VALUES (?,?,?,?,?,?,?,?)";
        
                         String Reference = Integer.toString(show.hashCode());
        
        
         try {
               
             con = DriverManager.getConnection(url, user, password);
             
             
                    if(con != null ){
             
            
                     stm = con.prepareStatement(values);

                    stm.setString(1, fullNames);
                    stm.setString(2, ComboBox.getItemAt(idIndex));
                    stm.setString(3, identity);
                    stm.setString(4, ComboBox1.getItemAt(provinceIndex));
                    stm.setString(5, ToggleButton.getText());
                    stm.setString(6, ComboBox2.getItemAt(serviceIndex));
                    stm.setString(7, Date);
                    stm.setString(8, Reference);

                       stm.execute();

 
                   JOptionPane.showMessageDialog(rootPane,"Appointment Successful Booked!\n Ref no : " + show.hashCode()+" \n Use Reference number to view appointment");
                           
                                 Appointment  clasApp = new Appointment();
                                         clasApp.setVisible(true);
                   
             con.close();
              stm.close();
             }  else{
                    
                    
                    JOptionPane.showMessageDialog(rootPane,"The system is currently Under Construction Please try again later");
                    
                    
                    }
    
         } catch (Exception e) {
            
           e.printStackTrace();
         
 }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
                
              
        
        
        
        
        
        
        
        
        
                   } 
        
          
    }//GEN-LAST:event_BookBtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookBt;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JComboBox<String> ComboBox2;
    private javax.swing.JButton ConfirmBt;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JTextField FullNames;
    private javax.swing.JTextField Identity;
    private javax.swing.JToggleButton ToggleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
