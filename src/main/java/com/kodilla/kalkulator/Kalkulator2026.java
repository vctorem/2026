package com.kodilla.kalkulator;

public class Kalkulator2026 {

    private final double a;
    private final double b;

    public Kalkulator2026(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double dodaj() {
        return a + b;
    }

    public double odejmij() {
        return a - b;
    }

    public double pomnoz() {
        return a * b;
    }

    public double podziel() {
        if (b == 0) {
            throw new ArithmeticException("Nie można dzielić przez zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {

        Kalkulator2026 kalkulator = new Kalkulator2026(10, 2);

        System.out.println("Dodawanie: " + kalkulator.dodaj());
        System.out.println("Odejmowanie: " + kalkulator.odejmij());
        System.out.println("Mnożenie: " + kalkulator.pomnoz());
        System.out.println("Dzielenie: " + kalkulator.podziel());
    }
}
