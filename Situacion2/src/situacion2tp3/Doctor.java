/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situacion2tp3;

import java.util.ArrayList;



public class Doctor extends Persona {
    
    private int matricula;
    private Especialidad especialidad;
    private ArrayList<Paciente> pacientes =  new ArrayList<Paciente>();
    private float sueldo;
    private int extra;
    
    public Doctor(){};
    public Doctor(String nombre,String apellido,String sexo,String dni,String direccion,int matricula, Especialidad especialidad, float sueldo, int extra){
        super(nombre,apellido,sexo,dni,direccion);
        this.especialidad = especialidad;
        this.matricula = matricula; 
        this.sueldo= sueldo;
        
}

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public Integer getExtra() {
        return extra;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }
    @Override
    public String toString(){
        String doctor = getNombre() +" " +getApellido() +"- MPN° "+getMatricula();
        return doctor;
    }
    public String pacientesAsignados(){
        String lista = "";
        for (int i=0; i< pacientes.size();i++){
            Object hab = pacientes.get(i);
            lista = lista +"\n"+ hab;
        }
        String asignados = toString()+"\nPacientes asignados"+lista;
        return asignados;
    }
    
    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the especialidad
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the paciente de acuerdo a su dni
     */
    public Paciente getPaciente(String dni) {
        
        Paciente resultado = null;
        for (Paciente paciente : pacientes){
            if(paciente.getDni().equals(dni)){
                resultado = paciente;
            }
        }
        return resultado;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente p) {
       pacientes.add(p);
    }
    
     public void calcularSueldo(){
           sueldo=(extra*500)+sueldo;
           System.out.println("El sueldo del empleado es "+sueldo+" sin las horas extras incluidas");
    }

}