package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Программа для определения расстояния между точками в системе координат.
 */
public class Point {
	private int x;
	private int y;
	private int z;

	/**
	 * Конструтор, который принимает начальное состояние объекта "точка" в двумерном пространстве.
	 * @param first координата x.
	 * @param second координата y.
	 */
	public Point(int first, int second) {
		this.x = first;
		this.y = second;
	}

	/**
	 * Конструтор, который принимает начальное состояние объекта "точка" в трёхмерном пространстве.
	 * @param x координата x.
	 * @param y координата y.
	 * @param z координата z.
	 */
 	public Point(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
 }
	/**
	 * Расстояние между точками в системе координат в двумерном пространстве.
	 * @param that координаты второй точки.
	 * @return расстояние.
	 */
	public double distance(Point that) {
		return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
	}

	/**
	 * Расстояние между точками в системе координат в трёхмерном пространстве.
	 * @param that координаты второй точки.
	 * @return расстояние.
	 */
	public double distance3d(Point that) {
		return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
	}

	public void info() {
		System.out.println(String.format("Point[%s, %s]", this.x, this.y));
	}

	public void info3d() {
		System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
	}
}