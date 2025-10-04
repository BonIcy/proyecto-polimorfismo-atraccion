/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.interfaces;

/**
 *
 * @author Jesùs
 */
public class PayPalPayment implements PaymentProcessor {

    @Override
    public boolean validatePayment(double amount, String currency, String country) {
        if (amount < 5) {
            System.out.println(" El monto mínimo para PayPal es de 5 unidades.");
            return false;
        }

        if (country.equalsIgnoreCase("Venezuela")) {
            System.out.println(" PayPal no disponible en " + country + ".");
            return false;
        }

        return true;
    }

    @Override
    public void processPayment(double amount, String currency, String country) {
        if (validatePayment(amount, currency, country)) {
            System.out.println("💻 Procesando pago con PayPal...");
            System.out.println("Monto: " + amount + " " + currency + " | País: " + country);
            System.out.println(" Pago vía PayPal completado con éxito.\n");
        } else {
            System.out.println("️ Error al procesar pago con PayPal.\n");
        }
    }
}