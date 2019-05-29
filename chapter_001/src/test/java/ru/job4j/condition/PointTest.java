package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    /**
     * Тест сравнивает расстояние между точками в двумерном пространстве, и ожидаемое значение.
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        double result = first.distance(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }

    /**
     * Тест сравнивает расстояние между точками в трёхмерном пространстве, и ожидаемое значение.
     */
    @Test
    public void whenZeroTenAndZeroThenTen() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(0, 10, 0);
        double result = first.distance3d(second);
        first.info3d();
        second.info3d();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }

    /**
     * Тест, который рассчитывает расстояние до себя в двумерном пространстве.
     */
    @Test
    public void whenCheckItself() {
        Point point = new Point(0, 0);
        double result = point.distance(point);
        assertThat(result, is(0D));
    }

    /**
     * Тест, который рассчитывает расстояние до себя в трёхмерном пространстве.
     */
    @Test
    public void whenCheckItself3d() {
        Point point = new Point(0, 0, 0);
        double result = point.distance3d(point);
        assertThat(result, is(0D));
    }

    /**
     * Тест для просмотра вывода состояния объекта в двумерном пространстве.
     */
    @Test
    public void whenShowInfo() {
        Point first = new Point(1, 1);
        first.info3d();
        Point second = new Point(2, 2);
        second.info();
    }

    /**
     * Тест для просмотра вывода состояния объекта в трёхмерном пространстве.
     */
    @Test
    public void whenShowInfo3d() {
        Point first = new Point(1, 1, 0);
        first.info3d();
        Point second = new Point(2, 2, 3);
        second.info3d();
    }
}