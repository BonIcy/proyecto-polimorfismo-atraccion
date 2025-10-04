/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4.interfaces;

/**
 *
 * @author Jesùs
 */
public class SalesReport extends ReportGenerator {

    @Override
    protected void validateData() {
        System.out.println("Validando datos de ventas...");
    }

    @Override
    protected void processData() {
        System.out.println("Procesando datos y generando gráficos de ventas...");
    }

    @Override
    protected void formatOutput() {
        System.out.println("Formateando reporte de ventas (tablas + gráficos).");
    }
}