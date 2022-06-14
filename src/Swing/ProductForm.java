/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import Constructors.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class ProductForm extends javax.swing.JFrame {

    /**
     * Creates new form Product
     */
    private List<Product> products;
    private DefaultTableModel tbl;
    public ProductForm() {
        initComponents();
        this.setTitle("Product");
        this.setLocationRelativeTo(null);
        ResetTable();
    }
    public void ResetTable(){
        products = new ArrayList<>();
        tbl = (DefaultTableModel) jProductTable.getModel();
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        try{
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=ClothingMgmtSvr;user=sa;password=sa");
            String sql = "Select * from product";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            Vector data = null;
            tbl.setRowCount(0);
            if(rs.isBeforeFirst()==false){
                return;
            }
            while(rs.next()){
                data = new Vector();
                data.add(rs.getString("p#"));
                data.add(rs.getString("name"));
                data.add(rs.getString("type"));
                data.add(rs.getString("material"));
                data.add(rs.getString("size"));
                data.add(rs.getInt("#instore"));
                data.add(rs.getFloat("price"));
                tbl.addRow(data);
            }
            jProductTable.setModel(tbl);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Something is wrong!");
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jProductTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_AddProduct = new javax.swing.JButton();
        jButton_UpdateProduct = new javax.swing.JButton();
        jButton_RemoveProduct = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ProductCode = new javax.swing.JTextField();
        ProductName = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        ProductInStockCount = new javax.swing.JTextField();
        ProductMaterial = new javax.swing.JComboBox<>();
        ProductType = new javax.swing.JComboBox<>();
        ProductSize = new javax.swing.JComboBox<>();
        SearchByCode = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        SearchBttn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "Name", "Type", "Material", "Size", "In Stock", "Price"
            }
        ));
        jProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProductTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jProductTableMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jProductTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add / View / Edit Product");

        jButton_AddProduct.setText("Add");
        jButton_AddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddProductActionPerformed(evt);
            }
        });

        jButton_UpdateProduct.setText("Update");
        jButton_UpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateProductActionPerformed(evt);
            }
        });

        jButton_RemoveProduct.setText("Remove");
        jButton_RemoveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RemoveProductActionPerformed(evt);
            }
        });

        jLabel2.setText("No.");

        jLabel3.setText("Name");

        jLabel4.setText("Type");

        jLabel5.setText("Material");

        jLabel6.setText("Size");

        jLabel7.setText("In Stock");

        jLabel8.setText("Price");

        ProductMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cotton", "Khaki", "Denim (Bò)", "Felt (Nỉ)", "Wool (Len)", "Nylon", "Leather (Da)", "Other" }));

        ProductType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tops", "Bottom", "Shoes" }));

        ProductSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L", "XL", "XXL" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(66, 66, 66)
                        .addComponent(Price))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(48, 48, 48)
                        .addComponent(ProductInStockCount))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductMaterial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProductType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductCode)
                            .addComponent(ProductName)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(70, 70, 70)
                                .addComponent(ProductSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_AddProduct)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_UpdateProduct)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_RemoveProduct)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ProductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ProductMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ProductSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ProductInStockCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_AddProduct)
                    .addComponent(jButton_UpdateProduct)
                    .addComponent(jButton_RemoveProduct))
                .addContainerGap())
        );

        SearchByCode.setText("Search by product code");

        SearchBttn.setText("Search");
        SearchBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBttnActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "by Type", "by Material", "by Size", "by Price", "by Stock Numbers" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Sort product");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SearchByCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchByCode)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBttn)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jProductTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jProductTableMouseEntered

    private void jProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductTableMouseClicked
        // TODO add your handling code here:
        int row = jProductTable.getSelectedRow();
        ProductCode.setText(tbl.getValueAt(row, 0).toString());
        ProductName.setText(tbl.getValueAt(row, 1).toString());
        ProductType.setSelectedItem(tbl.getValueAt(row, 2).toString());
        ProductMaterial.setSelectedItem(tbl.getValueAt(row, 3).toString());
        ProductSize.setSelectedItem(tbl.getValueAt(row, 4).toString());
        ProductInStockCount.setText(tbl.getValueAt(row, 5).toString());
        Price.setText(tbl.getValueAt(row, 6).toString());
    }//GEN-LAST:event_jProductTableMouseClicked

    private void jButton_AddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddProductActionPerformed
        // TODO add your handling code here:
        Statement st = null;
        ResultSet rs = null;
        String type = new String();
        String size = new String();
        String material = new String();
        String id = new String(ProductCode.getText());
        String name = new String(ProductName.getText());
        type = ProductType.getSelectedItem().toString();
        material = ProductMaterial.getSelectedItem().toString();
        size = ProductSize.getSelectedItem().toString();
        int count = Integer.parseInt(ProductInStockCount.getText());
        float price = Float.parseFloat(Price.getText());
        try{
            Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=ClothingMgmtSvr;user=sa;password=sa");
            String sql = "insert into product values ('"+id+"', '"+name+"', '"+type+"', '"+material+"', '"+size+"', "
                    +count+", "+price+");";
            st = c.createStatement();
            int rows = st.executeUpdate(sql);
            System.out.println("Rows affected: "+rows);
            ResetTable();
            st.close();
            c.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Something's wrong!");
            e.printStackTrace();
            return;
        }
    }//GEN-LAST:event_jButton_AddProductActionPerformed

    private void jButton_UpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateProductActionPerformed
        // TODO add your handling code here:
        Statement st = null;
        ResultSet rs = null;
        String type = new String();
        String size = new String();
        String material = new String();
        String id = new String(ProductCode.getText());
        String name = new String(ProductName.getText());
        type = ProductType.getSelectedItem().toString();
        material = ProductMaterial.getSelectedItem().toString();
        size = ProductSize.getSelectedItem().toString();
        int count = Integer.parseInt(ProductInStockCount.getText());
        float price = Float.parseFloat(Price.getText());
        try{
            Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=ClothingMgmtSvr;user=sa;password=sa");
            String sql = "update product"
                    + " set name = '"+name+"', type = '"+type+"', material = '"+material+"', size = '"+size+"', #instore = "
                    +count+", price = "+price+" where p# = '"+id+"';";
            st = c.createStatement();
            int rows = st.executeUpdate(sql);
            System.out.println("Rows affected: "+rows);
            ResetTable();
            st.close();
            c.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Something's wrong!");
            e.printStackTrace();
            return;
        }
    }//GEN-LAST:event_jButton_UpdateProductActionPerformed

    private void jButton_RemoveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemoveProductActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(this, "Do you want to delete?", "Confirm", JOptionPane.YES_NO_OPTION);
        if(ret != JOptionPane.YES_OPTION) {
            return;
        }
        
        Connection c = null;
        PreparedStatement ps = null;
        int[] rows = jProductTable.getSelectedRows();
        for(int i= rows.length-1; i>=0; i--){
            String selected = tbl.getValueAt(i, 0).toString();
            try {
                c = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=ClothingMgmtSvr;user=sa;password=sa");
                ps = c.prepareStatement("Delete From product where p# = ?");
                ps.setString(1, selected); //giá trị của cột đầu tiên tại dòng được chọn trong table
                ret = ps.executeUpdate();
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                    try {
                        if (c != null) {
                            c.close();
                        }
                        if (ps != null) {
                            ps.close();
                        }
                    } catch (Exception ex2) {
                    ex2.printStackTrace();
                }
            }
        }
        ResetTable();
             
    }//GEN-LAST:event_jButton_RemoveProductActionPerformed

    private void SearchBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBttnActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        try{
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=ClothingMgmtSvr;user=sa;password=sa");
            String sql = "Select * from product ";
            if(ProductCode.getText().length()>0){
                sql = sql + "where p# = '" + ProductCode.getText() +"'";
            }
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            Vector data = null;
            tbl.setRowCount(0);
            if(rs.isBeforeFirst()==false){
                JOptionPane.showMessageDialog(this, "Product not available!");
                return;
            }
            while(rs.next()){
                data = new Vector();
                data.add(rs.getString("p#"));
                data.add(rs.getString("name"));
                data.add(rs.getString("type"));
                data.add(rs.getString("material"));
                data.add(rs.getString("size"));
                data.add(rs.getInt("#instore"));
                data.add(rs.getFloat("price"));
                tbl.addRow(data);
            }
            jProductTable.setModel(tbl);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Something is wrong!");
            
        } finally{
            try {
                if (conn != null) {
                    conn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_SearchBttnActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        try{
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=ClothingMgmtSvr;user=sa;password=sa");
            String sql = "Select * from product ";
            if(jComboBox1.getSelectedItem().toString().equals("by Type")){
                sql = sql + "order by type;";
            }
            if(jComboBox1.getSelectedItem().toString().equals("by Material")){
                sql = sql + "order by material";
            }
            if(jComboBox1.getSelectedItem().toString().equals("by Price")){
                sql = sql + "order by price";
            }
            if(jComboBox1.getSelectedItem().toString().equals("by Size")){
                sql = sql + "order by size";
            }
            if(jComboBox1.getSelectedItem().toString().equals("by Stock Numbers")){
                sql = sql + "order by #instore";
            }
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            Vector data = null;
            tbl.setRowCount(0);
            while(rs.next()){
                data = new Vector();
                data.add(rs.getString("p#"));
                data.add(rs.getString("name"));
                data.add(rs.getString("type"));
                data.add(rs.getString("material"));
                data.add(rs.getString("size"));
                data.add(rs.getInt("#instore"));
                data.add(rs.getFloat("price"));
                tbl.addRow(data);
            }
            jProductTable.setModel(tbl);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Something is wrong!");
            
        } finally{
            try {
                if (conn != null) {
                    conn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Price;
    private javax.swing.JTextField ProductCode;
    private javax.swing.JTextField ProductInStockCount;
    private javax.swing.JComboBox<String> ProductMaterial;
    private javax.swing.JTextField ProductName;
    private javax.swing.JComboBox<String> ProductSize;
    private javax.swing.JComboBox<String> ProductType;
    private javax.swing.JButton SearchBttn;
    private javax.swing.JLabel SearchByCode;
    private javax.swing.JButton jButton_AddProduct;
    private javax.swing.JButton jButton_RemoveProduct;
    private javax.swing.JButton jButton_UpdateProduct;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jProductTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}