package ru.job4j.condition;

/**
 * Программа для определения расстояния между точками в системе координат.
 */
public class Point {

	/**
	 * Расстояние между точками в системе координат.
	 * @param x1 Координаты первой точки по оси x.
	 * @param y1 Координаты первой точки по оси y.
	 * @param x2 Координаты второй точки по оси x.
	 * @param y2 Координаты второй точки по оси y.
	 * @return Расстояние.
	 */
	public double distance(int x1, int y1, int x2, int y2) {
		double first = Math.pow(x2 - x1, 2);
		double second = Math.pow(y2 - y1, 2);
		return Math.sqrt(first + second);
	}
}