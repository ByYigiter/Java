package myOwnWork;

import java.util.Scanner;

public class Sayiyiyaziyacevirme {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        System.out.println("2 basamaklı bir sayı giriniz.");
        byte num = al.nextByte();
        if (num > -100 && num < 100) {
            int birler = num % 10;
            int onlar = num / 10;
            switch (onlar) {
                case 1:
                    System.out.print("On");
                    break;
                case 2:
                    System.out.print("Yirmi");
                    break;
                case 3:
                    System.out.print("Otuz");
                    break;
                case 4:
                    System.out.print("Kırk");
                    break;
                case 5:
                    System.out.print("Elli");
                    break;
                case 6:
                    System.out.print("Altmis");
                    break;
                case 7:
                    System.out.print("Yetmis");
                    break;
                case 8:
                    System.out.print("Seksen");
                    break;
                case 9:
                    System.out.print("Doksan");
                    break;
            }
            switch (birler) {
                case 1:
                    System.out.print("Bir");
                    break;
                case 2:
                    System.out.print("İki");
                    break;
                case 3:
                    System.out.println("Üc");
                    break;
                case 4:
                    System.out.println("Dört");
                    break;
                case 5:
                    System.out.println("Beş");
                    break;
                case 6:
                    System.out.println("Altı");
                    break;
                case 7:
                    System.out.println("Yedi");
                    break;
                case 8:
                    System.out.println("Sekiz");
                    break;
                case 9:
                    System.out.println("Dokuz");
                    break;
            }
        } else {
            System.out.println("hatalı giriş yaptınız:");
        }

    }

}
