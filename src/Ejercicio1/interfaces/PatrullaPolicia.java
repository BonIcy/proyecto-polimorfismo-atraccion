/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1.interfaces;

/**
 *
 * @author Jesùs
 */
public class PatrullaPolicia implements VehiculoEmergencia {

    @Override
    public void activarSirena() {
        System.out.println("🚓 Sirena policial activada.");
    }

    @Override
    public void responderEmergencia() {
        System.out.println("Acudiendo a la situación reportada.");
    }

    @Override
    public String getTipoVehiculo() {
        return "Patrulla de Policía";
    }
}      