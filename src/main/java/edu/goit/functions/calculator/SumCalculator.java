package edu.goit.functions.calculator;

public class SumCalculator {

    public int sum(int n) throws IllegalAccessException {
        if (n == 1 ) return 1;
        if (n == 0) throw new IllegalAccessException();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum +=i;
        }

        return sum;
    }

}
