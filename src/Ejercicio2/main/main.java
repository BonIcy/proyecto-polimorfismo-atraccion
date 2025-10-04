/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2.main;
import Ejercicio2.interfaces.*;
/**
 *
 * @author Jesùs
 */
public class main {

    public static void main(String[] args) {
        String[] archivos = {
            "reporte.pdf",
            "informe.docx",
            "datos.xlsx",
            "imagen.jpg" //archivo no valido
        };

        for (String archivo : archivos) {
            DocumentProcessor processor = DocumentFactory.getProcessor(archivo);

            if (processor != null) {
                ProcessResult result = processor.processDocument(archivo);
                System.out.println(result);
            } else {
                System.out.println("\n No se encontró un procesador compatible para: " + archivo);
            }
        }
    }
}
