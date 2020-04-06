package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Task.
 */
public class SearchAtt {

    private  static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> func) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att: list) {
            if (func.test(att)) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> func = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                if (attachment.getSize() > 100) {
                    return true;
                }
                return false;
            }
        };
        return filter(list, func);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> func = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                if (attachment.getName().contains("bug")) {
                    return true;
                }
                return false;
            }
        };
        return filter(list, func);
    }


    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 105),
                new Attachment("bug", 34),
                new Attachment("image 3", 13)
        );
        System.out.println(filterSize(attachments).get(0));
        System.out.println(filterName(attachments).get(0));
    }
}