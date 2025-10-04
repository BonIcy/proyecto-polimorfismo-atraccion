/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4.interfaces;

/**
 *
 * @author Jesùs
 */
public class EmployeeReport extends ReportGenerator {

    @Override
    protected void validateData() {
        System.out.println("Validando datos de empleados (asistencia, salarios, desempeño)...");
    }

    @Override
    protected void processData() {
        System.out.println("Procesando información del personal...");
    }

    @Override
    protected void formatOutput() {
        System.out.println("Formateando reporte de empleados (listas y métricas de desempeño).");
    }
}