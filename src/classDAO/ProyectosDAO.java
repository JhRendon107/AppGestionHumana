/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classDAO;

import Conexion.Conectar;
import classVO.ProyectosVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SISTEMAS
 */
public class ProyectosDAO {
    
    public static String registrarProyecto(ProyectosVO proyectosVO) {
        String result = null, last = null;
        Conectar con = new Conectar();
        Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "INSERT INTO proyectos VALUES(?,?,?,?,?)";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, proyectosVO.getId_proyecto());
                pst.setString(2, proyectosVO.getNombre_proyecto());
                pst.setString(3, proyectosVO.getDireccion());
                pst.setString(4, proyectosVO.getCiudad());
                pst.setString(5, proyectosVO.getEstado());
                pst.executeUpdate();
                pst = cn.prepareStatement("SELECT MAX(Id_Proyecto) AS id FROM proyectos");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    last = rs.getString(1);
                }
                result = "Contrato registrado con exito, ID: " + last;
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

    public static String actualizarProyecto(ProyectosVO proyectosVO) {
        
        String result = null;
        Conectar con = new Conectar();
        Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "UPDATE proyectos SET Proyecto=?,Direccion=?,Ciudad=?,Estado=? WHERE Id_Proyecto=?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1, proyectosVO.getNombre_proyecto());
                pst.setString(2, proyectosVO.getDireccion());
                pst.setString(3, proyectosVO.getCiudad());
                pst.setString(4, proyectosVO.getEstado());
                pst.setInt(5, proyectosVO.getId_proyecto());
                pst.executeUpdate();
                result = "Proyecto Actualizado con exito, ID: " + proyectosVO.getId_proyecto();
                
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

    public static ProyectosVO buscarProyecto(String clave) {
        ProyectosVO proyectosVO = new ProyectosVO();
        Conectar con = new Conectar();
        //INVOCAMOS AL METODO CONEXION
         Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "SELECT * FROM proyectos WHERE Id_Proyecto = ?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1,clave);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    proyectosVO.setId_proyecto(Integer.parseInt(rs.getString(1)));
                    proyectosVO.setNombre_proyecto(rs.getString(2));
                    proyectosVO.setDireccion(rs.getString(3));
                    proyectosVO.setCiudad(rs.getString(4));
                    proyectosVO.setEstado(rs.getString(5));
                                      
                }
//                cargoVO.setResultado("Busqueda exitosa");
            }
        } catch (SQLException e) {
            proyectosVO.setResultado("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                proyectosVO.setResultado("Error " + e);
            }
        }
        return proyectosVO;
    }
    
    public static String eliminarProyecto(String clave) {
        String result = null;
         Conectar con = new Conectar();
        //INVOCAMOS AL METODO CONEXION
         Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "DELETE FROM proyectos WHERE Id_Proyecto = ?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(clave));
                pst.executeUpdate();
                result = "Proyecto eliminado con exito";
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
    
    public static ArrayList<ProyectosVO> getListProyectos(){
        
        ArrayList<ProyectosVO> arrProyecto = new ArrayList<ProyectosVO>();
        Conectar con = new Conectar();
        //INVOCAMOS AL METODO CONEXION
        Connection cn = con.Conectar();
        PreparedStatement pst = null;
        ProyectosVO proyectosVO = null;
        String sql = "SELECT * FROM proyectos";
        
        try {
            pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                proyectosVO= new ProyectosVO();
                proyectosVO.setId_proyecto(Integer.parseInt(rs.getString(1)));
                proyectosVO.setNombre_proyecto(rs.getString(2));
                proyectosVO.setDireccion(rs.getString(3));
                proyectosVO.setCiudad(rs.getString(4));
                proyectosVO.setEstado(rs.getString(5));
                
                arrProyecto.add(proyectosVO);
                
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
                System.out.println("Error: " + e);
            }
        }
        return arrProyecto;
        
    }
    
}
