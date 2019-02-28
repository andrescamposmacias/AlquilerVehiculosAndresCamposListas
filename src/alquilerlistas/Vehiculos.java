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
public class Vehiculos {
    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private double tarifa;
    private boolean disponibilidad;
    
    private static String modeloSegunMarca;
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    private static String matriculaAleatoria(){
        String Matricula = "";
        
        Random rnd = new Random();
        
        for (int i = 0; i < 7; i++) {
            
            if (i < 4) {
               
                Matricula += rnd.nextInt(10);
            } 
            else {
                
                Matricula += (char) (rnd.nextInt(90-65+1) + 65);
            }
        }
        
        return Matricula;
    }
    
    private static String marcaAleatoria(){
        String marca = "";
        
        Random rnd = new Random();
        
        int numeroMarca = rnd.nextInt(9);
        
        switch (numeroMarca) {
            case 0:
                marca = "Audi";
                break;
            case 1:
                marca = "BMW";
                break;
            case 2:
                marca = "Bugatti";
                break;
            case 3:
                marca = "Fiat";
                break;
            case 4:
                marca = "Ferrari";
                break;
            case 5:
                marca = "Ford";
                break;
            case 6:
                marca = "Honda";
                break;
            case 7:
                marca = "Mazda";
                break;
            case 8:
                marca = "Lexus";
                break;     
        }
        
        modeloSegunMarca = marca;
        
        return marca;
    }
    
    private static String modeloAleatoria(){
       String modelo = "";
        
        Random rnd = new Random(); 
        
        int numeroModelo = rnd.nextInt(5);
        
        switch (modeloSegunMarca) {
            case "Audi":
                switch (numeroModelo) {
                    case 0:
                        modelo = "A3";
                        break;
                    case 1:
                        modelo = "A8";
                        break;
                    case 2:
                        modelo = "Q3";
                        break;
                    case 3:
                        modelo = "TT";
                        break;
                    case 4:
                        modelo = "R8";
                        break;
                }
                break;
            case "BMW":
                switch (numeroModelo) {
                    case 0:
                        modelo = "Coupé";
                        break;
                    case 1:
                        modelo = "Cabrio";
                        break;
                    case 2:
                        modelo = "Touring";
                        break;
                    case 3:
                        modelo = "Berlina";
                        break;
                    case 4:
                        modelo = "X3";
                        break;
                }
                break;
            case "Bugatti":
                switch (numeroModelo) {
                    case 0:
                        modelo = "Divo";
                        break;
                    case 1:
                        modelo = "Chiron";
                        break;
                    case 2:
                        modelo = "Veyron";
                        break;
                    case 3:
                        modelo = "Type 54";
                        break;
                    case 4:
                        modelo = "Type 51";
                        break;
                }
                break;
            case "Fiat":
                switch (numeroModelo) {
                    case 0:
                        modelo = "500";
                        break;
                    case 1:
                        modelo = "Panda";
                        break;
                    case 2:
                        modelo = "Punto";
                        break;
                    case 3:
                        modelo = "Fullback";
                        break;
                    case 4:
                        modelo = "124 Spider";
                        break;
                }
                break;
            case "Ferrari":
                switch (numeroModelo) {
                    case 0:
                        modelo = "488";
                        break;
                    case 1:
                        modelo = "Portofino";
                        break;
                    case 2:
                        modelo = "812 Superfast";
                        break;
                    case 3:
                        modelo = "GTC4Lusso";
                        break;
                    case 4:
                        modelo = "LaFerrari";
                        break;
                }
                break;
            case "Ford":
                switch (numeroModelo) {
                    case 0:
                        modelo = "GT";
                        break;
                    case 1:
                        modelo = "Mondeo";
                        break;
                    case 2:
                        modelo = "Mustang";
                        break;
                    case 3:
                        modelo = "Focus";
                        break;
                    case 4:
                        modelo = "Kuga";
                        break;
                }
                break;
            case "Honda":
                switch (numeroModelo) {
                    case 0:
                        modelo = "Civic";
                        break;
                    case 1:
                        modelo = "Jazz";
                        break;
                    case 2:
                        modelo = "CR-V";
                        break;
                    case 3:
                        modelo = "HR-V";
                        break;
                    case 4:
                        modelo = "NSX";
                        break;
                }
                break;
            case "Mazda":
                switch (numeroModelo) {
                    case 0:
                        modelo = "2";
                        break;
                    case 1:
                        modelo = "3";
                        break;
                    case 2:
                        modelo = "6";
                        break;
                    case 3:
                        modelo = "MX-5";
                        break;
                    case 4:
                        modelo = "CX-5";
                        break;
                }
                break;
            case "Lexus":
                switch (numeroModelo) {
                    case 0:
                        modelo = "CT 200h";
                        break;
                    case 1:
                        modelo = "IS";
                        break;
                    case 2:
                        modelo = "GS";
                        break;
                    case 3:
                        modelo = "ES";
                        break;
                    case 4:
                        modelo = "RX";
                        break;
                }
                break;     
        }
        
        
        return modelo;
    }
    
    private static String colorAleatoria(){
        String color = "";
        
        Random rnd = new Random();
        
        int numeroColor = rnd.nextInt(9);
        
        switch (numeroColor) {
            case 0:
                color = "Blanco";
                break;
            case 1:
                color = "Negro";
                break;
            case 2:
                color = "Azul";
                break;
            case 3:
                color = "Amarrillo";
                break;
            case 4:
                color = "Morado";
                break;
            case 5:
                color = "Naranja";
                break;
            case 6:
                color = "Verde";
                break;
            case 7:
                color = "Rojo";
                break;
            case 8:
                color = "Cian";
                break;     
        }
        
        
        return color;
    }
    
    private static double tarifaAleatoria(){
        double tarifa;
        
        Random rnd = new Random();
        
        tarifa =rnd.nextInt(150-100+1) + 100;
        
        return tarifa;
    }
    
    private static boolean disponibilidadAleatoria(){
        boolean disponibilidad;
        
        Random rnd = new Random();
        
        if (rnd.nextBoolean()){
            disponibilidad = true;
        }else{
            disponibilidad = false;
        }
        
        return disponibilidad;
    }
    
    public static Vehiculos generarVehiculos(){
        Vehiculos vehiculosAleatorios = new Vehiculos (matriculaAleatoria(), marcaAleatoria(), modeloAleatoria(), colorAleatoria(), tarifaAleatoria(), disponibilidadAleatoria());
        
        return vehiculosAleatorios;
    }

    public Vehiculos(String matricula, String marca, String modelo, String color, double tarifa, boolean disponibilidad) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;        
        this.tarifa = tarifa;
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", matricula=" + matricula + ", tarifa=" + tarifa + ", disponibilidad=" + disponibilidad + '}';
    }
    
    
    
}
