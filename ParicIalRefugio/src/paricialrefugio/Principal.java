/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paricialrefugio;

import java.util.List;

/**
 *
 * @author user
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Refugio r = new Refugio();
        
       Superviviente m1 = new Medico(1000,"abcd","juan",NivelExperiencia.EXPERTO,Disponibilidad.DISPONIBLE);
       Superviviente m2 = new Medico(1040,"dcsd","Sol",NivelExperiencia.EXPERTO,Disponibilidad.OCUPADO);
       Superviviente e1 = new Explorador(1000,"xj123","Javier",NivelExperiencia.INTERMEDIO,Disponibilidad.DISPONIBLE);
       Superviviente e2 = new Explorador(5000,"xj183","Lorena",NivelExperiencia.EXPERTO,Disponibilidad.DISPONIBLE);
       
       r.agregarSupervivente(m1);
       r.agregarSupervivente(m2);
       r.agregarSupervivente(e1);
       r.agregarSupervivente(e2);
       
       /*System.out.println(r.obtenerSupervivientes());*/
       /*System.out.println(r.filtrarPorNivel(NivelExperiencia.INTERMEDIO));*/
       
       /*System.out.println(m1.calcularAptitud());*/
        
        /*r.obtenerDisponiblesConAptitudMinima(100000);*/
        
        /*mostrarSupervivientes(r.obtenerSupervivientes());*/
        
        System.out.println("Supervivientes registrados:");
        mostrarSupervivientes(r.obtenerSupervivientes());
        System.out.println("\nAptitudes:");
        mostrarAptitudes(r.obtenerSupervivientes());
        System.out.println("\nAsignacion de tareas:");
       
        
       
        
       
    }
    private static void mostrarSupervivientes(List<Superviviente> lista) {
        
        for(Superviviente s : lista ){
            System.out.println(s);
        }
        
    }
    private static void mostrarAptitudes(List<Superviviente> lista) {
        
        for(Superviviente s : lista ){
            System.out.println(s.getNombre()+":" + s.calcularAptitud());
        }
        
    
    }
    private static void asignarTareas(List<Superviviente> lista) {
        
        
        
        
    }

        
 }
