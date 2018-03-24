/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szotar;

import com.sun.glass.events.KeyEvent;

/**
 *
 * @author Darázsi Márk
 */
public class Ablak extends javax.swing.JFrame {
    
    DB ab = new DB();

    /**
     * Creates new form Ablak
     */
    public Ablak() {
        initComponents();
        ab.beolvas(tblSzavak, lekerdez());
    }
    
    private String lekerdez() {
        String q = "";
        if (!txtLeckeSzur.getText().trim().isEmpty())
            q = q + " lecke LIKE '%" + txtLeckeSzur.getText().trim() + "%' AND ";
        q = q + " angol LIKE '%" + txtAngolSzur.getText().trim() + "%' AND ";
        q = q + " magyar LIKE '%" + txtMagyarSzur.getText().trim() + "%' ";
        return "SELECT * FROM szavak WHERE " + q + " ORDER BY lecke;";
    }
    
    private void tablabol() {
        int i = tblSzavak.getSelectedRow();
        if ( i == -1) return;
        Object e = tblSzavak.getValueAt(i, 1);
        if ( e != null)
            txtLecke.setText(e.toString());
        else
            txtLecke.setText("");
        txtAngol.setText(tblSzavak.getValueAt(i, 2).toString());
        txtMagyar.setText(tblSzavak.getValueAt(i, 3).toString());
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
        tblSzavak = new javax.swing.JTable();
        txtLeckeSzur = new javax.swing.JTextField();
        txtAngolSzur = new javax.swing.JTextField();
        txtMagyarSzur = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLecke = new javax.swing.JTextField();
        txtAngol = new javax.swing.JTextField();
        txtMagyar = new javax.swing.JTextField();
        btnTorol = new javax.swing.JButton();
        btnSzurtorol = new javax.swing.JButton();
        btnHozzaAd = new javax.swing.JButton();
        btnModosit = new javax.swing.JButton();
        btnUj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Szótárfüzet");
        setResizable(false);

        tblSzavak.setAutoCreateRowSorter(true);
        tblSzavak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lecke", "Angol", "Magyar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSzavak.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSzavak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblSzavakMouseReleased(evt);
            }
        });
        tblSzavak.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblSzavakKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblSzavak);
        if (tblSzavak.getColumnModel().getColumnCount() > 0) {
            tblSzavak.getColumnModel().getColumn(0).setMinWidth(0);
            tblSzavak.getColumnModel().getColumn(0).setMaxWidth(0);
            tblSzavak.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblSzavak.getColumnModel().getColumn(2).setPreferredWidth(300);
            tblSzavak.getColumnModel().getColumn(3).setPreferredWidth(300);
        }

        txtLeckeSzur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLeckeSzurActionPerformed(evt);
            }
        });

        txtAngolSzur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAngolSzurActionPerformed(evt);
            }
        });

        txtMagyarSzur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMagyarSzurActionPerformed(evt);
            }
        });

        jLabel1.setDisplayedMnemonic('L');
        jLabel1.setLabelFor(txtLecke);
        jLabel1.setText("Lecke:");

        jLabel2.setDisplayedMnemonic('A');
        jLabel2.setLabelFor(txtAngol);
        jLabel2.setText("Angol:");

        jLabel3.setDisplayedMnemonic('M');
        jLabel3.setLabelFor(txtMagyar);
        jLabel3.setText("Magyar:");

        btnTorol.setMnemonic('T');
        btnTorol.setText("Töröl");

        btnSzurtorol.setMnemonic('S');
        btnSzurtorol.setText("Szűrőket törli");
        btnSzurtorol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSzurtorolActionPerformed(evt);
            }
        });

        btnHozzaAd.setMnemonic('H');
        btnHozzaAd.setText("Hozzáad");

        btnModosit.setMnemonic('d');
        btnModosit.setText("Módosít");

        btnUj.setMnemonic('j');
        btnUj.setText("Új");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtLeckeSzur, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAngolSzur, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMagyarSzur, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtLecke, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtAngol, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMagyar)
                                .addGap(34, 34, 34)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHozzaAd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTorol))
                            .addComponent(btnUj)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModosit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSzurtorol)))
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnHozzaAd, btnModosit, btnSzurtorol, btnTorol, btnUj});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLeckeSzur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAngolSzur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMagyarSzur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLecke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTorol)
                    .addComponent(btnHozzaAd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAngol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSzurtorol)
                    .addComponent(btnModosit))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMagyar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUj))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLeckeSzurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLeckeSzurActionPerformed
        ab.beolvas(tblSzavak, lekerdez());
    }//GEN-LAST:event_txtLeckeSzurActionPerformed

    private void txtAngolSzurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAngolSzurActionPerformed
        ab.beolvas(tblSzavak, lekerdez());
    }//GEN-LAST:event_txtAngolSzurActionPerformed

    private void txtMagyarSzurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMagyarSzurActionPerformed
        ab.beolvas(tblSzavak, lekerdez());
    }//GEN-LAST:event_txtMagyarSzurActionPerformed

    private void btnSzurtorolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSzurtorolActionPerformed
        txtLeckeSzur.setText("");
        txtAngolSzur.setText("");
        txtMagyarSzur.setText("");
        ab.beolvas(tblSzavak, lekerdez());
    }//GEN-LAST:event_btnSzurtorolActionPerformed

    private void tblSzavakMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSzavakMouseReleased
        tablabol();
    }//GEN-LAST:event_tblSzavakMouseReleased

    private void tblSzavakKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSzavakKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP
            || evt.getKeyCode() == KeyEvent.VK_DOWN
            || evt.getKeyCode() == KeyEvent.VK_PAGE_UP
            || evt.getKeyCode() == KeyEvent.VK_PAGE_DOWN)
            tablabol();
    }//GEN-LAST:event_tblSzavakKeyReleased

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
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ablak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHozzaAd;
    private javax.swing.JButton btnModosit;
    private javax.swing.JButton btnSzurtorol;
    private javax.swing.JButton btnTorol;
    private javax.swing.JButton btnUj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSzavak;
    private javax.swing.JTextField txtAngol;
    private javax.swing.JTextField txtAngolSzur;
    private javax.swing.JTextField txtLecke;
    private javax.swing.JTextField txtLeckeSzur;
    private javax.swing.JTextField txtMagyar;
    private javax.swing.JTextField txtMagyarSzur;
    // End of variables declaration//GEN-END:variables
}
