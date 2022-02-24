/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classDAO;

import Conexion.Conectar;
import classVO.ResponsabilidadesVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SISTEMAS
 */
public class ResponsabilidadesDAO {
    
    public static String registrarResponsabilidad(ResponsabilidadesVO responsabilidadesVO) {
        String result = null, last = null;
        Conectar con = new Conectar();
        Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "INSERT INTO responsabilidades VALUES(?,?,?,?,?)";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, responsabilidadesVO.getId_responsabilidad());
                pst.setString(2, responsabilidadesVO.getNombre_responsabilidad());
                pst.setInt(3, responsabilidadesVO.getId_cargo());
                
                pst.executeUpdate();
                pst = cn.prepareStatement("SELECT MAX(Id_Responsabilidad) AS id FROM responsabilidades");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    last = rs.getString(1);
                }
                result = "Responsabilidad registrada con exito, ID: " + last;
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

    public static String actualizarResponsabilidad(ResponsabilidadesVO resp) {
        String result = null; 
        Conectar con = new Conectar();
        Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "UPDATE responsabilidades SET Responsabilidad='"+resp.getNombre_responsabilidad()+"', Id_Cargo='"+resp.getId_cargo()+""
                     + " WHERE Id_Responsabilidad='"+resp.getId_responsabilidad()+"'";
        try {
             pst = cn.prepareStatement(sql);
//                pst.setString(1, carg.getNombre_cargo());
//                pst.setInt(2, carg.getId_proyecto());
//                pst.setString(3, carg.getProposito());
//                pst.setString(4, carg.getDependencia());
//                pst.setInt(5, carg.getId_cargo());
                pst.executeUpdate();
                result = "Cargo Actualizado con exito, ID: " + resp.getId_responsabilidad();
            
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

    public static ResponsabilidadesVO buscarResponsabilidad(String clave) {
        ResponsabilidadesVO responsabilidadesVO = new ResponsabilidadesVO();
        Conectar con = new Conectar();
        //INVOCAMOS AL METODO CONEXION
         Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "SELECT Id_Responsabilidad, Responsabilidad, Cargo, Proyecto FROM responsabilidades "
                + "INNER JOIN cargos USING(Id_Cargo) "
                + "INNER JOIN proyectos USING(Id_Proyecto) "
                + "WHERE Id_Responsabilidad = ?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1,clave);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    responsabilidadesVO.setId_responsabilidad(Integer.parseInt(rs.getString(1)));
                    responsabilidadesVO.setNombre_responsabilidad(rs.getString(2));
//                    responsabilidadesVO.setId_cargo(Integer.parseInt(rs.getString(3)));
                    responsabilidadesVO.setNombre_cargo(rs.getString(3));  
//                    responsabilidadesVO.setId_proyecto(Integer.parseInt(rs.getString(5)));
                    responsabilidadesVO.setNombre_proyecto(rs.getString(4));
                                                          
                }
//                cargoVO.setResultado("Busqueda exitosa");
            }
        } catch (SQLException e) {
            responsabilidadesVO.setResultado("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                responsabilidadesVO.setResultado("Error " + e);
            }
        }
        return responsabilidadesVO;
    }
    
    public static String eliminarResponsabilidad(String clave) {
        String result = null;
         Conectar con = new Conectar();
        //INVOCAMOS AL METODO CONEXION
         Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "DELETE FROM funciones WHERE Id_Responsabilidad = ?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(clave));
                pst.executeUpdate();
                result = "Responsabiidad eliminada con exito";
            }
        } catch (SQLException e) {
            result = "Error en la consulta: " + e.getMessage();
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
    
    public static ArrayList<ResponsabilidadesVO> getListResponsabilidades(Integer valor){
        
        ArrayList<ResponsabilidadesVO> arrResponsabilidades = new ArrayList<ResponsabilidadesVO>();
        Conectar con = new Conectar();
        //INVOCAMOS AL METODO CONEXION
        Connection cn = con.Conectar();
        PreparedStatement pst = null;
        ResponsabilidadesVO responsabilidadesVO = null;
        
        String sql = "";
        
        if(valor.equals(0))
        {
        sql="SELECT Id_Responsabilidad, Id_Cargo, Cargo, Id_Proyecto, Proyecto FROM responsabilidades " 
                   + "INNER JOIN cargos USING(Id_Cargo) "
                   + "INNER JOIN proyectos USING(Id_Proyecto) ";
        }
        else{

        sql="SELECT Id_Responsabilidad, Id_Cargo, Cargo, Id_Proyecto, Proyecto FROM responsabilidades " 
                   + "INNER JOIN cargos USING(Id_Cargo) "
                   + "INNER JOIN proyectos USING(Id_Proyecto) "
                   + " WHERE Id_Cargo='"+valor+"'";      
        }
        
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while(rs.next()) {
                    responsabilidadesVO = new ResponsabilidadesVO();
                    responsabilidadesVO.setId_responsabilidad(Integer.parseInt(rs.getString(1)));
//                    responsabilidadesVO.setNombre_responsabilidad(rs.getString(2));
                    responsabilidadesVO.setId_cargo(Integer.parseInt(rs.getString(2)));
                    responsabilidadesVO.setNombre_cargo(rs.getString(3));
                    responsabilidadesVO.setId_proyecto(Integer.parseInt(rs.getString(4)));
                    responsabilidadesVO.setNombre_proyecto(rs.getString(5));
                                        
                    arrResponsabilidades.add(responsabilidadesVO);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println("Error " + e);
            }
        }
        return arrResponsabilidades;
    }
    
       
}
