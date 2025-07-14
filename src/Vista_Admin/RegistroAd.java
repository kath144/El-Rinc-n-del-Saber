
package Vista_Admin;

import Modelo.Admin;
import Sistema.AdminDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class RegistroAd extends javax.swing.JFrame {

   private AdminDAO adminDAO;

public RegistroAd(AdminDAO adminDAO) {
    this.adminDAO = adminDAO;
    initComponents();
    setLocationRelativeTo(null);
}


public RegistroAd() {
    this(new AdminDAO());
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JPanel();
        labelNombre1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        txtNombreCompleto1 = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        txtConfirmar = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombre.setBackground(new java.awt.Color(0, 104, 120));

        labelNombre1.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        labelNombre1.setForeground(new java.awt.Color(167, 237, 255));
        labelNombre1.setText("Nombre Completo");

        txtPassword.setText("*********");
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });

        txtEmail.setText("Ingresa tu correo electronico");
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(69, 73, 74));
        btnRegresar.setFont(new java.awt.Font("Readex Pro bold", 0, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(167, 237, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 183)));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtNombreCompleto1.setText("Ingresa tu nombre completo");
        txtNombreCompleto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombreCompleto1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreCompleto1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreCompleto1FocusLost(evt);
            }
        });
        txtNombreCompleto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCompleto1ActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(69, 73, 74));
        btnRegistrar.setFont(new java.awt.Font("Readex Pro bold", 0, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(167, 237, 255));
        btnRegistrar.setText("Registrarse");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 183)));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtConfirmar.setText("*********");
        txtConfirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtConfirmar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmarFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(167, 237, 255));
        jLabel8.setText("Correo electrónico");

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(167, 237, 255));
        jLabel2.setText("Registrarse");

        jLabel9.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(167, 237, 255));
        jLabel9.setText("Contraseña");

        jLabel10.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(167, 237, 255));
        jLabel10.setText("Confirmar contraseña");

        javax.swing.GroupLayout txtNombreLayout = new javax.swing.GroupLayout(txtNombre);
        txtNombre.setLayout(txtNombreLayout);
        txtNombreLayout.setHorizontalGroup(
            txtNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtNombreLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(txtNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(labelNombre1)
                        .addComponent(jSeparator3)
                        .addComponent(txtNombreCompleto1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                        .addComponent(txtEmail)
                        .addComponent(txtPassword)
                        .addComponent(txtConfirmar)
                        .addGroup(txtNombreLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(txtNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator4)
                                .addGroup(txtNombreLayout.createSequentialGroup()
                                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)))))
                    .addComponent(jLabel2))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        txtNombreLayout.setVerticalGroup(
            txtNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtNombreLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(labelNombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreCompleto1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(txtNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreCompleto1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreCompleto1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCompleto1FocusGained

    private void txtNombreCompleto1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreCompleto1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCompleto1FocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtConfirmarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarFocusGained

    private void txtConfirmarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarFocusLost

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        LoginAdmin login = new LoginAdmin ();
        login.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
    String nombre = txtNombreCompleto1.getText().trim();
    String correo = txtEmail.getText().trim();
    String contraseña = new String(txtPassword.getPassword()).trim();
    String confirmar = new String(txtConfirmar.getPassword()).trim();
    

    if (nombre.isEmpty() || correo.isEmpty() || contraseña.isEmpty() || confirmar.isEmpty() ) {
        JOptionPane.showMessageDialog(this, "Completa todos los campos.");
        return;
    }

    if (!contraseña.equals(confirmar)) {
        JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.");
        return;
    }

    Admin nuevo = new Admin(correo, contraseña, nombre);

    if (adminDAO.registrar(nuevo)) {
        JOptionPane.showMessageDialog(this, "✅ Registro exitoso.");
        new LoginAdmin(adminDAO).setVisible(true);
        System.out.println("=== ADMINISTRADORES GUARDADOS ===");
        for (Admin a : adminDAO.obtenerTodos()) {
            System.out.println("- " + a.getCorreo() + " / " + a.getContraseña());
        }

        this.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "❌ Ya existe un administrador con ese correo.");
    }
    
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNombreCompleto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCompleto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCompleto1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               AdminDAO adminDAO = new AdminDAO();
               new RegistroAd(adminDAO).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelNombre1;
    public javax.swing.JPasswordField txtConfirmar;
    public javax.swing.JTextField txtEmail;
    private javax.swing.JPanel txtNombre;
    public javax.swing.JTextField txtNombreCompleto1;
    public javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
