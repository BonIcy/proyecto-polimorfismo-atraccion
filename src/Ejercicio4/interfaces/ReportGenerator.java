/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4.interfaces;
import java.util.Date;
/**
 *
 * @author Jesùs
 */
public abstract class ReportGenerator {

    protected String title;
    protected Date generationDate;


    public final void generateReport(ReportConfig config) {
        this.title = config.getTitle();
        this.generationDate = config.getGenerationDate();

        System.out.println("\n Generando reporte: " + title);
        addHeader();
        validateData();
        processData();
        formatOutput();
        addFooter();

        ReportExporter.export(config.getFormat(), title);

        if (config.shouldSendEmail()) {
            sendEmailNotification();
        }

        System.out.println(" Reporte completado: " + title);
    }


    protected abstract void validateData();
    protected abstract void processData();
    protected abstract void formatOutput();

    protected void addHeader() {
        System.out.println("Encabezado añadido. Fecha: " + generationDate);
    }

    protected void addFooter() {
        System.out.println("Pie de página añadido. © Empresa XYZ");
    }

    protected void sendEmailNotification() {
        System.out.println("📧 Enviando reporte '" + title + "' por correo electrónico...");
    }
}