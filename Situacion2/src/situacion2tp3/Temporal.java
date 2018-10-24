/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situacion2tp3;


public class Temporal extends Doctor {
    private Integer sueldoPorHora;
    private Integer cantidadHora;
    private Integer cantidadExtras;

    public Temporal(Integer sueldoPorHora, Integer cantidadHora, Integer cantidadExtras) {
        this.sueldoPorHora = sueldoPorHora;
        this.cantidadHora = cantidadHora;
        this.cantidadExtras = cantidadExtras;
    }

    public Integer getSueldoPorHora() {
        return sueldoPorHora;
    }

    public Integer getCantidadHora() {
        return cantidadHora;
    }

    public Integer getCantidadExtras() {
        return cantidadExtras;
    }

    public void setSueldoPorHora(Integer sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    public void setCantidadHora(Integer cantidadHora) {
        this.cantidadHora = cantidadHora;
    }

    public void setCantidadExtras(Integer cantidadExtras) {
        this.cantidadExtras = cantidadExtras;
    }
    

    @Override
    public void calcularSueldo(){
        
      //  setSueldo((cantidadHora+cantidadExtras)*sueldoPorHora);
      //  System.out.println("El sueldo del empleado es"+getSueldo());
    }
}
