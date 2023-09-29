package org.example;

import java.util.Date;
import java.util.Scanner;

public class ConsoleInteration {
    public Date RequestDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date(dd/mm/yyyy): ");
        String date = scanner.next();
        //TODO convert string to date and return it
        return new Date();
    }
}
