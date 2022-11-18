package myOwnWork;

import java.util.Scanner;

public class Dikdörtgenciz {
    public static void main(String[] args) {
        int kisa = 10;
        int uzun =10;
        for (int i = 0; i < kisa; i++) {
            for (int j = 0; j < uzun; j++) {
                if (i==0 ||i==3 ||i==6 || i == kisa-1 ||j ==0 || j ==uzun-1|| j == 3|| j ==6) {
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
