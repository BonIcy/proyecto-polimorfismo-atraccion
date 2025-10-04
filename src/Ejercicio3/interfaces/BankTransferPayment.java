/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.interfaces;

/**
 *
 * @author Jesùs
 */
public class BankTransferPayment implements PaymentProcessor {

    @Override
    public boolean validatePayment(double amount, String currency, String country) {
        if (amount < 100) {
            System.out.println(" El monto mínimo para transferencia bancaria es de 100 unidades.");
            return false;
        }

        if (!country.equalsIgnoreCase("Colombia") && !country.equalsIgnoreCase("México")) {
            System.out.println(" Solo se permiten transferencias desde Colombia o México.");
            return false;
        }

        return true;
    }

    @Override
    public void processPayment(double amount, String currency, String country) {
        if (validatePayment(amount, currency, country)) {
            System.out.println(" Procesando transferencia bancaria...");
            System.out.println("Monto: " + amount + " " + currency + " | País: " + country);
            System.out.println(" Transferencia completada con éxito.\n");
        } else {
            System.out.println("️Error al procesar transferencia bancaria.\n");
        }
    }
}