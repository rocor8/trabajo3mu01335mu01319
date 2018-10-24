/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situacion2tp3;

import java.util.ArrayList;


public class Centro {
    private ArrayList<Paciente> pacientes =  new ArrayList<Paciente>();
    private ArrayList<Doctor> doctores =  new ArrayList<Doctor>();
    private ArrayList<Especialidad> especialidades =  new ArrayList<Especialidad>();
    private ArrayList<Diagnostico> diagnosticos =  new ArrayList<Diagnostico>();

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public void setDoctores(ArrayList<Doctor> doctores) {
        this.doctores = doctores;
    }

    public void setEspecialidades(ArrayList<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public void setDiagnosticos(ArrayList<Diagnostico> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public ArrayList<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public Centro() {
    }
    
    
}
