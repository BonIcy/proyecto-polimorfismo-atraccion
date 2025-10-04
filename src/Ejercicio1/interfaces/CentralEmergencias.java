/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1.interfaces;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jesùs
 */

public class CentralEmergencias {

    private List<VehiculoEmergencia> vehiculos;

    public CentralEmergencias() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(VehiculoEmergencia vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void despacharVehiculos() {
        System.out.println("\n🚨 Despachando vehículos de emergencia...\n");
        for (VehiculoEmergencia v : vehiculos) {
            System.out.println("Tipo: " + v.getTipoVehiculo());
            v.activarSirena();
            v.responderEmergencia();
            System.out.println("------------------------");
        }
    }
}