package ru.job4j.pseudo;

/**
 * @version $Id$
 * @since 0.1
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        StringBuilder pic = new StringBuilder();
        pic.append("*");
        pic.append(ln);
        pic.append("**");
        pic.append(ln);
        pic.append("***");
        pic.append(ln);
        pic.append("****");
        return pic.toString();
            }
}
