
package Formularios;

import Conexion.Conectar;
import classDAO.CargoDAO;
import classDAO.ResponsabilidadesDAO;
import classDAO.ProyectosDAO;
import classVO.CargoVO;
import classVO.ProyectosVO;
import classVO.ResponsabilidadesVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SISTEMAS
 */
public class FrmResponsabilidades extends javax.swing.JInternalFrame {
    
       PreparedStatement ps;
      Integer idproyecto = 0;
       
       Conectar con = new Conectar();
    //INVOCAMOS AL METODO CONEXION 
    Connection cn = con.Conectar();
    
    Integer idcargo = 0;
  
    
    public FrmResponsabilidades() {
        initComponents();
        
        cargarProyecto(0);
        cargarCargo(0);
        
        this.setTitle("Responsabilidades");


        mostrarresponsabilidades();
        generar_codigo();
    }

    private void mostrarresponsabilidades(){
         
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Id");
    modelo.addColumn("Responsabilidad");
    modelo.addColumn("Cargo");
    modelo.addColumn("Proyecto");
    
    
    Tabla_Responsabilidades.setModel(modelo);
    
    
 
    Object[]arrResponsabilidades = new Object [4];
        
           for(ResponsabilidadesVO resp: ResponsabilidadesDAO.getListResponsabilidades(idproyecto)){
                
                
                arrResponsabilidades[0] = resp.getId_responsabilidad();
                arrResponsabilidades[1] = resp.getNombre_responsabilidad();
                arrResponsabilidades[2] = resp.getNombre_cargo();
                arrResponsabilidades[3] = resp.getNombre_proyecto();
               
                
                modelo.addRow(arrResponsabilidades);
            }
            Tabla_Responsabilidades.setModel(modelo);
       
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Txt_IdResponsabilidad = new javax.swing.JTextField();
        Lbl_IdResponsabilidad = new javax.swing.JLabel();
        Lbl_Responsabilidad = new javax.swing.JLabel();
        Lbl_ProyectoResponsabilidad = new javax.swing.JLabel();
        Cmb_ProyectoResponsabilidad = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        Txta_Responsabilidad = new javax.swing.JTextArea();
        Lbl_CargoResponsabilidad = new javax.swing.JLabel();
        Cmb_CargoResponsabilidad = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Responsabilidades = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Btn_IngresarResponsabilidad = new javax.swing.JButton();
        Btn_ActualizarResponsabilidad = new javax.swing.JButton();
        Btn_LimpiarResponsabilidad = new javax.swing.JButton();
        Btn_EliminarResponsabilidad = new javax.swing.JButton();
        Btn_SalirResponsabilidad = new javax.swing.JButton();
        Btn_BuscarResponsabilidad = new javax.swing.JButton();
        Btn_NuevoResponsabilidad = new javax.swing.JButton();

        Txt_IdResponsabilidad.setEditable(false);
        Txt_IdResponsabilidad.setBackground(new java.awt.Color(255, 255, 255));
        Txt_IdResponsabilidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Txt_IdResponsabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IdResponsabilidadActionPerformed(evt);
            }
        });
        Txt_IdResponsabilidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_IdResponsabilidadKeyTyped(evt);
            }
        });

        Lbl_IdResponsabilidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_IdResponsabilidad.setText("Id Responsabilidad");

        Lbl_Responsabilidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_Responsabilidad.setText("Responsabilidad");

        Lbl_ProyectoResponsabilidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_ProyectoResponsabilidad.setText("Proyecto");

        Cmb_ProyectoResponsabilidad.setBackground(new java.awt.Color(255, 255, 255));
        Cmb_ProyectoResponsabilidad.setForeground(new java.awt.Color(0, 0, 0));
        Cmb_ProyectoResponsabilidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cmb_ProyectoResponsabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_ProyectoResponsabilidadActionPerformed(evt);
            }
        });

        Txta_Responsabilidad.setColumns(20);
        Txta_Responsabilidad.setLineWrap(true);
        Txta_Responsabilidad.setRows(5);
        Txta_Responsabilidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(Txta_Responsabilidad);

        Lbl_CargoResponsabilidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_CargoResponsabilidad.setText("Cargo");

        Cmb_CargoResponsabilidad.setBackground(new java.awt.Color(255, 255, 255));
        Cmb_CargoResponsabilidad.setForeground(new java.awt.Color(0, 0, 0));
        Cmb_CargoResponsabilidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cmb_CargoResponsabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_CargoResponsabilidadActionPerformed(evt);
            }
        });

        Tabla_Responsabilidades.setBackground(new java.awt.Color(255, 255, 255));
        Tabla_Responsabilidades.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tabla_Responsabilidades.setForeground(new java.awt.Color(0, 0, 0));
        Tabla_Responsabilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Responsabilidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_ResponsabilidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Responsabilidades);

        Btn_IngresarResponsabilidad.setBackground(new java.awt.Color(0, 0, 0));
        Btn_IngresarResponsabilidad.setForeground(new java.awt.Color(255, 255, 255));
        Btn_IngresarResponsabilidad.setText("Ingresar");
        Btn_IngresarResponsabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IngresarResponsabilidadActionPerformed(evt);
            }
        });

        Btn_ActualizarResponsabilidad.setBackground(new java.awt.Color(0, 0, 0));
        Btn_ActualizarResponsabilidad.setForeground(new java.awt.Color(255, 255, 255));
        Btn_ActualizarResponsabilidad.setText("Actualizar");
        Btn_ActualizarResponsabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActualizarResponsabilidadActionPerformed(evt);
            }
        });

        Btn_LimpiarResponsabilidad.setBackground(new java.awt.Color(0, 0, 0));
        Btn_LimpiarResponsabilidad.setForeground(new java.awt.Color(255, 255, 255));
        Btn_LimpiarResponsabilidad.setText("Limpiar");
        Btn_LimpiarResponsabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimpiarResponsabilidadActionPerformed(evt);
            }
        });

        Btn_EliminarResponsabilidad.setBackground(new java.awt.Color(0, 0, 0));
        Btn_EliminarResponsabilidad.setForeground(new java.awt.Color(255, 255, 255));
        Btn_EliminarResponsabilidad.setText("Eliminar");
        Btn_EliminarResponsabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarResponsabilidadActionPerformed(evt);
            }
        });

        Btn_SalirResponsabilidad.setBackground(new java.awt.Color(0, 0, 0));
        Btn_SalirResponsabilidad.setForeground(new java.awt.Color(255, 255, 255));
        Btn_SalirResponsabilidad.setText("Salir");
        Btn_SalirResponsabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirResponsabilidadActionPerformed(evt);
            }
        });

        Btn_BuscarResponsabilidad.setBackground(new java.awt.Color(0, 0, 0));
        Btn_BuscarResponsabilidad.setForeground(new java.awt.Color(255, 255, 255));
        Btn_BuscarResponsabilidad.setText("Buscar");
        Btn_BuscarResponsabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarResponsabilidadActionPerformed(evt);
            }
        });

        Btn_NuevoResponsabilidad.setBackground(new java.awt.Color(0, 0, 0));
        Btn_NuevoResponsabilidad.setForeground(new java.awt.Color(255, 255, 255));
        Btn_NuevoResponsabilidad.setText("Nuevo");
        Btn_NuevoResponsabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoResponsabilidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn_NuevoResponsabilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Btn_BuscarResponsabilidad, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(Btn_ActualizarResponsabilidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(Btn_IngresarResponsabilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_LimpiarResponsabilidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_EliminarResponsabilidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_SalirResponsabilidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(Btn_BuscarResponsabilidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_ActualizarResponsabilidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_NuevoResponsabilidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_IngresarResponsabilidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_LimpiarResponsabilidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_EliminarResponsabilidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_SalirResponsabilidad)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_Responsabilidad)
                            .addComponent(Lbl_ProyectoResponsabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmb_CargoResponsabilidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cmb_ProyectoResponsabilidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lbl_CargoResponsabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_IdResponsabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_IdResponsabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_IdResponsabilidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_IdResponsabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lbl_Responsabilidad)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Lbl_ProyectoResponsabilidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cmb_ProyectoResponsabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Lbl_CargoResponsabilidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cmb_CargoResponsabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_IdResponsabilidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_IdResponsabilidadKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_Txt_IdResponsabilidadKeyTyped

    private void Txt_IdResponsabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IdResponsabilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_IdResponsabilidadActionPerformed

    private void Btn_EliminarResponsabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarResponsabilidadActionPerformed
//        int fila = Tabla_Proyectos.getSelectedRow();
//        String id="";
//        id=Tabla_Proyectos.getValueAt(fila, 0).toString();
//
//        try {
//            PreparedStatement pst = cn.prepareStatement("DELETE FROM sedes WHERE  Id_Sede='"+id+"'");
//            pst.executeUpdate();
//            mostrardatos("");
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_Btn_EliminarResponsabilidadActionPerformed

    private void Btn_LimpiarResponsabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarResponsabilidadActionPerformed

        Limpiar();
        generar_codigo();
       
    }//GEN-LAST:event_Btn_LimpiarResponsabilidadActionPerformed

    private void Btn_IngresarResponsabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IngresarResponsabilidadActionPerformed

        CargoVO r = (CargoVO) Cmb_CargoResponsabilidad.getSelectedItem();
//        CargoVO carg = new CargoVO();
//        Integer p_carg = c.getId_proyecto();
//        carg.setId_cargo(Integer.parseInt(Txt_IdResponsabilidad.getText()));
//      
//        carg.setProposito(Txta_Responsabilidad.getText());
//        
//        carg.setId_proyecto(p_carg);
//        String resp = ResponsabilidadesDAO.registrarCargo(carg);
//        
//        JOptionPane.showMessageDialog(null,resp);
//        mostrarresponsabilidades();
//        
//        mostrarresponsabilidades();
        
        
    }//GEN-LAST:event_Btn_IngresarResponsabilidadActionPerformed

    private void Btn_SalirResponsabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirResponsabilidadActionPerformed

        Limpiar();
//        generar_codigo();
        dispose();

    }//GEN-LAST:event_Btn_SalirResponsabilidadActionPerformed

    private void Btn_ActualizarResponsabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActualizarResponsabilidadActionPerformed
               
//        ProyectosVO c = (ProyectosVO) Cmb_ProyectoResponsabilidad.getSelectedItem();
//        CargoVO carg = new CargoVO();
//        Integer p_carg = c.getId_proyecto();
//        carg.setId_cargo(Integer.parseInt(Txt_IdResponsabilidad.getText()));
//        carg.setNombre_cargo(Txt_NombreCargo.getText());
//        carg.setId_proyecto(p_carg);
//        carg.setProposito(Txta_Responsabilidad.getText());
//        carg.setDependencia(Txt_DependenciaCargo.getText());
//        
//        String resp = ResponsabilidadesDAO.registrarCargo(carg);
//
//         JOptionPane.showMessageDialog(null,resp);
//          
//          Limpiar();       
//          mostrarresponsabilidades();
    }//GEN-LAST:event_Btn_ActualizarResponsabilidadActionPerformed

    private void Cmb_ProyectoResponsabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_ProyectoResponsabilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cmb_ProyectoResponsabilidadActionPerformed

    private void Cmb_CargoResponsabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_CargoResponsabilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cmb_CargoResponsabilidadActionPerformed

    private void Btn_NuevoResponsabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoResponsabilidadActionPerformed

         
        generar_codigo();
        Limpiar();
        
 
    }//GEN-LAST:event_Btn_NuevoResponsabilidadActionPerformed

    private void Tabla_ResponsabilidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_ResponsabilidadesMouseClicked

        int fila= Tabla_Responsabilidades.getSelectedRow();
        if(fila>=0){
            Txt_IdResponsabilidad.setText(Tabla_Responsabilidades.getValueAt(fila, 0).toString());

//            desbloquear();
            Btn_IngresarResponsabilidad.setEnabled(false);
            Btn_ActualizarResponsabilidad.setEnabled(true);
            Btn_NuevoResponsabilidad.setEnabled(false);

            tablaresponsabilidadlineaseleccionada();
        }
        else{
            JOptionPane.showMessageDialog(null,"No seleciono fila");
        }
    }//GEN-LAST:event_Tabla_ResponsabilidadesMouseClicked

    private void Btn_BuscarResponsabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarResponsabilidadActionPerformed

        ProyectosVO p = (ProyectosVO) Cmb_ProyectoResponsabilidad.getSelectedItem();
        Integer p_cont = p.getId_proyecto();
        idproyecto = p_cont;

        mostrarresponsabilidades();

    }//GEN-LAST:event_Btn_BuscarResponsabilidadActionPerformed

    public void cargarProyecto(int busca){
        int index = 1;
        Cmb_ProyectoResponsabilidad.removeAllItems();
        Cmb_ProyectoResponsabilidad.addItem("Seleccione el proyecto");
        for(ProyectosVO proy: ProyectosDAO.getListProyectos()){
            Cmb_ProyectoResponsabilidad.addItem(proy);
            if(proy.getId_proyecto() == busca){
                Cmb_ProyectoResponsabilidad.setSelectedIndex(index);
            }
            index++;
        }
    }
    
   public void cargarCargo(int busca){
        int index = 1;
        Cmb_CargoResponsabilidad.removeAllItems();
        Cmb_CargoResponsabilidad.addItem("Seleccione el Cargo");
        for(CargoVO carg: CargoDAO.getListCargos(idproyecto)){
            Cmb_CargoResponsabilidad.addItem(carg);
            if(carg.getId_cargo() == busca){
                Cmb_CargoResponsabilidad.setSelectedIndex(index);
            }
            index++;
        }
    }
    
    private void tablaresponsabilidadlineaseleccionada(){
        
        ResponsabilidadesVO resp = ResponsabilidadesDAO.buscarResponsabilidad(Txt_IdResponsabilidad.getText());
        Txt_IdResponsabilidad.setText(resp.getId_responsabilidad()+"");
        Txta_Responsabilidad.setText(resp.getNombre_responsabilidad());
        cargarProyecto(resp.getId_proyecto());
        cargarCargo(resp.getId_cargo());
   
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_ActualizarResponsabilidad;
    private javax.swing.JButton Btn_BuscarResponsabilidad;
    private javax.swing.JButton Btn_EliminarResponsabilidad;
    private javax.swing.JButton Btn_IngresarResponsabilidad;
    private javax.swing.JButton Btn_LimpiarResponsabilidad;
    private javax.swing.JButton Btn_NuevoResponsabilidad;
    private javax.swing.JButton Btn_SalirResponsabilidad;
    private javax.swing.JComboBox Cmb_CargoResponsabilidad;
    private javax.swing.JComboBox Cmb_ProyectoResponsabilidad;
    private javax.swing.JLabel Lbl_CargoResponsabilidad;
    private javax.swing.JLabel Lbl_IdResponsabilidad;
    private javax.swing.JLabel Lbl_ProyectoResponsabilidad;
    private javax.swing.JLabel Lbl_Responsabilidad;
    private javax.swing.JTable Tabla_Responsabilidades;
    private javax.swing.JTextField Txt_IdResponsabilidad;
    private javax.swing.JTextArea Txta_Responsabilidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
     
 private void generar_codigo(){
 
     try {
         con.sentencia = con.Conectar().createStatement();
         con.rs = con.sentencia.executeQuery("select ifnull(max(Id_Responsabilidad),0)+1 as newcod from responsabilidades"
                 + "");
         con.rs.next();
         Txt_IdResponsabilidad.setText(con.rs.getString("newcod"));
     } catch (Exception e){
     } finally{
         con.desconectar();
     }  
 
 }
 

    public void Limpiar(){
        Txt_IdResponsabilidad.setText("");
        Txta_Responsabilidad.setText("");
        
        cargarProyecto(0);
        cargarCargo(0);
    }
 
}
