package ru.job4j.stream;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class SchoolTest {

    /**
     * Тест-метод сравнивает ответ метода School.collect и ожидаемый результат.
     * В ожидаемый список учеников 10А класса должны попасть те, кто набрал [70: 100] баллов.
     */
    @Test
    public void whenGrade10A() {
        List<Student> students = List.of(
                new Student(100),
                new Student(25),
                new Student(55)
        );
        List<Student> result = School.collect(students, student -> student.getScore() >= 70 && student.getScore() <= 100);
        assertThat(result.get(0).getScore(), is(students.get(0).getScore()));
    }

    /**
     * Тест-метод сравнивает ответ метода School.collect и ожидаемый результат.
     * В ожидаемый список учеников 10Б класса должны попасть те, кто набрал [50: 70) баллов.
     */
    @Test
    public void whenGrade10B() {
        List<Student> students = List.of(
                new Student(100),
                new Student(25),
                new Student(55)
        );
        List<Student> result = School.collect(students, student -> student.getScore() >= 50 && student.getScore() < 70);
        assertThat(result.get(0).getScore(), is(students.get(2).getScore()));
    }

    /**
     * Тест-метод сравнивает ответ метода School.collect и ожидаемый результат.
     * В ожидаемый список учеников 10В класса должны попасть те, кто набрал (0: 50) баллов.
     */
    @Test
    public void whenGrade10V() {
        List<Student> students = List.of(
                new Student(100),
                new Student(25),
                new Student(55)
        );
        List<Student> result = School.collect(students, student -> student.getScore() > 0 && student.getScore() < 50);
        assertThat(result.get(0).getScore(), is(students.get(1).getScore()));
    }
}
