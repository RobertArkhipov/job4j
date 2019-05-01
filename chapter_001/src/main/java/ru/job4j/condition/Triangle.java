package ru.job4j.condition;

/**
 * Программа для вычисления площади треугольника.
 */
public class Triangle {

    /**
     * Метод вычисляет полупериметр треугольника по длинам сторон.
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return полупериметр.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод вычисляет прощадь треуголька.
     * @param x1 координаты первой вершины по оси x.
     * @param y1 координаты первой вершины по оси y.
     * @param x2 координаты второй вершины по оси x.
     * @param y2 координаты второй вершины по оси y.
     * @param x3 координаты третьей вершины по оси x.
     * @param y3 координаты третьей вершины по оси y.
     * @return возвращает прощадь, если треугольник существует или -1.
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x2, y2, x3, y3);
        double c = new Point().distance(x1, y1, x3, y3);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return true, если треугольник существует.
     */
    private boolean exist(double a, double c, double b) {
        return ((a + b) > c) & ((b + c) > a) & ((a + c) > b);
    }
}