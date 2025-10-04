/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2.interfaces;

/**
 *
 * @author Jesùs
 */
public class DocumentContent {
    private String text;
    private String metadata;

    public DocumentContent(String text, String metadata) {
        this.text = text;
        this.metadata = metadata;
    }

    public String getText() {
        return text;
    }

    public String getMetadata() {
        return metadata;
    }

    @Override
    public String toString() {
        return "Contenido: " + text + "\nMetadatos: " + metadata;
    }
}
