package com.example.lab_patitos.entity;


import lombok.Getter;
import lombok.Setter;

public class Juego {
    private Integer columnas;
    private Integer filas;
    private String coordenadas;
    private Integer cantfotos;

    public Integer getColumnas() {
        return columnas;
    }

    public void setColumnas(Integer columnas) {
        this.columnas = columnas;
    }

    public Integer getFilas() {
        return filas;
    }

    public void setFilas(Integer filas) {
        this.filas = filas;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Integer getCantfotos() {
        return cantfotos;
    }

    public void setCantfotos(Integer cantfotos) {
        this.cantfotos = cantfotos;
    }


}
