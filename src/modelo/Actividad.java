/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Actividad {
    private String tipo;
    private String descripcion;
    private int horas;
    private String estado;
    private int prioridad;

    public Actividad() {
    }

    public Actividad(String tipo, String descripcion, int horas, String estado, int prioridad) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.horas = horas;
        this.estado = estado;
        this.prioridad = prioridad;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Actividad{" + "tipo=" + tipo + ", descripcion=" + descripcion + ", horas=" + horas + ", estado=" + estado + ", prioridad=" + prioridad + '}';
    }
    
    
    
}
