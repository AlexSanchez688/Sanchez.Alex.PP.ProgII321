/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paricialrefugio;



public abstract class Superviviente {
    
    private String codigo;
    private String nombre;
    private NivelExperiencia nivelExperiencia;
    private Disponibilidad disponibilidad;
    
    
    public Superviviente(String codigo, String nombre, NivelExperiencia nivelExperiencia, Disponibilidad disponibilidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nivelExperiencia = nivelExperiencia;
        this.disponibilidad = disponibilidad;
    }
    
    public abstract int calcularAptitud();

    @Override
    public String toString() {
        return "Superviviente{" + "codigo=" + codigo + ", nombre=" + nombre + ", nivelExperiencia=" + nivelExperiencia + ", disponibilidad=" + disponibilidad + '}';
    }

    public NivelExperiencia getNivelExperiencia() {
        return nivelExperiencia;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
