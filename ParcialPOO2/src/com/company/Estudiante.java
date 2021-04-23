package com.company;

import java.util.ArrayList;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private String ID;
    private String correoElectronico;
    ArrayList<Materia> listadoMaterias = new ArrayList<>();

    public Estudiante(String nombres, String apellidos, String ID, String correoElectronico) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ID = ID;
        this.correoElectronico = correoElectronico;
    }

    public Double calcularPromedio(){
        Double promedio = 0.0;
        for (Materia actual:listadoMaterias){
            promedio += actual.getNota();
        }
        return promedio / listadoMaterias.size();
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public ArrayList<Materia> getListadoMaterias() {
        return listadoMaterias;
    }

    public void setListadoMaterias(ArrayList<Materia> listadoMaterias) {
        this.listadoMaterias = listadoMaterias;
    }
}
