package main.function;

import java.lang.*;
import java.math.*;

public class TaylorCos {
    public static final double ep = 1E-9;
    private static BigInteger factorial(int n)
    {
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    public static double cos(double x) {
        double curr = 1;
        double result = 0.0;
        int n = 1;
        while (Math.abs(curr) >= ep/10) {
                result += curr;
                curr = (Math.pow(-1, n)*Math.pow(x,2*n))/Double.parseDouble(factorial(2*n).toString());
                n++;
        }
        return result;
    }
}
