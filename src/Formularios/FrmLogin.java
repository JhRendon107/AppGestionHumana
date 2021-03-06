/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;



/**
 *
 * @author SISTEMAS
 */
public class FrmLogin extends javax.swing.JFrame {

    private Timer t;
    private ActionListener ac;
    private int x = 0;
    
    /**
     * Creates new form FrmLogin
     */
    public FrmLogin() {
        initComponents();
        
        
        
        setSize(400,550);
        setResizable(false);
        setTitle("Acceso al Sistema");
        setLocationRelativeTo(null);
        
        ImageIcon fondologin = new ImageIcon("src/Imagenes/FondoFrm.jpg");
        Icon icono = new ImageIcon(fondologin.getImage().getScaledInstance(Lbl_FondoLogin.getWidth(), 
                Lbl_FondoLogin.getHeight(), Image.SCALE_DEFAULT));    
        Lbl_FondoLogin.setIcon(icono);
        this.repaint();
        
        ImageIcon logologin = new ImageIcon("src/Imagenes/LogoConsultel2.jpg");
        Icon icono_logo = new ImageIcon(logologin.getImage().getScaledInstance(Lbl_LogoLogin.getWidth(),
                Lbl_LogoLogin.getHeight(), Image.SCALE_DEFAULT ));
        Lbl_LogoLogin.setIcon(icono_logo);
        this.repaint();
        
       
        
    }

    @Override
    
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/ConsultelLogoIcono.jpg"));
        return retValue;
    
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar2 = new javax.swing.JProgressBar();
        Btn_IngresarLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Pass_Contrase??aLogin = new javax.swing.JPasswordField();
        Txt_UsuarioLogin = new javax.swing.JTextField();
        Btn_SalirLogin = new javax.swing.JButton();
        Lbl_LogoLogin = new javax.swing.JLabel();
        PBar_Inicio = new javax.swing.JProgressBar();
        Lbl_FondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_IngresarLogin.setBackground(new java.awt.Color(0, 0, 0));
        Btn_IngresarLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn_IngresarLogin.setForeground(new java.awt.Color(255, 255, 255));
        Btn_IngresarLogin.setText("Ingresar");
        Btn_IngresarLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_IngresarLoginMouseClicked(evt);
            }
        });
        Btn_IngresarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IngresarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_IngresarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contrase??a:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        Pass_Contrase??aLogin.setText("123");
        Pass_Contrase??aLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Pass_Contrase??aLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 270, -1));

        Txt_UsuarioLogin.setBackground(new java.awt.Color(255, 255, 255));
        Txt_UsuarioLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Txt_UsuarioLogin.setText("Sistemas");
        Txt_UsuarioLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Txt_UsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 270, -1));

        Btn_SalirLogin.setBackground(new java.awt.Color(0, 0, 0));
        Btn_SalirLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn_SalirLogin.setForeground(new java.awt.Color(255, 255, 255));
        Btn_SalirLogin.setText("Salir");
        getContentPane().add(Btn_SalirLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 90, -1));

        Lbl_LogoLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Lbl_LogoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 270, 80));

        PBar_Inicio.setBackground(new java.awt.Color(255, 255, 255));
        PBar_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        PBar_Inicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(PBar_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 290, -1));
        getContentPane().add(Lbl_FondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 400, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_IngresarLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_IngresarLoginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_IngresarLoginMouseClicked

    private void Btn_IngresarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IngresarLoginActionPerformed

        String Usuario ="Sistemas";
        String Contrase??a="123";

        String Password=new String(Pass_Contrase??aLogin.getPassword());

        if (Txt_UsuarioLogin.getText().equals(Usuario)&& Password.equals(Contrase??a)){

            
             
            ac = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
             x = x + 1;   
             PBar_Inicio.setValue(x);
                
            }
      
        };
        t = new Timer(100, ac);
        t.start();

        FrmMenuPrincipalRH FMP = new FrmMenuPrincipalRH();
        
            FMP.setVisible(true);
            dispose();

        }

        else {
            JOptionPane.showMessageDialog(this, "Usuario y contrase??a Incorrecta");

        }
    }//GEN-LAST:event_Btn_IngresarLoginActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_IngresarLogin;
    private javax.swing.JButton Btn_SalirLogin;
    private javax.swing.JLabel Lbl_FondoLogin;
    private javax.swing.JLabel Lbl_LogoLogin;
    private javax.swing.JProgressBar PBar_Inicio;
    private javax.swing.JPasswordField Pass_Contrase??aLogin;
    private javax.swing.JTextField Txt_UsuarioLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar2;
    // End of variables declaration//GEN-END:variables
}
