
package Formularios;

import Conexion.Conectar;
import classDAO.ProyectosDAO;
import classVO.ProyectosVO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SISTEMAS
 */
public class FrmProyectos extends javax.swing.JInternalFrame {
    
       PreparedStatement ps;
//     Resultset rs;
    Conectar con = new Conectar();
    //INVOCAMOS AL METODO CONEXION 
    Connection cn = con.Conectar();
    
    String estado = "";
    int estado_cmb = 0;
    
    public FrmProyectos() {
        initComponents();
       
        mostrarproyectos();
        this.setTitle("Proyectos");
       Btn_ActualizarProyecto.setEnabled(false);        
        
        generar_codigo();
    }

    private void mostrarproyectos(){
       
        DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Id");
    modelo.addColumn("Proyecto");
    modelo.addColumn("Direccion");
    modelo.addColumn("Ciudad");
    modelo.addColumn("Estado");    
    
    Tabla_Proyectos.setModel(modelo);
    
    Object[]arrProyectos = new Object [5];
        
           for(ProyectosVO proy: ProyectosDAO.getListProyectos()){
                 
                arrProyectos[0] = proy.getId_proyecto();
                arrProyectos[1] = proy.getNombre_proyecto();
                arrProyectos[2] = proy.getDireccion();
                arrProyectos[3] = proy.getCiudad();
                arrProyectos[4] = proy.getEstado();
                
                modelo.addRow(arrProyectos);
            }
            Tabla_Proyectos.setModel(modelo);
  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Txt_IdProyecto = new javax.swing.JTextField();
        Lbl_IdProyecto = new javax.swing.JLabel();
        Lbl_NombreProyecto = new javax.swing.JLabel();
        Txt_DireccionProyecto = new javax.swing.JTextField();
        Lbl_DireccionProyecto = new javax.swing.JLabel();
        Txt_NombreProyecto = new javax.swing.JTextField();
        Txt_CiudadProyecto = new javax.swing.JTextField();
        Lbl_CiudadProyecto = new javax.swing.JLabel();
        Btn_EliminarContrato = new javax.swing.JButton();
        Btn_LimpiarContrato = new javax.swing.JButton();
        Btn_IngresarProyecto = new javax.swing.JButton();
        Btn_SalirContrato = new javax.swing.JButton();
        Btn_ActualizarProyecto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Proyectos = new javax.swing.JTable();
        Cmb_EstadoProyecto = new javax.swing.JComboBox<>();
        Lbl_EstadoProyecto = new javax.swing.JLabel();

        Txt_IdProyecto.setEditable(false);
        Txt_IdProyecto.setBackground(new java.awt.Color(255, 255, 255));
        Txt_IdProyecto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Txt_IdProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IdProyectoActionPerformed(evt);
            }
        });
        Txt_IdProyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_IdProyectoKeyTyped(evt);
            }
        });

        Lbl_IdProyecto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Lbl_IdProyecto.setText("Id Proyecto");

        Lbl_NombreProyecto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Lbl_NombreProyecto.setText("Proyecto");

        Txt_DireccionProyecto.setBackground(new java.awt.Color(255, 255, 255));
        Txt_DireccionProyecto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_DireccionProyecto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Lbl_DireccionProyecto.setText("N° Contrato");

        Txt_NombreProyecto.setBackground(new java.awt.Color(255, 255, 255));
        Txt_NombreProyecto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Txt_CiudadProyecto.setBackground(new java.awt.Color(255, 255, 255));
        Txt_CiudadProyecto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_CiudadProyecto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Lbl_CiudadProyecto.setText("Ciudad");

        Btn_EliminarContrato.setBackground(new java.awt.Color(0, 0, 0));
        Btn_EliminarContrato.setForeground(new java.awt.Color(255, 255, 255));
        Btn_EliminarContrato.setText("Eliminar");
        Btn_EliminarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarContratoActionPerformed(evt);
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

        Btn_IngresarProyecto.setBackground(new java.awt.Color(0, 0, 0));
        Btn_IngresarProyecto.setForeground(new java.awt.Color(255, 255, 255));
        Btn_IngresarProyecto.setText("Ingresar");
        Btn_IngresarProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Btn_IngresarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IngresarProyectoActionPerformed(evt);
            }
        });

        Btn_SalirContrato.setBackground(new java.awt.Color(0, 0, 0));
        Btn_SalirContrato.setForeground(new java.awt.Color(255, 255, 255));
        Btn_SalirContrato.setText("Salir");
        Btn_SalirContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirContratoActionPerformed(evt);
            }
        });

        Btn_ActualizarProyecto.setBackground(new java.awt.Color(0, 0, 0));
        Btn_ActualizarProyecto.setForeground(new java.awt.Color(255, 255, 255));
        Btn_ActualizarProyecto.setText("Actualizar");
        Btn_ActualizarProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Btn_ActualizarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActualizarProyectoActionPerformed(evt);
            }
        });

        Tabla_Proyectos.setBackground(new java.awt.Color(255, 255, 255));
        Tabla_Proyectos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tabla_Proyectos.setForeground(new java.awt.Color(0, 0, 0));
        Tabla_Proyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Proyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_ProyectosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Proyectos);

        Cmb_EstadoProyecto.setBackground(new java.awt.Color(255, 255, 255));
        Cmb_EstadoProyecto.setForeground(new java.awt.Color(0, 0, 0));
        Cmb_EstadoProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Activo", "Inactivo" }));
        Cmb_EstadoProyecto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_EstadoProyecto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Lbl_EstadoProyecto.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Lbl_CiudadProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_EstadoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Cmb_EstadoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Txt_CiudadProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Lbl_IdProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Lbl_NombreProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(47, 47, 47)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Txt_IdProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Txt_NombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lbl_DireccionProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(Txt_DireccionProyecto)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_ActualizarProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_IngresarProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_EliminarContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_SalirContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_LimpiarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Lbl_IdProyecto)
                        .addComponent(Txt_IdProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Btn_IngresarProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_NombreProyecto)
                            .addComponent(Txt_NombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_DireccionProyecto)
                            .addComponent(Txt_DireccionProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_CiudadProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lbl_CiudadProyecto)
                            .addComponent(Btn_LimpiarContrato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cmb_EstadoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lbl_EstadoProyecto)
                            .addComponent(Btn_SalirContrato)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_ActualizarProyecto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_EliminarContrato)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_IdProyectoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_IdProyectoKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_Txt_IdProyectoKeyTyped

    private void Txt_IdProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IdProyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_IdProyectoActionPerformed

    private void Btn_EliminarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarContratoActionPerformed
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
    }//GEN-LAST:event_Btn_EliminarContratoActionPerformed

    private void Btn_LimpiarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarContratoActionPerformed

        Limpiar();
        generar_codigo();
       
    }//GEN-LAST:event_Btn_LimpiarContratoActionPerformed

    private void Btn_IngresarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IngresarProyectoActionPerformed

        int estado_cmb, validacion =0;
        String proyecto, estado_string = "";  
        
        proyecto = Txt_NombreProyecto.getText().trim();
        estado_cmb = Cmb_EstadoProyecto.getSelectedIndex() + 1;
        
        if(proyecto.equals("")){
        
            Txt_NombreProyecto.setBackground(Color.RED);
            validacion++;
        }
        
        if(estado_cmb == 1){
           estado_string = "Selecionar";
        } else if(estado_cmb == 2){
           estado_string = "Activo";
        }else if(estado_cmb == 3){
           estado_string = "Inactivo";     
        }
        
          
        if (validacion == 0){
        
             try {

            ps = cn.prepareStatement("INSERT INTO proyectos ( Id_Proyecto, Proyecto, Direccion, Ciudad, Estado) VALUES(?,?,?,?,?) ");
            ps.setString(1, Txt_IdProyecto.getText());
            ps.setString(2, Txt_NombreProyecto.getText());
            ps.setString(3, Txt_DireccionProyecto.getText());
            ps.setString(4, Txt_CiudadProyecto.getText());
            ps.setString(5, estado_string);

            int res = ps.executeUpdate();

            mostrarproyectos();
            generar_codigo();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Datos Guerdados");
            } else{
                JOptionPane.showMessageDialog(null, "No se guardaron los datos");
            }
            cn.close();
            
           Limpiar();
            

        } catch (SQLException e){
            System.err.println("Error en Registrar proyecto." + e);
            JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");
        }
        
        } else {
            JOptionPane.showMessageDialog(null, "Se debe llenar el nombre del proyecto");
        }
        
        

    }//GEN-LAST:event_Btn_IngresarProyectoActionPerformed

    private void Btn_SalirContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirContratoActionPerformed

        Limpiar();
        generar_codigo();
        dispose();

    }//GEN-LAST:event_Btn_SalirContratoActionPerformed

    private void Btn_ActualizarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActualizarProyectoActionPerformed
         
        String cmbestado = (String) Cmb_EstadoProyecto.getSelectedItem();
        
        if(cmbestado == "Seleccione"){
       
            JOptionPane.showMessageDialog(null, "Debe Seleccionar el estado del proyecto");
            
        }else{

                 ProyectosVO proy = new ProyectosVO();
        
        proy.setNombre_proyecto(Txt_NombreProyecto.getText());
        proy.setDireccion(Txt_DireccionProyecto.getText());
        proy.setCiudad(Txt_CiudadProyecto.getText());
        proy.setEstado((String) Cmb_EstadoProyecto.getSelectedItem());
        proy.setId_proyecto(Integer.parseInt(Txt_IdProyecto.getText()));
        
        
        
        String resp = ProyectosDAO.actualizarProyecto(proy);

         JOptionPane.showMessageDialog(null,resp);
          
          Limpiar();       
          mostrarproyectos();
          Btn_IngresarProyecto.setEnabled(true);
          Btn_ActualizarProyecto.setEnabled(false);
              
    }

    }//GEN-LAST:event_Btn_ActualizarProyectoActionPerformed

    private void Tabla_ProyectosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_ProyectosMouseClicked
        int fila= Tabla_Proyectos.getSelectedRow();
        if(fila>=0){
            Txt_IdProyecto.setText(Tabla_Proyectos.getValueAt(fila, 0).toString());
//            Txt_NombreProyecto.setText(Tabla_Proyectos.getValueAt(fila, 1).toString());
//            Txt_DireccionProyecto.setText(Tabla_Proyectos.getValueAt(fila, 2).toString());
//            Txt_CiudadProyecto.setText(Tabla_Proyectos.getValueAt(fila, 3).toString());
//            Cmb_EstadoProyecto.setSelectedItem(Tabla_Proyectos.getValueAt(fila, 4).toString());

               Btn_IngresarProyecto.setEnabled(false);
               Btn_ActualizarProyecto.setEnabled(true);

               tablaproyectolineaseleccionada(); 
        }
        else{
            JOptionPane.showMessageDialog(null,"no seleciono fila");
        }
    }//GEN-LAST:event_Tabla_ProyectosMouseClicked

    private void tablaproyectolineaseleccionada(){
        
         ProyectosVO proy = ProyectosDAO.buscarProyecto(Txt_IdProyecto.getText());
        Txt_IdProyecto.setText(proy.getId_proyecto()+"");
        Txt_NombreProyecto.setText(proy.getNombre_proyecto());
        Txt_DireccionProyecto.setText(proy.getDireccion());
        Txt_CiudadProyecto.setText(proy.getCiudad());
        Cmb_EstadoProyecto.setSelectedItem(proy.getEstado());
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_ActualizarProyecto;
    private javax.swing.JButton Btn_EliminarContrato;
    private javax.swing.JButton Btn_IngresarProyecto;
    private javax.swing.JButton Btn_LimpiarContrato;
    private javax.swing.JButton Btn_SalirContrato;
    private javax.swing.JComboBox<String> Cmb_EstadoProyecto;
    private javax.swing.JLabel Lbl_CiudadProyecto;
    private javax.swing.JLabel Lbl_DireccionProyecto;
    private javax.swing.JLabel Lbl_EstadoProyecto;
    private javax.swing.JLabel Lbl_IdProyecto;
    private javax.swing.JLabel Lbl_NombreProyecto;
    private javax.swing.JTable Tabla_Proyectos;
    private javax.swing.JTextField Txt_CiudadProyecto;
    private javax.swing.JTextField Txt_DireccionProyecto;
    private javax.swing.JTextField Txt_IdProyecto;
    private javax.swing.JTextField Txt_NombreProyecto;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
     
 private void generar_codigo(){
 
     try {
         con.sentencia = con.Conectar().createStatement();
         con.rs = con.sentencia.executeQuery("select ifnull(max(Id_Proyecto),0)+1 as newcod from proyectos");
         con.rs.next();
         Txt_IdProyecto.setText(con.rs.getString("newcod"));
     } catch (Exception e){
     } finally{
         con.desconectar();
     }  
 
 }
 

    public void Limpiar(){
        Txt_NombreProyecto.setText("");
        Txt_NombreProyecto.setText("");
        Txt_DireccionProyecto.setText("");
        Txt_CiudadProyecto.setText("");
        Cmb_EstadoProyecto.setSelectedIndex(0); 
        
        Btn_ActualizarProyecto.setEnabled(false);
        Btn_IngresarProyecto.setEnabled(true);
    }
 
}
