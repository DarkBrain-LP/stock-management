/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author M@nU_LP
 */
public class Accueil extends javax.swing.JFrame {

    /**
     * Creates new form Accueil
     */
    public Accueil() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnEnregistrer = new javax.swing.JButton();
        btnModSup = new javax.swing.JButton();
        btnArticleStock = new javax.swing.JButton();
        btnRecherche = new javax.swing.JButton();
        btnNbTotalArticle = new javax.swing.JButton();
        btnSousSeuil = new javax.swing.JButton();
        btnApprovisionner = new javax.swing.JButton();
        btnVendreArticle = new javax.swing.JButton();
        panePresentation = new javax.swing.JPanel();
        paneEnregistrer = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        codeArticleField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        libelArticleField = new javax.swing.JTextField();
        prixArticleField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        qteStockField = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        submit = new javax.swing.JButton();
        paneModSup = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        paneArticleStock = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        paneRecherche = new javax.swing.JPanel();
        paneNbTotalArticle = new javax.swing.JPanel();
        paneSousSeuil = new javax.swing.JPanel();
        paneApprovisionner = new javax.swing.JPanel();
        paneVendreArticle = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 2, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nous sommes spécialisée dans la technologie. Nous menons des esperiences spaciales");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(33, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APPLICATION DE GESTION DE STOCK DE L'ENTREPRISE NUCLAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setMinimumSize(new java.awt.Dimension(200, 200));

        btnEnregistrer.setBackground(new java.awt.Color(102, 51, 255));
        btnEnregistrer.setText("Enregistrer Article");
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });

        btnModSup.setText("Modifier/Supprimer");
        btnModSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModSupActionPerformed(evt);
            }
        });

        btnArticleStock.setBackground(new java.awt.Color(204, 204, 0));
        btnArticleStock.setText("Articles en Stock");
        btnArticleStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticleStockActionPerformed(evt);
            }
        });

        btnRecherche.setText("Rechercher Article");
        btnRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercheActionPerformed(evt);
            }
        });

        btnNbTotalArticle.setText("Nombre Total d'Articles");
        btnNbTotalArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNbTotalArticleActionPerformed(evt);
            }
        });

        btnSousSeuil.setText("Articles en Dessous Seul");
        btnSousSeuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSousSeuilActionPerformed(evt);
            }
        });

        btnApprovisionner.setText("Approvisionner Article");
        btnApprovisionner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprovisionnerActionPerformed(evt);
            }
        });

        btnVendreArticle.setText("Vendre Article");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSousSeuil, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(btnApprovisionner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVendreArticle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNbTotalArticle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecherche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnArticleStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEnregistrer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnArticleStock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModSup, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNbTotalArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSousSeuil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApprovisionner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVendreArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.LINE_START);

        panePresentation.setLayout(new java.awt.CardLayout());

        paneEnregistrer.setBackground(new java.awt.Color(204, 204, 204));

        jPanel5.setBackground(new java.awt.Color(0, 0, 51));

        jPanel6.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Code Article");

        codeArticleField.setBackground(new java.awt.Color(0, 0, 51));
        codeArticleField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        codeArticleField.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Libelé Article");

        libelArticleField.setBackground(new java.awt.Color(0, 0, 51));
        libelArticleField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        libelArticleField.setForeground(new java.awt.Color(255, 255, 255));
        libelArticleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libelArticleFieldActionPerformed(evt);
            }
        });

        prixArticleField.setBackground(new java.awt.Color(0, 0, 51));
        prixArticleField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        prixArticleField.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Prix Article");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantité En Stock");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date De Création");

        qteStockField.setBackground(new java.awt.Color(0, 0, 51));
        qteStockField.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        submit.setBackground(new java.awt.Color(0, 0, 153));
        submit.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(qteStockField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codeArticleField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(libelArticleField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prixArticleField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(175, 175, 175))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(434, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codeArticleField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(libelArticleField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prixArticleField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qteStockField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(294, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(92, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout paneEnregistrerLayout = new javax.swing.GroupLayout(paneEnregistrer);
        paneEnregistrer.setLayout(paneEnregistrerLayout);
        paneEnregistrerLayout.setHorizontalGroup(
            paneEnregistrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneEnregistrerLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneEnregistrerLayout.setVerticalGroup(
            paneEnregistrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panePresentation.add(paneEnregistrer, "card9");

        jLabel7.setText("Composant gérant la modification et la suppression");

        javax.swing.GroupLayout paneModSupLayout = new javax.swing.GroupLayout(paneModSup);
        paneModSup.setLayout(paneModSupLayout);
        paneModSupLayout.setHorizontalGroup(
            paneModSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneModSupLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(509, Short.MAX_VALUE))
        );
        paneModSupLayout.setVerticalGroup(
            paneModSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneModSupLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(515, Short.MAX_VALUE))
        );

        panePresentation.add(paneModSup, "card8");

        paneArticleStock.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel9.setText("Articles en stock");

        javax.swing.GroupLayout paneArticleStockLayout = new javax.swing.GroupLayout(paneArticleStock);
        paneArticleStock.setLayout(paneArticleStockLayout);
        paneArticleStockLayout.setHorizontalGroup(
            paneArticleStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneArticleStockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(paneArticleStockLayout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneArticleStockLayout.setVerticalGroup(
            paneArticleStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneArticleStockLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        panePresentation.add(paneArticleStock, "card7");

        javax.swing.GroupLayout paneRechercheLayout = new javax.swing.GroupLayout(paneRecherche);
        paneRecherche.setLayout(paneRechercheLayout);
        paneRechercheLayout.setHorizontalGroup(
            paneRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
        );
        paneRechercheLayout.setVerticalGroup(
            paneRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        panePresentation.add(paneRecherche, "card6");

        javax.swing.GroupLayout paneNbTotalArticleLayout = new javax.swing.GroupLayout(paneNbTotalArticle);
        paneNbTotalArticle.setLayout(paneNbTotalArticleLayout);
        paneNbTotalArticleLayout.setHorizontalGroup(
            paneNbTotalArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
        );
        paneNbTotalArticleLayout.setVerticalGroup(
            paneNbTotalArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        panePresentation.add(paneNbTotalArticle, "card5");

        javax.swing.GroupLayout paneSousSeuilLayout = new javax.swing.GroupLayout(paneSousSeuil);
        paneSousSeuil.setLayout(paneSousSeuilLayout);
        paneSousSeuilLayout.setHorizontalGroup(
            paneSousSeuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
        );
        paneSousSeuilLayout.setVerticalGroup(
            paneSousSeuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        panePresentation.add(paneSousSeuil, "card3");

        javax.swing.GroupLayout paneApprovisionnerLayout = new javax.swing.GroupLayout(paneApprovisionner);
        paneApprovisionner.setLayout(paneApprovisionnerLayout);
        paneApprovisionnerLayout.setHorizontalGroup(
            paneApprovisionnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
        );
        paneApprovisionnerLayout.setVerticalGroup(
            paneApprovisionnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        panePresentation.add(paneApprovisionner, "card3");

        javax.swing.GroupLayout paneVendreArticleLayout = new javax.swing.GroupLayout(paneVendreArticle);
        paneVendreArticle.setLayout(paneVendreArticleLayout);
        paneVendreArticleLayout.setHorizontalGroup(
            paneVendreArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
        );
        paneVendreArticleLayout.setVerticalGroup(
            paneVendreArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        panePresentation.add(paneVendreArticle, "card2");

        jPanel1.add(panePresentation, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed
        panePresentation.removeAll();
        panePresentation.add(paneEnregistrer);
        panePresentation.repaint();
        panePresentation.revalidate();   
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void btnArticleStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticleStockActionPerformed
        panePresentation.removeAll();
        panePresentation.add(paneArticleStock);
        panePresentation.repaint();
        panePresentation.revalidate();
    }//GEN-LAST:event_btnArticleStockActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
    }//GEN-LAST:event_submitActionPerformed

    private void libelArticleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libelArticleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_libelArticleFieldActionPerformed

    private void btnModSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModSupActionPerformed
        panePresentation.removeAll();
        panePresentation.add(paneModSup);
        panePresentation.repaint();
        panePresentation.revalidate();
    }//GEN-LAST:event_btnModSupActionPerformed

    private void btnRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercheActionPerformed
        panePresentation.removeAll();
        panePresentation.add(paneRecherche);
        panePresentation.repaint();
        panePresentation.revalidate();
    }//GEN-LAST:event_btnRechercheActionPerformed

    private void btnNbTotalArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNbTotalArticleActionPerformed
        panePresentation.removeAll();
        panePresentation.add(paneNbTotalArticle);
        panePresentation.repaint();
        panePresentation.revalidate();
    }//GEN-LAST:event_btnNbTotalArticleActionPerformed

    private void btnSousSeuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSousSeuilActionPerformed
        panePresentation.removeAll();
        panePresentation.add(paneSousSeuil);
        panePresentation.repaint();
        panePresentation.revalidate();
    }//GEN-LAST:event_btnSousSeuilActionPerformed

    private void btnApprovisionnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprovisionnerActionPerformed
        panePresentation.removeAll();
        panePresentation.add(paneApprovisionner);
        panePresentation.repaint();
        panePresentation.revalidate();
    }//GEN-LAST:event_btnApprovisionnerActionPerformed

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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprovisionner;
    private javax.swing.JButton btnArticleStock;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnModSup;
    private javax.swing.JButton btnNbTotalArticle;
    private javax.swing.JButton btnRecherche;
    private javax.swing.JButton btnSousSeuil;
    private javax.swing.JButton btnVendreArticle;
    private javax.swing.JTextField codeArticleField;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField libelArticleField;
    private javax.swing.JPanel paneApprovisionner;
    private javax.swing.JPanel paneArticleStock;
    private javax.swing.JPanel paneEnregistrer;
    private javax.swing.JPanel paneModSup;
    private javax.swing.JPanel paneNbTotalArticle;
    private javax.swing.JPanel panePresentation;
    private javax.swing.JPanel paneRecherche;
    private javax.swing.JPanel paneSousSeuil;
    private javax.swing.JPanel paneVendreArticle;
    private javax.swing.JTextField prixArticleField;
    private javax.swing.JPasswordField qteStockField;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
