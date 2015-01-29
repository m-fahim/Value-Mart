/*
 * ProductFrame.java
 *
 * Created on January 1, 2012, 8:13 PM
 */

package client;

import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  mfahim
 */
public class searchProduct extends javax.swing.JFrame {

    /** Creates new form ProductFrame */
    public searchProduct() {
        initComponents();
        this.setTitle(this.getClass().getSimpleName());
        rsProList = Product.find_all_products();
        int  li_row = 0;
        try {
            while (rsProList.next()) {
                int col = 0;
                jEdit = new javax.swing.JButton("Edit");
                jEdit.setVisible(true);
                productList.setValueAt(jEdit, li_row, col);
                col=1;
                for(int i = 1; i <= 8 ; i++){
                    productList.setValueAt(rsProList.getString(i), li_row, col);
                    col++;
                }
                li_row++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Error :: In finding Products");
        }
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/images/icon.png"));
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();  
        Rectangle recframe = getBounds();  
        setLocation((screen.width - recframe.width)/2, (screen.height - recframe.height)/2);
    }
    public searchProduct(JFrame f,String uStatus,String user) {
        initComponents();
        this.setTitle(this.getClass().getSimpleName());
        rsProList = Product.find_all_products();
        rsProListJbox = Product.find_all_products();
        int  li_row = 0;
        try {
            while (rsProList.next()){
                int col = 0;
                jEdit = new javax.swing.JButton("Edit");
                jEdit.setVisible(true);
                productList.setValueAt(jEdit, li_row, col);
                col=1;
                for(int i = 1; i <= 8 ; i++){
                    productList.setValueAt(rsProList.getString(i), li_row, col); 
                    col++;
                }
                li_row++;
            }
            while(rsProListJbox.next())
                searchProName.addItem(rsProListJbox.getString("product_name"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Error :: In finding Products");
        }
        userStatus.setText(uStatus);
        systemUser.setText(user);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/images/icon.png"));
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();  
        Rectangle recframe = getBounds();  
        setLocation((screen.width - recframe.width)/2, (screen.height - recframe.height)/2);  
        frame = new JFrame();
        frame = f;
        f.setVisible(false);
        f.dispose();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainContent2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productList = new javax.swing.JTable();
        mainContent1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        systemUser = new javax.swing.JToggleButton();
        userStatus = new javax.swing.JToggleButton();
        searchProName = new javax.swing.JComboBox();
        sProduct = new javax.swing.JButton();
        mainMenuPanel = new javax.swing.JPanel();
        mainMenuJLabel = new javax.swing.JLabel();
        mannageOrder = new javax.swing.JButton();
        placeOrder = new javax.swing.JButton();
        cancelOrder = new javax.swing.JButton();
        updateProduct = new javax.swing.JButton();
        searchProduct = new javax.swing.JButton();
        newSupplier = new javax.swing.JButton();
        updateSupplier = new javax.swing.JButton();
        searchSupplier = new javax.swing.JButton();
        updateStock = new javax.swing.JButton();
        newStock = new javax.swing.JButton();
        searchStock = new javax.swing.JButton();
        newProduct = new javax.swing.JButton();
        orderStatus = new javax.swing.JButton();
        mannageProduct = new javax.swing.JButton();
        mannageSupplier = new javax.swing.JButton();
        mannageInventory = new javax.swing.JButton();
        titlePanel = new javax.swing.JPanel();
        vmLogo = new javax.swing.JLabel();
        signOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Product");
        setForeground(java.awt.Color.white);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Product List :");

        productList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "ID", "Name", "Brand", "Manufacture", "Variety", "Size", "Description", "Category ID"
            }
        ));
        jScrollPane1.setViewportView(productList);

        org.jdesktop.layout.GroupLayout mainContent2Layout = new org.jdesktop.layout.GroupLayout(mainContent2);
        mainContent2.setLayout(mainContent2Layout);
        mainContent2Layout.setHorizontalGroup(
            mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainContent2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, mainContent2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 557, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(56, 56, 56))
        );
        mainContent2Layout.setVerticalGroup(
            mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainContent2Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 34, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 389, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("Product : ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel11.setText("Product ID : ");

        systemUser.setBackground(new java.awt.Color(0, 0, 0));
        systemUser.setSelected(true);
        systemUser.setEnabled(false);

        userStatus.setBackground(new java.awt.Color(0, 0, 0));
        userStatus.setSelected(true);
        userStatus.setEnabled(false);

        searchProName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProNameActionPerformed(evt);
            }
        });

        sProduct.setText("Search");
        sProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sProductActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout mainContent1Layout = new org.jdesktop.layout.GroupLayout(mainContent1);
        mainContent1.setLayout(mainContent1Layout);
        mainContent1Layout.setHorizontalGroup(
            mainContent1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, mainContent1Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .add(mainContent1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(mainContent1Layout.createSequentialGroup()
                        .add(jLabel11)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(searchProName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(sProduct)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                    .add(userStatus))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(systemUser)
                .add(219, 219, 219))
            .add(mainContent1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel3)
                .addContainerGap(589, Short.MAX_VALUE))
        );
        mainContent1Layout.setVerticalGroup(
            mainContent1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainContent1Layout.createSequentialGroup()
                .add(mainContent1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(systemUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(userStatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(15, 15, 15)
                .add(jLabel3)
                .add(22, 22, 22)
                .add(mainContent1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel11)
                    .add(searchProName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(sProduct))
                .add(27, 27, 27))
        );

        mainMenuJLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        mainMenuJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainMenuJLabel.setText("Main Menu");

        mannageOrder.setBackground(new java.awt.Color(51, 51, 51));
        mannageOrder.setFont(new java.awt.Font("Tahoma", 1, 11));
        mannageOrder.setText("Mannage Order");
        mannageOrder.setEnabled(false);

        placeOrder.setText("Place Order");
        placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderActionPerformed(evt);
            }
        });

        cancelOrder.setText("Cancel Order");
        cancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderActionPerformed(evt);
            }
        });

        updateProduct.setText("Update Product");
        updateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProductActionPerformed(evt);
            }
        });

        searchProduct.setText("Search Product");
        searchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductActionPerformed(evt);
            }
        });

        newSupplier.setText("New Supplier");
        newSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSupplierActionPerformed(evt);
            }
        });

        updateSupplier.setText("Update Supplier");
        updateSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSupplierActionPerformed(evt);
            }
        });

        searchSupplier.setText("Search Supplier");
        searchSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSupplierActionPerformed(evt);
            }
        });

        updateStock.setText("Update Stock");
        updateStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStockActionPerformed(evt);
            }
        });

        newStock.setText("New Stock");
        newStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStockActionPerformed(evt);
            }
        });

        searchStock.setText("Search Stock");
        searchStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStockActionPerformed(evt);
            }
        });

        newProduct.setText("New Product");
        newProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProductActionPerformed(evt);
            }
        });

        orderStatus.setText("Order Status");
        orderStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderStatusActionPerformed(evt);
            }
        });

        mannageProduct.setBackground(new java.awt.Color(51, 51, 51));
        mannageProduct.setFont(new java.awt.Font("Tahoma", 1, 11));
        mannageProduct.setText("Mannage Product");
        mannageProduct.setEnabled(false);

        mannageSupplier.setBackground(new java.awt.Color(51, 51, 51));
        mannageSupplier.setFont(new java.awt.Font("Tahoma", 1, 11));
        mannageSupplier.setText("Mannage Supplier");
        mannageSupplier.setEnabled(false);

        mannageInventory.setBackground(new java.awt.Color(51, 51, 51));
        mannageInventory.setFont(new java.awt.Font("Tahoma", 1, 11));
        mannageInventory.setText("Mannage Inventory");
        mannageInventory.setEnabled(false);

        org.jdesktop.layout.GroupLayout mainMenuPanelLayout = new org.jdesktop.layout.GroupLayout(mainMenuPanel);
        mainMenuPanel.setLayout(mainMenuPanelLayout);
        mainMenuPanelLayout.setHorizontalGroup(
            mainMenuPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(mainMenuPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mannageOrder, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(placeOrder, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, searchStock, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(updateStock, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(newStock, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(searchSupplier, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(updateSupplier, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(newSupplier, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, searchProduct, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(updateProduct, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(newProduct, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(cancelOrder, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, mainMenuJLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(mannageSupplier, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, mannageInventory, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, mannageProduct, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(orderStatus, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainMenuPanelLayout.setVerticalGroup(
            mainMenuPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(mainMenuJLabel)
                .add(18, 18, 18)
                .add(mannageOrder, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(4, 4, 4)
                .add(placeOrder, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cancelOrder, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(orderStatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(mannageProduct, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(newProduct, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(updateProduct, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(searchProduct, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mannageSupplier, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(newSupplier, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(updateSupplier, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(searchSupplier, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mannageInventory, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(newStock, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(updateStock, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(searchStock, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        vmLogo.setFont(new java.awt.Font("Times New Roman", 3, 24));
        vmLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vmLogo.setText("Value Mart");

        signOut.setBackground(new java.awt.Color(0, 0, 0));
        signOut.setFont(new java.awt.Font("Tahoma", 1, 11));
        signOut.setForeground(new java.awt.Color(255, 255, 255));
        signOut.setText("Sign Out");
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout titlePanelLayout = new org.jdesktop.layout.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(titlePanelLayout.createSequentialGroup()
                .add(vmLogo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 466, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(signOut)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(titlePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(vmLogo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .add(signOut)))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(mainMenuPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mainContent1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(mainContent2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(243, Short.MAX_VALUE)
                    .add(titlePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(57, 57, 57)
                .add(mainContent1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mainContent2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(mainMenuPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(titlePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(606, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        choiceFrame cFrame = new choiceFrame(this);
        cFrame.setVisible(true);
}//GEN-LAST:event_signOutActionPerformed

private void searchSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSupplierActionPerformed
    searchSupplier sSupFrame = new searchSupplier(this,userStatus.getText(),systemUser.getText());
    sSupFrame.setVisible(true);
}//GEN-LAST:event_searchSupplierActionPerformed

private void placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderActionPerformed
    placeOrder pOrderFrame = new placeOrder(this,userStatus.getText(),systemUser.getText());
    pOrderFrame.setVisible(true);
}//GEN-LAST:event_placeOrderActionPerformed

private void cancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderActionPerformed
    cancelOrder cOrderFrame = new cancelOrder(this,userStatus.getText(),systemUser.getText());
    cOrderFrame.setVisible(true);
}//GEN-LAST:event_cancelOrderActionPerformed

private void orderStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderStatusActionPerformed
    orderStatus sOrderFrame = new orderStatus(this,userStatus.getText(),systemUser.getText());
    sOrderFrame.setVisible(true);
}//GEN-LAST:event_orderStatusActionPerformed

private void newProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProductActionPerformed
    newProduct nProFrame = new newProduct(this,userStatus.getText(),systemUser.getText());
    nProFrame.setVisible(true);
}//GEN-LAST:event_newProductActionPerformed

private void updateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProductActionPerformed
    updateProduct uProFrame = new updateProduct(this,userStatus.getText(),systemUser.getText());
    uProFrame.setVisible(true);
}//GEN-LAST:event_updateProductActionPerformed

private void searchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductActionPerformed
    searchProduct sProFrame = new searchProduct(this,userStatus.getText(),systemUser.getText());
    sProFrame.setVisible(true);
}//GEN-LAST:event_searchProductActionPerformed

private void newSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSupplierActionPerformed
    newSupplier nSupFrame = new newSupplier(this,userStatus.getText(),systemUser.getText());
    nSupFrame.setVisible(true);
}//GEN-LAST:event_newSupplierActionPerformed

private void updateSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSupplierActionPerformed
    updateSupplier uSupFrame = new updateSupplier(this,userStatus.getText(),systemUser.getText());
    uSupFrame.setVisible(true);
}//GEN-LAST:event_updateSupplierActionPerformed

private void newStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStockActionPerformed
    newStock nStockFrame = new newStock(this,userStatus.getText(),systemUser.getText());
    nStockFrame.setVisible(true);
}//GEN-LAST:event_newStockActionPerformed

private void updateStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStockActionPerformed
    updateStock uStockFrame = new updateStock(this,userStatus.getText(),systemUser.getText());
    uStockFrame.setVisible(true);
}//GEN-LAST:event_updateStockActionPerformed

private void searchStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStockActionPerformed
    searchStock sStockFrame = new searchStock(this,userStatus.getText(),systemUser.getText());
    sStockFrame.setVisible(true);
}//GEN-LAST:event_searchStockActionPerformed

private void searchProNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProNameActionPerformed
    searchProName.setEditable(true);
    JComboBox cb = (JComboBox)evt.getSource();
    getProName = (String)cb.getSelectedItem();
}//GEN-LAST:event_searchProNameActionPerformed

private void sProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sProductActionPerformed
deleteSearchProduct dSPro = new deleteSearchProduct(this,userStatus.getText(),systemUser.getText(),getProName);
}//GEN-LAST:event_sProductActionPerformed
    
    private JFrame frame;
    private ResultSet rsProList ; 
    private ResultSet rsProListJbox;
    private String getProName;
    private javax.swing.JButton jEdit;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelOrder;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainContent1;
    private javax.swing.JPanel mainContent2;
    private javax.swing.JLabel mainMenuJLabel;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JButton mannageInventory;
    private javax.swing.JButton mannageOrder;
    private javax.swing.JButton mannageProduct;
    private javax.swing.JButton mannageSupplier;
    private javax.swing.JButton newProduct;
    private javax.swing.JButton newStock;
    private javax.swing.JButton newSupplier;
    private javax.swing.JButton orderStatus;
    private javax.swing.JButton placeOrder;
    private javax.swing.JTable productList;
    private javax.swing.JButton sProduct;
    private javax.swing.JComboBox searchProName;
    private javax.swing.JButton searchProduct;
    private javax.swing.JButton searchStock;
    private javax.swing.JButton searchSupplier;
    private javax.swing.JButton signOut;
    private javax.swing.JToggleButton systemUser;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton updateProduct;
    private javax.swing.JButton updateStock;
    private javax.swing.JButton updateSupplier;
    private javax.swing.JToggleButton userStatus;
    private javax.swing.JLabel vmLogo;
    // End of variables declaration//GEN-END:variables

}
