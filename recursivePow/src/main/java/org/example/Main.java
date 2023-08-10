package org.example;
import java.util.Scanner;
public class Main {
    static int power(int us, int taban){
        if(us==0){
            return 1;
        }
        int result = 1;
        return (result *= power(--us, taban)*taban);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri: ");
        int taban = input.nextInt();
        System.out.print("Üs değeri: ");
        int us = input.nextInt();
        System.out.println(power(us, taban));
    }
}