
package classVO;

/**
 *
 * @author SISTEMAS
 */
public class ResponsabilidadesVO {
    
    private Integer id_responsabilidad;
    private String nombre_responsabilidad;
    private Integer id_cargo;
    private String nombre_cargo;
    private Integer id_proyecto;
    private String nombre_proyecto;
    private String resultado;

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public String getNombre_cargo() {
        return nombre_cargo;
    }

    public Integer getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public void setNombre_cargo(String nombre_cargo) {
        this.nombre_cargo = nombre_cargo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Integer getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(Integer id_cargo) {
        this.id_cargo = id_cargo;
    }

   
public Integer getId_responsabilidad() {
        return id_responsabilidad;
    }

    public void setId_responsabilidad(Integer id_responsabilidad) {
        this.id_responsabilidad = id_responsabilidad;
    }

    public String getNombre_responsabilidad() {
        return nombre_responsabilidad;
    }

    public void setNombre_responsabilidad(String nombre_responsabilidad) {
        this.nombre_responsabilidad = nombre_responsabilidad;
    }
    
  
    @Override
    public String toString() {
        return nombre_responsabilidad;
    }
    
}
