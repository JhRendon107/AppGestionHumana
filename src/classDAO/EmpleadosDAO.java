/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classDAO;

import Conexion.Conectar;
import classVO.EmpleadosVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SISTEMAS
 */
public class EmpleadosDAO {
    
    public static String IngresarEmpleado(EmpleadosVO empleadosVO) {
        String result = null, last = null;
        Conectar con = new Conectar();
        Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "INSERT INTO empleados VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, empleadosVO.getId_empleado());
                pst.setString(2, empleadosVO.getCedula());
                pst.setString(3, empleadosVO.getFlugar_expedicion());
                pst.setString(4, empleadosVO.getNombre());
                pst.setString(5, empleadosVO.getApellidos());
                pst.setString(6, empleadosVO.getFlugar_nacimiento());
                pst.setString(7, empleadosVO.getSexo());
                pst.setString(8, empleadosVO.getEstado_civil());
                pst.setString(9, empleadosVO.getRh_sanguineo());
                pst.setString(10, empleadosVO.getDireccion());
                pst.setString(11, empleadosVO.getTelefono());
                pst.setString(12, empleadosVO.getTelfamiliar());
                pst.setString(13, empleadosVO.getEmail());
                pst.setString(14, empleadosVO.getFormacion_academica());
                pst.setString(15, empleadosVO.getOtros_certificados());
                pst.setString(16, empleadosVO.getTarjeta_pro());
                pst.setString(17, empleadosVO.getFcertificado_altura());
                pst.setString(18, empleadosVO.getExperiencia());
                pst.setString(19, empleadosVO.getEps());
                pst.setString(20, empleadosVO.getPension());
                               
                pst.executeUpdate();
                pst = cn.prepareStatement("SELECT MAX(Id_Empleado) AS id FROM empleados");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    last = rs.getString(1);
                }
                result = "Empleado registrado con exito, ID: " + last;
            }
        } catch (SQLException e) {
            result = "Error durante el registro: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                result = "Error " + e;
            }
        }
        return result;
    }
    
    public int validacionEmpleado(String empleado){
    
        
        Conectar con = new Conectar();
        Connection cn = con.Conectar();
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        String sql = "SELECT count(id) FROM empleados WHERE Cedula = ?";
        
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, empleado);
            rs = pst.executeQuery();
            
            if (rs.next()) {
                
                return rs.getInt(1);
                     
            }
            
            return 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadosDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        } 
        
    }
    

    public static String actualizarEmpleado(EmpleadosVO empl) {
        String result = null; 
        Conectar con = new Conectar();
        Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "UPDATE empleados SET Cedula=?, F_Lugar_Expedi=?, Nombre=?, Apellidos=?, F_Lugar_Naci=?, Sexo=?, Estado_Civil=?, Rh_Sanguineo=?, Direccion=?, Tel_Celular=?, Tel_Familiar=?"
                + ", Email=?, Titulo_Academico=?, Otros_Titulos=?, Tarjeta_Pro=?, F_Certi_Alturas=?, Experiencia_Emp=?, Eps=?, Pension=?"
                + " WHERE Id_Empleado=? ";
        try {
             pst = cn.prepareStatement(sql);
                
                pst.setString(1, empl.getCedula());
                pst.setString(2, empl.getFlugar_expedicion());
                pst.setString(3, empl.getNombre());
                pst.setString(4, empl.getApellidos());
                pst.setString(5, empl.getFlugar_nacimiento());
                pst.setString(6, empl.getSexo());
                pst.setString(7, empl.getEstado_civil());
                pst.setString(8, empl.getRh_sanguineo());
                pst.setString(9, empl.getDireccion());
                pst.setString(10, empl.getTelefono());
                pst.setString(11, empl.getTelfamiliar());
                pst.setString(12, empl.getEmail());
                pst.setString(13, empl.getFormacion_academica());
                pst.setString(14, empl.getOtros_certificados());
                pst.setString(15, empl.getTarjeta_pro());
                pst.setString(16, empl.getFcertificado_altura());
                pst.setString(17, empl.getExperiencia());
                pst.setString(18, empl.getEps());
                pst.setString(19, empl.getPension());
                pst.setInt(20, empl.getId_empleado());
                pst.executeUpdate();
                result = "Empleado Actualizado con exito, ID: " + empl.getNombre();
            
        } catch (SQLException e) {
            result = "Error durante el registro: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                result = "Error " + e;
            }
        }
        return result;
    }

    public static EmpleadosVO buscarEmpleado(String clave) {
       
        EmpleadosVO empl = new EmpleadosVO();
        Conectar con = new Conectar();
        //INVOCAMOS AL METODO CONEXION
         Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "SELECT * FROM empleados WHERE Cedula = ?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1,clave);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    empl.setId_empleado(Integer.parseInt(rs.getString(1)));
                    empl.setCedula(rs.getString(2));
                    empl.setFlugar_expedicion(rs.getString(3));
                    empl.setNombre(rs.getString(4));
                    empl.setApellidos(rs.getString(5));
                    empl.setFlugar_nacimiento(rs.getString(6));
                    empl.setSexo(rs.getString(7));
                    empl.setEstado_civil(rs.getString(8));
                    empl.setRh_sanguineo(rs.getString(9));
                    empl.setDireccion(rs.getString(10));
                    empl.setTelefono(rs.getString(11));
                    empl.setTelfamiliar(rs.getString(12));
                    empl.setEmail(rs.getString(13));
                    empl.setFormacion_academica(rs.getString(14));
                    empl.setOtros_certificados(rs.getString(15));
                    empl.setTarjeta_pro(rs.getString(16));
                    empl.setFcertificado_altura(rs.getString(17));
                    empl.setExperiencia(rs.getString(18));
                    empl.setEps(rs.getString(19));
                    empl.setPension(rs.getString(20));
                                                          
                }
            }
        } catch (SQLException e) {
            empl.setResultado("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                empl.setResultado("Error " + e);
            }
        }
        return empl;
    }
    
      
}
