package ru.job4j.stream;

import org.junit.Test;
import java.util.List;
import java.util.stream.Collectors;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test. Проверяем фильтрацию учеников с помощью лямбда, а также лямбда совместно со Stream API.
 */
public class SchoolTest {

    /**
     * В итоговый список учеников 10А класса должны попасть те, кто набрал больше 70 баллов.
     */
    @Test
    public void whenGrade10A() {
        List<Student> students = List.of(
                new Student(100),
                new Student(25),
                new Student(73),
                new Student(55),
                new Student(2),
                new Student(49)
        );
        List<Student> result = School.collect(students, student -> student.getScore() > 70);
        List<Student> expected = students.stream().filter(
                student -> student.getScore() > 70  && student.getScore() < 101
        ).collect(Collectors.toList());
        assertThat(result, is(expected));
    }

    /**
     * В итоговый список учеников 10Б класса должны попасть те, кто набрал больше 50 баллов, но меньше 71.
     */
    @Test
    public void whenGrade10B() {
        List<Student> students = List.of(
                new Student(100),
                new Student(25),
                new Student(73),
                new Student(55),
                new Student(2),
                new Student(49)
        );
        List<Student> result = School.collect(students, student -> student.getScore() > 50 && student.getScore() < 71);
        List<Student> expected = students.stream().filter(
                student -> student.getScore() > 50 && student.getScore() < 71
        ).collect(Collectors.toList());
        assertThat(result, is(expected));
    }

    /**
     * В итоговый список учеников 10В класса должны попасть те, кто набрал от 0 до 50 баллов(включительно)
     */
    @Test
    public void whenGrade10V() {
        List<Student> students = List.of(
                new Student(100),
                new Student(25),
                new Student(73),
                new Student(55),
                new Student(2),
                new Student(49)
        );
        List<Student> result = School.collect(students, student -> student.getScore() < 51);
        List<Student> expected = students.stream().filter(
                student -> student.getScore() >= 0 && student.getScore() < 51
        ).collect(Collectors.toList());
        assertThat(result, is(expected));
    }
}
