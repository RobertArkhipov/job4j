package ru.job4j.calculate;

/**
 * Task.
 */
public class X2 {

    /**
     * Метод, вычисляющий значение квадратного уравнения.
     * @param a param a.
     * @param b param b.
     * @param c param c.
     * @param x param x.
     * @return вычисленное значение.
     */
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 1;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
    }
}