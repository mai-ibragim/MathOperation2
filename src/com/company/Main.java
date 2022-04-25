package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter three digit number: ");
        int a = sc.nextInt();

        int one = a % 10;
        int two = a / 10 % 10;
        int three = a / 10 / 10;

        System.out.println(three + "," + two + "," + one);
    }
}
