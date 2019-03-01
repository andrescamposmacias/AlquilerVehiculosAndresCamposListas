/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerlistas;

import java.util.Scanner;

/**
 *
 * @author andres
 */
public class LosVehiculos {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        String nif, matricula;
        int alquiler;
        
        //Creo un objeto de EmpresaAlquiler
        EmpresaAlquiler listaAndres = new EmpresaAlquiler("Domotica", "Andrés", "www.domoticaandres.com");
        
        //relleno las listas con los clientes y los vehiculos
        listaAndres.generacionClientes();
        listaAndres.generacionVehiculos();
        
        //muestro los 25 clientes y los 25 vehiculos
        listaAndres.imprimirClientes();
        listaAndres.imprimirVehiculos();
        
        //pedimos el NIF al usuario
        System.out.println("Introduce su NIF");
        nif = teclado.nextLine();
        
        teclado.nextLine();//Limpiamos buffer
        
        //pedimos la matricula
        System.out.println("Introduce la matricula del vehiculo");
        matricula = teclado.nextLine();
        
        teclado.nextLine();//Limpiamos buffer
        
        //y por ultimo pedimos el numero de dia de alquiler
        System.out.println("Introduce el número de dias de alquiler");
        alquiler = teclado.nextInt();
        
        //ahora usamos el metododo alquilerVehiculo, que pasandole la matricula, el nif y los dias
        //el cliente alquilara el vehiculo que pide el numero de dias que quiere si el vehiculo no esta
        //alquilado
        listaAndres.alquilarVehiculo(matricula, nif, alquiler);
        
        //ordenos los clientes segun su nif
        listaAndres.ordenarCarteraClientes();
    }

}
