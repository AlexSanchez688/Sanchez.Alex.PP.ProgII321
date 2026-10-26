/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paricialrefugio;

/**
 *
 * @author user
 */
public class Medico extends Superviviente implements Capacitacion {
    private int valorConocimiento;

    public Medico(int valorConocimiento, String codigo, String nombre, NivelExperiencia nivelExperiencia, Disponibilidad disponibilidad) {
        super(codigo, nombre, nivelExperiencia, disponibilidad);
        this.valorConocimiento = valorConocimiento;
    }

    @Override
    public int calcularAptitud() {
        return this.valorConocimiento + 10;     
    }

    @Override
    public void capatacitarse() {
        System.out.println("Medico capacitandose..");
        
    }

    
    
    

    
    
    
    
    
}
