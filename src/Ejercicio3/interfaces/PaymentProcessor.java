/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.interfaces;

/**
 *
 * @author Jesùs
 */
public interface PaymentProcessor {

    boolean validatePayment(double amount, String currency, String country);
    void processPayment(double amount, String currency, String country);
}
