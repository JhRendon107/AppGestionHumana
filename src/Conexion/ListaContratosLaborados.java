/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

/**
 *
 * @author SISTEMAS
 */
public class ListaContratosLaborados {
       private String cargo;
       private String fingreso;
       private String fretiro;
      

    public ListaContratosLaborados(String cargo, String fingreso, String fretiro) {
        this.cargo = cargo;
        this.fingreso = fingreso;
        this.fretiro = fretiro;
        
    }

    public String getcargo() {
        return cargo;
    }

    public void setcargo(String cargo) {
        this.cargo = cargo;
    }

    public String getfingreso() {
        return fingreso;
    }

    public void setfingreso(String fingreso) {
        this.fingreso = fingreso;
    }

    public String getfretiro() {
        return fretiro;
    }

    public void setfretiro(String FRetiro) {
        this.fretiro = FRetiro;
    }
       
       
    
}
