/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1.main;

import Ejercicio1.interfaces.Ambulancia;
import Ejercicio1.interfaces.BomberosVehiculo;
import Ejercicio1.interfaces.CentralEmergencias;
import Ejercicio1.interfaces.PatrullaPolicia;
import Ejercicio1.interfaces.VehiculoEmergencia;

/**
 * @author Jesùs
 */
public class main {

    public static void main(String[] args) {

        VehiculoEmergencia ambulancia = new Ambulancia();
        VehiculoEmergencia bomberos = new BomberosVehiculo();
        VehiculoEmergencia patrulla = new PatrullaPolicia();

        CentralEmergencias central = new CentralEmergencias();
        central.agregarVehiculo(ambulancia);
        central.agregarVehiculo(bomberos);
        central.agregarVehiculo(patrulla);

        System.out.println("Iniciando despacho de vehículos...");
        central.despacharVehiculos();
    }
}