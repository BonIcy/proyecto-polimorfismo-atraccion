/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4.interfaces;

/**
 *
 * @author Jesùs
 */
public class FinancialReport extends ReportGenerator {

    @Override
    protected void validateData() {
        System.out.println("Validando datos contables y bancarios...");
    }

    @Override
    protected void processData() {
        System.out.println("Realizando cálculos financieros complejos (balance, flujo de caja)...");
    }

    @Override
    protected void formatOutput() {
        System.out.println("Formateando reporte financiero con tablas y gráficos de resultados.");
    }
}
