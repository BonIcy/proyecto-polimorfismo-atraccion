/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2.interfaces;

/**
 *
 * @author Jesùs
 */
public class DocumentFactory {

    public static DocumentProcessor getProcessor(String filePath) {
        if (filePath.toLowerCase().endsWith(".pdf")) {
            return new PDFProcessor();
        } else if (filePath.toLowerCase().endsWith(".docx") || filePath.toLowerCase().endsWith(".doc")) {
            return new WordProcessor();
        } else if (filePath.toLowerCase().endsWith(".xlsx") || filePath.toLowerCase().endsWith(".xls")) {
            return new ExcelProcessor();
        } else {
            return null;
        }
    }
}