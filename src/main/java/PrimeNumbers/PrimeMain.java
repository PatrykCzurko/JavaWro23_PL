package PrimeNumbers;

import java.util.List;

public class PrimeMain {
    public static void main(String[] args) {
        PrimeCalculator primeCalculator = new PrimeCalculator();
        System.out.println(primeCalculator.isPrime(5));
        System.out.println(primeCalculator.isPrime(6));
        List<Integer> list = primeCalculator.getPrimeNumbers(99);
        for (int i:list) {
            System.out.println(i + "  ");
        }
    }
}
