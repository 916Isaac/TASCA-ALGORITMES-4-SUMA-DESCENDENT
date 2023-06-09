
/**
 * Esta clase define un atributo para calcularlo
 * multiplicando cada una de sus cifras
 * @author: Isaac Abarca Dudlo
 * @version: 01/05/2023/
 */
package es.iesmz.ed.algoritmes;

public class SumaDescendent {
    private long numero;

    public SumaDescendent(long numero) {
        this.numero = numero;
    }
    /**
     * Este metodo obtiene la suma de todos los digitos del numero EJ: 31314 = 31314 + 1314 + 314 + 14 + 4 = 32.960
     * */
    public long suma() {
        long resultado = 0;

        String numeros = String.valueOf(numero);

        for (int i = 0; i < numeros.length(); i++) {
            String substring = numeros.substring(i);
            resultado += Long.parseLong(substring);
        }

        return resultado;
    }
}
