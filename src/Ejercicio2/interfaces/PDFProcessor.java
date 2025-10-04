/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2.interfaces;

/**
 *
 * @author Jesùs
 */
public class PDFProcessor extends DocumentProcessor {

    @Override
    protected boolean validateFormat(String filePath) {
        return filePath.toLowerCase().endsWith(".pdf");
    }

    @Override
    protected DocumentContent extractContent(String filePath) {
        System.out.println("Extrayendo texto y metadatos del PDF...");
        return new DocumentContent("Texto del PDF", "Autor: Juan, Fecha: 2025");
    }

    @Override
    protected void saveProcessedDocument(DocumentContent content) {
        System.out.println("Guardando PDF procesado...");
        System.out.println(content);
    }
}