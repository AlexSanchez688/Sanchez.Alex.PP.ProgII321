/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paricialrefugio;

public class Explorador extends Superviviente implements Tareas {
    
    private int valorResistencia;

    public Explorador(int valorResistencia, String codigo, String nombre, NivelExperiencia nivelExperiencia, Disponibilidad disponibilidad) {
        super(codigo, nombre, nivelExperiencia, disponibilidad);
        this.valorResistencia = valorResistencia;
    }

    @Override
    public int calcularAptitud() {  
        return this.valorResistencia*2;
    }

    @Override
    public void realizarTarea() {
        
        System.out.println("Explorador realizando tareas..");
        
    }

    @Override
    public String toString() {
        return "Explorador{" + "valorResistencia=" + valorResistencia + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
}
