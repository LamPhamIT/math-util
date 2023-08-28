package com.shinn.core;

public class MathUtil {

    public static long getFactorial(int number) {
        if (number < 0 || number > 20)
            throw new IllegalArgumentException("N must be between 0 to 20");
        if(number == 0 || number == 1)
            return 1;
        long product = 1;
        for (int i = 2; i <= number; i++)
            product *= i;
        return product;
    }

}
