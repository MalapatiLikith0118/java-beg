package com.javaintro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/banking";
        String username = "root";
        String password = "9441649333";

        try {

            // Connect to MySQL
            Connection con = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            System.out.println("MySQL Connected Successfully!");

            // Get account details
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter account number: ");
            long accountNumber = sc.nextLong();

            // SQL query
            String sql = "INSERT INTO accounts (name, account_number, balance) VALUES (?, ?, ?)";

            // Prepare query
            PreparedStatement ps = con.prepareStatement(sql);

            // Set values
            ps.setString(1, name);
            ps.setLong(2, accountNumber);
            ps.setDouble(3, 0);

            // Execute query
            ps.executeUpdate();

            System.out.println("Account created successfully!");

            // Close connection
            ps.close();
            con.close();
            sc.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}