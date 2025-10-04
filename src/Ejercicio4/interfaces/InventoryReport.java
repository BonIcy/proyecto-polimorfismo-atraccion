/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4.interfaces;

/**
 *
 * @author Jesùs
 */
public class InventoryReport extends ReportGenerator {

    @Override
    protected void validateData() {
        System.out.println("Validando niveles de inventario...");
    }

    @Override
    protected void processData() {
        System.out.println("Procesando datos de inventario y detectando alertas...");
    }

    @Override
    protected void formatOutput() {
        System.out.println("Formateando reporte de inventario (tabla + alertas).");
    }
}