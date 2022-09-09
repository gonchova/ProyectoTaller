/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author CHOVA
 */
public class Agenda {
    private Date Fecha;
    private Boolean Asistio;

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Boolean getAsistio() {
        return Asistio;
    }

    public void setAsistio(Boolean Asistio) {
        this.Asistio = Asistio;
    }
        
}
