
package Formularios;

import Conexion.Conectar;
import classDAO.CargoDAO;
import classDAO.ProyectosDAO;
import classVO.CargoVO;
import classVO.ProyectosVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmCargos extends javax.swing.JInternalFrame {
    
       PreparedStatement ps;
    
    Conectar con = new Conectar();
     
    Connection cn = con.Conectar();
    
    
    String estado = "";
    int estado_cmb = 0;
    Integer idproyecto = 0;
    
    public FrmCargos() {
        initComponents();
        
        cargarProyecto(0);
       
        
        this.setTitle("Cargos");

        bloquear();
        mostrarcargos();
        }

    private void mostrarcargos(){
         
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Id");
    modelo.addColumn("Cargo");
    modelo.addColumn("Proposito");
    modelo.addColumn("Dependencia");    
    
    Tabla_Cargo.setModel(modelo);
    
    Object[]arrCargos = new Object [4];
        
           for(CargoVO carg: CargoDAO.getListCargos(idproyecto)){
                 
                arrCargos[0] = carg.getId_cargo();
                arrCargos[1] = carg.getNombre_cargo();
                arrCargos[2] = carg.getProposito();
                arrCargos[3] = carg.getDependencia();
                
                modelo.addRow(arrCargos);
            }
            Tabla_Cargo.setModel(modelo);
       
    }
    
    void bloquear(){
       
    Txt_NombreCargo.setEnabled(false);
    Txta_PropositoCargo.setEnabled(false);
    Txt_DependenciaCargo.setEnabled(false);
    Btn_IngresarCargo.setEnabled(false);
    Btn_ActualizarCargo.setEnabled(false);
        
    } 
    
    void desbloquear(){
       
    Txt_NombreCargo.setEnabled(true);
    Txta_PropositoCargo.setEnabled(true);
    Txt_DependenciaCargo.setEnabled(true);
       
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Txt_IdCargo = new javax.swing.JTextField();
        Lbl_IdCargo = new javax.swing.JLabel();
        Lbl_NombreCargo = new javax.swing.JLabel();
        Txt_NombreCargo = new javax.swing.JTextField();
        Btn_EliminarCargo = new javax.swing.JButton();
        Btn_LimpiarCargo = new javax.swing.JButton();
        Btn_NuevoCargo = new javax.swing.JButton();
        Btn_SalirCargo = new javax.swing.JButton();
        Btn_ActualizarCargo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Cargo = new javax.swing.JTable();
        Lbl_ProyectoCargo = new javax.swing.JLabel();
        Cmb_ProyectoCargo = new javax.swing.JComboBox();
        Lbl_NombreCargo1 = new javax.swing.JLabel();
        Lbl_NombreCargo2 = new javax.swing.JLabel();
        Txt_DependenciaCargo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Txta_PropositoCargo = new javax.swing.JTextArea();
        Btn_IngresarCargo = new javax.swing.JButton();
        Btn_BuscarCargo = new javax.swing.JButton();
        Txt_NContrato = new javax.swing.JTextField();
        Lbl_NContrato = new javax.swing.JLabel();

        Txt_IdCargo.setEditable(false);
        Txt_IdCargo.setBackground(new java.awt.Color(255, 255, 255));
        Txt_IdCargo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Txt_IdCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IdCargoActionPerformed(evt);
            }
        });
        Txt_IdCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_IdCargoKeyTyped(evt);
            }
        });

        Lbl_IdCargo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_IdCargo.setText("Id Cargo");

        Lbl_NombreCargo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_NombreCargo.setText("Cargo");

        Txt_NombreCargo.setBackground(new java.awt.Color(255, 255, 255));
        Txt_NombreCargo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Btn_EliminarCargo.setBackground(new java.awt.Color(0, 0, 0));
        Btn_EliminarCargo.setForeground(new java.awt.Color(255, 255, 255));
        Btn_EliminarCargo.setText("Eliminar");
        Btn_EliminarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarCargoActionPerformed(evt);
            }
        });

        Btn_LimpiarCargo.setBackground(new java.awt.Color(0, 0, 0));
        Btn_LimpiarCargo.setForeground(new java.awt.Color(255, 255, 255));
        Btn_LimpiarCargo.setText("Limpiar");
        Btn_LimpiarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimpiarCargoActionPerformed(evt);
            }
        });

        Btn_NuevoCargo.setBackground(new java.awt.Color(0, 0, 0));
        Btn_NuevoCargo.setForeground(new java.awt.Color(255, 255, 255));
        Btn_NuevoCargo.setText("Nuevo");
        Btn_NuevoCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoCargoActionPerformed(evt);
            }
        });

        Btn_SalirCargo.setBackground(new java.awt.Color(0, 0, 0));
        Btn_SalirCargo.setForeground(new java.awt.Color(255, 255, 255));
        Btn_SalirCargo.setText("Salir");
        Btn_SalirCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirCargoActionPerformed(evt);
            }
        });

        Btn_ActualizarCargo.setBackground(new java.awt.Color(0, 0, 0));
        Btn_ActualizarCargo.setForeground(new java.awt.Color(255, 255, 255));
        Btn_ActualizarCargo.setText("Actualizar");
        Btn_ActualizarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActualizarCargoActionPerformed(evt);
            }
        });

        Tabla_Cargo.setBackground(new java.awt.Color(255, 255, 255));
        Tabla_Cargo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tabla_Cargo.setForeground(new java.awt.Color(0, 0, 0));
        Tabla_Cargo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Cargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_CargoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Cargo);

        Lbl_ProyectoCargo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_ProyectoCargo.setText("Proyecto");

        Cmb_ProyectoCargo.setBackground(new java.awt.Color(255, 255, 255));
        Cmb_ProyectoCargo.setForeground(new java.awt.Color(0, 0, 0));
        Cmb_ProyectoCargo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cmb_ProyectoCargo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Cmb_ProyectoCargoItemStateChanged(evt);
            }
        });
        Cmb_ProyectoCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cmb_ProyectoCargoMouseClicked(evt);
            }
        });
        Cmb_ProyectoCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_ProyectoCargoActionPerformed(evt);
            }
        });

        Lbl_NombreCargo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_NombreCargo1.setText("Proposito");

        Lbl_NombreCargo2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_NombreCargo2.setText("Dependencia");

        Txt_DependenciaCargo.setBackground(new java.awt.Color(255, 255, 255));
        Txt_DependenciaCargo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Txta_PropositoCargo.setColumns(20);
        Txta_PropositoCargo.setLineWrap(true);
        Txta_PropositoCargo.setRows(5);
        Txta_PropositoCargo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(Txta_PropositoCargo);

        Btn_IngresarCargo.setBackground(new java.awt.Color(0, 0, 0));
        Btn_IngresarCargo.setForeground(new java.awt.Color(255, 255, 255));
        Btn_IngresarCargo.setText("Ingresar");
        Btn_IngresarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IngresarCargoActionPerformed(evt);
            }
        });

        Btn_BuscarCargo.setBackground(new java.awt.Color(0, 0, 0));
        Btn_BuscarCargo.setForeground(new java.awt.Color(255, 255, 255));
        Btn_BuscarCargo.setText("Buscar");
        Btn_BuscarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarCargoActionPerformed(evt);
            }
        });

        Txt_NContrato.setEditable(false);
        Txt_NContrato.setBackground(new java.awt.Color(255, 255, 255));
        Txt_NContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Txt_NContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NContratoActionPerformed(evt);
            }
        });
        Txt_NContrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NContratoKeyTyped(evt);
            }
        });

        Lbl_NContrato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_NContrato.setText("N° Contrato");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_NombreCargo2)
                            .addComponent(Lbl_NombreCargo1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_DependenciaCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lbl_IdCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(Lbl_NombreCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_IdCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_NContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_NContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cmb_ProyectoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_NombreCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbl_ProyectoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_LimpiarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_IngresarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_EliminarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_SalirCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_BuscarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_ActualizarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_NuevoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_BuscarCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_ActualizarCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_NuevoCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_IngresarCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_LimpiarCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_EliminarCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_SalirCargo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_IdCargo)
                            .addComponent(Lbl_NombreCargo))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_IdCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_NombreCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lbl_ProyectoCargo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Cmb_ProyectoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_NContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lbl_NContrato)
                                .addGap(34, 34, 34)))
                        .addComponent(Lbl_NombreCargo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Lbl_NombreCargo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_DependenciaCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_IdCargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_IdCargoKeyTyped
        
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_Txt_IdCargoKeyTyped

    private void Txt_IdCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IdCargoActionPerformed
    }//GEN-LAST:event_Txt_IdCargoActionPerformed

    private void Btn_EliminarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarCargoActionPerformed
    }//GEN-LAST:event_Btn_EliminarCargoActionPerformed

    private void Btn_LimpiarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarCargoActionPerformed

        Limpiar();
      
    }//GEN-LAST:event_Btn_LimpiarCargoActionPerformed

    private void Btn_NuevoCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoCargoActionPerformed
    
    Txt_NombreCargo.setEnabled(true);
    Txta_PropositoCargo.setEnabled(true);
    Txt_DependenciaCargo.setEnabled(true);
    Btn_IngresarCargo.setEnabled(true);
    Btn_BuscarCargo.setEnabled(false);
    Btn_NuevoCargo.setEnabled(false);
     
    generar_codigo();
       
    }//GEN-LAST:event_Btn_NuevoCargoActionPerformed

    private void Btn_SalirCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirCargoActionPerformed

        Limpiar();
        dispose();

    }//GEN-LAST:event_Btn_SalirCargoActionPerformed

    private void Btn_ActualizarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActualizarCargoActionPerformed
               
        ProyectosVO c = (ProyectosVO) Cmb_ProyectoCargo.getSelectedItem();
        CargoVO carg = new CargoVO();
        Integer p_carg = c.getId_proyecto();
       
        carg.setNombre_cargo(Txt_NombreCargo.getText());
        carg.setId_proyecto(p_carg);
        carg.setProposito(Txta_PropositoCargo.getText());
        carg.setDependencia(Txt_DependenciaCargo.getText());
        carg.setId_cargo(Integer.parseInt(Txt_IdCargo.getText()));
        
        String resp = CargoDAO.actualizarCargo(carg);

         JOptionPane.showMessageDialog(null,resp);
          
          Limpiar();       
          mostrarcargos();
    }//GEN-LAST:event_Btn_ActualizarCargoActionPerformed

    private void Tabla_CargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_CargoMouseClicked

        int fila= Tabla_Cargo.getSelectedRow();
        if(fila>=0){
            Txt_IdCargo.setText(Tabla_Cargo.getValueAt(fila, 0).toString());
             
               desbloquear();
               Btn_IngresarCargo.setEnabled(false);
               Btn_ActualizarCargo.setEnabled(true);
               Btn_NuevoCargo.setEnabled(false);
     
              tablacargolineaseleccionada();
        }
        else{
            JOptionPane.showMessageDialog(null,"No seleciono fila");
        }
    }//GEN-LAST:event_Tabla_CargoMouseClicked

    private void Cmb_ProyectoCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_ProyectoCargoActionPerformed
         
    }//GEN-LAST:event_Cmb_ProyectoCargoActionPerformed

    private void Btn_IngresarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IngresarCargoActionPerformed
        
        ProyectosVO c = (ProyectosVO) Cmb_ProyectoCargo.getSelectedItem();
        CargoVO carg = new CargoVO();
        Integer p_carg = c.getId_proyecto();
        
        carg.setId_cargo(Integer.parseInt(Txt_IdCargo.getText()));
        carg.setNombre_cargo(Txt_NombreCargo.getText());
        carg.setId_proyecto(p_carg);
        carg.setProposito(Txta_PropositoCargo.getText());
        carg.setDependencia(Txt_DependenciaCargo.getText());
        
        String resp = CargoDAO.registrarCargo(carg);
        
        JOptionPane.showMessageDialog(null,resp);
        mostrarcargos();
       
    }//GEN-LAST:event_Btn_IngresarCargoActionPerformed

    private void Btn_BuscarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarCargoActionPerformed
       
         ProyectosVO p = (ProyectosVO) Cmb_ProyectoCargo.getSelectedItem();
         Integer p_cont = p.getId_proyecto();
         idproyecto = p_cont;
        
        mostrarcargos();
             
    }//GEN-LAST:event_Btn_BuscarCargoActionPerformed

    
    private void Cmb_ProyectoCargoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cmb_ProyectoCargoItemStateChanged
        
//        ProyectosVO p = (ProyectosVO) Cmb_ProyectoCargo.getSelectedItem();
//         Integer p_cont = p.getId_proyecto();
//         idproyecto = p_cont;
//        
//        mostrarcargos();
       
    }//GEN-LAST:event_Cmb_ProyectoCargoItemStateChanged

    private void Txt_NContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NContratoActionPerformed

    private void Txt_NContratoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NContratoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NContratoKeyTyped

    private void Cmb_ProyectoCargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cmb_ProyectoCargoMouseClicked
        
         ProyectosVO p = (ProyectosVO) Cmb_ProyectoCargo.getSelectedItem();
         Integer p_cont = p.getId_proyecto();
         idproyecto = p_cont;
        
        mostrarcargos();
    }//GEN-LAST:event_Cmb_ProyectoCargoMouseClicked

    
    public void cargarProyecto(int busca){
        int index = 1;
        Cmb_ProyectoCargo.removeAllItems();
        Cmb_ProyectoCargo.addItem("Seleccione el proyecto");
        for(ProyectosVO proy: ProyectosDAO.getListProyectos()){
            
            Cmb_ProyectoCargo.addItem(proy);
            if(proy.getId_proyecto() == busca){
                Cmb_ProyectoCargo.setSelectedIndex(index);
            }
            index++;
        }
    }
    
    
   private void tablacargolineaseleccionada(){
        
        CargoVO carg = CargoDAO.buscarCargo(Txt_IdCargo.getText());
        Txt_IdCargo.setText(carg.getId_cargo()+"");
        Txt_NombreCargo.setText(carg.getNombre_cargo());
        cargarProyecto(carg.getId_proyecto());
        Txta_PropositoCargo.setText(carg.getProposito());
        Txt_DependenciaCargo.setText(carg.getDependencia());
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_ActualizarCargo;
    private javax.swing.JButton Btn_BuscarCargo;
    private javax.swing.JButton Btn_EliminarCargo;
    private javax.swing.JButton Btn_IngresarCargo;
    private javax.swing.JButton Btn_LimpiarCargo;
    private javax.swing.JButton Btn_NuevoCargo;
    private javax.swing.JButton Btn_SalirCargo;
    private javax.swing.JComboBox Cmb_ProyectoCargo;
    private javax.swing.JLabel Lbl_IdCargo;
    private javax.swing.JLabel Lbl_NContrato;
    private javax.swing.JLabel Lbl_NombreCargo;
    private javax.swing.JLabel Lbl_NombreCargo1;
    private javax.swing.JLabel Lbl_NombreCargo2;
    private javax.swing.JLabel Lbl_ProyectoCargo;
    private javax.swing.JTable Tabla_Cargo;
    private javax.swing.JTextField Txt_DependenciaCargo;
    private javax.swing.JTextField Txt_IdCargo;
    private javax.swing.JTextField Txt_NContrato;
    private javax.swing.JTextField Txt_NombreCargo;
    private javax.swing.JTextArea Txta_PropositoCargo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
     


 private void generar_codigo(){
 
     try {
         con.sentencia = con.Conectar().createStatement();
         con.rs = con.sentencia.executeQuery("select ifnull(max(Id_Cargo),0)+1 as newcod from cargos");
         con.rs.next();
         Txt_IdCargo.setText(con.rs.getString("newcod"));
     } catch (Exception e){
     } finally{
         con.desconectar();
     }  
 
 }
 

    public void Limpiar(){
        Txt_IdCargo.setText("");
        Txt_NombreCargo.setText("");
        Txta_PropositoCargo.setText("");
        Txt_DependenciaCargo.setText("");
        Btn_BuscarCargo.setEnabled(true);
        Btn_NuevoCargo.setEnabled(true);

        bloquear();
        cargarProyecto(0);
           
    }
 
}

