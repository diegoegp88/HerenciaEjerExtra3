
package Entidades;


public class Residencia extends Alojamiento{
    private boolean privado;
    private double metrosCuadrados;
    private int cantidadHabitaciones;
    private boolean descuentos;
    private boolean campoDeportivo;
    private Integer precioHabitaciones;

    public Residencia() {
    }

    public Residencia(boolean privado, double metrosCuadrados, int cantidadHabitaciones, boolean descuentos, boolean campoDeportivo, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentos = descuentos;
        this.campoDeportivo = campoDeportivo;
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

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
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
        String descuentoSioNo="";// Se inicializa para darle letras segun el booleano
        if(descuentos){
            descuentoSioNo= "La residencia cuenta con descuentos a gremios";
        }else{
            descuentoSioNo= "La residencia no cuenta con descuentos a gremios";
        }
        
        String deportivoSioNo="";// Se inicializa para darle letras segun el booleano
        if(descuentos){
            deportivoSioNo= "La residencia cuenta con campo deportivo";
        }else{
            deportivoSioNo= "La residencia no cuenta con campo deportivo";
        }
        return "Hotel **** \n" +
           "// " + nombre + " \\" + "\n" +
           "direccion: " + direccion + "\n" +
           "localidad: " + localidad + "\n" +
           "gerente a cargo: " + gerente + "\n" +
           "La residencia consta de " + metrosCuadrados + "metros cuadrados" + "\n" +
           "Con una cantidad de " + cantidadHabitaciones + " habitaciones" + "\n" +
           descuentoSioNo + "\n" +
           deportivoSioNo + "\n" +
           "El precio es de : $" + precioHabitaciones;
    }
    
}
