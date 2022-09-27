package com.company;

import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String user_input;

        // input collection
        System.out.println("Enter a string of exactly 5 characters");
        user_input = s.nextLine();

        // input validation
        while (user_input.length() != 5) {
            System.out.println("Please read directions and try again!");
            System.out.println("Enter a string of exactly 5 characters");
            user_input = s.nextLine();
        }

        // random seed collection
        System.out.println("Enter the seed value");
        int seed_input = Integer.parseInt(s.nextLine());

        // generates random number between 0-25 inclusive
        Random random = new Random(seed_input);
        int rand = 0;
        while (true) {
            rand = random.nextInt(26);
            if (rand !=0) break;
        }

        // Converts user input into char array
        char[] ch = new char[5];
        for (int i = 0; i < 5; ++i) {
            ch[i] = user_input.charAt(i);
        }

        // Encodes cipher
        for (int i = 0; i < 5; ++i) {
            char c =  (char) (ch[i] + rand);
            ch[i] = c;
        }

        // Display cipher;
        System.out.println();
        System.out.println(ch);
    }
}
