package classDAO;

import Conexion.Conectar;
import classVO.CargoVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CargoDAO {
    
    public static String registrarCargo(CargoVO cargoVO) {
                   
        String result = null, last = null;
        Conectar con = new Conectar();
        Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "INSERT INTO cargos VALUES(?,?,?,?,?)";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, cargoVO.getId_cargo());
                pst.setString(2, cargoVO.getNombre_cargo());
                pst.setInt(3, cargoVO.getId_proyecto());
                pst.setString(4, cargoVO.getProposito());
                pst.setString(5, cargoVO.getDependencia());
                pst.executeUpdate();
                pst = cn.prepareStatement("SELECT MAX(Id_Cargo) AS id FROM cargos");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    last = rs.getString(1);
                }
                result = "Cargo registrado con exito, ID: " + last;
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

    public static String actualizarCargo(CargoVO carg) {
        String result = null; 
        Conectar con = new Conectar();
        Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "UPDATE cargos SET Cargo=?, Id_Proyecto=?"
                + ", Proposito=?, Dependencia=?"
                + " WHERE Id_Cargo=? ";
        try {
             pst = cn.prepareStatement(sql);
                pst.setString(1, carg.getNombre_cargo());
                pst.setInt(2, carg.getId_proyecto());
                pst.setString(3, carg.getProposito());
                pst.setString(4, carg.getDependencia());
                pst.setInt(5, carg.getId_cargo());
                pst.executeUpdate();
                result = "Cargo Actualizado con exito, ID: " + carg.getId_cargo();
            
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

    public static CargoVO buscarCargo(String clave) {
        CargoVO cargoVO = new CargoVO();
        Conectar con = new Conectar();
        //INVOCAMOS AL METODO CONEXION
         Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "SELECT * FROM cargos WHERE Id_Cargo = ?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1,clave);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    cargoVO.setId_cargo(Integer.parseInt(rs.getString(1)));
                    cargoVO.setNombre_cargo(rs.getString(2));
                    cargoVO.setId_proyecto(Integer.parseInt(rs.getString(3)));
                    cargoVO.setProposito(rs.getString(4));
                    cargoVO.setDependencia(rs.getString(5));
                                      
                }
//                cargoVO.setResultado("Busqueda exitosa");
            }
        } catch (SQLException e) {
            cargoVO.setResultado("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                cargoVO.setResultado("Error " + e);
            }
        }
        return cargoVO;
    }
    
    public static String eliminarCargo(String clave) {
        String result = null;
         Conectar con = new Conectar();
        //INVOCAMOS AL METODO CONEXION
         Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "DELETE FROM cargos WHERE Id_Cargo = ?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(clave));
                pst.executeUpdate();
                result = "Disco eliminado con exito";
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
    
    public static ArrayList<CargoVO> getListCargos(Integer idproyecto){
       
        ArrayList<CargoVO> arrCargos = new ArrayList<CargoVO>();
        Conectar con = new Conectar();
     //INVOCAMOS AL METODO CONEXION
        Connection cn = con.Conectar();
        PreparedStatement pst = null;
        CargoVO cargoVO = null;
        
        String sql = "";
        
            if(idproyecto.equals(0))
            {
                sql="SELECT Id_Cargo, Cargo, Proyecto, Proposito, Dependencia FROM cargos "
                + "INNER JOIN proyectos USING(Id_Proyecto)"
                + "WHERE Id_Cargo!=0  ORDER BY Id_Cargo";
            }
            else{

                sql="SELECT Id_Cargo, Cargo, Proyecto, Proposito, Dependencia FROM cargos "
                + "INNER JOIN proyectos USING(Id_Proyecto)"
                + " WHERE Id_Proyecto='"+idproyecto+"'";  
            }
                        
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while(rs.next()) {
                    cargoVO = new CargoVO();
                    cargoVO.setId_cargo(Integer.parseInt(rs.getString(1)));
                    cargoVO.setNombre_cargo(rs.getString(2));
//                  cargoVO.setId_proyecto(Integer.parseInt(rs.getString(3)));
                    cargoVO.setNombre_proyecto(rs.getString(3));
                    cargoVO.setProposito(rs.getString(4));
                    cargoVO.setDependencia(rs.getString(5));
                    
                    arrCargos.add(cargoVO);
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
        return arrCargos;
    }
    
}
