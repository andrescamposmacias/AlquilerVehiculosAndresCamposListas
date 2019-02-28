/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerlistas;

import java.time.LocalDate;
import java.util.ArrayList;
/* FALTAN LOS MÉTODOS DE ORDENACIÓN POR LA BURBUJA Y LA BÚSQUEDA BINARIA */

/**
 *
 * @author andres
 */
public class EmpresaAlquiler {

    //atributos de la empresa
    private String cif;
    private String nombre;
    private String paginaWeb;

    //atributos para controlar el total de clientes que tiene la
    //empresa y array de almacenamiento para los objetos Clientes
    private int totalClientes;
    private ArrayList <Clientes> clientes;

    //atributos para controlar el total de vehiculos disponibles en
    //alquiler que tiene la empresa y array de almacenamiento para los objetos
    //Vehiculos
    private int totalVehiculos;
    private ArrayList <Vehiculos> vehiculos;

    //atributos para controlar el histórico de alquileres: total de
    //alquileres realizados y array de almacenamiento para los objetos VehiculosAlquilados
    private int totalAlquileres;
    private ArrayList <VehiculosAlquilados> alquileres;

    EmpresaAlquiler(String cif, String nombre, String paginaWeb) {
        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;

        //incialmente no hay clientes creados en la empresa
        this.totalClientes = 0;
        this.clientes = new ArrayList <Clientes>(50); //apuntan a null

        //incialmente no hay vehiculos creados en la empresa
        this.totalVehiculos = 0;
        this.vehiculos = new ArrayList <Vehiculos>(50); //apuntan a null

        //incialmente no hay histórico de alquileres en la empresa
        this.totalAlquileres = 0;
        this.alquileres = new ArrayList <VehiculosAlquilados> (100); //apuntan a null
    }

    //metodo para agregar un nuevo cliente
    public void registrarCliente(Clientes nuevo) {
        //lo guardamos en el array en la posicion de totalClientes que esta
        //inicializada a 0
        this.clientes.add(totalClientes, nuevo);

        //autoincrementamos totalClientes, para que podamos agregar nuevos clientes
        //y no se machaquen 
        this.totalClientes++;
    }

    //metodo para registrar un nuevo vehiculo
    public void registrarVehiculo(Vehiculos nuevo) {
        //guardamos el nuevo cliente en el array en la posicion 0, ya que antes
        //inicializamos la variable totalVehiculos a 0
        this.vehiculos.add(totalClientes, nuevo);

        //lo autoincrementamos para poder registrar nuevos vehiculos y no se machaque
        this.totalVehiculos++;
    }

    //metodo para mostrar por pantalla los clientes
    public void imprimirClientes() {

        System.out.println("NIF cliente\tNombre\n");
        for (int i = 0; i < this.totalClientes; i++) {
            System.out.println(clientes.get(i));
        }
    }

    //metodo para mostrar por pantalla los vehiculos
    public void imprimirVehiculos() {

        System.out.println("Matricula\tModelo\tColor\tImporte\tDisponible\n");

        for (int i = 0; i < this.totalVehiculos; i++) {
            System.out.println(vehiculos.get(i));
        }
    }

    //metodo para buscar un cliente
    private Clientes getCliente(String nif) {
        for (int i = 0; i < this.getTotalClientes(); i++) {
            if (this.clientes.get(i).getNif().equals(nif)) {
                return this.clientes.get(i);
            }
        }
        return null;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    public ArrayList<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }

    public ArrayList<VehiculosAlquilados> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(ArrayList <VehiculosAlquilados> alquileres) {
        this.alquileres = alquileres;
    }

    //metodo para comprobar la disponibilidad de un vehiculo y modificar
    //su disponibilidad si esta disponible
    private Vehiculos getVehiculo(String matricula) {
        
        for (int i = 0; i < this.getTotalVehiculos(); i++) {
            if (this.vehiculos.get(i).getMatricula().equals(matricula)) {
                return this.vehiculos.get(i);
            }
        }
        
        return null;
    }

    public void alquilarVehiculo(String matricula, String nif, int dias) {
        
        Clientes cliente = getCliente(nif);
        Vehiculos vehiculo = getVehiculo(matricula);
        // busca el cliente con el NIF dado en el array
        // clientes y el vehículo con la matrícula dada en el
        // array vehiculos, si el vehículo está disponible se
        // alquila con la fecha actual, que se obtiene
        // ejecutando los métodos diaHoy(), mesHoy() y
        // añoHoy(), cuya declaración no se incluye
        
        if (vehiculo.isDisponibilidad()) {
            vehiculo.setDisponibilidad(false);
            this.alquileres.add(new VehiculosAlquilados(cliente,vehiculo,diaHoy(), mesHoy(), añoHoy(), dias)) ;
            this.totalAlquileres++;
        }
    }
    
    public int diaHoy(){
        
        LocalDate diaHoy = LocalDate.now();        
        return diaHoy.getDayOfMonth();
    }
    
    public int mesHoy(){
        
        LocalDate mesHoy = LocalDate.now();        
        return mesHoy.getMonthValue();
    }
    
    public int añoHoy(){
        
        LocalDate anioHoy = LocalDate.now();        
        return anioHoy.getYear();
    }
  
    public void recibirVehiculo(String matricula) {
        
        // busca el vehículo con la matrícula dada en el
        // array vehiculos y modifica su disponibilidad
        // para que se pueda alquilar de nuevo
        
        Vehiculos vehiculo = getVehiculo(matricula);
        if (vehiculo != null) {
            vehiculo.setDisponibilidad(true);
        }

    }
    
    public ArrayList generacionVehiculos(){
        for (int i = 0; i < 50; i++) {
            this.vehiculos.add(Vehiculos.generarVehiculos());
            this.totalVehiculos++;
        }
        return this.vehiculos;
    }
    
    public ArrayList generacionClientes(){
        for (int i = 0; i < 50; i++) {
            this.clientes.add(Clientes.clienteAleatorio());
            this.totalClientes++;
        }
        return this.clientes;
    }
    
}
