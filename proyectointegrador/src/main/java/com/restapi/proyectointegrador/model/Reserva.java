package com.restapi.proyectointegrador.model;

public class Reserva {
    private String id;
    private String idUsuario;
    private String fecha;

    // Constructor
    public Reserva(String id, String idUsuario, String fecha) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.fecha = fecha;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
