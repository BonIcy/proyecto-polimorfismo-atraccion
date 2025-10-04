/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2.interfaces;

/**
 *
 * @author Jesùs
 */
public class ExcelProcessor extends DocumentProcessor {

    @Override
    protected boolean validateFormat(String filePath) {
        return filePath.toLowerCase().endsWith(".xlsx") || filePath.toLowerCase().endsWith(".xls");
    }

    @Override
    protected DocumentContent extractContent(String filePath) {
        System.out.println("Analizando datos y fórmulas del Excel...");
        return new DocumentContent("Datos de hoja 1, 2 y 3", "Fórmulas: SUMA(), PROMEDIO()");
    }

    @Override
    protected void saveProcessedDocument(DocumentContent content) {
        System.out.println("Guardando Excel procesado...");
        System.out.println(content);
    }
}