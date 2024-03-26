package com.jhonson.parking.models;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Estacionamiento implements Serializable {

    private Auto auto;
    private int lugar;
    private Date fechaRegistro;
    private String fecha;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy ' - 'HH:mm");

    public Estacionamiento() {
    }

    public Estacionamiento(Auto auto, int lugar) {
        this.auto = auto;
        this.lugar = lugar;
        this.fechaRegistro = new Date();
        this.fecha = sdf.format(fechaRegistro);
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Object[] toArray() {
        return new Object[]{
            auto.conductor.getNombre(), auto.conductor.getApellido(), auto.conductor.getCargo(), fecha,
            auto.tipoVehiculo, auto.placas, lugar
        };
    }

}
