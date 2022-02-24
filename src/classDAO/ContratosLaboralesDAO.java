
package classDAO;

import Conexion.Conectar;
import classVO.ContratosLaboralesVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SISTEMAS
 */
public class ContratosLaboralesDAO {
    
    public static String ingresarContratolaboral(ContratosLaboralesVO contratoslaboralesVO) {
        String result = null, last = null;
        Conectar con = new Conectar();
        Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "INSERT INTO contratos_laborales VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, contratoslaboralesVO.getId_contrato());
                pst.setInt(2, contratoslaboralesVO.getId_empleado());
                pst.setString(3, contratoslaboralesVO.getFecha_cont());
                pst.setString(4, contratoslaboralesVO.getPer_pru());
                pst.setString(5, contratoslaboralesVO.getFecha_ter());
                pst.setString(6, contratoslaboralesVO.getFecha_ret());
                pst.setString(7, contratoslaboralesVO.getTipo_contrato());
                pst.setInt(8, contratoslaboralesVO.getId_cargo());
                pst.setFloat(9, contratoslaboralesVO.getSalario());
                pst.setInt(10, contratoslaboralesVO.getId_proyecto());
                pst.setString(11, contratoslaboralesVO.getPreaviso());
                pst.setString(12, contratoslaboralesVO.getPreabierto());
                pst.setString(13, contratoslaboralesVO.getMot_ret());
                pst.setString(14, contratoslaboralesVO.getObservacion());
               
                                
                pst.executeUpdate();
                pst = cn.prepareStatement("SELECT MAX(Id_Contrato) AS id FROM contratos_laborales");
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

    public static String actualizarContratolaboral(ContratosLaboralesVO contratoslaborolesVO) {
        
        String result = null; 
        Conectar con = new Conectar();
        Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "UPDATE contratos_laborales SET Fecha_Cont=?, Per_Pru=?, Fecha_Ter=?, Fecha_Ret=?, Tipo_Contrato=?,"
                + " Id_Cargo=?, Salario=?, Id_Proyecto=?, Preaviso=?, PreAbierto=?, Mot_Ret=?, Observacion=?"
                + " WHERE Id_Contrato=? ";
        try {
             pst = cn.prepareStatement(sql);

                pst.setString(1, contratoslaborolesVO.getFecha_cont());
                pst.setString(2, contratoslaborolesVO.getPer_pru());
                pst.setString(3, contratoslaborolesVO.getFecha_ter());
                pst.setString(4, contratoslaborolesVO.getFecha_ret());
                pst.setString(5, contratoslaborolesVO.getTipo_contrato());
                pst.setInt(6, contratoslaborolesVO.getId_cargo());
                pst.setFloat(7, contratoslaborolesVO.getSalario());
                pst.setInt(8, contratoslaborolesVO.getId_proyecto());
                pst.setString(9, contratoslaborolesVO.getPreaviso());
                pst.setString(10, contratoslaborolesVO.getPreabierto());
                pst.setString(11, contratoslaborolesVO.getMot_ret());
                pst.setString(12, contratoslaborolesVO.getObservacion());
                pst.setInt(13, contratoslaborolesVO.getId_contrato());
                pst.executeUpdate();
                result = "Contrato Laboral Actualizado con exito, ID: " + contratoslaborolesVO.getId_contrato();
            
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

    public static ContratosLaboralesVO buscarContratolaboral(String clave) {
        
        ContratosLaboralesVO cont = new ContratosLaboralesVO();
        Conectar con = new Conectar();
        //INVOCAMOS AL METODO CONEXION
         Connection cn = con.Conectar();
        PreparedStatement pst = null;
        String sql = "SELECT * FROM contratos_laborales WHERE Id_Contrato = ?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1,clave);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    cont.setId_contrato(Integer.parseInt(rs.getString(1)));
                    cont.setId_empleado(Integer.parseInt(rs.getString(2)));
                    cont.setFecha_cont(rs.getString(3));
                    cont.setPer_pru(rs.getString(4));
                    cont.setFecha_ter(rs.getString(5));
                    cont.setFecha_ret(rs.getString(6));
                    cont.setTipo_contrato(rs.getString(7));
                    cont.setId_cargo(Integer.parseInt(rs.getString(8)));
                    cont.setSalario(Float.parseFloat(rs.getString(9)));
                    cont.setId_proyecto(Integer.parseInt(rs.getString(10)));
                    cont.setPreaviso(rs.getString(11));
                    cont.setPreabierto(rs.getString(12));
                    cont.setMot_ret(rs.getString(13));
                    cont.setObservacion(rs.getString(14));
                                 
                }
//                cargoVO.setResultado("Busqueda exitosa");
            }
        } catch (SQLException e) {
            cont.setResultado("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                cont.setResultado("Error " + e);
            }
        }
        return cont;
    }
    
      
    public static ArrayList<ContratosLaboralesVO> getListContratosLaborales(Integer valor){
        ArrayList<ContratosLaboralesVO> arrContratosLaborales = new ArrayList<ContratosLaboralesVO>();
        Conectar con = new Conectar();
     //INVOCAMOS AL METODO CONEXION
        Connection cn = con.Conectar();
        PreparedStatement pst = null;
        ContratosLaboralesVO contratoslaboralesVO = null;
        
        String sql = "";
        
        if(valor.equals(0))
    {
       sql="SELECT Id_Contrato, Fecha_Cont, Fecha_Ret, Tipo_Contrato, Cargo, Salario, Proyecto"
               + " FROM contratos_laborales INNER JOIN proyectos USING(Id_Proyecto) INNER JOIN cargos USING(Id_Cargo)"
               + " WHERE Id_Contrato!=0  ORDER BY Id_Contrato";
    }
    else{

          sql="SELECT Id_Contrato, Fecha_Cont, Fecha_Ret, Tipo_Contrato, Cargo, Salario, Proyecto"
               + " FROM contratos_laborales INNER JOIN proyectos USING(Id_Proyecto) INNER JOIN cargos USING(Id_Cargo)"
               + " WHERE Id_Empleado='"+valor+"'";
              
    }
           
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while(rs.next()) {
                    contratoslaboralesVO = new ContratosLaboralesVO();
                    contratoslaboralesVO.setId_contrato(Integer.parseInt(rs.getString(1)));
                    contratoslaboralesVO.setFecha_cont(rs.getString(2));
                    contratoslaboralesVO.setFecha_ret(rs.getString(3));
                    contratoslaboralesVO.setTipo_contrato(rs.getString(4));
                    contratoslaboralesVO.setCargo(rs.getString(5));
                    contratoslaboralesVO.setSalario(Float.parseFloat(rs.getString(6)));
                    contratoslaboralesVO.setProyecto(rs.getString(7));

                                        
                    
                    arrContratosLaborales.add(contratoslaboralesVO);
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
        return arrContratosLaborales;
    }
    
}
