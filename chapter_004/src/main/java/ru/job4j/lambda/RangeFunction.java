package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Task.
 */
public class RangeFunction {

    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        for (double index = start; index < end; index++) {
            rsl.add(func.apply(index));
        }
        return rsl;
    }
    Function<Double, Double> func = new Function<Double, Double>() {
        @Override
        public Double apply(Double aDouble) {
            return null;
        }
    };
}