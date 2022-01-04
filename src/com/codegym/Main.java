package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double result = (c-b)/a;
            System.out.printf("Nghiệm là x = %f!\n", result);
        } else {
            if (b==c) {
                System.out.printf("Pt có vô số nghiệm");
            } else {
                System.out.printf("Pt vô nghiệm");
            }
        }
    }
}
