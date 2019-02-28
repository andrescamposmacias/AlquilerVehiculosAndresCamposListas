/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerlistas;

/**
 *
 * @author andres
 */
public class VehiculosAlquilados {
    private Clientes cliente;
    private Vehiculos vehiculo;
    private int diaAlquiler;
    private int mesAlquiler;
    private int anioAlquiler;
    private int totalDiasAlquiler;

    public VehiculosAlquilados(Clientes cliente, Vehiculos vehiculo, int diaAlquiler, int mesAlquiler, int anioAlquiler, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.anioAlquiler = anioAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }
    
    
    
    
}
