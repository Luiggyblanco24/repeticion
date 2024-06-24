/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repiticion;

import java.util.Random;

public abstract class Student extends Persona {
    private TypeVehicle tipoVehiculo;

    public Student(TypeVehicle tipoVehiculo, String nombre, TypeUsers tipoUsuario, String nombreArchivo) {
        super(nombre, tipoUsuario, nombreArchivo);
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public void mostrarRuta() {
        int precioBase = 3000;
        int precioFinal = (int) (precioBase * 0.70); // 30% de descuento

        if (tipoVehiculo == TypeVehicle.COLECTIVO) {
            Random random = new Random();
            int randomNumber = random.nextInt(51);
            String ruta = "calle " + randomNumber + " avenida " + randomNumber;
            System.out.println("Estudiante " + getNombre() + " en " + tipoVehiculo + " pasará por " + ruta + ". Precio total: " + precioFinal);
        }
    }
}