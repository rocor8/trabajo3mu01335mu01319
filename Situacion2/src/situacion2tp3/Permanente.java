/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situacion2tp3;


public class Permanente extends Doctor {
    
    private Integer sueldoBase;
    private Integer horasExtras;

    public void setSueldoBase(Integer sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setHorasExtras(Integer horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Integer getSueldoBase() {
        return sueldoBase;
    }

    public Integer getHorasExtras() {
        return horasExtras;
    }

    public Permanente(Integer sueldoBase, Integer horasExtras) {
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
    }

    public Permanente(Integer sueldoBase, Integer horasExtras, String nombre, String apellido, String sexo, String dni, String direccion, int matricula, Especialidad especialidad, float sueldo, int extra) {
        super(nombre, apellido, sexo, dni, direccion, matricula, especialidad, sueldo, extra);
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
    }
    
}
