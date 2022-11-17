package myOwnWork;

import java.util.Scanner;

public class CharToplama {
    public static void main(String[] args) {

        KarakterTopla();

    }


    public static void KarakterTopla() {
        Scanner al = new Scanner(System.in);
        System.out.print("5 karakterli Kelime veya rakam giriniz: ");
        String sayi = al.nextLine();
        int sayiuzunluk = sayi.length();
        if (sayiuzunluk == 5) {
            char sayi1 = sayi.charAt(0);
            System.out.print(sayi1 + " +" + "\t");
            char sayi2 = sayi.charAt(1);
            System.out.print(sayi2 + " +" + "\t");
            char sayi3 = sayi.charAt(2);
            System.out.print(sayi3 + " +" + "\t");
            char sayi4 = sayi.charAt(3);
            System.out.print(sayi4 + " +" + "\t");
            char sayi5 = sayi.charAt(4);
            System.out.println(sayi5 + "\t");
            System.out.println(sayi + " Karakterlerin ascii değerleri toplamı " + (0 + sayi1 + sayi2 + sayi3 + sayi4 + sayi5));
        } else {
            System.out.println("hatalı giriş Tekrar deneyin:");
        }


    }
}
