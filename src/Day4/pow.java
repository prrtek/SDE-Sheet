package Day4;

public class pow {
    public static double pow(double x, int n) {
    if (n == 0) {
        return 1.0; // Anything raised to the power of 0 is 1
    }
    
    if (n < 0) {
        x = 1 / x; // If n is negative, invert x and make n positive
        n = -n;
    }
    
    return power(x, n);
}

private static double power(double x, int n) {
    if (n == 0) {
        return 1.0; // Base case: x^0 is 1
    }
    
    double half = power(x, n / 2);
    
    if (n % 2 == 0) {
        return half * half; // If n is even, x^n = (x^(n/2)) * (x^(n/2))
    } else {
        return x * half * half; // If n is odd, x^n = x * (x^(n/2)) * (x^(n/2))
    }
}
}
