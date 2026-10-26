/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paricialrefugio;

import java.util.ArrayList;

public class Refugio {
    private ArrayList<Superviviente> supervivientes;

    
    public Refugio() {
        this.supervivientes = new ArrayList<>();
    }
    
    public void agregarSupervivente(Superviviente s){
        this.supervivientes.add(s);    
    }
    
    public ArrayList<Superviviente> obtenerSupervivientes(){
        
        ArrayList<Superviviente> supervivientesobtenidos = new ArrayList();
        
        for(Superviviente a : this.supervivientes ){
            supervivientesobtenidos.add(a);  
        }
        return supervivientesobtenidos;
    }
    
    
    public ArrayList<Superviviente> filtrarPorNivel(NivelExperiencia nivel){
        ArrayList<Superviviente> nivelFiltrado = new ArrayList();
        
        for(Superviviente a : this.supervivientes ){
            
            if (a.getNivelExperiencia() == nivel){
                nivelFiltrado.add(a);
            }
   
        }
        return nivelFiltrado;

    }
    
    /*
     obtenerDisponiblesConAptitudMinima(minimo): 
    devuelve solamente los supervivientes
    disponibles cuya aptitud sea mayor o igual que minimo. 
    El mínimo no puede ser negativo.

    */
    
    public void obtenerDisponiblesConAptitudMinima(int minimo){
        validarPositivo(minimo);
        for(Superviviente s : this.supervivientes){
            if(s.calcularAptitud() >= minimo){
                System.out.println(s);
            } 
        }
          
    }
    
    public static void validarPositivo(int n){
        if(n < 0){
            throw new IllegalArgumentException("Numero negativo, entrada invalida");
        }
    }
    
    
    
    
    @Override
    public String toString() {
        return "Refugio{" + "supervivientes=" + supervivientes + '}';
    }
 
}
