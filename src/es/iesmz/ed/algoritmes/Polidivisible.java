/**
 * Esta clase define un atributo para calcular
 * si es divisible por toda su longitud
 * @author: Isaac Abarca Dudlo
 * @version: 01/06/2023/
 */
package es.iesmz.ed.algoritmes;
import java.util.HashSet;
import java.util.Set;

public class Polidivisible {
    private long num;
    public Polidivisible(long num) {this.num = num;}
    public boolean esPolidivisible() {
        String numberString = String.valueOf(num);
        int largoNumeros = numberString.length();

        Set<Integer> numeros = new HashSet<>();
        for (int i = 0; i < largoNumeros; i++) {
            numeros.add(Character.getNumericValue(numberString.charAt(i)));
        }
        if (numeros.size() != largoNumeros) {
            return false;
        }
        long divison = largoNumeros;
        while (num > 0) {
            if (num % divison != 0) {
                return false;
            }
            num /= 10;
            divison--;
        }
        return true;
    }
}
