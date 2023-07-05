

package Utilidades;

import Entidades.Hotel4;
import java.util.Comparator;


public class ComparadorAlojamiento {

    public static Comparator<Hotel4> ordenarPorPrecioDescendente = new Comparator<Hotel4>() {
        @Override
        public int compare(Hotel4 t, Hotel4 t1) {
            return t.getPrecioHabitaciones().compareTo(t1.getPrecioHabitaciones());
        }

    };
}
