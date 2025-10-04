/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.interfaces;

/**
 *
 * @author Jesùs
 */
public class BitcoinPayment implements PaymentProcessor {

    @Override
    public boolean validatePayment(double amount, String currency, String country) {
        if (!currency.equalsIgnoreCase("BTC")) {
            System.out.println("❌ Solo se aceptan pagos en BTC para este método.");
            return false;
        }

        if (amount < 0.0001) {
            System.out.println("❌ Monto mínimo para transacción Bitcoin: 0.0001 BTC.");
            return false;
        }

        return true;
    }

    @Override
    public void processPayment(double amount, String currency, String country) {
        if (validatePayment(amount, currency, country)) {
            System.out.println("₿ Procesando pago con Bitcoin...");
            System.out.println("Monto: " + amount + " " + currency + " | País: " + country);
            System.out.println("✅ Pago con Bitcoin confirmado.\n");
        } else {
            System.out.println("⚠️ Error al procesar pago con Bitcoin.\n");
        }
    }
}