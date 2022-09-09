/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author CHOVA
 */
public class Cliente {
      
    private String Nombre;
    private String Apellido;
    private String Direcion;
    private String Tipodoc;
    private String Nrodoc;
    private String Telefono;

    public Cliente(String Nombre, String Apellido, String Direcion, String Tipodoc, String Nrodoc, String Telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direcion = Direcion;
        this.Tipodoc = Tipodoc;
        this.Nrodoc = Nrodoc;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDirecion() {
        return Direcion;
    }
    
    public void setDirecion(String Direcion) {
        this.Direcion = Direcion;
    }

    public String getTipodoc() {
        return Tipodoc;
    }
  
    public void setTipodoc(String Tipodoc) {
        this.Tipodoc = Tipodoc;
    }

    public String getNrodoc() {
        return Nrodoc;
    }
    
    public void setNrodoc(String Nrodoc) {
        this.Nrodoc = Nrodoc;
    }
    
    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
    

    
    
}