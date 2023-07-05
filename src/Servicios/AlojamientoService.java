
package Servicios;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel4;
import Entidades.Hotel5;
import Entidades.Residencia;
import Utilidades.ComparadorAlojamiento;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class AlojamientoService {
    ArrayList<Alojamiento> alojamientos = new ArrayList();
    private Scanner leer = new Scanner(System.in);
    
    public void inicio(){
        System.out.println("Bienvenidos a la agencia de turismo");
        System.out.println();
        menuPrincipal();
    }
    
    public void menuPrincipal(){
        System.out.println();
        System.out.println("1 - Dar de alta alojamientos");
        System.out.println("2 - dar de baja alojamientos");
        System.out.println("3 - mostar todos los alojamientos");
        System.out.println("4 - Ver los hoteles de mayor precio a menor precio");
        System.out.println("5 - Ver los camping con restaurante");
        System.out.println("6 - Ver las residencias con descuentos");
        System.out.println("7- Salir");
        System.out.println();
        
        opcionesPrincipales(leer.nextInt());
    }
    
    public void opcionesPrincipales(int opcion){
        switch(opcion){
            case 1:
                menuCrear();
                break;
            case 2:
                eliminarAlojamiento();
                break;
            case 3:
                mostrarAlojamientos();
                break;
            case 4:
                mostrarHoteles();
                break;
            case 5:
                mostrarCamping();
                break;
            case 6:
                mostrarResidencia();
                break;
            case 7:
                System.out.println("El programa Terminara");
                break;
            default:
                System.out.println("Ingrese una opcion correcta");
                System.out.println();
                menuPrincipal();
        }
    }
    
    public void menuCrear(){
        System.out.println();
        System.out.println("Bienvenido al menu para dar de alta alojamientos");
        System.out.println();
        System.out.println("1 - Dar de alta un Hotel **** ");
        System.out.println("2 - Dar de alta un Hotel ***** ");
        System.out.println("3 - Dar de alta un Camping");
        System.out.println("4 - Dar de alta una Residencia");
        System.out.println("5 - Volver al menu principal");
        System.out.println();
        
        int opcion=leer.nextInt();
        leer.nextLine();
        opcionesCrear(opcion);
    }
    
    public void opcionesCrear(int opcion){
        switch(opcion){
            case 1:
                crearAlojamiento(1);
                break;
            case 2:
                crearAlojamiento(2);
                break;
            case 3:
                crearAlojamiento(3);
                break;
            case 4:
                crearAlojamiento(4);
                break;
            case 5:
                menuPrincipal();
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                System.out.println();
                menuCrear();
    }
}
    
    public void crearAlojamiento(int tipo) {
        Alojamiento aux = null; // se inicializa nula para evitar errores
        
        //Datos comunes de todos los alojamientos
        System.out.println();
        System.out.println("Para comenzar con el alta vamos a completar unos datos requeridos");
        System.out.println();
        System.out.println("Ingrese el nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrse la direccion");
        String direccion = leer.nextLine();
        System.out.println("Ingrese la locaclidad donde esta situado");
        String localidad = leer.nextLine();
        System.out.println("Ingrese el nombre del gerente a cargo");
        String gerente = leer.nextLine();

        if (tipo < 3) {// Datos del tipo Hotel
            System.out.println("Ingrese la cantidad de habitaciones");
            Integer cantidadHabitaciones = leer.nextInt();
            leer.nextLine(); //consume el buffer
            System.out.println("Ingrese el numeros de camas total");
            Integer numeroCamas = leer.nextInt();
            leer.nextLine(); //consume el buffer
            System.out.println("Ingrese la cantidad de pisos");
            Integer cantidadPisos = leer.nextInt();
            leer.nextLine(); //consume el buffer
            System.out.println("Ingrese el tipo de gimnasio - A / B");
            char gimnasioClase = Character.toUpperCase(leer.nextLine().charAt(0));//se guarda en mayus
            //If para confirmar clase de gym
            if (gimnasioClase != 'A' && gimnasioClase != 'B') {
                gimnasioClase = 'B';
            }
            
            System.out.println("Ingrese el nombre del Restaurante");
            String nombreRestaurante = leer.nextLine();
            System.out.println("Ingrese la capacidad del Restaurante");
            Integer capacidadRestaurante = leer.nextInt();
            leer.nextLine(); //consume el buffer

            if (tipo == 1) {// Se crear el Hotel 4 estrellas
                aux = new Hotel4(cantidadHabitaciones, numeroCamas, cantidadPisos, gimnasioClase, nombreRestaurante, capacidadRestaurante, nombre, direccion, localidad, gerente);
            
            } else if (tipo == 2) {//Datos adicionales para el Hotel 5 Estrellas
                System.out.println("Ingrese la cantidad de salones");
                int cantidadSalones = leer.nextInt();
                leer.nextLine(); //consume el buffer
                System.out.println("Ingrese la cantidad de Suites");
                int CantidadSuites = leer.nextInt();
                leer.nextLine(); //consume el buffer
                System.out.println("Ingrese las limosinas disponibles");
                int cantidadLimosinas = leer.nextInt();
                leer.nextLine(); //consume el buffer
                // se crea un hotel 5 estrellas
                aux = new Hotel5(cantidadSalones, CantidadSuites, cantidadLimosinas, cantidadHabitaciones, numeroCamas, cantidadPisos, gimnasioClase, nombreRestaurante, capacidadRestaurante, nombre, direccion, localidad, gerente);
            }

        }else if (tipo == 3) {// Datos adicionales para el tipo camping
            System.out.println("El camping es privado? Si/No");
            boolean privado = false;//Se inicializa como falso
            //If para verdadero si es privado el camping
            if (leer.nextLine().toUpperCase().equals("SI")) {
                privado = true;
            }

            System.out.println("Ingrese los metros cuadrados del camping");
            double metrosCuadrados = leer.nextDouble();
            leer.nextLine(); //consume el buffer
            System.out.println("Ingrese la capacidad maxima de carpas");
            int capacidadMaxCarpas = leer.nextInt();
            leer.nextLine(); //consume el buffer
            System.out.println("Ingrese la cantidad de baños");
            int cantiadDeBaños = leer.nextInt();
            leer.nextLine(); //consume el buffer

            System.out.println("El camping tiene restaurante? Si/No");
            boolean restaurante = false;// se inicializa como falso
            // if para verdadero si tiene restaurante
            if (leer.nextLine().toUpperCase().equals("SI")) {
                restaurante = true;
            }
            // Se crea un camping
            aux = new Camping(privado, metrosCuadrados, capacidadMaxCarpas, cantiadDeBaños, restaurante, nombre, direccion, localidad, gerente);
        
        }else  if (tipo == 4) {//Datos adicionales para el tipo Residencia
            System.out.println("El camping es privado? Si/No");
            boolean privado = false;//Se inicializa como falso
            if (leer.nextLine().toUpperCase().equals("SI")) {
                privado = true;
            }

            System.out.println("Ingrese los metros cuadrados del camping");
            double metrosCuadrados = leer.nextDouble();
            leer.nextLine(); //consume el buffer
            System.out.println("Ingrese la cantidad de habitaciones");
            int cantidadHabitaciones = leer.nextInt();
            leer.nextLine(); //consume el buffer

            System.out.println("La residencia ofrece descuentos a gremios? Si/No");
            boolean descuento = false;// se inicializa como falso
            if (leer.nextLine().toUpperCase().equals("SI")) {
                descuento = true;
            }

            System.out.println("La residencia cuenta con campo deportivo? Si/No");
            boolean campoDeportivo = false;// se inicializa como falso
            if (leer.nextLine().toUpperCase().equals("SI")) {
                campoDeportivo = true;
            }
            //Se crea una residencia
            aux = new Residencia(privado, metrosCuadrados, cantidadHabitaciones, descuento, campoDeportivo, nombre, direccion, localidad, gerente);
        }
        
        aux.precioHabitacion();// se encarga de calcular el precio antes de guardar en la lista
        
        alojamientos.add(aux);//Se añade a la lista de alojamientos
        
        menuPrincipal();// Retornamos al menu principal
    }
    
    public void eliminarAlojamiento(){
        System.out.println("Ingrese el nombre del alojamiento que desea eliminar");
        String nombre=leer.nextLine();
        Alojamiento aux=null;
        
        for (Alojamiento alojamiento : alojamientos) {
            if(nombre.equals(alojamiento.getNombre())){
                aux=alojamiento;
            }
        }
        alojamientos.remove(aux);
        menuPrincipal();
    }
    
    public void mostrarAlojamientos(){
        System.out.println("La lista de alojamientos es la siguiente");
        System.out.println();
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamientos.toString());
        }
        
        menuPrincipal();
    }
    
    public void mostrarHoteles(){
        ArrayList<Hotel4> aux = new ArrayList();// array para guardar los hoteles filtrados
       
        System.out.println("La lista de hoteles de mayor a menor precio es la siguiente");
        System.out.println();
        for (Alojamiento alojamiento : alojamientos) {// filtramos los hoteles de la lista
            if(alojamiento instanceof Hotel4){
                aux.add((Hotel4)alojamiento);
            }
        }
        // ordenamos con comparadores
        Collections.sort(aux, ComparadorAlojamiento.ordenarPorPrecioDescendente);
        
        for (Hotel4 hotel : aux) {//Mostramso los hoteles en orden
        
            System.out.println(hotel.toString());
    }
        menuPrincipal();
    }
    
    public void mostrarCamping() {

        ArrayList<Camping> aux = new ArrayList();// array para guardar los camping filtrados

        System.out.println("La lista de camping con restaurantes es la siguiente");
        System.out.println();
        for (Alojamiento alojamiento : alojamientos) {// filtramos los camping de la lista
            if (alojamiento instanceof Camping) {
                aux.add((Camping) alojamiento);
            }
        }

        for (Camping camping : aux) {//Mostramso los camping con restaurantes

            if(camping.isRestaurante()){
                System.out.println(camping.toString());
            }
        }
        menuPrincipal();
    }
    
    public void mostrarResidencia() {

        ArrayList<Residencia> aux = new ArrayList();// array para guardar las residencias filtrados

        System.out.println("La lista de residencias con descuentos es la siguiente");
        System.out.println();
        for (Alojamiento alojamiento : alojamientos) {// filtramos las residencias de la lista
            if (alojamiento instanceof Residencia) {
                aux.add((Residencia) alojamiento);
            }
        }

        for (Residencia residencia : aux) {//Mostramso los camping con restaurantes

            if(residencia.isDescuentos()){
                System.out.println(residencia.toString());
            }
        }
        menuPrincipal();
    }

}