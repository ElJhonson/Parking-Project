package com.jhonson.parking.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistroMovimientos {
    private Estacionamiento estacionamiento;
    private Date llegada;
    private Date salida;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy - HH:mm");
    private String llegadaFormat;
    private String salidaFormat = "En espera";

    public RegistroMovimientos() {
    }

    public RegistroMovimientos(Estacionamiento estacionamiento) {
        this.estacionamiento =estacionamiento;
        this.llegadaFormat = sdf.format(this.llegada);
    }

    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Estacionamiento estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public Date getLlegada() {
        return llegada;
    }

    public void setLlegada(Date llegada) {
        this.llegada = llegada;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public String getLlegadaFormat() {
        return llegadaFormat;
    }

    public void setLlegadaFormat(String llegadaFormat) {
        this.llegadaFormat = llegadaFormat;
    }

    public String getSalidaFormat() {
        return salidaFormat;
    }

    public void setSalidaFormat(String salidaFormat) {
        this.salidaFormat = salidaFormat;
    }
    
    public Object[] toArray(){
        return new Object[]{
          estacionamiento.getAuto().getConductor().getNombre(), estacionamiento.getAuto().getConductor().getApellido(),
            estacionamiento.getAuto().getPlacas(), estacionamiento.getLugar(), this.llegada, this.salidaFormat
        };
    }
    
    
}
