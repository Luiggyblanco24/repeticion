
package com.mycompany.repiticion;

import java.util.Random;

public abstract class Passenger extends Persona {
    private TypeVehicle tipoVehiculo;

    public Passenger(TypeVehicle tipoVehiculo, String nombre, TypeUsers tipoUsuario, String nombreArchivo) {
        super(nombre, tipoUsuario, nombreArchivo);
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public void mostrarRuta() {
        int precioBase = 3000;
        int precioFinal = precioBase;

        if (tipoVehiculo == TypeVehicle.TAXI) {
            precioFinal *= 4;
            System.out.println("Pasajero " + getNombre() + " irá en " + tipoVehiculo + ". Precio total: " + precioFinal);
        } else if (tipoVehiculo == TypeVehicle.COLECTIVO) {
            Random random = new Random();
            int randomNumber = random.nextInt(51);
            String ruta = "calle " + randomNumber + " avenida " + randomNumber;
            System.out.println("Pasajero " + getNombre() + " en " + tipoVehiculo + " pasará por " + ruta + ". Precio total: " + precioFinal);
        }
    }
}