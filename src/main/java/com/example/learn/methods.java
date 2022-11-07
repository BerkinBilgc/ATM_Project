package com.example.learn;
import java.util.Scanner;

import static com.example.learn.operation.DosyayaEkle;

public class methods {
    public static int balancop(int balances) {
        System.out.print("Enter money to be deposited:");
        Scanner input = new Scanner(System.in);
        int deposit = input.nextInt();
        balances += deposit;
        DosyayaEkle(" Deposit Process\n");
        System.out.println("");

        System.out.println("Your Transaction is successful! Available Balance: " + balances);
        System.out.println("");
        return balances;
     }

    public static int withdraws(int money){
        System.out.print("Enter money to be withdrawn:");
        Scanner input = new Scanner(System.in);
        int withdraw = input.nextInt();
        if(money >= withdraw)
        {
            money = money - withdraw;
            System.out.println("Your Transaction is successful! Available Balance: "+ money);
            DosyayaEkle(" Withdrawn Process\n");
        }
        else
        {
            System.out.println("Failed Transaction! Your budget is not enough");
            DosyayaEkle(" Failed Withdrawn Transaction!\n");
        }
        System.out.println("");
        return money;
    }
    public static int transferss(int money){
        System.out.print("Enter money to be Transfer:");
        Scanner input = new Scanner(System.in);
        int withdraw = input.nextInt();
        if(money >= withdraw)
        {
            money = money - withdraw;
            System.out.println("Your Transaction is successful! Available Balance: "+ money);
            DosyayaEkle(" Transfer Process!\n");
        }
        else
        {
            System.out.println("Failed Transaction! Your budget is not enough");
            DosyayaEkle(" Failed Transfer Transaction!\n");
        }
        System.out.println("");
        return money;
    }
    public static int EFT(int money){
        System.out.print("Enter money to be EFT:");
        Scanner input = new Scanner(System.in);
        int withdraw = input.nextInt();
        if(money >= withdraw)
        {
            money = money - withdraw;
            System.out.println("Your Transaction is successful! Available Balance: "+ money);
            DosyayaEkle(" EFT Process\n");
        }
        else
        {
            System.out.println("Failed Transaction! Your budget is not enough");
            DosyayaEkle(" Failed EFT Transaction!\n");
        }
        System.out.println("");
        return money;
    }

}

