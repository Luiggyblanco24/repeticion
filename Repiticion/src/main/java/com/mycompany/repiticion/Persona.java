
package com.mycompany.repiticion;

public abstract class Persona extends Vehicles {
    private String nombre;
    private TypeUsers tipoUsuario;

    public Persona(String nombre, TypeUsers tipoUsuario, String nombreArchivo) {
        super(null, null, nombreArchivo);
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public TypeUsers getTipoUsuario() {
        return tipoUsuario;
    }

    public abstract void mostrarRuta();
}