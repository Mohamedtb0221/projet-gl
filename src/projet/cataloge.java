/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projet;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author RAM Tech OM
 */
public class cataloge extends javax.swing.JFrame {

    /**
     * Creates new form cataloge
     */
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        reference = new javax.swing.JTextField();
        designation = new javax.swing.JTextField();
        valeurnutri = new javax.swing.JTextField();
        poidsnet = new javax.swing.JTextField();
        ingredients = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        rechercher = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableproduit = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        dateprod = new com.toedter.calendar.JDateChooser();
        dateexpir = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(242, 0, 51));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("cataloge des produits");

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 0, 51));
        jLabel2.setText("reference :");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 0, 51));
        jLabel3.setText("designation :");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 0, 51));
        jLabel4.setText("valeur nutri :");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 0, 51));
        jLabel5.setText("date_prod :");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 0, 51));
        jLabel6.setText("date expir :");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 0, 51));
        jLabel7.setText("poids net :");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 0, 51));
        jLabel8.setText("liste ingredients :");

        designation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationActionPerformed(evt);
            }
        });

        valeurnutri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valeurnutriActionPerformed(evt);
            }
        });

        poidsnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poidsnetActionPerformed(evt);
            }
        });

        ingredients.setForeground(new java.awt.Color(102, 102, 102));
        ingredients.setText("juste pour les derivées");
        ingredients.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ingredientsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ingredientsFocusLost(evt);
            }
        });
        ingredients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredientsActionPerformed(evt);
            }
        });

        addbtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        addbtn.setText("ajouter");
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        modifier.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        modifier.setText("modifier");
        modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifierMouseClicked(evt);
            }
        });
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });

        supprimer.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        supprimer.setText("supprimer");
        supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supprimerMouseClicked(evt);
            }
        });
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        rechercher.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rechercher.setText("rechercher");
        rechercher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechercherMouseClicked(evt);
            }
        });
        rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton7.setText("retour");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        tableproduit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tableproduit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "reference", "designation", "valeur nutri", "date_prod", "date_expir", "poids net", "ingredients", "type"
            }
        ));
        tableproduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableproduitMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableproduit);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("liste des produits");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(242, 0, 51));
        jLabel10.setText("type :");

        type.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lait cru", "lait pasteurisé", "lait stérilisé", "lait UHT", "lait concentré", "fromage", "yaourt", "crème fraiche", "beurre" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(addbtn)
                        .addGap(27, 27, 27)
                        .addComponent(modifier)
                        .addGap(29, 29, 29)
                        .addComponent(supprimer)
                        .addGap(30, 30, 30)
                        .addComponent(rechercher))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton7)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(poidsnet))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(designation)
                                            .addComponent(reference)
                                            .addComponent(valeurnutri)
                                            .addComponent(type, 0, 162, Short.MAX_VALUE)
                                            .addComponent(dateprod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dateexpir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ingredients, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(257, 257, 257)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valeurnutri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(dateprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateexpir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(poidsnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingredients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valeurnutriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valeurnutriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valeurnutriActionPerformed

    private void ingredientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingredientsActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addbtnActionPerformed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifierActionPerformed

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supprimerActionPerformed

    private void rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rechercherActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
                    agent_de_vente c =new agent_de_vente();
                    c.setVisible(true);
                    this.hide();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
     public cataloge() {
        initComponents();
        selectprod();
    }
    Connection conn = null;
    Statement st =null;
    ResultSet rs=null; 
    
    public void selectprod(){
        try{
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/projet", "root", "medtb21");
            st =conn.createStatement();
            rs=st.executeQuery("select reference,designation,valeurnutri,dateprod,dateexpir,poidsnet,ingredients,type from produit ");
            tableproduit.setModel(DbUtils.resultSetToTableModel(rs));
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
        try{

        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/projet", "root", "medtb21");
        st =conn.createStatement();
        rs=st.executeQuery("select * from produit where reference = "+Integer.valueOf(reference.getText()));
        if(rs.next()){
            JOptionPane.showMessageDialog(this, "la reference entrée est deja utilisé !");
        }else{
            if(type.getSelectedItem().toString().equals("fromage")||type.getSelectedItem().toString().equals("yaourt")||type.getSelectedItem().toString().equals("lait concentré")||type.getSelectedItem().toString().equals("crème fraiche")||type.getSelectedItem().toString().equals("beurre"))
            {
        
        PreparedStatement add=conn.prepareStatement("insert into produit values (?,?,?,?,?,?,?,?,?)");
        
        if(reference.getText().isEmpty()||designation.getText().isEmpty()||valeurnutri.getText().isEmpty()||poidsnet.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "veilluez remplir tout les information de votre produit !");
        }else{
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            add.setInt(1,Integer.valueOf(reference.getText()));
            add.setString(2,designation.getText());
            add.setInt(3,Integer.valueOf(valeurnutri.getText()));
            add.setString(4,dcn.format(dateprod.getDate()));
            add.setString(5,dcn.format(dateexpir.getDate()));
            add.setInt(6,Integer.valueOf(poidsnet.getText()));
            add.setString(7,ingredients.getText());
            add.setInt(8,0);
            add.setString(9,type.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "produit ajouté !");
            }
            }else{
                PreparedStatement add=conn.prepareStatement("insert into produit values (?,?,?,?,?,?,?,?,?)");
        
        if(reference.getText().isEmpty()||designation.getText().isEmpty()||valeurnutri.getText().isEmpty()||poidsnet.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "veilluez remplir tout les information de votre produit !");
        }else{
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            add.setInt(1,Integer.valueOf(reference.getText()));
            add.setString(2,designation.getText());
            add.setInt(3,Integer.valueOf(valeurnutri.getText()));
            add.setString(4,dcn.format(dateprod.getDate()));
            add.setString(5,dcn.format(dateexpir.getDate()));
            add.setInt(6,Integer.valueOf(poidsnet.getText()));
            add.setString(7,null);
            add.setInt(8,0);
            add.setString(9,type.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "produit ajouté !");
            }
            }   
            conn.close();
            selectprod();}
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_addbtnMouseClicked

    private void supprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerMouseClicked
        if(reference.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "veilluez que le produit existe pour le supprimer !");
        }
        else{
           try{
                Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/projet", "root", "medtb21");
                String ref=reference.getText();
                String req="delete from produit where reference="+ref;
                Statement add=conn.createStatement();
                add.executeUpdate(req);
                selectprod();
                JOptionPane.showMessageDialog(this, "produit supprimé !");
           } catch(SQLException e){
               e.printStackTrace();
           }
        }
    }//GEN-LAST:event_supprimerMouseClicked

    private void tableproduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableproduitMouseClicked
       try{
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        DefaultTableModel mod=(DefaultTableModel)tableproduit.getModel();
       int index=tableproduit.getSelectedRow();
       reference.setText(mod.getValueAt(index,0).toString());
       designation.setText(mod.getValueAt(index,1).toString());
       valeurnutri.setText(mod.getValueAt(index,2).toString());
       dateprod.setDate(dcn.parse(mod.getValueAt(index,3).toString()));
       dateexpir.setDate(dcn.parse(mod.getValueAt(index,4).toString()));
       poidsnet.setText(mod.getValueAt(index,5).toString());
       if(!mod.getValueAt(index,6).toString().equals("")){
           ingredients.setText(mod.getValueAt(index,6).toString());
       }else{
           ingredients.setText("");
       }
       
       }catch(NullPointerException e){
           
       } catch (ParseException ex) {
            Logger.getLogger(cataloge.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_tableproduitMouseClicked

    private void designationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designationActionPerformed

    private void modifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMouseClicked
        if(reference.getText().isEmpty()||designation.getText().isEmpty()||valeurnutri.getText().isEmpty()||poidsnet.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "manque des informations !");
        }else{
            try{
                 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/projet", "root", "medtb21");
                 String req="update produit set designation= '"+designation.getText()+"'"+",valeurnutri= "+valeurnutri.getText()+",dateprod='"+dateprod.getDate()+"'"+",dateexpir ='"+dateexpir.getDate()+"'"+",poidsnet ="+poidsnet.getText()+",ingredients ='"+ingredients.getText()+"'"+" where reference ="+reference.getText();
                 Statement add=conn.createStatement();
                 add.executeUpdate(req);
                 JOptionPane.showMessageDialog(this, "produit modifié !");
                 selectprod();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_modifierMouseClicked
    
    private void rechercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechercherMouseClicked
    try{
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/projet", "root", "medtb21");
            st =conn.createStatement();
            if(! reference.getText().isEmpty())
            rs=st.executeQuery("select * from produit where reference = "+reference.getText());
            else if(! designation.getText().isEmpty()){
                rs=st.executeQuery("select * from produit where designation = '"+designation.getText()+"'");
            }else{
                JOptionPane.showMessageDialog(this, "veuillez entrer la reference ou designation pour rechercher !");
                selectprod();
            }
            
                        
            tableproduit.setModel(DbUtils.resultSetToTableModel(rs));
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_rechercherMouseClicked

    private void ingredientsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ingredientsFocusGained
       if(ingredients.getText().equals("juste pour les derivées")){
           ingredients.setText("");
           ingredients.setForeground(new Color(0,0,0));
           
       }
    }//GEN-LAST:event_ingredientsFocusGained

    private void ingredientsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ingredientsFocusLost
       if(ingredients.getText().equals("")){
           ingredients.setText("juste pour les derivées");
           ingredients.setForeground(new Color(102,102,102));
           
       }
    }//GEN-LAST:event_ingredientsFocusLost

    private void poidsnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poidsnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poidsnetActionPerformed

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
            java.util.logging.Logger.getLogger(cataloge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cataloge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cataloge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cataloge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cataloge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private com.toedter.calendar.JDateChooser dateexpir;
    private com.toedter.calendar.JDateChooser dateprod;
    private javax.swing.JTextField designation;
    private javax.swing.JTextField ingredients;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifier;
    private javax.swing.JTextField poidsnet;
    private javax.swing.JButton rechercher;
    private javax.swing.JTextField reference;
    private javax.swing.JButton supprimer;
    private javax.swing.JTable tableproduit;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField valeurnutri;
    // End of variables declaration//GEN-END:variables
}
