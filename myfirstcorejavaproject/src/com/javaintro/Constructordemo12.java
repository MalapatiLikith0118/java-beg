
package com.javaintro;

import java.util.Scanner;

public class Constructordemo12 {

    String name;
    int age;

    // Parameterized constructor
    Constructordemo12(String sname, int sage) {
        name = sname;
        age = sage;
    }

    void show() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter age:");
        int age = sc.nextInt();

        Constructordemo12 q1 = new Constructordemo12(name, age);

        q1.show();

        sc.close();
    }
}
