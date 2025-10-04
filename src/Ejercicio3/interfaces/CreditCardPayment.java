/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.interfaces;

/**
 *
 * @author Jesùs
 */
public class CreditCardPayment implements PaymentProcessor {

    @Override
    public boolean validatePayment(double amount, String currency, String country) {
        if (amount <= 0) {
            System.out.println("Monto inválido para pago con tarjeta.");
            return false;
        }

        if (!currency.equalsIgnoreCase("USD") && !currency.equalsIgnoreCase("EUR")) {
            System.out.println(" Solo se aceptan pagos con tarjeta en USD o EUR.");
            return false;
        }

        return true;
    }

    @Override
    public void processPayment(double amount, String currency, String country) {
        if (validatePayment(amount, currency, country)) {
            System.out.println(" Procesando pago con tarjeta de crédito...");
            System.out.println("Monto: " + amount + " " + currency + " | País: " + country);
            System.out.println(" Pago con tarjeta completado con éxito.\n");
        } else {
            System.out.println("️ No se pudo procesar el pago con tarjeta.\n");
        }
    }
}