/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classVO;

/**
 *
 * @author SISTEMAS
 */
public class ContratosLaboralesVO {
    
     private Integer id_contrato;
     private Integer id_empleado;
     private String fecha_cont;
     private String per_pru;
     private String fecha_ter;
     private String fecha_ret;
     private String tipo_contrato;
     private Integer id_cargo;
     private String cargo;
     private Float salario;
     private Integer id_proyecto;
     private String proyecto;
     private String preaviso;
     private String preabierto;
     private String mot_ret;
     private String observacion;
     private String resultado;

    public Integer getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(Integer id_contrato) {
        this.id_contrato = id_contrato;
    }

    public Integer getId_empleado() {
        return id_empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public void setId_empleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getFecha_cont() {
        return fecha_cont;
    }

    public void setFecha_cont(String fecha_cont) {
        this.fecha_cont = fecha_cont;
    }

    public String getPer_pru() {
        return per_pru;
    }

    public void setPer_pru(String per_pru) {
        this.per_pru = per_pru;
    }

    public String getFecha_ter() {
        return fecha_ter;
    }

    public void setFecha_ter(String fecha_ter) {
        this.fecha_ter = fecha_ter;
    }

    public String getFecha_ret() {
        return fecha_ret;
    }

    public void setFecha_ret(String fecha_ret) {
        this.fecha_ret = fecha_ret;
    }

    public String getTipo_contrato() {
        return tipo_contrato;
    }

    public void setTipo_contrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }

    public Integer getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(Integer id_cargo) {
        this.id_cargo = id_cargo;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Integer getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getPreaviso() {
        return preaviso;
    }

    public void setPreaviso(String preaviso) {
        this.preaviso = preaviso;
    }

    public String getPreabierto() {
        return preabierto;
    }

    public void setPreabierto(String preabierto) {
        this.preabierto = preabierto;
    }

    public String getMot_ret() {
        return mot_ret;
    }

    public void setMot_ret(String mot_ret) {
        this.mot_ret = mot_ret;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
}
