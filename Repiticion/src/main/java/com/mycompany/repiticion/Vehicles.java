package com.mycompany.repiticion;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicles implements Mantenimiento {
    private String ruta;
    private TypeVehicle typeVehicle;
    private List<String> historialMantenimientos = new ArrayList<>();
    private FileManager fileManager;

    public Vehicles(String ruta, TypeVehicle typeVehicle, String nombreArchivo) {
        this.ruta = ruta;
        this.typeVehicle = typeVehicle;
        this.fileManager = new FileManager(nombreArchivo);
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public TypeVehicle getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(TypeVehicle typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    public void agregarMantenimiento(String mantenimiento) {
        historialMantenimientos.add(mantenimiento);
        fileManager.agregarEntrada("Mantenimiento: " + mantenimiento);
    }

    public List<String> getHistorialMantenimientos() {
        return historialMantenimientos;
    }

    public void guardarHistorialMantenimientos() {
        fileManager.guardarHistorial(historialMantenimientos);
    }

    public abstract double calcularTarifa();

    @Override
    public void cambiodeaceite() {
        System.out.println("Despues de treinta dias de uso debe hacerse cambio de aceite");
    }

    @Override
    public void chequeodefrenos() {
        System.out.println("El chequeo de frenos se hace cada semana");
    }

    @Override
    public void revisionllantas() {
        System.out.println("La revision de llantas se hace dia por medio");
    }
}