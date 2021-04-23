package com.company;

public class Materia {
    private Integer codigo;
    private String nombreMateria;
    private Integer NumCreditos;
    private Double nota;

    public Materia(Integer codigo, String nombre, Integer numCreditos, Double nota) {
        this.codigo = codigo;
        this.nombreMateria = nombre;
        NumCreditos = numCreditos;
        this.nota = nota;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Integer getNumCreditos() {
        return NumCreditos;
    }

    public void setNumCreditos(Integer numCreditos) {
        NumCreditos = numCreditos;
    }
    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }






}
