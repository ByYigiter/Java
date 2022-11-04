package myOwnWork.scrabble;

import myOwnWork.SayiTahminOyunu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Scrabble {
        static Scanner input = new Scanner(System.in);
        static  OyuncuSec oyuncu = new OyuncuSec();
        static  Oyun oyun = new Oyun();

        static  Sonuc sonuc = new Sonuc();
    static boolean kontrol;
    static int puan = 0;

   static List<Integer> puandurumu = new ArrayList<Integer>();

        public static void main(String[] args) {
            System.out.println();
            System.out.println("******************------SCRABBLE OYUNU BAŞLIYOR-------****************");
            System.out.print("Oyuncu sayısını giriniz: ");
            int oyuncusayisi =input.nextInt();
            for (int i = 0; i <oyuncusayisi;i++){
                puandurumu.add(0);
            }
               // System.out.println(puandurumu); // Başlangıçta herkes 0 puanla başlıyor

            for (int i = 0; i < oyuncusayisi; i++){
                oyuncu.oyuncusec(i);
                puan = oyun.basla();
               oyuncu.puandurumu( puan,i+1,puandurumu);
                puan =0;

                if (i == oyuncusayisi-1) {
                    System.out.print("Oyundan Çıkmak İstiyor musunuz. E/H :");
                    char str = input.next().charAt(0);
                    char ch = input.next().charAt(0);
                    if (ch == 'e'||ch == 'E') {
                        for (int j = 0; j <oyuncusayisi;j++){
                            sonuc.sonuc(j+1,puandurumu);
                        }
                        break;
                    }else {
                    i -= oyuncusayisi;
                    }
                }

            }



        }

}
