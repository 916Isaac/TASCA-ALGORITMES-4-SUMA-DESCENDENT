/**
 * Esta clase define un atributo para un vector
 * y intentar que todos los cables conecten mediante un metodo
 * @author: Isaac Abarca Dudlo
 * @version: 01/06/2023/
 */
package es.iesmz.ed.algoritmes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cablejat {
    private String[] conector;

    public Cablejat(String[] conectores) {
        this.conector = conectores;
    }
    /**
     * Este metodo se encarga de ver si se pueden conectar todos los conectores
     * */
    public boolean esPotConnectar() {
        List<String> availableConnectors = new ArrayList<>();
        availableConnectors.addAll(Arrays.asList(conector));

        return connectCables(availableConnectors, availableConnectors.get(0), 1);
    }
    /**
     * Metodo para ver si es posible conectar los cables de una lista de conectores en un orden determinado
     * */
    private boolean connectCables(List<String> conectoresValidos, String conectorActual, int cont) {
        if (cont == conector.length) {
            return canConnect(conectorActual, conectoresValidos.get(0));
        }

        for (int i = 1; i < conectoresValidos.size(); i++) {
            String siguienteConector = conectoresValidos.get(i);
            if (canConnect(conectorActual, siguienteConector)) {
                conectoresValidos.remove(i);
                if (connectCables(conectoresValidos, siguienteConector, cont + 1)) {
                    return true;
                }
                conectoresValidos.add(i, siguienteConector);
            }
        }

        return false;
    }
    /**
     *metodo que devuelve el boolean para verificar si han conectado
     **/
    private boolean canConnect(String con1, String con2) {
        char resultado1 = con1.charAt(1);
        char resultado2 = con2.charAt(0);
        return resultado1 != resultado2;
    }
}
