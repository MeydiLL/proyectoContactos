package com.example.crudfirebase.Models;

public class Persona {
    private String idpersona;
    private String nombres;
    private String telefono;
    private String fecharegitro;
    private String id_usuario;
    private long timestamp;

    public String getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(String idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecharegitro() {
        return fecharegitro;
    }

    public void setFecharegitro(String fecharegitro) {
        this.fecharegitro = fecharegitro;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return nombres;
    }
}
