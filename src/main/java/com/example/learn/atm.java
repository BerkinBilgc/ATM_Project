package com.example.learn;

import static com.example.learn.operation.DosyayaEkle;
import static com.example.learn.methods.balancop;
import static com.example.learn.methods.withdraws;
import static com.example.learn.methods.transferss;
import static com.example.learn.methods.EFT;
import java.io.*;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1000;
        int select;
        while (right > 0) {
            System.out.println("Your Username: ");
            userName = input.nextLine();
            System.out.println("Your Password: ");
            password = input.nextLine();
            if (userName.equals("admin@gmail.com") && password.equals("root")) {
                System.out.println("Hello, Welcome...");
                do {
                    System.out.println("Automated Teller Machine");
                    System.out.println("Choose 0 for Control Your Budget");
                    System.out.println("Choose 1 for Deposit");
                    System.out.println("Choose 2 for Withdrawn");
                    System.out.println("Choose 3 for Transfer");
                    System.out.println("Choose 4 for EFT");
                    System.out.println("Choose 5 for Sending Email");
                    System.out.println("Choose 6 for EXIT");
                    System.out.print("Choose the operation you want to perform:");
                    select = input.nextInt();
                    if (balance <= 0){
                        System.out.println("Your balance is 0 TL. You need to deposit money! ");
                        balance = balancop(balance);
                    }else {
                        switch (select) {
                            case 0:
                                System.out.println("Balance : " + balance);
                                System.out.println("");
                                DosyayaEkle(" Control Budget Process\n");
                                break;
                            case 1:
                                balance = balancop(balance);
                                break;
                            case 2:
                                balance = withdraws(balance);
                                break;
                            case 3:
                                balance = transferss(balance);
                                break;

                            case 4:
                                balance = EFT(balance);
                                break;
                            case 5:
                                System.out.println("An instruction has been sent to your e-mail. Please check your email!");
                                DosyayaEkle(" Fake Mail Process\n");
                                System.out.println("");
                                break;
                        }
                    }
                }
                while (select != 6);
                System.out.println("See you again...");
                DosyayaEkle(" Exit Process\n");
                break;
            } else {
                right--;
                System.out.println("Invalid password or username ! Please try again...");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank.");
                } else {
                    System.out.println("Remaining login right: " + right);
                }
            }

        }
    }
}
