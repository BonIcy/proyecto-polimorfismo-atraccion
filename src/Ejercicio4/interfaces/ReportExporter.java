/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4.interfaces;

/**
 *
 * @author Jesùs
 */
public class ReportExporter {

    public static void export(String format, String reportTitle) {
        switch (format.toUpperCase()) {
            case "PDF":
                System.out.println("📄 Exportando '" + reportTitle + "' a PDF...");
                break;
            case "EXCEL":
                System.out.println("📊 Exportando '" + reportTitle + "' a Excel...");
                break;
            case "CSV":
                System.out.println("📁 Exportando '" + reportTitle + "' a CSV...");
                break;
            default:
                System.out.println("⚠️ Formato desconocido: " + format);
        }
    }
}