/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Usuario {
    private int codigo;
    private String pass;
    private String nombre;
    private String rol;
    private ArrayList<Actividad> actividad;

    public Usuario() {
    }

    public Usuario(int codigo, String pass, String nombre, String rol, ArrayList<Actividad> actividad) {
        this.codigo = codigo;
        this.pass = pass;
        this.nombre = nombre;
        this.rol = rol;
        this.actividad = actividad;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public ArrayList<Actividad> getActividad() {
        return actividad;
    }

    public void setActividad(ArrayList<Actividad> actividad) {
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", pass=" + pass + ", nombre=" + nombre + ", rol=" + rol + ", actividad=" + actividad + '}';
    }

    
    
}
