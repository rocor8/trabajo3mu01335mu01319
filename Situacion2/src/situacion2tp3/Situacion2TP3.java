/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situacion2tp3;


public class Situacion2TP3 {

    public static void main(String[] args) {
        Especialidad esp = new Especialidad("Traumatología");
        Especialidad esp2 = new Especialidad("Otorrinolaringología");
        Especialidad esp3 = new Especialidad("Pediatría");
        Especialidad esp4 = new Especialidad("Cardiología");
        
        Doctor doc1 = new Doctor("Tamara","Senatore","Femenino","21342424","Centro",2313,esp,10000,50);
        Doctor doc2 = new Doctor("Miguel","Campos","Masculino","28101992","B° 25 Mayo",6423,esp2,5000,12);
        Doctor doc3 = new Doctor("Samuel","Castro","Masculino","21310424","Loro Huasi",1113,esp3,20000,5);
        Doctor doc4 = new Doctor("Eduardo","Gomez","Masculino","3850498","El Alto", 7639, esp4,15000,10);
 
        System.out.println("Los medicos son");
        doc1.calcularSueldo();
        doc2.calcularSueldo();
        doc3.calcularSueldo();
        doc4.calcularSueldo();
//        calcularSueldo(doc1);
//        System.out.println(doc2);
//        System.out.println(doc3);
//        System.out.println(doc4);
        
    }
}
