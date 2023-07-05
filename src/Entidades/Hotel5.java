
package Entidades;


public class Hotel5 extends Hotel4{
    private int cantidadSalones;
    private int cantidadSuites;
    private int cantidadLimosinas;

    public Hotel5() {
    }

    public Hotel5(int cantidadSalones, int CantidadSuites, int cantidadLimosinas, Integer cantidadHabitaciones, Integer numeroCamas, Integer cantidadPisos, char gimnasioClase, String nombreRestaurante, Integer capacidadRestaurante, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos, gimnasioClase, nombreRestaurante, capacidadRestaurante, nombre, direccion, localidad, gerente);
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuites = CantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public int getCantidadSalones() {
        return cantidadSalones;
    }

    public void setCantidadSalones(int cantidadSalones) {
        this.cantidadSalones = cantidadSalones;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int CantidadSuites) {
        this.cantidadSuites = CantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public void precioHabitacion() {
        super.precioHabitacion();
        this.precioHabitaciones+=(15*cantidadLimosinas);
    }
    
    @Override
    public String toString() {
        return "Hotel ***** \n" +
           "// " + nombre + " \\" + "\n" +
           "direccion: " + direccion + "\n" +
           "localidad: " + localidad + "\n" +
           "gerente a cargo: " + gerente + "\n" +
           "Consta de " + cantidadHabitaciones + "habitaciones disponibles" + "\n" +
           "Es una construccion de " + cantidadPisos + "Pisos" + "\n" +
           "El precio de 1 habitacion es de: $" + precioHabitaciones + "\n" +
           "Su gimnasio es de clase: " + gimnasioClase + "\n" +
           "Consta de un restaurante llamado: " + nombreRestaurante + "\n" +
           "El restaurante tiene una capacidad de " + capacidadRestaurante + " comensales"+ "\n" +
           "La totalidad de sus salones de fiesta es: " + cantidadSalones + "\n" +
           "Consta de " + cantidadSuites + "Suites de lujo" + "\n" +
           "Tambien tiene un servicio de limosinas con: " + cantidadLimosinas + " disponibles";
    }
    
}
