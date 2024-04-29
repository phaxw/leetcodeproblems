package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {

        int number = 0;
        int valorAnterior = 0;
        int valorActual = 0;
        int contador = s.length()-1;
        Map<Character, Integer> romans = new HashMap<>();

        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);


        //MCMXCIV
        while (contador >= 0) {
            valorActual = romans.get(s.charAt(contador));

            //primera interacion
            if (contador == s.length()-1)
            {
                valorAnterior = valorActual;
                number = valorActual;
                contador--;
                continue;
            }

            if (valorAnterior > valorActual)
            {
                number -= valorActual;
            }
            else
            {
                number+=valorActual;
            }
            valorAnterior = romans.get(s.charAt(contador));
            contador--;
        }

        return number;

    }
}
