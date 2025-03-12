package pgozadanie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0){
            System.out.println("The number is positive");

        }else if (a < 0){
            System.out.println("The number is negative");
        }
        if (a == 0){
            System.out.println("The number is zero");

        };
    }
    }
