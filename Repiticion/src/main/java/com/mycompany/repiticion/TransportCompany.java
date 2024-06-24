
package com.mycompany.repiticion;

public class TransportCompany {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(TypeVehicle.TAXI, "Juan", TypeUsers.USUARIO, "historial.txt") {
            @Override
            public double calcularTarifa() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        Conductor conductor = new Conductor(TypeVehicle.TAXI, TypeConductor.PRESTADO, "Pedro", TypeUsers.CONDUCTOR, "historial.txt") {
            @Override
            public void mostrarRuta() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        Student student = new Student(TypeVehicle.BUSETA, "Camilo", TypeUsers.ESTUDIANTE, "historial.txt") {
            @Override
            public double calcularTarifa() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };

        // Calcular tarifas y rutas
        System.out.println("----------------------------------------");
        conductor.calcularTarifa();
        conductor.agregarMantenimiento("Cambio de aceite");
        conductor.guardarHistorialMantenimientos();
        System.out.println("----------------------------------------");
        passenger.mostrarRuta();
        passenger.agregarMantenimiento("Chequeo de frenos");
        passenger.guardarHistorialMantenimientos();
        System.out.println("----------------------------------------");
        student.mostrarRuta();
        student.agregarMantenimiento("Revisión de llantas");
        student.guardarHistorialMantenimientos();
    }
}