/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5.interfaces;

/**
 *
 * @author Jesùs
 */
public class CreditCardValidator extends Validator<String> {

    @Override
    protected boolean isValid(String cardNumber) {
        cardNumber = cardNumber.replaceAll("\\s+", ""); // Quitar espacios
        if (!cardNumber.matches("\\d{13,19}")) return false;

        int sum = 0;
        boolean alternate = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(cardNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) n -= 9;
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }

    @Override
    protected String getErrorMessage() {
        return "Número de tarjeta inválido (falló la validación de Luhn).";
    }
}