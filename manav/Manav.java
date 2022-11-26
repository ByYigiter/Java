package myOwnWork.manav;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {

    public static void main(String[] args) {
        System.out.println("*************MANAVIMIZA HOŞGELDİNİZ***************");
        urunler();
    }
    public static void kasa(int sum ,List<String> alinanurun){
        for(String w: alinanurun){
            System.out.println(w);
        }
        System.out.println();
        System.out.println("Toplam ödenecek Tutar: " + sum);
        System.out.println("***TEŞEKKÜR EDERİZ YİNE BEKLERİZ.*****");
    }
    public static void urunler(){
        List<String> urun= new ArrayList<>();
        urun.add("Elma");
        urun.add("Limon");
        urun.add("Havuç");
        urun.add("Domates");
        urun.add("Patates");
         System.out.println(urun);
         urunsec(urun);
    }
    public static void urunsec(List<String> urun ){
        Scanner al = new Scanner(System.in);
        int toplam =0;
        int elmafiyati=9;
        int limonfiyati=20;
        int havucfiyati=7;
        int domatesfiyati=13;
        int patatesfiyati=8;
        List<String> alinanurun = new ArrayList<>();
        do {
            System.out.println("Almak istediğiniz Ürünü seçiniz \n1-Elma\n2-Limon\n3-Havuç\n4-Domates\n5-Patates");
            int urunsec=al.nextInt();
            System.out.println("Kaç Kilo almak istersiniz: ");
            int kilo= al.nextInt();
            switch (urunsec){
                case 1:
                    alinanurun.add (kilo +" kilo Elma Tutarı: "+ kilo*elmafiyati);
                    System.out.println(alinanurun);
                    toplam+=elmafiyati*kilo;
                    break;
                case 2:
                    alinanurun.add (kilo +" kilo Limon Tutarı: "+ kilo*limonfiyati);
                    toplam+=limonfiyati*kilo;
                    break;
                case 3:
                    alinanurun.add (kilo +" kilo Havuç Tutarı: "+ kilo*havucfiyati);
                    toplam+=havucfiyati*kilo;
                    break;
                case 4:
                    alinanurun.add (kilo +" kilo Domates Tutarı: "+ kilo*domatesfiyati);
                    toplam+=domatesfiyati*kilo;
                    break;
                case 5:
                    alinanurun.add (kilo +" kilo Patates Tutarı: "+ kilo*patatesfiyati);
                    toplam+=patatesfiyati*kilo;
                    break;
                default:
                    System.out.println("Geçersiz değer girdiniz");
                    continue;
            }
            System.out.println("Başka bir urun almak istermisiniz: E / H");
            char devam=al.next().charAt(0);
            if (devam =='H' || devam =='h'){
                break;
            }
        }while (true);
        kasa(toplam,alinanurun);
    }

}
