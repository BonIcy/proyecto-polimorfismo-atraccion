/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.interfaces;

/**
 *
 * @author Jesùs
 */
public class PaymentFactory {

    public static PaymentProcessor getProcessor(String type) {
        switch (type.toLowerCase()) {
            case "tarjeta":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalPayment();
            case "transferencia":
                return new BankTransferPayment();
            case "bitcoin":
                return new BitcoinPayment();
            default:
                return null;
        }
    }
}