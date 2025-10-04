/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1.interfaces;

/**
 *
 * @author Jesùs
 */
public class Ambulancia implements VehiculoEmergencia {

    @Override
    public void activarSirena() {
        System.out.println("🚑 Sirena de ambulancia activada.");
    }

    @Override
    public void responderEmergencia() {
        System.out.println("Atendiendo emergencia médica.");
    }

    @Override
    public String getTipoVehiculo() {
        return "Ambulancia";
    }
}