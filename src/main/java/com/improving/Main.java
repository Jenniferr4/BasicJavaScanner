package com.improving;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hi There");
        var scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Boolean loop = true;
        while (loop) {

            if (input.equals("hi")) {
                System.out.println("How are you?");
            } else {
                System.out.println("HUH?");
            }
            String response = scanner.nextLine();
            if (response.equals("good")) {
                System.out.println("What's so good about it?");

            } else if (response.equals("bad")) {
                System.out.println("Wanna Taco About it? ");
            }
            var better = scanner.nextLine();
            System.out.println("It'll get better, keep on trying :) \n");

        }
    }
}
