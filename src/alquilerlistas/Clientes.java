/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerlistas;

import java.util.Random;

/**
 *
 * @author andres
 */
public class Clientes {
    private String nombre;
    private String apellidos;
    private String nif;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
    
    private static String nombreAleatorio (){
        String nombre = "";
        
        Random rnd = new Random();
        
        int numeroNombre = rnd.nextInt(9);
        
        switch (numeroNombre) {
            case 0:
                nombre = "Andres";
                break;
            case 1:
                nombre = "Maria";
                break;
            case 2:
                nombre = "Francisco";
                break;
            case 3:
                nombre = "Juan";
                break;
            case 4:
                nombre = "Alberto";
                break;
            case 5:
                nombre = "Diego";
                break;
            case 6:
                nombre = "Rafa";
                break;
            case 7:
                nombre = "Andrea";
                break;
            case 8:
                nombre = "Almudena";
                break;     
        }

        
        return nombre;
    }
    
    private static String apellidoAleatorio() {
        String apellido = "";

        Random rnd = new Random();

        for (int i = 0; i < 2; i++) {
            int numeroApellido = rnd.nextInt(9);

            switch (numeroApellido) {
                case 0:
                    apellido += "Campos ";
                    break;
                case 1:
                    apellido += "Rodriguez ";
                    break;
                case 2:
                    apellido += "Fernandez ";
                    break;
                case 3:
                    apellido += "Macias ";
                    break;
                case 4:
                    apellido += "Perez ";
                    break;
                case 5:
                    apellido += "Barbaran ";
                    break;
                case 6:
                    apellido += "Nieto ";
                    break;
                case 7:
                    apellido += "Marchante ";
                    break;
                case 8:
                    apellido += "Lavado ";
                    break;
            }
        }

        return apellido;
    }
    
    private static String nifAleatorio(){
        String nif = "";
        int numero = 0;
        
        Random rnd = new Random();
        
        for (int i = 0; i < 9; i++) {
            
            if (i < 8) {
               
                nif += rnd.nextInt(10);
                numero += Integer.parseInt(nif);
            } 
            else {
                
                String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
                int numeroLetra = numero % 23;
                
                nif += juegoCaracteres.charAt(numeroLetra);

            }
        }
        
        return nif;
    }
    
    public static Clientes clienteAleatorio(){
        Clientes aux = new Clientes (nombreAleatorio (), apellidoAleatorio(), nifAleatorio());
        
        return aux;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + '}';
    }

    public Clientes(String nombre, String apellidos, String nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }

    
    
}
