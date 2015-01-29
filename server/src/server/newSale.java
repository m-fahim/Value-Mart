/*
 * ProductFrame.java
 *
 * Created on January 1, 2012, 8:13 PM
 */

package server;

import java.awt.*;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author  mfahim
 */
public class newSale extends javax.swing.JFrame {

    /** Creates new form ProductFrame */
    public newSale() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/images/icon.png"));
        proCate.removeAllItems();
        rs = Category.find_all_category();
        try{
        while(rs.next()){
            proCate.addItem(rs.getString(1));
        }
        }catch(Exception e){
            System.out.println("Error :: In Adding items to JComboBox");
        }
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();  
        Rectangle recframe = getBounds();  
        setLocation((screen.width - recframe.width)/2, (screen.height - recframe.height)/2);
    }
    public newSale(JFrame f,String uStatus,String user) {
        initComponents();
        this.setTitle(this.getClass().getSimpleName());
        userStatus.setText(uStatus);
        systemUser.setText(user);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/images/icon.png"));
        proCate.removeAllItems();
        rs = Category.find_all_category();
        try{
        while(rs.next()){
            proCate.addItem(rs.getString(1));
        }
        }catch(Exception e){
            System.out.println("Error :: In Adding items to JComboBox");
        }
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
        jButton1 = new javax.swing.JButton();
        proSize = new javax.swing.JTextField();
        proBrand = new javax.swing.JTextField();
        proName = new javax.swing.JTextField();
        proCate = new javax.swing.JComboBox();
        proMan = new javax.swing.JTextField();
        proVariety = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        proDes = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        newProCancel = new javax.swing.JButton();
        mainContent1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cateFam = new javax.swing.JTextField();
        nameCate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        subCate = new javax.swing.JTextField();
        systemUser = new javax.swing.JToggleButton();
        userStatus = new javax.swing.JToggleButton();
        mainMenuPanel = new javax.swing.JPanel();
        mainMenuJLabel = new javax.swing.JLabel();
        mannageSales = new javax.swing.JButton();
        newSale = new javax.swing.JButton();
        searchSale = new javax.swing.JButton();
        issueLoyalityCard = new javax.swing.JButton();
        renewMember = new javax.swing.JButton();
        cancelMember = new javax.swing.JButton();
        viewPromotion = new javax.swing.JButton();
        addPromotion = new javax.swing.JButton();
        returnSale = new javax.swing.JButton();
        replaceSale = new javax.swing.JButton();
        membership = new javax.swing.JButton();
        promotions = new javax.swing.JButton();
        titlePanel = new javax.swing.JPanel();
        vmLogo = new javax.swing.JLabel();
        signOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Product");
        setForeground(java.awt.Color.white);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        proCate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        proCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proCateActionPerformed(evt);
            }
        });

        proVariety.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proVarietyActionPerformed(evt);
            }
        });

        proDes.setColumns(20);
        proDes.setRows(5);
        jScrollPane1.setViewportView(proDes);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("New Product :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setText("Name : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("Brand : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("Manufacture : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel7.setText("Size : ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel8.setText("Category ID : ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel9.setText("Variety :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel10.setText("Description :");

        newProCancel.setFont(new java.awt.Font("Tahoma", 1, 11));
        newProCancel.setText("Cancel");
        newProCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProCancelActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout mainContent2Layout = new org.jdesktop.layout.GroupLayout(mainContent2);
        mainContent2.setLayout(mainContent2Layout);
        mainContent2Layout.setHorizontalGroup(
            mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, mainContent2Layout.createSequentialGroup()
                .add(28, 28, 28)
                .add(mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel6)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(proSize)
                    .add(proMan)
                    .add(proBrand)
                    .add(proName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 47, Short.MAX_VALUE)
                .add(mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jLabel10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(proCate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(proVariety, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(mainContent2Layout.createSequentialGroup()
                        .add(53, 53, 53)
                        .add(newProCancel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton1))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 192, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(46, 46, 46))
            .add(mainContent2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .addContainerGap(535, Short.MAX_VALUE))
        );
        mainContent2Layout.setVerticalGroup(
            mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainContent2Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel2)
                .add(31, 31, 31)
                .add(mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mainContent2Layout.createSequentialGroup()
                        .add(mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(proCate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel8))
                        .add(8, 8, 8)
                        .add(mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(proVariety, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel9))
                        .add(mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(mainContent2Layout.createSequentialGroup()
                                .add(42, 42, 42)
                                .add(jLabel10))
                            .add(mainContent2Layout.createSequentialGroup()
                                .add(18, 18, 18)
                                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(18, 18, 18)
                        .add(mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(newProCancel)
                            .add(jButton1)))
                    .add(mainContent2Layout.createSequentialGroup()
                        .add(mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(proName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(8, 8, 8)
                        .add(mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(proBrand, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(proMan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel6))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(mainContent2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(proSize, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel7))))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("Category Info :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel11.setText("Family : ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel12.setText("Category :");

        cateFam.setEditable(false);

        nameCate.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel13.setText("Sub-Category :");

        subCate.setEditable(false);
        subCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCateActionPerformed(evt);
            }
        });

        systemUser.setBackground(new java.awt.Color(0, 0, 0));
        systemUser.setSelected(true);
        systemUser.setEnabled(false);

        userStatus.setBackground(new java.awt.Color(0, 0, 0));
        userStatus.setSelected(true);
        userStatus.setEnabled(false);

        org.jdesktop.layout.GroupLayout mainContent1Layout = new org.jdesktop.layout.GroupLayout(mainContent1);
        mainContent1.setLayout(mainContent1Layout);
        mainContent1Layout.setHorizontalGroup(
            mainContent1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainContent1Layout.createSequentialGroup()
                .add(28, 28, 28)
                .add(mainContent1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabel11, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel12, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mainContent1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(nameCate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 159, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(mainContent1Layout.createSequentialGroup()
                        .add(cateFam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 159, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(34, 34, 34)
                        .add(jLabel13)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(subCate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
            .add(mainContent1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 284, Short.MAX_VALUE)
                .add(userStatus)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(systemUser)
                .add(172, 172, 172))
        );
        mainContent1Layout.setVerticalGroup(
            mainContent1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainContent1Layout.createSequentialGroup()
                .add(mainContent1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mainContent1Layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel3)
                        .add(27, 27, 27))
                    .add(mainContent1Layout.createSequentialGroup()
                        .add(mainContent1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(systemUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(userStatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .add(mainContent1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cateFam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(subCate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel11)
                    .add(jLabel13))
                .add(8, 8, 8)
                .add(mainContent1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(nameCate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel12)))
        );

        mainMenuJLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        mainMenuJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainMenuJLabel.setText("Main Menu");

        mannageSales.setBackground(new java.awt.Color(51, 51, 51));
        mannageSales.setFont(new java.awt.Font("Tahoma", 1, 11));
        mannageSales.setText("Mannage Sales");
        mannageSales.setEnabled(false);

        newSale.setText("New Sale");
        newSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSaleActionPerformed(evt);
            }
        });

        searchSale.setText("Search Sale");
        searchSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSaleActionPerformed(evt);
            }
        });

        issueLoyalityCard.setText("Issue Loyality Card");
        issueLoyalityCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueLoyalityCardActionPerformed(evt);
            }
        });

        renewMember.setText("Renew Membership");
        renewMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renewMemberActionPerformed(evt);
            }
        });

        cancelMember.setText("Cancel Membership");
        cancelMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelMemberActionPerformed(evt);
            }
        });

        viewPromotion.setText("View Promotions");
        viewPromotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPromotionActionPerformed(evt);
            }
        });

        addPromotion.setText("Add Promotion");
        addPromotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPromotionActionPerformed(evt);
            }
        });

        returnSale.setText("Return Sale");
        returnSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnSaleActionPerformed(evt);
            }
        });

        replaceSale.setText("Replace Sale");
        replaceSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceSaleActionPerformed(evt);
            }
        });

        membership.setBackground(new java.awt.Color(51, 51, 51));
        membership.setFont(new java.awt.Font("Tahoma", 1, 11));
        membership.setText("Membership");
        membership.setEnabled(false);

        promotions.setBackground(new java.awt.Color(51, 51, 51));
        promotions.setFont(new java.awt.Font("Tahoma", 1, 11));
        promotions.setText("Promotions");
        promotions.setEnabled(false);

        org.jdesktop.layout.GroupLayout mainMenuPanelLayout = new org.jdesktop.layout.GroupLayout(mainMenuPanel);
        mainMenuPanel.setLayout(mainMenuPanelLayout);
        mainMenuPanelLayout.setHorizontalGroup(
            mainMenuPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(mainMenuPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mannageSales, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(newSale, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(searchSale, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, mainMenuJLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(replaceSale, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(returnSale, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(cancelMember, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(renewMember, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(issueLoyalityCard, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(membership, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(viewPromotion, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(addPromotion, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, promotions, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainMenuPanelLayout.setVerticalGroup(
            mainMenuPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainMenuPanelLayout.createSequentialGroup()
                .add(17, 17, 17)
                .add(mainMenuJLabel)
                .add(18, 18, 18)
                .add(mannageSales, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(4, 4, 4)
                .add(newSale, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(searchSale, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(replaceSale, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(returnSale, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(membership, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(issueLoyalityCard, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(renewMember, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cancelMember, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(promotions, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(addPromotion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(viewPromotion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(88, 88, 88))
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
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(mainContent1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, mainContent2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(215, Short.MAX_VALUE)
                    .add(titlePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(57, 57, 57)
                .add(mainContent1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mainContent2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(mainMenuPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(titlePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(387, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 Product p = new Product();
 p.set_product_name(proName.getText());
 p.set_product_brand(proBrand.getText());
 p.set_product_manufacture(proMan.getText());
 p.set_size(proSize.getText());
 p.set_variety(proVariety.getText());
        JComboBox cb = (JComboBox)evt.getSource();
        String cateID = (String)cb.getSelectedItem();
        p.set_category_id(Integer.parseInt(cateID));
 p.set_product_description(proDes.getText());
 p.insert_product();
}//GEN-LAST:event_jButton1ActionPerformed

private void proVarietyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proVarietyActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_proVarietyActionPerformed

private void subCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCateActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_subCateActionPerformed

private void proCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proCateActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        String getCate = (String)cb.getSelectedItem();
        try{
        rs = Category.quick_find_category(getCate);
        while(rs.next()){
            cateFam.setText(rs.getString("family"));
            subCate.setText(rs.getString("subcategory"));
            nameCate.setText(rs.getString("category_name"));
                        }
            }catch(Exception e){
                System.out.println("Error :: Category not Found.");
        }
}//GEN-LAST:event_proCateActionPerformed

private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        choiceFrame cFrame = new choiceFrame(this);
        cFrame.setVisible(true);
}//GEN-LAST:event_signOutActionPerformed

private void newProCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProCancelActionPerformed
 proName.setText("");
 proBrand.setText("");
 proMan.setText("");
 proSize.setText("");
 proVariety.setText("");
 proCate.setAutoscrolls(true);
 proDes.setText("");
}//GEN-LAST:event_newProCancelActionPerformed

private void cancelMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelMemberActionPerformed
    cancelMember cMemFrame = new cancelMember(this,userStatus.getText(),systemUser.getText());
    cMemFrame.setVisible(true);
}//GEN-LAST:event_cancelMemberActionPerformed

private void newSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSaleActionPerformed
    newSale nSaleFrame = new newSale(this,userStatus.getText(),systemUser.getText());
    nSaleFrame.setVisible(true);
}//GEN-LAST:event_newSaleActionPerformed

private void searchSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSaleActionPerformed
    searchSale sSaleFrame = new searchSale(this,userStatus.getText(),systemUser.getText());
    sSaleFrame.setVisible(true);
}//GEN-LAST:event_searchSaleActionPerformed

private void replaceSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceSaleActionPerformed
    replaceSale rSaleFrame = new replaceSale(this,userStatus.getText(),systemUser.getText());
    rSaleFrame.setVisible(true);
}//GEN-LAST:event_replaceSaleActionPerformed

private void returnSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnSaleActionPerformed
    returnSale reSaleFrame = new returnSale(this,userStatus.getText(),systemUser.getText());
    reSaleFrame.setVisible(true);
}//GEN-LAST:event_returnSaleActionPerformed

private void issueLoyalityCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueLoyalityCardActionPerformed
    issueLoyalityCard iLCardFrame = new issueLoyalityCard(this,userStatus.getText(),systemUser.getText());
    iLCardFrame.setVisible(true);
}//GEN-LAST:event_issueLoyalityCardActionPerformed

private void renewMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renewMemberActionPerformed
    renewMember rMemFrame = new renewMember(this,userStatus.getText(),systemUser.getText());
    rMemFrame.setVisible(true);
}//GEN-LAST:event_renewMemberActionPerformed

private void addPromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPromotionActionPerformed
    addPromotion aPromoFrame = new addPromotion(this,userStatus.getText(),systemUser.getText());
    aPromoFrame.setVisible(true);
}//GEN-LAST:event_addPromotionActionPerformed

private void viewPromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPromotionActionPerformed
    viewPromotion vPromoFrame = new viewPromotion(this,userStatus.getText(),systemUser.getText());
    vPromoFrame.setVisible(true);
}//GEN-LAST:event_viewPromotionActionPerformed
    
    private JFrame frame;
    private ResultSet rs ; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPromotion;
    private javax.swing.JButton cancelMember;
    private javax.swing.JTextField cateFam;
    private javax.swing.JButton issueLoyalityCard;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainContent1;
    private javax.swing.JPanel mainContent2;
    private javax.swing.JLabel mainMenuJLabel;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JButton mannageSales;
    private javax.swing.JButton membership;
    private javax.swing.JTextField nameCate;
    private javax.swing.JButton newProCancel;
    private javax.swing.JButton newSale;
    private javax.swing.JTextField proBrand;
    private javax.swing.JComboBox proCate;
    private javax.swing.JTextArea proDes;
    private javax.swing.JTextField proMan;
    private javax.swing.JTextField proName;
    private javax.swing.JTextField proSize;
    private javax.swing.JTextField proVariety;
    private javax.swing.JButton promotions;
    private javax.swing.JButton renewMember;
    private javax.swing.JButton replaceSale;
    private javax.swing.JButton returnSale;
    private javax.swing.JButton searchSale;
    private javax.swing.JButton signOut;
    private javax.swing.JTextField subCate;
    private javax.swing.JToggleButton systemUser;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JToggleButton userStatus;
    private javax.swing.JButton viewPromotion;
    private javax.swing.JLabel vmLogo;
    // End of variables declaration//GEN-END:variables

}
