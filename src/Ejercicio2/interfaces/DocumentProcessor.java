/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2.interfaces;

/**
 *
 * @author Jesùs
 */
public abstract class DocumentProcessor {

    public final ProcessResult processDocument(String filePath) {
        System.out.println("\nProcesando documento: " + filePath);

        if (!validateFormat(filePath)) {
            return new ProcessResult(false, "Formato no válido para " + filePath);
        }

        DocumentContent content = extractContent(filePath);
        saveProcessedDocument(content);

        return new ProcessResult(true, "Documento procesado correctamente: " + filePath);
    }

    protected abstract boolean validateFormat(String filePath);
    protected abstract DocumentContent extractContent(String filePath);
    protected abstract void saveProcessedDocument(DocumentContent content);
}