package ru.job4j.io;

import java.util.Scanner;

/**
 * Task.
 */
public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int balance = 11;
        while (run) {
            System.out.print("Первый игрок, введите количество спичек от 1 до 3: ");
            int player = Integer.valueOf(input.nextLine());
            while (player < 1 || player > 3 || player > balance) {
                System.out.print("Введите ещё раз от 1 до 3, но не больше остатка на столе: ");
                player = Integer.valueOf(input.nextLine());
            } balance -= player;
            System.out.println("На столе осталось " + balance + " спичек.");
            System.out.println();
            if (balance == 0) {
                System.out.println("Первый игрок выиграл!");
                break;
            }
            System.out.print("Второй игрок, введите количество спичек от 1 до 3: ");
            player = Integer.valueOf(input.nextLine());
            while (player < 1 || player > 3 || player > balance) {
                System.out.print("Введите ещё раз от 1 до 3, но не больше остатка на столе: ");
                player = Integer.valueOf(input.nextLine());
            } balance -= player;
            System.out.println("На столе осталось " + balance + " спичек.");
            System.out.println();
            if (balance == 0) {
                System.out.println("Второй игрок выиграл!");
                run = false;
            }
        }
    }
}