package Clases;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class ventanaPrincipal extends javax.swing.JFrame {

    
    
    public ventanaPrincipal() {
        initComponents();
        Panel1.setBackground(new Color(51, 51, 51, 200));
        this.setLocationRelativeTo(null);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        imgUser = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lblUser = new javax.swing.JLabel();
        imgPass = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        lblFondoUser = new javax.swing.JLabel();
        lblFondoPass = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnOlvidePass = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(800, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIngresar.setBackground(new java.awt.Color(102, 102, 102));
        btnIngresar.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(null);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        Panel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 110, 40));

        imgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono1.png"))); // NOI18N
        Panel1.add(imgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 30, 30));

        txtPass.setToolTipText("");
        txtPass.setBorder(null);
        Panel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 220, 30));

        lblUser.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 0, 0));
        Panel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 10, 30));

        imgPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/password1.png"))); // NOI18N
        Panel1.add(imgPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 30, 30));

        txtCorreo.setToolTipText("");
        txtCorreo.setBorder(null);
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        Panel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 220, 30));

        lblPass.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPass.setForeground(new java.awt.Color(255, 0, 0));
        Panel1.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 10, 30));

        lblFondoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campos.png"))); // NOI18N
        Panel1.add(lblFondoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 260, 30));

        lblFondoPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campos.png"))); // NOI18N
        Panel1.add(lblFondoPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 260, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Iniciar Sesion");
        Panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 240, 60));

        getContentPane().add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 450));

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 70, 30));

        btnOlvidePass.setBackground(new java.awt.Color(102, 102, 102));
        btnOlvidePass.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnOlvidePass.setForeground(new java.awt.Color(255, 255, 255));
        btnOlvidePass.setText("Olvide la contraseña");
        btnOlvidePass.setBorder(null);
        btnOlvidePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvidePassActionPerformed(evt);
            }
        });
        getContentPane().add(btnOlvidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 180, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnOlvidePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvidePassActionPerformed
        Ventana_Cambio obj = new Ventana_Cambio();
        obj.ventana();
    }//GEN-LAST:event_btnOlvidePassActionPerformed

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        if(validarCorreo(txtCorreo.getText())){
            txtPass.requestFocus();
        }else{
            lblUser.setText("!");
            //txtCorreo.requestFocus();
        }
    }//GEN-LAST:event_txtCorreoFocusLost

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if(camposVacios()==true){//COMPROBAMOS QUE NO HAYAN CAMPOS VACIOS.
            String UserName = this.txtCorreo.getText();
            String Password = new String(this.txtPass.getPassword());
            Usuarios obj = new Usuarios(UserName,Password);
            int i = obj.Validacion();
            if(i==1){
                Bienvenido obj2 = new Bienvenido();
                obj2.ventana();
            }
            else{
                JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrecto");
            }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    public boolean validarCorreo(String correo){
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[\\w\\\\\\+]+(\\.[\\w\\\\]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
        mat = pat.matcher(correo);
        
        if(mat.find()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean camposVacios(){
        boolean llenos=true;
        
        if(txtCorreo.getText().isEmpty()){
            llenos=false;
            lblUser.setText("!");
        }else{
            lblUser.setText("");
        }
        if(txtPass.getText().isEmpty()){
            llenos=false;
            lblPass.setText("!");
        }else{
            lblPass.setText("");
        }
        return llenos;
    }
    
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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnOlvidePass;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel imgPass;
    private javax.swing.JLabel imgUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFondoPass;
    private javax.swing.JLabel lblFondoUser;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
