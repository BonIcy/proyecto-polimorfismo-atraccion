/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3.main;
import Ejercicio3.interfaces.*;
/**
 *
 * @author Jesùs
 */
public class main {

    public static void main(String[] args) {
        String[][] pagos = {
            {"tarjeta", "250", "USD", "España"},
            {"paypal", "10", "USD", "Colombia"},
            {"transferencia", "80", "COP", "Perú"},
            {"transferencia", "500", "MXN", "México"},
            {"bitcoin", "0.00005", "BTC", "Argentina"},
            {"bitcoin", "0.002", "BTC", "Colombia"},
            {"paypal", "4", "USD", "Venezuela"}
        };

        for (String[] datos : pagos) {
            String tipo = datos[0];
            double monto = Double.parseDouble(datos[1]);
            String moneda = datos[2];
            String pais = datos[3];

            System.out.println("Método seleccionado: " + tipo.toUpperCase());
            PaymentProcessor processor = PaymentFactory.getProcessor(tipo);

            if (processor != null) {
                processor.processPayment(monto, moneda, pais);
            } else {
                System.out.println("Método de pago no reconocido.\n");
            }
        }
    }
}