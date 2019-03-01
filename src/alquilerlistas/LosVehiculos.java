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
public class LosVehiculos {
    
    public static void main(String[] args) {
        
        //Creo un objeto de EmpresaAlquiler
        EmpresaAlquiler listaAndres = new EmpresaAlquiler("Domotica", "Andrés", "www.domoticaandres.com");
        
        //relleno las listas con los clientes y los vehiculos
        listaAndres.generacionClientes();
        listaAndres.generacionVehiculos();
        
        
        
    }

}
