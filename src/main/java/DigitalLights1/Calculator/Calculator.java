package DigitalLights1.Calculator;

public class Calculator {
    public int fib(int num) {
        if (num <= 1)
            return num;
        return fib(num-1) + fib(num-2);
    }
    public long factorial(int num) {
        if (num >= 1)
            return num * factorial(num - 1);
        else
            return 1;
    }
    public int lowestCommonMultiple(int n1, int n2) {
        int lcm = Math.max(n1, n2);

        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0)
                return lcm;
            ++lcm;
        }
    }
    public int greatestCommonDivisor(int n1, int n2) {
        return (n1 * n2) / lowestCommonMultiple(n1, n2);
    }
}