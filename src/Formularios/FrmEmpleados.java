package Formularios;

import Conexion.Conectar;
import classDAO.EmpleadosDAO;
import classVO.EmpleadosVO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS
 */
public class FrmEmpleados extends javax.swing.JInternalFrame {
    Conectar con = new Conectar();
    //INVOCAMOS AL METODO CONEXION
     Connection cn = con.Conectar(); 
    
    PreparedStatement ps;
    String Sexo = "";
    int validacion =0;
    String color = "";

    
//         boolean guar, mod, bor = false;
    
    public FrmEmpleados() {
        initComponents();
        
        this.setTitle("Empleados");
//        this.getContentPane().setBackground(Color.DARK_GRAY);

        Btg_SexoEmpleado.add(Rbt_MasculinoEmpleado);
        Btg_SexoEmpleado.add(Rbt_FemeninoEmpleado);
        
        generar_codigoempleado();
                
//        String Item = "";
        
    }
     
      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btg_SexoEmpleado = new javax.swing.ButtonGroup();
        Txt_IdEmpleado = new javax.swing.JTextField();
        Lbl_CiudadEmpleado = new javax.swing.JLabel();
        Lbl_IdEmpleado = new javax.swing.JLabel();
        Txt_DireccionEmpleado = new javax.swing.JTextField();
        Lbl_TelefonoEmpleado = new javax.swing.JLabel();
        Txt_TelefonoEmpleado = new javax.swing.JTextField();
        Lbl_TelefonoFamiliarEmpleado = new javax.swing.JLabel();
        Txt_TelefonoFamiliarEmpleado = new javax.swing.JTextField();
        Txt_NombreEmpleado = new javax.swing.JTextField();
        Txt_ApellidosEmpleado = new javax.swing.JTextField();
        Lbl_NombreEmpleado = new javax.swing.JLabel();
        Lbl_ApellidosEmpleado = new javax.swing.JLabel();
        Lbl_SexoEmpleado = new javax.swing.JLabel();
        Txt_CedulaEmpleado = new javax.swing.JTextField();
        Lbl_CedulaEmpleado = new javax.swing.JLabel();
        Lbl_DireccionEmpleado = new javax.swing.JLabel();
        Txt_CorreoEmpleado = new javax.swing.JTextField();
        Lbl_FormaAcademicaEmpleado = new javax.swing.JLabel();
        Txt_FormaAcademicaEmpleado = new javax.swing.JTextField();
        Lbl_OtrosEmpleado = new javax.swing.JLabel();
        Txt_OtrosCertificadosEmpleado = new javax.swing.JTextField();
        Lbl_ExperienciaEmpleado = new javax.swing.JLabel();
        Txt_ExperienciaEmpleado = new javax.swing.JTextField();
        Lbl_EpsEmpleado = new javax.swing.JLabel();
        Txt_EpsEmpleado = new javax.swing.JTextField();
        Lbl_PensionEmpleado = new javax.swing.JLabel();
        Txt_PensionEmpleado = new javax.swing.JTextField();
        Lbl_CesantiasEmpleado = new javax.swing.JLabel();
        Txt_EstadoCivilEmpleado = new javax.swing.JTextField();
        Txt_TarjetaProEmpleado = new javax.swing.JTextField();
        Lbl_TarjetaProEmpleado = new javax.swing.JLabel();
        Lbl_RHSanguineoEmpleado = new javax.swing.JLabel();
        Txt_RHSanguineoEmpleado = new javax.swing.JTextField();
        Btn_ActualizarEmpleado = new javax.swing.JButton();
        Btn_IngresarEmpleado = new javax.swing.JButton();
        Btn_SalirEmpleado = new javax.swing.JButton();
        Lbl_FNacimientoEmpleado = new javax.swing.JLabel();
        Txt_FechaNacimientoEmpleado = new javax.swing.JTextField();
        Btn_BuscarEmpleado = new javax.swing.JButton();
        Btn_LimpiarEmpleado = new javax.swing.JButton();
        Rbt_MasculinoEmpleado = new javax.swing.JRadioButton();
        Rbt_FemeninoEmpleado = new javax.swing.JRadioButton();
        Txt_FechaExpedicionEmpleado = new javax.swing.JTextField();
        Lbl_FExpedicionEmpleado = new javax.swing.JLabel();
        Lbl_FCertificadoAlturasEmpleado = new javax.swing.JLabel();
        Txt_FCertificadoAlturasEmpleado = new javax.swing.JTextField();

        Txt_IdEmpleado.setEditable(false);
        Txt_IdEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_IdEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Txt_IdEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_IdEmpleadoKeyTyped(evt);
            }
        });

        Lbl_CiudadEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_CiudadEmpleado.setText("Correo electronico");

        Lbl_IdEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_IdEmpleado.setText("Id de Usuario");

        Txt_DireccionEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_DireccionEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Txt_DireccionEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_DireccionEmpleadoActionPerformed(evt);
            }
        });

        Lbl_TelefonoEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_TelefonoEmpleado.setText("Telefono o celular");

        Txt_TelefonoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_TelefonoEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_TelefonoFamiliarEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_TelefonoFamiliarEmpleado.setText("Telefono Familiar");

        Txt_TelefonoFamiliarEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_TelefonoFamiliarEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Txt_NombreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_NombreEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Txt_ApellidosEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_ApellidosEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_NombreEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_NombreEmpleado.setText("Nombre  *");

        Lbl_ApellidosEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_ApellidosEmpleado.setText("Apellidos  *");

        Lbl_SexoEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_SexoEmpleado.setText("Sexo  *");

        Txt_CedulaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_CedulaEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_CedulaEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_CedulaEmpleado.setText("Cedula  *");

        Lbl_DireccionEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_DireccionEmpleado.setText("Direccion y Ciudad");

        Txt_CorreoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_CorreoEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_FormaAcademicaEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_FormaAcademicaEmpleado.setText("Formacion academica");

        Txt_FormaAcademicaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_FormaAcademicaEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_OtrosEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_OtrosEmpleado.setText("Otros");

        Txt_OtrosCertificadosEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_OtrosCertificadosEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_ExperienciaEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_ExperienciaEmpleado.setText("Experiencia");

        Txt_ExperienciaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_ExperienciaEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_EpsEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_EpsEmpleado.setText("EPS");

        Txt_EpsEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_EpsEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_PensionEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_PensionEmpleado.setText("Pension");

        Txt_PensionEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_PensionEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_CesantiasEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_CesantiasEmpleado.setText("Estado civil");

        Txt_EstadoCivilEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_EstadoCivilEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Txt_TarjetaProEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_TarjetaProEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_TarjetaProEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_TarjetaProEmpleado.setText("Tarjeta profesional");

        Lbl_RHSanguineoEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_RHSanguineoEmpleado.setText("RH Sanguineo");

        Txt_RHSanguineoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_RHSanguineoEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Btn_ActualizarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        Btn_ActualizarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        Btn_ActualizarEmpleado.setText("Actualizar");
        Btn_ActualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActualizarEmpleadoActionPerformed(evt);
            }
        });

        Btn_IngresarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        Btn_IngresarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        Btn_IngresarEmpleado.setText("Ingresar");
        Btn_IngresarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IngresarEmpleadoActionPerformed(evt);
            }
        });

        Btn_SalirEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        Btn_SalirEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        Btn_SalirEmpleado.setText("Salir");
        Btn_SalirEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirEmpleadoActionPerformed(evt);
            }
        });

        Lbl_FNacimientoEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_FNacimientoEmpleado.setText("Fecha y lugar de Nacimiento");

        Txt_FechaNacimientoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_FechaNacimientoEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Btn_BuscarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        Btn_BuscarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        Btn_BuscarEmpleado.setText("Buscar");
        Btn_BuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarEmpleadoActionPerformed(evt);
            }
        });

        Btn_LimpiarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        Btn_LimpiarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        Btn_LimpiarEmpleado.setText("Limpiar");
        Btn_LimpiarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimpiarEmpleadoActionPerformed(evt);
            }
        });

        Rbt_MasculinoEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Rbt_MasculinoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        Rbt_MasculinoEmpleado.setText("Masculino");

        Rbt_FemeninoEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Rbt_FemeninoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        Rbt_FemeninoEmpleado.setText("Femenino");

        Txt_FechaExpedicionEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_FechaExpedicionEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_FExpedicionEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_FExpedicionEmpleado.setText("Fecha y lugar de Expedicion");

        Lbl_FCertificadoAlturasEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_FCertificadoAlturasEmpleado.setText("Fecha certificado en alturas");

        Txt_FCertificadoAlturasEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_FCertificadoAlturasEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_EpsEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Txt_TarjetaProEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_NombreEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Rbt_MasculinoEmpleado)
                                        .addGap(48, 48, 48)
                                        .addComponent(Rbt_FemeninoEmpleado))
                                    .addComponent(Lbl_SexoEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_CiudadEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_CorreoEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_DireccionEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                    .addComponent(Lbl_DireccionEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_NombreEmpleado, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Lbl_CesantiasEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(115, 115, 115))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Lbl_ApellidosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Txt_ApellidosEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                            .addComponent(Txt_EstadoCivilEmpleado)
                                            .addComponent(Lbl_TelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Txt_TelefonoEmpleado)
                                            .addComponent(Txt_FormaAcademicaEmpleado)
                                            .addComponent(Lbl_FormaAcademicaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(46, 46, 46))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_IdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_IdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(272, 272, 272)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Txt_CedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Lbl_CedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Lbl_TarjetaProEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(109, 109, 109)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Txt_FCertificadoAlturasEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                            .addComponent(Lbl_PensionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Txt_PensionEmpleado)
                                            .addComponent(Lbl_FCertificadoAlturasEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(46, 46, 46)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_FechaExpedicionEmpleado)
                            .addComponent(Txt_OtrosCertificadosEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(Txt_TelefonoFamiliarEmpleado)
                            .addComponent(Txt_RHSanguineoEmpleado)
                            .addComponent(Txt_FechaNacimientoEmpleado)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_RHSanguineoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_TelefonoFamiliarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_FExpedicionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_FNacimientoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_OtrosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_ExperienciaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 69, Short.MAX_VALUE))
                            .addComponent(Txt_ExperienciaEmpleado)))
                    .addComponent(Txt_EpsEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(Btn_BuscarEmpleado)
                .addGap(18, 18, 18)
                .addComponent(Btn_IngresarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_ActualizarEmpleado)
                .addGap(18, 18, 18)
                .addComponent(Btn_LimpiarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_SalirEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Txt_IdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Lbl_CedulaEmpleado)
                                    .addComponent(Lbl_IdEmpleado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_CedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Lbl_FExpedicionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_FechaExpedicionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Lbl_NombreEmpleado)
                                .addGap(7, 7, 7)
                                .addComponent(Txt_NombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Lbl_ApellidosEmpleado)
                                .addGap(7, 7, 7)
                                .addComponent(Txt_ApellidosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lbl_CesantiasEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_EstadoCivilEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lbl_SexoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Rbt_FemeninoEmpleado)
                                    .addComponent(Rbt_MasculinoEmpleado)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_FNacimientoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_FechaNacimientoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Lbl_RHSanguineoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_RHSanguineoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Lbl_DireccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Txt_DireccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Lbl_TelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Txt_TelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(Lbl_TelefonoFamiliarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)))
                    .addComponent(Txt_TelefonoFamiliarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_CiudadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_CorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_FormaAcademicaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_FormaAcademicaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_OtrosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_OtrosCertificadosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lbl_ExperienciaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_ExperienciaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lbl_FCertificadoAlturasEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_FCertificadoAlturasEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(Lbl_PensionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_PensionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_TarjetaProEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_TarjetaProEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Lbl_EpsEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_EpsEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_IngresarEmpleado)
                    .addComponent(Btn_ActualizarEmpleado)
                    .addComponent(Btn_SalirEmpleado)
                    .addComponent(Btn_BuscarEmpleado)
                    .addComponent(Btn_LimpiarEmpleado))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_IdEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_IdEmpleadoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_Txt_IdEmpleadoKeyTyped

    private void Btn_ActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActualizarEmpleadoActionPerformed
      
          String cedula, nombre, apellidos;
          
          cedula = Txt_CedulaEmpleado.getText().trim();
          nombre = Txt_NombreEmpleado.getText().trim();
          apellidos = Txt_ApellidosEmpleado.getText().trim();
          
          if (cedula.equals("")){
              
             Txt_CedulaEmpleado.setBackground(Color.red);
             validacion++;
              
          }
          if (nombre.equals("")){
              
             Txt_NombreEmpleado.setBackground(Color.red);
             validacion++;
              
          }
          if (apellidos.equals("")){
              
             Txt_ApellidosEmpleado.setBackground(Color.red);
             validacion++; 
          }
          
          
          if ( validacion > 0){
              JOptionPane.showMessageDialog(null, "Los campos marcados con  *  son obligatorios ");
               validacion = 0;
               color = "Rojo";
          }else {
          
              if (Rbt_MasculinoEmpleado.isSelected()){
                 Sexo = "M";
               }
             
             else if (Rbt_FemeninoEmpleado.isSelected()){
                 Sexo = "F";
               } 
           
             if (Sexo.equals("")){
               JOptionPane.showMessageDialog(null, "No se selecciono el Sexo");
             }else{
             
                    EmpleadosVO empl = new EmpleadosVO();
       
                    empl.setCedula(Txt_CedulaEmpleado.getText());
                    empl.setFlugar_expedicion(Txt_FechaExpedicionEmpleado.getText());
                    empl.setNombre(Txt_NombreEmpleado.getText());
                    empl.setApellidos(Txt_ApellidosEmpleado.getText());
                    empl.setFlugar_nacimiento(Txt_FechaNacimientoEmpleado.getText());
                    empl.setSexo(Sexo);
                    empl.setEstado_civil(Txt_EstadoCivilEmpleado.getText());
                    empl.setRh_sanguineo(Txt_RHSanguineoEmpleado.getText());
                    empl.setDireccion(Txt_DireccionEmpleado.getText());
                    empl.setTelefono(Txt_TelefonoEmpleado.getText());
                    empl.setTelfamiliar(Txt_TelefonoFamiliarEmpleado.getText());
                    empl.setEmail(Txt_CorreoEmpleado.getText());
                    empl.setFormacion_academica(Txt_FormaAcademicaEmpleado.getText());
                    empl.setOtros_certificados(Txt_OtrosCertificadosEmpleado.getText());
                    empl.setTarjeta_pro(Txt_TarjetaProEmpleado.getText());
                    empl.setFcertificado_altura(Txt_FCertificadoAlturasEmpleado.getText());
                    empl.setExperiencia(Txt_ExperienciaEmpleado.getText());
                    empl.setEps(Txt_EpsEmpleado.getText());
                    empl.setPension(Txt_PensionEmpleado.getText());
                    
                    
                    
                    empl.setId_empleado(Integer.parseInt(Txt_IdEmpleado.getText()));
        
                    String resp = EmpleadosDAO.actualizarEmpleado(empl);

                    JOptionPane.showMessageDialog(null,resp);
          
                    Limpiar();       
                    generar_codigoempleado();   
             
             }
              
          } 
    
    }//GEN-LAST:event_Btn_ActualizarEmpleadoActionPerformed

    private void Btn_IngresarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IngresarEmpleadoActionPerformed
         
         String cedula, nombre, apellidos;
          
          cedula = Txt_CedulaEmpleado.getText().trim();
          nombre = Txt_NombreEmpleado.getText().trim();
          apellidos = Txt_ApellidosEmpleado.getText().trim();
          
          if (cedula.equals("")){
              
             Txt_CedulaEmpleado.setBackground(Color.red);
             validacion++;
              
          }
          if (nombre.equals("")){
              
             Txt_NombreEmpleado.setBackground(Color.red);
             validacion++;
              
          }
          if (apellidos.equals("")){
              
             Txt_ApellidosEmpleado.setBackground(Color.red);
             validacion++; 
          }
          
          
          if ( validacion > 0){
              JOptionPane.showMessageDialog(null, "Los campos marcados con  *  son obligatorios ");
              validacion = 0;
              color = "Rojo";
          }else {
          
              if (Rbt_MasculinoEmpleado.isSelected()){
                 Sexo = "M";
               }
             
             else if (Rbt_FemeninoEmpleado.isSelected()){
                 Sexo = "F";
               } 
           
             if (Sexo.equals("")){
               JOptionPane.showMessageDialog(null, "No se selecciono el Sexo");
             }else{
                 
             
                    EmpleadosVO empl = new EmpleadosVO();

                    empl.setId_empleado(Integer.parseInt(Txt_IdEmpleado.getText()));
                    empl.setCedula(Txt_CedulaEmpleado.getText());
                    empl.setFlugar_expedicion(Txt_FechaExpedicionEmpleado.getText());
                    empl.setNombre(Txt_NombreEmpleado.getText());
                    empl.setApellidos(Txt_ApellidosEmpleado.getText());
                    empl.setFlugar_nacimiento(Txt_FechaNacimientoEmpleado.getText());
                    empl.setSexo(Sexo);
                    empl.setEstado_civil(Txt_EstadoCivilEmpleado.getText());
                    empl.setRh_sanguineo(Txt_RHSanguineoEmpleado.getText());
                    empl.setDireccion(Txt_DireccionEmpleado.getText());
                    empl.setTelefono(Txt_TelefonoEmpleado.getText());
                    empl.setTelfamiliar(Txt_TelefonoFamiliarEmpleado.getText());
                    empl.setEmail(Txt_CorreoEmpleado.getText());
                    empl.setFormacion_academica(Txt_FormaAcademicaEmpleado.getText());
                    empl.setOtros_certificados(Txt_OtrosCertificadosEmpleado.getText());
                    empl.setTarjeta_pro(Txt_TarjetaProEmpleado.getText());
                    empl.setFcertificado_altura(Txt_FCertificadoAlturasEmpleado.getText());
                    empl.setExperiencia(Txt_ExperienciaEmpleado.getText());
                    empl.setEps(Txt_EpsEmpleado.getText());
                    empl.setPension(Txt_PensionEmpleado.getText());
                    
        
                    String resp = EmpleadosDAO.actualizarEmpleado(empl);

                    JOptionPane.showMessageDialog(null,resp);
          
                    Limpiar();       
                    generar_codigoempleado();   
             
             }
              
          } 
        
    }//GEN-LAST:event_Btn_IngresarEmpleadoActionPerformed

    private void Btn_SalirEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirEmpleadoActionPerformed

        Limpiar();
        generar_codigoempleado();

        dispose();
        
    }//GEN-LAST:event_Btn_SalirEmpleadoActionPerformed

    private void Btn_BuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarEmpleadoActionPerformed
        
        String validacionsexo = "";
        
        EmpleadosVO empl = EmpleadosDAO.buscarEmpleado(Txt_CedulaEmpleado.getText());
        
        Txt_IdEmpleado.setText(empl.getId_empleado()+"");
        Txt_CedulaEmpleado.setText(empl.getCedula()+"");
        Txt_FechaExpedicionEmpleado.setText(empl.getFlugar_expedicion());
        Txt_NombreEmpleado.setText(empl.getNombre());
        Txt_ApellidosEmpleado.setText(empl.getApellidos());
        Txt_FechaNacimientoEmpleado.setText(empl.getFlugar_nacimiento());
        validacionsexo = (empl.getSexo());
        Txt_EstadoCivilEmpleado.setText(empl.getEstado_civil());
        Txt_RHSanguineoEmpleado.setText(empl.getRh_sanguineo());
        Txt_DireccionEmpleado.setText(empl.getDireccion());
        Txt_TelefonoEmpleado.setText(empl.getTelefono());
        Txt_TelefonoFamiliarEmpleado.setText(empl.getTelfamiliar());
        Txt_CorreoEmpleado.setText(empl.getEmail());
        Txt_FormaAcademicaEmpleado.setText(empl.getFormacion_academica());
        Txt_OtrosCertificadosEmpleado.setText(empl.getOtros_certificados());
        Txt_TarjetaProEmpleado.setText(empl.getTarjeta_pro());
        Txt_FCertificadoAlturasEmpleado.setText(empl.getFcertificado_altura());
        Txt_ExperienciaEmpleado.setText(empl.getExperiencia());
        Txt_EpsEmpleado.setText(empl.getEps());
        Txt_PensionEmpleado.setText(empl.getPension());
        

             if("M".equals(validacionsexo)) {
                        Rbt_MasculinoEmpleado.setSelected(true);
                    } 
             
             if("F".equals(validacionsexo)) {
                        Rbt_FemeninoEmpleado.setSelected(true);
                    }
    
    }//GEN-LAST:event_Btn_BuscarEmpleadoActionPerformed

    private void Btn_LimpiarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarEmpleadoActionPerformed

        Limpiar();
        
        generar_codigoempleado();

    }//GEN-LAST:event_Btn_LimpiarEmpleadoActionPerformed

    private void Txt_DireccionEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_DireccionEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_DireccionEmpleadoActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup Btg_SexoEmpleado;
    private javax.swing.JButton Btn_ActualizarEmpleado;
    private javax.swing.JButton Btn_BuscarEmpleado;
    private javax.swing.JButton Btn_IngresarEmpleado;
    private javax.swing.JButton Btn_LimpiarEmpleado;
    private javax.swing.JButton Btn_SalirEmpleado;
    private javax.swing.JLabel Lbl_ApellidosEmpleado;
    private javax.swing.JLabel Lbl_CedulaEmpleado;
    private javax.swing.JLabel Lbl_CesantiasEmpleado;
    private javax.swing.JLabel Lbl_CiudadEmpleado;
    private javax.swing.JLabel Lbl_DireccionEmpleado;
    private javax.swing.JLabel Lbl_EpsEmpleado;
    private javax.swing.JLabel Lbl_ExperienciaEmpleado;
    private javax.swing.JLabel Lbl_FCertificadoAlturasEmpleado;
    private javax.swing.JLabel Lbl_FExpedicionEmpleado;
    private javax.swing.JLabel Lbl_FNacimientoEmpleado;
    private javax.swing.JLabel Lbl_FormaAcademicaEmpleado;
    private javax.swing.JLabel Lbl_IdEmpleado;
    private javax.swing.JLabel Lbl_NombreEmpleado;
    private javax.swing.JLabel Lbl_OtrosEmpleado;
    private javax.swing.JLabel Lbl_PensionEmpleado;
    private javax.swing.JLabel Lbl_RHSanguineoEmpleado;
    private javax.swing.JLabel Lbl_SexoEmpleado;
    private javax.swing.JLabel Lbl_TarjetaProEmpleado;
    private javax.swing.JLabel Lbl_TelefonoEmpleado;
    private javax.swing.JLabel Lbl_TelefonoFamiliarEmpleado;
    private javax.swing.JRadioButton Rbt_FemeninoEmpleado;
    private javax.swing.JRadioButton Rbt_MasculinoEmpleado;
    private javax.swing.JTextField Txt_ApellidosEmpleado;
    private javax.swing.JTextField Txt_CedulaEmpleado;
    private javax.swing.JTextField Txt_CorreoEmpleado;
    private javax.swing.JTextField Txt_DireccionEmpleado;
    private javax.swing.JTextField Txt_EpsEmpleado;
    private javax.swing.JTextField Txt_EstadoCivilEmpleado;
    private javax.swing.JTextField Txt_ExperienciaEmpleado;
    private javax.swing.JTextField Txt_FCertificadoAlturasEmpleado;
    private javax.swing.JTextField Txt_FechaExpedicionEmpleado;
    private javax.swing.JTextField Txt_FechaNacimientoEmpleado;
    private javax.swing.JTextField Txt_FormaAcademicaEmpleado;
    private javax.swing.JTextField Txt_IdEmpleado;
    private javax.swing.JTextField Txt_NombreEmpleado;
    private javax.swing.JTextField Txt_OtrosCertificadosEmpleado;
    private javax.swing.JTextField Txt_PensionEmpleado;
    private javax.swing.JTextField Txt_RHSanguineoEmpleado;
    private javax.swing.JTextField Txt_TarjetaProEmpleado;
    private javax.swing.JTextField Txt_TelefonoEmpleado;
    private javax.swing.JTextField Txt_TelefonoFamiliarEmpleado;
    // End of variables declaration//GEN-END:variables

     
     private void generar_codigoempleado(){
 
     try {
         con.sentencia = con.Conectar().createStatement();
         con.rs = con.sentencia.executeQuery("select ifnull(max(Id_Empleado),0)+1 as newcod from empleados");
         con.rs.next();
         Txt_IdEmpleado.setText(con.rs.getString("newcod"));
        } catch (Exception e){
        } finally{
//         con.desconectar();
     }  
 
 }
   
     
     private void Limpiar(){
     
        Txt_IdEmpleado.setText("");
        Txt_CedulaEmpleado.setText("");
        Txt_FechaExpedicionEmpleado.setText("");
        Txt_NombreEmpleado.setText("");
        Txt_ApellidosEmpleado.setText("");
        Txt_FechaNacimientoEmpleado.setText("");
        Btg_SexoEmpleado.clearSelection();
        Txt_EstadoCivilEmpleado.setText("");
        Txt_RHSanguineoEmpleado.setText("");
        Txt_DireccionEmpleado.setText("");
        Txt_TelefonoEmpleado.setText("");
        Txt_TelefonoFamiliarEmpleado.setText("");
        Txt_CorreoEmpleado.setText("");
        Txt_FormaAcademicaEmpleado.setText("");
        Txt_OtrosCertificadosEmpleado.setText("");
        Txt_TarjetaProEmpleado.setText("");
        Txt_FCertificadoAlturasEmpleado.setText("");
        Txt_ExperienciaEmpleado.setText("");
        Txt_EpsEmpleado.setText("");
        Txt_PensionEmpleado.setText("");
       
            
         if (color.equals("Rojo") ){
              
             Txt_CedulaEmpleado.setBackground(Color.white);
             Txt_NombreEmpleado.setBackground(Color.white);
             Txt_ApellidosEmpleado.setBackground(Color.white); 
             }
              
     }


     
}
