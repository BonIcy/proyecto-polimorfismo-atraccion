/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4.main;
import Ejercicio4.interfaces.*;
/**
 *
 * @author Jesùs
 */
public class main {

    public static void main(String[] args) {
        // Crear diferentes configuraciones
        ReportConfig salesConfig = new ReportConfig("Reporte de Ventas", "PDF", true);
        ReportConfig inventoryConfig = new ReportConfig("Reporte de Inventario", "EXCEL", false);
        ReportConfig financialConfig = new ReportConfig("Reporte Financiero", "CSV", true);
        ReportConfig employeeConfig = new ReportConfig("Reporte de Empleados", "PDF", false);

        // Crear los diferentes reportes
        ReportGenerator salesReport = new SalesReport();
        ReportGenerator inventoryReport = new InventoryReport();
        ReportGenerator financialReport = new FinancialReport();
        ReportGenerator employeeReport = new EmployeeReport();

        // Ejecutar generación (usa Template Method)
        salesReport.generateReport(salesConfig);
        inventoryReport.generateReport(inventoryConfig);
        financialReport.generateReport(financialConfig);
        employeeReport.generateReport(employeeConfig);
    }
}