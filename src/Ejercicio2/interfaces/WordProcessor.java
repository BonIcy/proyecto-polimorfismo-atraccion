/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2.interfaces;

/**
 *
 * @author Jesùs
 */
public class WordProcessor extends DocumentProcessor {

    @Override
    protected boolean validateFormat(String filePath) {
        return filePath.toLowerCase().endsWith(".docx") || filePath.toLowerCase().endsWith(".doc");
    }

    @Override
    protected DocumentContent extractContent(String filePath) {
        System.out.println("Extrayendo texto y estilos del Word...");
        return new DocumentContent("Texto del Word", "Estilos detectados: Negrita, Cursiva");
    }

    @Override
    protected void saveProcessedDocument(DocumentContent content) {
        System.out.println("Guardando documento Word procesado...");
        System.out.println(content);
    }
}