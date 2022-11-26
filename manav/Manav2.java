package myOwnWork.manav;

import java.util.Scanner;

public class Manav2 {
    public static void main(String[] args) {

        System.out.println("\n--------------------\n---Aile Manavi---\n---Hosgeldiniz---\n --------------------");
        Scanner can = new Scanner(System.in);

        System.out.println("*".repeat(30) + "\n1\t Elma\n2\t Erik\n3\t Karpuz\n4\t Domates\n5\t Salatalik\n0\t Cikis Yap");


        do{
            System.out.println("lutfen sepete eklemek istediginiz urunun numarasini yaziniz ..\n Alisverisi sonlandirmak icin 0'i tuslayiniz.");
            double urun = can.nextDouble();

            if(urun==1 || urun == 2 || urun == 3 || urun == 4 || urun == 5) {
                System.out.println("lutfen kg miktarini giriniz ..");
                double miktar = can.nextDouble();

                Sepet musteri = new Sepet();

                musteri.musteriSecimi(urun,miktar);

                System.out.println("urunun fiyati : "+musteri.araToplam+"$");

                System.out.println("Alisveris tutariniz : "+musteri.toplam+"$");
            }else if(urun==0){
                System.out.println("Programdan cikiliyor..Alisveris tamamlandi..");
                break;
            }else{
                System.out.println("hatali giris yaptiniz");
                break;
            }

        }while(true);


    }
}
