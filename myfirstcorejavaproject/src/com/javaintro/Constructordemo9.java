
package com.javaintro;

import java.util.Scanner;

public class Constructordemo9 {

    String product_Name;
    double price;
    static double totalprice;
    int quantity;

    public Constructordemo9(String product_Name, double price, int quantity) {
        this.product_Name = product_Name;
        this.price = price;
        this.quantity = quantity;
    }

    double caltotal() {
        totalprice = price * quantity;

        if (totalprice > 5000) {
            totalprice = totalprice - (totalprice * 10 / 100);
        }

        return totalprice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double finalbill = 0;

        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter product name:");
            String name = sc.nextLine();

            System.out.println("Enter price of product:");
            double price = sc.nextDouble();

            System.out.println("Enter quantity:");
            int quantity = sc.nextInt();

            sc.nextLine(); 

            Constructordemo9 q1 =
                    new Constructordemo9(name, price, quantity);

            double total = q1.caltotal();

            System.out.println("Total price after discount: " + total);

            finalbill = finalbill + total;
;        }
        

        System.out.println("Final bill amount: " + finalbill);

        sc.close();
    }
}
