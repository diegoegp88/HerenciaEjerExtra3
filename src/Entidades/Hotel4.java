
package Entidades;


public class Hotel4 extends Alojamiento {
    protected Integer cantidadHabitaciones;
    protected Integer numeroCamas;
    protected Integer cantidadPisos;
    protected Integer precioHabitaciones;
    protected char gimnasioClase;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    public Hotel4() {
    }

    public Hotel4(Integer cantidadHabitaciones, Integer numeroCamas, Integer cantidadPisos, char gimnasioClase, String nombreRestaurante, Integer capacidadRestaurante, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.gimnasioClase = gimnasioClase;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(Integer numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public Integer getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(Integer cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public Integer getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Integer precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    public char getGimnasioClase() {
        return gimnasioClase;
    }

    public void setGimnasioClase(char gimnasioClase) {
        this.gimnasioClase = gimnasioClase;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public void precioHabitacion() {
        Integer capRestaurante=0;
        Integer valorGym=0;
        
        if(capacidadRestaurante<30){
            capRestaurante=10;
        }if(capacidadRestaurante>30 && capacidadRestaurante<=50 ){
            capRestaurante=30;
        }if(capacidadRestaurante>50){
            capRestaurante=50;
        }else{
            System.out.println("Capacidad de restaurante incorrecta");
        }
        
        if(gimnasioClase=='A'){
            valorGym=50;
        }else{
            valorGym=30;
        }
        
        this.precioHabitaciones= 50 +(1*numeroCamas)+ capRestaurante+ valorGym;
        
    }

    @Override
    public String toString() {
        return "Hotel **** \n" +
           "// " + nombre + " \\" + "\n" +
           "direccion: " + direccion + "\n" +
           "localidad: " + localidad + "\n" +
           "gerente a cargo: " + gerente + "\n" +
           "Consta de " + cantidadHabitaciones + " habitaciones disponibles" + "\n" +
           "Es una construccion de " + cantidadPisos + " Pisos" + "\n" +
           "El precio de 1 habitacion es de: $" + precioHabitaciones + "\n" +
           "Su gimnasio es de clase: " + gimnasioClase + "\n" +
           "Consta de un restaurante llamado: " + nombreRestaurante + "\n" +
           "El restaurante tiene una capacidad de " + capacidadRestaurante + " comensales";
    }
    
    
    

}
