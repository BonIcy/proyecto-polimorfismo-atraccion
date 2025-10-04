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
public class ReportConfig {
    private String title;
    private String format; // pdf- excel - csv
    private boolean sendEmail;

    public ReportConfig(String title, String format, boolean sendEmail) {
        this.title = title;
        this.format = format;
        this.sendEmail = sendEmail;
    }

    public String getTitle() {
        return title;
    }

    public String getFormat() {
        return format;
    }

    public boolean shouldSendEmail() {
        return sendEmail;
    }

    public Date getGenerationDate() {
        return new Date();
    }
}