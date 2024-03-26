package com.jhonson.parking.models;

import java.io.Serializable;

public class Auto implements Serializable{

    Conductor conductor;
    String tipoVehiculo;
    String marca;
    String placas;

    public Auto() {
    }

    public Auto(Conductor conductor, String tipoVehiculo, String marca, String placas) {
        this.conductor = conductor;
        this.tipoVehiculo = tipoVehiculo;
        this.marca = marca;
        this.placas = placas;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

}
