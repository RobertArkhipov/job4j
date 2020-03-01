package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book first = new Book("Clean code", 1000);
        Book second = new Book("Head First Java", 688);
        Book third = new Book("Java 8. The Complete Reference", 1377);
        Book fourth = new Book("Thinking in Java", 1150);

        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }

        System.out.println("Rearrange the book with index 0 and 3");
        books[0] = fourth;
        books[3] = first;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }

        System.out.println("We display books with the name: Clean code");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getPage());
            }
        }
    }
}