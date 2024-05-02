package medium;

import java.math.BigInteger;

public class ReverseInteger {

    public int reverse(int x) {

        boolean bandera = false;
        Long theLong = 0L;

        if (x < 0) {
            theLong = (long)x * -1;
            bandera = true;
        }
        else {
            theLong = (long)x;
        }

        String numeros = String.valueOf(theLong);
        StringBuilder builder = new StringBuilder();


        for (int i = numeros.length()-1; i >= 0; i--) {
            builder.append(numeros.charAt(i));
        }

        theLong = Long.valueOf(builder.toString());

        if ( theLong.compareTo((long)Integer.MAX_VALUE) > 0 ) {
            return 0;
        }

        return bandera ? theLong.intValue()*-1 : theLong.intValue() ;
    }


}
