
package Entidades;


public class Camping extends Alojamiento{
    private boolean privado;
    private double metrosCuadrados;
    private int capacidadMaxCarpas;
    private int cantiadDeBaños;
    private boolean restaurante;
    private Integer precioHabitaciones;

    public Camping() {
    }

    public Camping(boolean privado, double metrosCuadrados, int capacidadMaxCarpas, int cantiadDeBaños, boolean restaurante, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantiadDeBaños = cantiadDeBaños;
        this.restaurante = restaurante;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(int capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public int getCantiadDeBaños() {
        return cantiadDeBaños;
    }

    public void setCantiadDeBaños(int cantiadDeBaños) {
        this.cantiadDeBaños = cantiadDeBaños;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    public Integer getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Integer precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    @Override
    public void precioHabitacion() {
        this.precioHabitaciones=50;
    }
    
    @Override
    public String toString() {
        String restauranteSioNo="";// Se inicializa para darle letras segun el booleano
        if(restaurante){
            restauranteSioNo= "El camping tiene restaurante en sus instalaciones";
        }else{
            restauranteSioNo= "El camping no tiene restaurante en sus instalaciones";
        }
        return "Hotel **** \n" +
           "// " + nombre + " \\" + "\n" +
           "direccion: " + direccion + "\n" +
           "localidad: " + localidad + "\n" +
           "gerente a cargo: " + gerente + "\n" +
           "El camping consta de " + metrosCuadrados + "metros cuadrados" + "\n" +
           "Con una capacidad maxima de " + capacidadMaxCarpas + "carpas" + "\n" +
           "Tiene " + cantiadDeBaños+ "baños a disposicion" + "\n" +
            restauranteSioNo + "\n" +
           "El precio es de : $" + precioHabitaciones;
    }
}
