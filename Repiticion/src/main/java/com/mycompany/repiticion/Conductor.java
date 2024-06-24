
package com.mycompany.repiticion;

public abstract class Conductor extends Persona {
    private TypeVehicle tipoVehiculo;
    private TypeConductor tipoConductor;

    public Conductor(TypeVehicle tipoVehiculo, TypeConductor tipoConductor, String nombre, TypeUsers tipoUsuario, String nombreArchivo) {
        super(nombre, tipoUsuario, nombreArchivo);
        this.tipoVehiculo = tipoVehiculo;
        this.tipoConductor = tipoConductor;
    }

    @Override
    public double calcularTarifa() {
        double tarifa = 30; // Tarifa base
        if (tipoVehiculo == TypeVehicle.TAXI) {
            if (tipoConductor == TypeConductor.DUEÑO) {
                tarifa *= 0.90; // 10% de descuento
                System.out.println("Tarifa para " + getNombre() + " (Dueño de Taxi): " + tarifa);
            } else {
                System.out.println("Tarifa para " + getNombre() + " (Conductor de Taxi Prestado): " + tarifa);
            }
        }
        return tarifa;
    }
}