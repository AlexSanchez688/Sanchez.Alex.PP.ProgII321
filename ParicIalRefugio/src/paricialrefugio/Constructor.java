/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paricialrefugio;

/**
 *
 * @author user
 */
public class Constructor extends Superviviente implements Tareas,Capacitacion{
    private int valorTecnico;

    public Constructor(String codigo, String nombre, NivelExperiencia nivelExperiencia, Disponibilidad disponibilidad) {
        super(codigo, nombre, nivelExperiencia, disponibilidad);
    }

    @Override
    public int calcularAptitud() {
        return this.valorTecnico*3;
    }

    @Override
    public void realizarTarea() {
        
        System.out.println("Constructor realizando tareas..");
         
    }

    @Override
    public void capatacitarse() {
        
        System.out.println("El constructor se esta capacitando..");
        
    }

    @Override
    public String toString() {
        return "Constructor{" + "valorTecnico=" + valorTecnico + '}';
    }
    
    
}
