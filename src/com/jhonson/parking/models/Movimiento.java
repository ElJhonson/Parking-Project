package com.jhonson.parking.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Movimiento {
    Conductor conductor;
    Auto auto;
    Estacionamiento estacionamiento;
    Date horaLlegada;
    Date horaSalida;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy - HH:mm");
    String horaSalidaF;
    String horaLlegadaF;

    public Movimiento() {
    }

    public Movimiento(Conductor conductor, Auto auto, Estacionamiento estacionamiento) {
        this.conductor = conductor;
        this.auto = auto;
        this.estacionamiento = estacionamiento;
        this.horaLlegada = new Date();
        this.horaSalida = new Date();
        this.horaLlegadaF = sdf.format(horaLlegada);
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Estacionamiento estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraSalidaF() {
        return horaSalidaF;
    }

    public void setHoraSalidaF(String horaSalidaF) {
        this.horaSalidaF = horaSalidaF;
    }

    public String getHoraLlegadaF() {
        return horaLlegadaF;
    }

    public void setHoraLlegadaF(String horaLlegadaF) {
        this.horaLlegadaF = horaLlegadaF;
    }

    public Object[] toArray(){
        return new Object[]{
          conductor.getNombre(), conductor.getApellido(), conductor.getCargo(), auto.marca, auto.placas,
            estacionamiento.getLugar(),horaLlegadaF, horaSalidaF
        };
    }
    
}
