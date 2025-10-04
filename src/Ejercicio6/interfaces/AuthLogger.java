/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.interfaces;
import java.time.LocalDateTime;
/**
 *
 * @author Jesùs
 */
public class AuthLogger {
    public static void log(String username, boolean success) {
        String status = success ? "ÉXITO" : "FALLIDO";
        System.out.println(LocalDateTime.now() + " | Usuario: " + username + " | Resultado: " + status);
    }
}