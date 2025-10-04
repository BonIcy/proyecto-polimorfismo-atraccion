/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1.interfaces;

/**
 *
 * @author Jesùs
 */
public class BomberosVehiculo implements VehiculoEmergencia {

    @Override
    public void activarSirena() {
        System.out.println("🚒 Sirena de bomberos activada.");
    }

    @Override
    public void responderEmergencia() {
        System.out.println("Acudiendo al incendio.");
    }

    @Override
    public String getTipoVehiculo() {
        return "Camión de Bomberos";
    }
}