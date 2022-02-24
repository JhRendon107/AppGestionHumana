
package Formularios;

import Conexion.Conectar;
import classDAO.CargoDAO;
import classDAO.ContratosLaboralesDAO;
import classDAO.EmpleadosDAO;
import classDAO.ProyectosDAO;
import classVO.CargoVO;
import classVO.ContratosLaboralesVO;
import classVO.EmpleadosVO;
import classVO.ProyectosVO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class FrmContratosLaborales extends javax.swing.JInternalFrame {

         PreparedStatement ps;
          
         Integer idempleado = 0;
         Integer idproyecto = 0;
    
    public FrmContratosLaborales() {
        initComponents();
           
        cargarProyecto(0);
        cargarCargo(0);
        
        Txt_CedulaContrato.setFocusable(true);
        Txt_CedulaContrato.requestFocus();
        
        
        this.setTitle("contratos laborales");
       
        bloquear();
        mostrarcontratoslaborales();
        
    }
 
    private void mostrarcontratoslaborales(){
     
    Tabla_ContratosLaborales.getColumnModel().getColumn(0).setPreferredWidth(0);

   
    
     DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Id");
    modelo.addColumn("F Ingreso");
    modelo.addColumn("F Retiro");
    modelo.addColumn("Tipo Contrato");
    modelo.addColumn("Cargo");
    modelo.addColumn("Salario");
    modelo.addColumn("Proyecto");
    
    
    
    Tabla_ContratosLaborales.setModel(modelo);
    
           Object[]arrContratosLaborales = new Object [7];
        
           for(ContratosLaboralesVO carg: ContratosLaboralesDAO.getListContratosLaborales(idempleado)){
                 
                arrContratosLaborales[0] = carg.getId_contrato();
                arrContratosLaborales[1] = carg.getFecha_cont();
                arrContratosLaborales[2] = carg.getFecha_ret();
                arrContratosLaborales[3] = carg.getTipo_contrato();
                arrContratosLaborales[4] = carg.getCargo();
                arrContratosLaborales[5] = carg.getSalario();
                arrContratosLaborales[6] = carg.getProyecto();
                
                modelo.addRow(arrContratosLaborales);
            }
            Tabla_ContratosLaborales.setModel(modelo);
            
            
    
    }
 
     void bloquear(){
       
    Txt_IdContrato.setEnabled(false);
    Txt_IdEmpleado.setEnabled(false);
    Txt_CedulaContrato.setEnabled(true);
    Txt_NombreCompletoContrato.setEnabled(false);
    Txt_FIngresoContrato.setEnabled(false);
    Txt_PeriodoPruebaContrato.setEnabled(false);
    Txt_FTerminacionContrato.setEnabled(false);
    Txt_FRetiroContrato.setEnabled(false);
    Txt_TipoContrato.setEnabled(false);
    Cmb_CargoContrato.setEnabled(false);
    Txt_SalarioContrato.setEnabled(false);
    Cmb_ProyectoContrato.setEnabled(false);
    Txt_ObservacionContrato.setEnabled(false);
    Txt_MotivoRetiroContrato.setEnabled(false);
    Txt_PreavisoContrato.setEnabled(false);
    Txt_PreavisoAbiertoContrato.setEnabled(false);
    Btn_NuevoContrato.setEnabled(false);    
    Btn_IngresarContrato.setEnabled(false);
    Btn_BuscarContrato.setEnabled(true);
    Btn_ActualizarContrato.setEnabled(false);
        
    } 
    
     void desbloquear(){
         
    Txt_IdContrato.setEnabled(false);
    Txt_CedulaContrato.setEnabled(false);
    Txt_NombreCompletoContrato.setEnabled(false);
    Txt_FIngresoContrato.setEnabled(true);
    Txt_PeriodoPruebaContrato.setEnabled(true);
    Txt_FTerminacionContrato.setEnabled(true);
    Txt_FRetiroContrato.setEnabled(true);
    Txt_TipoContrato.setEnabled(true);
    Cmb_CargoContrato.setEnabled(true);
    Txt_SalarioContrato.setEnabled(true);
    Cmb_ProyectoContrato.setEnabled(true);
    Txt_ObservacionContrato.setEnabled(true);
    Txt_MotivoRetiroContrato.setEnabled(true);
    Txt_PreavisoContrato.setEnabled(true);
    Txt_PreavisoAbiertoContrato.setEnabled(true);
            
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Lbl_MotivoRetiroContrato = new javax.swing.JLabel();
        Txt_MotivoRetiroContrato = new javax.swing.JTextField();
        Lbl_TipoContrato = new javax.swing.JLabel();
        Txt_TipoContrato = new javax.swing.JTextField();
        Lbl_PreavisoContrato = new javax.swing.JLabel();
        Txt_PreavisoContrato = new javax.swing.JTextField();
        Lbl_PreavisoAbiertoContrato = new javax.swing.JLabel();
        Txt_PreavisoAbiertoContrato = new javax.swing.JTextField();
        Lbl_ProyectoContrato = new javax.swing.JLabel();
        Cmb_ProyectoContrato = new javax.swing.JComboBox();
        Lbl_CargoContrato = new javax.swing.JLabel();
        Txt_SalarioContrato = new javax.swing.JTextField();
        Cmb_CargoContrato = new javax.swing.JComboBox();
        Lbl_IdContrato = new javax.swing.JLabel();
        Txt_IdContrato = new javax.swing.JTextField();
        Lbl_CedulaContrato = new javax.swing.JLabel();
        Txt_CedulaContrato = new javax.swing.JTextField();
        Lbl_NombreCompletoContrato = new javax.swing.JLabel();
        Txt_NombreCompletoContrato = new javax.swing.JTextField();
        Lbl_SalarioContrato = new javax.swing.JLabel();
        Lbl_FIngresoContrato = new javax.swing.JLabel();
        Txt_FIngresoContrato = new javax.swing.JTextField();
        Lbl_PeriodoPruebaContrato = new javax.swing.JLabel();
        Txt_PeriodoPruebaContrato = new javax.swing.JTextField();
        Lbl_FRetiroContrato = new javax.swing.JLabel();
        Txt_FRetiroContrato = new javax.swing.JTextField();
        Lbl_FTerminacionContrato = new javax.swing.JLabel();
        Txt_FTerminacionContrato = new javax.swing.JTextField();
        Lbl_ObservacionContrato = new javax.swing.JLabel();
        Txt_ObservacionContrato = new javax.swing.JTextField();
        Lbl_IdContrato1 = new javax.swing.JLabel();
        Txt_IdEmpleado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Btn_BuscarContrato = new javax.swing.JButton();
        Btn_NuevoContrato = new javax.swing.JButton();
        Btn_IngresarContrato = new javax.swing.JButton();
        Btn_ActualizarContrato = new javax.swing.JButton();
        Btn_LimpiarContrato = new javax.swing.JButton();
        Btn_SalirContrato1 = new javax.swing.JButton();
        Btn_CertificadoContrato = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_ContratosLaborales = new javax.swing.JTable();
        Chk_Responsabilidades = new javax.swing.JCheckBox();

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
        jScrollPane2.setViewportView(jTable1);

        setBackground(new java.awt.Color(102, 102, 102));

        Lbl_MotivoRetiroContrato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_MotivoRetiroContrato.setText("Motivo Retiro");

        Txt_MotivoRetiroContrato.setBackground(new java.awt.Color(255, 255, 255));
        Txt_MotivoRetiroContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_TipoContrato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_TipoContrato.setText("Tipo Contrato");

        Txt_TipoContrato.setBackground(new java.awt.Color(255, 255, 255));
        Txt_TipoContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_PreavisoContrato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_PreavisoContrato.setText("Preaviso");

        Txt_PreavisoContrato.setBackground(new java.awt.Color(255, 255, 255));
        Txt_PreavisoContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_PreavisoAbiertoContrato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_PreavisoAbiertoContrato.setText("Preaviso Abierto");

        Txt_PreavisoAbiertoContrato.setBackground(new java.awt.Color(255, 255, 255));
        Txt_PreavisoAbiertoContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_ProyectoContrato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_ProyectoContrato.setText("Proyecto");

        Cmb_ProyectoContrato.setBackground(new java.awt.Color(255, 255, 255));
        Cmb_ProyectoContrato.setForeground(new java.awt.Color(0, 0, 0));
        Cmb_ProyectoContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cmb_ProyectoContrato.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cmb_ProyectoContratoItemStateChanged(evt);
            }
        });
        Cmb_ProyectoContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cmb_ProyectoContratoMouseClicked(evt);
            }
        });
        Cmb_ProyectoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_ProyectoContratoActionPerformed(evt);
            }
        });

        Lbl_CargoContrato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_CargoContrato.setText("Cargo");

        Txt_SalarioContrato.setBackground(new java.awt.Color(255, 255, 255));
        Txt_SalarioContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Cmb_CargoContrato.setBackground(new java.awt.Color(255, 255, 255));
        Cmb_CargoContrato.setForeground(new java.awt.Color(0, 0, 0));
        Cmb_CargoContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_IdContrato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_IdContrato.setText("Id Contrato");

        Txt_IdContrato.setEditable(false);
        Txt_IdContrato.setBackground(new java.awt.Color(255, 255, 255));
        Txt_IdContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_CedulaContrato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_CedulaContrato.setText("Cedula");

        Txt_CedulaContrato.setBackground(new java.awt.Color(255, 255, 255));
        Txt_CedulaContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_NombreCompletoContrato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_NombreCompletoContrato.setText("Nombre Completo");

        Txt_NombreCompletoContrato.setBackground(new java.awt.Color(255, 255, 255));
        Txt_NombreCompletoContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_SalarioContrato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_SalarioContrato.setText("Salario");

        Lbl_FIngresoContrato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_FIngresoContrato.setText("Fecha Ingreso");

        Txt_FIngresoContrato.setBackground(new java.awt.Color(255, 255, 255));
        Txt_FIngresoContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_PeriodoPruebaContrato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_PeriodoPruebaContrato.setText("Periodo Prueba");

        Txt_PeriodoPruebaContrato.setBackground(new java.awt.Color(255, 255, 255));
        Txt_PeriodoPruebaContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_FRetiroContrato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_FRetiroContrato.setText("Fecha Retiro");

        Txt_FRetiroContrato.setBackground(new java.awt.Color(255, 255, 255));
        Txt_FRetiroContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_FTerminacionContrato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_FTerminacionContrato.setText("Fecha terminacion");

        Txt_FTerminacionContrato.setBackground(new java.awt.Color(255, 255, 255));
        Txt_FTerminacionContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_ObservacionContrato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_ObservacionContrato.setText("Observacion");

        Txt_ObservacionContrato.setBackground(new java.awt.Color(255, 255, 255));
        Txt_ObservacionContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_IdContrato1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_IdContrato1.setText("Id Empleado");

        Txt_IdEmpleado.setEditable(false);
        Txt_IdEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Txt_IdEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Cmb_ProyectoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(Cmb_CargoContrato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_IdContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_IdContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Lbl_IdContrato1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(Txt_IdEmpleado))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_CedulaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_CedulaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Lbl_NombreCompletoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(277, 277, 277))
                                    .addComponent(Txt_NombreCompletoContrato))))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Txt_ObservacionContrato, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_MotivoRetiroContrato, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Lbl_ProyectoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(349, 349, 349)
                                    .addComponent(Lbl_CargoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Txt_FIngresoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(Lbl_FIngresoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(99, 99, 99)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Lbl_SalarioContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(113, 113, 113)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Txt_PeriodoPruebaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_PeriodoPruebaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_TipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Lbl_FTerminacionContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(78, 78, 78)
                                            .addComponent(Lbl_FRetiroContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Txt_FTerminacionContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Lbl_PreavisoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Lbl_PreavisoAbiertoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Txt_FRetiroContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Txt_SalarioContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(Txt_TipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Lbl_MotivoRetiroContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(Txt_PreavisoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Txt_PreavisoAbiertoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Lbl_ObservacionContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_CedulaContrato)
                            .addComponent(Lbl_IdContrato)
                            .addComponent(Lbl_NombreCompletoContrato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_IdContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_CedulaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_NombreCompletoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Lbl_IdContrato1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_IdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_ProyectoContrato)
                    .addComponent(Lbl_CargoContrato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cmb_CargoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cmb_ProyectoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_FIngresoContrato)
                    .addComponent(Lbl_PeriodoPruebaContrato)
                    .addComponent(Lbl_FTerminacionContrato)
                    .addComponent(Lbl_FRetiroContrato))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_FIngresoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_PeriodoPruebaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_FTerminacionContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_FRetiroContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_SalarioContrato)
                    .addComponent(Lbl_TipoContrato)
                    .addComponent(Lbl_PreavisoContrato)
                    .addComponent(Lbl_PreavisoAbiertoContrato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_TipoContrato)
                    .addComponent(Txt_SalarioContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_PreavisoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_PreavisoAbiertoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lbl_MotivoRetiroContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_MotivoRetiroContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(Lbl_ObservacionContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_ObservacionContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        Btn_BuscarContrato.setBackground(new java.awt.Color(0, 0, 0));
        Btn_BuscarContrato.setForeground(new java.awt.Color(255, 255, 255));
        Btn_BuscarContrato.setText("Buscar");
        Btn_BuscarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarContratoActionPerformed(evt);
            }
        });

        Btn_NuevoContrato.setBackground(new java.awt.Color(0, 0, 0));
        Btn_NuevoContrato.setForeground(new java.awt.Color(255, 255, 255));
        Btn_NuevoContrato.setText("Nuevo");
        Btn_NuevoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoContratoActionPerformed(evt);
            }
        });

        Btn_IngresarContrato.setBackground(new java.awt.Color(0, 0, 0));
        Btn_IngresarContrato.setForeground(new java.awt.Color(255, 255, 255));
        Btn_IngresarContrato.setText("Ingresar");
        Btn_IngresarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IngresarContratoActionPerformed(evt);
            }
        });

        Btn_ActualizarContrato.setBackground(new java.awt.Color(0, 0, 0));
        Btn_ActualizarContrato.setForeground(new java.awt.Color(255, 255, 255));
        Btn_ActualizarContrato.setText("Actualizar");
        Btn_ActualizarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActualizarContratoActionPerformed(evt);
            }
        });

        Btn_LimpiarContrato.setBackground(new java.awt.Color(0, 0, 0));
        Btn_LimpiarContrato.setForeground(new java.awt.Color(255, 255, 255));
        Btn_LimpiarContrato.setText("Limpiar");
        Btn_LimpiarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimpiarContratoActionPerformed(evt);
            }
        });

        Btn_SalirContrato1.setBackground(new java.awt.Color(0, 0, 0));
        Btn_SalirContrato1.setForeground(new java.awt.Color(255, 255, 255));
        Btn_SalirContrato1.setText("Salir");
        Btn_SalirContrato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirContrato1ActionPerformed(evt);
            }
        });

        Btn_CertificadoContrato.setBackground(new java.awt.Color(0, 0, 0));
        Btn_CertificadoContrato.setForeground(new java.awt.Color(255, 255, 255));
        Btn_CertificadoContrato.setText("Certificado");
        Btn_CertificadoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CertificadoContratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Btn_BuscarContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_NuevoContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_IngresarContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_ActualizarContrato, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addComponent(Btn_LimpiarContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_SalirContrato1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Btn_CertificadoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Btn_BuscarContrato)
                .addGap(18, 18, 18)
                .addComponent(Btn_ActualizarContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_NuevoContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_IngresarContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_LimpiarContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_SalirContrato1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_CertificadoContrato)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tabla_ContratosLaborales.setBackground(new java.awt.Color(255, 255, 255));
        Tabla_ContratosLaborales.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tabla_ContratosLaborales.setForeground(new java.awt.Color(0, 0, 0));
        Tabla_ContratosLaborales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "F Ingreso", "F Terminacion", "F Retiro", "Tipo Contrato", "Cargo", "Salario", "Proyecto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_ContratosLaborales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabla_ContratosLaborales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_ContratosLaboralesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_ContratosLaborales);
        if (Tabla_ContratosLaborales.getColumnModel().getColumnCount() > 0) {
            Tabla_ContratosLaborales.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        Chk_Responsabilidades.setText("Responsabilidades");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Chk_Responsabilidades, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Chk_Responsabilidades))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabla_ContratosLaboralesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_ContratosLaboralesMouseClicked

        
        int fila= Tabla_ContratosLaborales.getSelectedRow();
        
        if(fila>=0){
            Txt_IdContrato.setText(Tabla_ContratosLaborales.getValueAt(fila, 0).toString());
            
            desbloquear();
            
            Btn_NuevoContrato.setEnabled(false);
            Btn_IngresarContrato.setEnabled(false);
            Btn_ActualizarContrato.setEnabled(true);
            Btn_BuscarContrato.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(null,"no seleciono fila");
        }
        
        tablacontratolaborallineaseleccionada();
       
    }//GEN-LAST:event_Tabla_ContratosLaboralesMouseClicked

    private void Btn_IngresarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IngresarContratoActionPerformed
            

        ProyectosVO p = (ProyectosVO) Cmb_ProyectoContrato.getSelectedItem();
        CargoVO c = (CargoVO) Cmb_CargoContrato.getSelectedItem();
        
        ContratosLaboralesVO cont = new ContratosLaboralesVO();
        
        Integer p_cont = p.getId_proyecto();
        Integer c_cont = c.getId_cargo();
        
        cont.setId_contrato(Integer.parseInt(Txt_IdContrato.getText()));
        cont.setId_empleado(Integer.parseInt(Txt_IdEmpleado.getText()));
        cont.setFecha_cont(Txt_FIngresoContrato.getText());
        cont.setPer_pru(Txt_PeriodoPruebaContrato.getText());
        cont.setFecha_ter(Txt_FTerminacionContrato.getText());
        cont.setFecha_ret(Txt_FRetiroContrato.getText());
        cont.setTipo_contrato(Txt_TipoContrato.getText());
        cont.setId_cargo(c_cont);
        cont.setSalario(Float.parseFloat(Txt_SalarioContrato.getText()));
        cont.setId_proyecto(p_cont);
        cont.setPreaviso(Txt_PreavisoContrato.getText());
        cont.setPreabierto(Txt_PreavisoAbiertoContrato.getText());
        cont.setMot_ret(Txt_MotivoRetiroContrato.getText());       
        cont.setObservacion(Txt_ObservacionContrato.getText());
        
        String resp = ContratosLaboralesDAO.ingresarContratolaboral(cont);
        
        JOptionPane.showMessageDialog(null,resp);
        mostrarcontratoslaborales();
        
        Btn_NuevoContrato.setEnabled(true);
        
              
    }//GEN-LAST:event_Btn_IngresarContratoActionPerformed

    private void Btn_BuscarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarContratoActionPerformed
          
        String cedula; 
          
         cedula = Txt_CedulaContrato.getText().trim();
        
        if (cedula.equals("")){
              
             Txt_CedulaContrato.setBackground(Color.red);
             
             JOptionPane.showMessageDialog(null, "Se debe digitar numero de identificacion para realizar busqueda ");
             
        }else{
        
        Txt_CedulaContrato.setBackground(Color.WHITE);
        
        EmpleadosVO empl = EmpleadosDAO.buscarEmpleado(Txt_CedulaContrato.getText());
        
        idempleado = (empl.getId_empleado());
        Txt_IdEmpleado.setText(empl.getId_empleado()+"");
        Txt_NombreCompletoContrato.setText(empl.getNombre()+ " " + (empl.getApellidos()));
        
        mostrarcontratoslaborales();
        
        int fila = Tabla_ContratosLaborales.getRowCount () - 1;
    
            Txt_IdContrato.setText(Tabla_ContratosLaborales.getValueAt(fila, 0).toString());
            
         tablacontratolaborallineaseleccionada();   
        
         Txt_CedulaContrato.setEnabled(false);
         Btn_NuevoContrato.setEnabled(true);
         Btn_BuscarContrato.setEnabled(false);
         
        }

    }//GEN-LAST:event_Btn_BuscarContratoActionPerformed

    private void Btn_LimpiarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarContratoActionPerformed

        
        Limpiar();
        bloquear();
//        mostrarcontratoslaborales();
        generar_codigo();
        
    }//GEN-LAST:event_Btn_LimpiarContratoActionPerformed

    private void Btn_SalirContrato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirContrato1ActionPerformed

        Limpiar();
        generar_codigo();
        dispose();
 
    }//GEN-LAST:event_Btn_SalirContrato1ActionPerformed

    private void Btn_ActualizarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActualizarContratoActionPerformed

        ProyectosVO p = (ProyectosVO) Cmb_ProyectoContrato.getSelectedItem();
        CargoVO c = (CargoVO) Cmb_CargoContrato.getSelectedItem();
        
        ContratosLaboralesVO cont = new ContratosLaboralesVO();
                
        Integer p_cont = p.getId_proyecto(); 
        Integer c_cont = c.getId_cargo();
              
        cont.setFecha_cont(Txt_FIngresoContrato.getText());
        cont.setPer_pru(Txt_PeriodoPruebaContrato.getText());
        cont.setFecha_ter(Txt_FTerminacionContrato.getText());
        cont.setFecha_ret(Txt_FRetiroContrato.getText());
        cont.setTipo_contrato(Txt_TipoContrato.getText());
        cont.setId_cargo(c_cont);
        cont.setSalario(Float.parseFloat(Txt_SalarioContrato.getText()));
        cont.setId_proyecto(p_cont);
        cont.setPreaviso(Txt_PreavisoContrato.getText());
        cont.setPreabierto(Txt_PreavisoAbiertoContrato.getText());
        cont.setMot_ret(Txt_MotivoRetiroContrato.getText());       
        cont.setObservacion(Txt_ObservacionContrato.getText());
        cont.setId_contrato(Integer.parseInt(Txt_IdContrato.getText()));
        
        String resp = ContratosLaboralesDAO.actualizarContratolaboral(cont);

         JOptionPane.showMessageDialog(null,resp);
          
               
        mostrarcontratoslaborales();
        tablacontratolaborallineaseleccionada();
     
    }//GEN-LAST:event_Btn_ActualizarContratoActionPerformed

    private void Btn_NuevoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoContratoActionPerformed

       desbloquear();
        Txt_FIngresoContrato.setText("");
        Txt_PeriodoPruebaContrato.setText("");
        Txt_FTerminacionContrato.setText("");
        Txt_FRetiroContrato.setText("");
        Txt_TipoContrato.setText("");
        Txt_SalarioContrato.setText("");
        Txt_PreavisoContrato.setText("");
        Txt_PreavisoAbiertoContrato.setText("");
        Txt_MotivoRetiroContrato.setText("");
        Txt_ObservacionContrato.setText("");
        Btn_BuscarContrato.setEnabled(true);
        
        cargarProyecto(0);
        cargarCargo(0);
        generar_codigo();
        Btn_BuscarContrato.setEnabled(false);
        Btn_IngresarContrato.setEnabled(true);
        Btn_ActualizarContrato.setEnabled(false);
        Btn_NuevoContrato.setEnabled(false);
        
    }//GEN-LAST:event_Btn_NuevoContratoActionPerformed

    
    private void Cmb_ProyectoContratoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cmb_ProyectoContratoItemStateChanged
                   
    }//GEN-LAST:event_Cmb_ProyectoContratoItemStateChanged

    private void Cmb_ProyectoContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cmb_ProyectoContratoMouseClicked
        
        if (Cmb_ProyectoContrato.equals("Seleccione el proyecto")){
            idproyecto = 0;
         
            cargarCargo(0);
            
        }
        else{
         
         ProyectosVO p = (ProyectosVO) Cmb_ProyectoContrato.getSelectedItem();
         Integer p_cont = p.getId_proyecto();
         idproyecto = p_cont;
         
         cargarCargo(idproyecto);
        }
            
    }//GEN-LAST:event_Cmb_ProyectoContratoMouseClicked

    private void Cmb_ProyectoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_ProyectoContratoActionPerformed
        
    }//GEN-LAST:event_Cmb_ProyectoContratoActionPerformed

    private void Btn_CertificadoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CertificadoContratoActionPerformed
        boolean responsabilidades = false;
        
        Conectar con = new Conectar();
                    //INVOCAMOS AL METODO CONEXION
        Connection cn = con.Conectar();
        
        
        if (Chk_Responsabilidades.isSelected()){
            responsabilidades=true;
            
        }
        
            //   Activos sin responsabilidades 
        if (Txt_FRetiroContrato.getText().length()==0 && responsabilidades == false) {
            
        
        try {
                      
            JasperReport reporte = null;
            String path = "src\\Reportes\\CertificadoActivosSinFunciones.jasper";

            Map parametro = new HashMap();
            parametro.put("Id_Contrato",(Integer.parseInt(Txt_IdContrato.getText())));
            parametro.put("Nombre_Apellidos",Txt_NombreCompletoContrato.getText());
            parametro.put("Cedula",(Integer.parseInt(Txt_CedulaContrato.getText())));
            parametro.put("Firma",2);
                        
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, cn);

            JasperViewer view = new JasperViewer(jprint, false);             

            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
            
        } catch (JRException ex) {
            Logger.getLogger(FrmPersonalActivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        else{
            
            //   Activos con responsabilidades 
        if (Txt_FRetiroContrato.getText().length()==0 && responsabilidades == true) {
            
            try {
          
            JasperReport reporte = null;
            String path = "src\\Reportes\\CertificadoActivosConFunciones.jasper";

            Map parametro = new HashMap();
            parametro.put("Id_Contrato",(Integer.parseInt(Txt_IdContrato.getText())));
            parametro.put("Nombre_Apellidos",Txt_NombreCompletoContrato.getText());
            parametro.put("Cedula",(Integer.parseInt(Txt_CedulaContrato.getText())));
            parametro.put("Firma",2);
                        
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, cn);

            JasperViewer view = new JasperViewer(jprint, false);             

            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
            
        } catch (JRException ex) {
            Logger.getLogger(FrmPersonalActivo.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
              
        else{
            
            //   retirados sin responsabilidades         
        if (Txt_FRetiroContrato.getText().length()>=1 && responsabilidades == false) {
            
            try {

                  
            JasperReport reporte = null;
            String path = "src\\Reportes\\CertificadoRetiradosSinFunciones.jasper";

            Map parametro = new HashMap();
            parametro.put("Id_Contrato",(Integer.parseInt(Txt_IdContrato.getText())));
            parametro.put("Nombre_Apellidos",Txt_NombreCompletoContrato.getText());
            parametro.put("Cedula",(Integer.parseInt(Txt_CedulaContrato.getText())));
            parametro.put("Firma",2);
                        
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, cn);

            JasperViewer view = new JasperViewer(jprint, false);             

            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
            
        } catch (JRException ex) {
            Logger.getLogger(FrmPersonalRetirado.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }    
         
        else{
            
            //   retirados con responsabilidades 
            
        if (Txt_FRetiroContrato.getText().length()>=1 && responsabilidades == true) {
            
             try {

         
            JasperReport reporte = null;
            String path = "src\\Reportes\\CertificadoRetiradosConFunciones.jasper";

            Map parametro = new HashMap();
            parametro.put("Id_Contrato",(Integer.parseInt(Txt_IdContrato.getText())));
            parametro.put("Nombre_Apellidos",Txt_NombreCompletoContrato.getText());
            parametro.put("Cedula",(Integer.parseInt(Txt_CedulaContrato.getText())));
            parametro.put("Firma",2);
                        
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, cn);

            JasperViewer view = new JasperViewer(jprint, false);             

            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
            
        } catch (JRException ex) {
            Logger.getLogger(FrmPersonalRetirado.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }   
        }
        }
        }
        
        
    }//GEN-LAST:event_Btn_CertificadoContratoActionPerformed

    public void cargarProyecto(int busca){
        int index = 1;
        Cmb_ProyectoContrato.removeAllItems();
        Cmb_ProyectoContrato.addItem("Seleccione el proyecto");
        for(ProyectosVO proy: ProyectosDAO.getListProyectos()){
            
            Cmb_ProyectoContrato.addItem(proy);
            if(proy.getId_proyecto() == busca){
                Cmb_ProyectoContrato.setSelectedIndex(index);
            }
            index++;
        }
    }
    
    public void cargarCargo(int busca){
        int index = 1;
        Cmb_CargoContrato.removeAllItems();
        Cmb_CargoContrato.addItem("Seleccione el cargo");
        for(CargoVO carg: CargoDAO.getListCargos(idproyecto)){
            
            Cmb_CargoContrato.addItem(carg);
            if(carg.getId_cargo() == busca){
                Cmb_CargoContrato.setSelectedIndex(index);
            }
            index++;
        }
    }
    
    private void tablacontratolaborallineaseleccionada(){
        
         ContratosLaboralesVO cont = ContratosLaboralesDAO.buscarContratolaboral(Txt_IdContrato.getText());
         
        Txt_IdContrato.setText(cont.getId_contrato()+"");
        Txt_FIngresoContrato.setText(cont.getFecha_cont());
        Txt_PeriodoPruebaContrato.setText(cont.getPer_pru());
        Txt_FTerminacionContrato.setText(cont.getFecha_ter());
        Txt_FRetiroContrato.setText(cont.getFecha_ret());
        Txt_TipoContrato.setText(cont.getTipo_contrato());
        cargarCargo(cont.getId_cargo());
        Txt_SalarioContrato.setText(cont.getSalario()+"");
        cargarProyecto(cont.getId_proyecto());
        Txt_PreavisoContrato.setText(cont.getPreaviso());
        Txt_PreavisoAbiertoContrato.setText(cont.getPreabierto());
        Txt_MotivoRetiroContrato.setText(cont.getMot_ret());
        Txt_ObservacionContrato.setText(cont.getObservacion());
        
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_ActualizarContrato;
    private javax.swing.JButton Btn_BuscarContrato;
    private javax.swing.JButton Btn_CertificadoContrato;
    private javax.swing.JButton Btn_IngresarContrato;
    private javax.swing.JButton Btn_LimpiarContrato;
    private javax.swing.JButton Btn_NuevoContrato;
    private javax.swing.JButton Btn_SalirContrato1;
    private javax.swing.JCheckBox Chk_Responsabilidades;
    private javax.swing.JComboBox Cmb_CargoContrato;
    private javax.swing.JComboBox Cmb_ProyectoContrato;
    private javax.swing.JLabel Lbl_CargoContrato;
    private javax.swing.JLabel Lbl_CedulaContrato;
    private javax.swing.JLabel Lbl_FIngresoContrato;
    private javax.swing.JLabel Lbl_FRetiroContrato;
    private javax.swing.JLabel Lbl_FTerminacionContrato;
    private javax.swing.JLabel Lbl_IdContrato;
    private javax.swing.JLabel Lbl_IdContrato1;
    private javax.swing.JLabel Lbl_MotivoRetiroContrato;
    private javax.swing.JLabel Lbl_NombreCompletoContrato;
    private javax.swing.JLabel Lbl_ObservacionContrato;
    private javax.swing.JLabel Lbl_PeriodoPruebaContrato;
    private javax.swing.JLabel Lbl_PreavisoAbiertoContrato;
    private javax.swing.JLabel Lbl_PreavisoContrato;
    private javax.swing.JLabel Lbl_ProyectoContrato;
    private javax.swing.JLabel Lbl_SalarioContrato;
    private javax.swing.JLabel Lbl_TipoContrato;
    private javax.swing.JTable Tabla_ContratosLaborales;
    private javax.swing.JTextField Txt_CedulaContrato;
    private javax.swing.JTextField Txt_FIngresoContrato;
    private javax.swing.JTextField Txt_FRetiroContrato;
    private javax.swing.JTextField Txt_FTerminacionContrato;
    private javax.swing.JTextField Txt_IdContrato;
    private javax.swing.JTextField Txt_IdEmpleado;
    private javax.swing.JTextField Txt_MotivoRetiroContrato;
    private javax.swing.JTextField Txt_NombreCompletoContrato;
    private javax.swing.JTextField Txt_ObservacionContrato;
    private javax.swing.JTextField Txt_PeriodoPruebaContrato;
    private javax.swing.JTextField Txt_PreavisoAbiertoContrato;
    private javax.swing.JTextField Txt_PreavisoContrato;
    private javax.swing.JTextField Txt_SalarioContrato;
    private javax.swing.JTextField Txt_TipoContrato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

     Conectar con = new Conectar();
     //INVOCAMOS AL METODO CONEXION
     Connection cn = con.Conectar();
     
      private void generar_codigo(){
 
     try {
         con.sentencia = con.Conectar().createStatement();
         con.rs = con.sentencia.executeQuery("select ifnull(max(Id_Contrato),0)+1 as newcod from contratos_laborales");
         con.rs.next();
         Txt_IdContrato.setText(con.rs.getString("newcod"));
     } catch (Exception e){
     } finally{

     }  
 
 }
     
 private void Limpiar(){
     
        Txt_IdContrato.setText("");
        Txt_CedulaContrato.setText("");
        Txt_NombreCompletoContrato.setText("");
        Txt_FIngresoContrato.setText("");
        Txt_PeriodoPruebaContrato.setText("");
        Txt_FTerminacionContrato.setText("");
        Txt_FRetiroContrato.setText("");
        Txt_TipoContrato.setText("");
        Txt_SalarioContrato.setText("");
        Txt_PreavisoContrato.setText("");
        Txt_PreavisoAbiertoContrato.setText("");
        Txt_MotivoRetiroContrato.setText("");
        Txt_ObservacionContrato.setText("");
        Btn_BuscarContrato.setEnabled(true);
        idempleado = 0;
        
        cargarProyecto(0);
        cargarCargo(0);
        mostrarcontratoslaborales();
        
     }     

 
}

