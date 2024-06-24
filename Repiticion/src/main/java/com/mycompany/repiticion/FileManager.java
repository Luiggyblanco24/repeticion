
package com.mycompany.repiticion;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileManager {
    private String nombreArchivo;

    public FileManager(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void guardarHistorial(List<String> historial) {
          File fichero = null;

        try (FileWriter writer = new FileWriter(nombreArchivo, true)) {
            fichero = new File("./historial.txt");
            for (String entrada : historial) {
                writer.write(entrada + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void agregarEntrada(String entrada) {
        File fichero = null;
        try (FileWriter writer = new FileWriter(nombreArchivo, true)) {
            fichero = new File("./historial_entrada.txt");
            writer.write(entrada + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}