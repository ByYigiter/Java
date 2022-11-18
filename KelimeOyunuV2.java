package myOwnWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KelimeOyunuV2 {
    public static void main(String[] args) {
        System.out.println("**********ÇARKIFELEK OYUNUNA HOŞGELDİNİZ*******************");
        Scanner al = new Scanner(System.in);
        String kelime ="kader bilinmez";
        String[] word = kelime.trim().toLowerCase().replaceAll("\\s","").split("");
        // System.out.println(Arrays.toString(word));
        List<String> words = new ArrayList<String>();
        for (String w : word) {
            words.add(w);
        }
        List<String> aranan = new ArrayList<>();
        for (String w : word) {
            aranan.add("_");
        }
        int sira=100;
        System.out.println(aranan+" Aradığınız cumle veya kelime karakter sayısı: "+aranan.size());

        int sayi=3;
        int puan1=0;
        int puan2=0;
        int puan3=0;

        for (int i=sayi; i>-1;i--){
            if (i==3){
                System.out.println("sıra 3 oyucuda");
                do {
                    System.out.println("\nbir harf giriniz.");
                    String ch=al.next().substring(0,1);
                    if (words.contains(ch)) {
                        int idx=words.indexOf(ch);
                        if (aranan.contains(ch)){
                            System.out.println("aynı harfi daha önce söylediniz.");
                            sira--;
                            break;
                            //System.out.println("kalan hakkınız= "+hak);
                        }
                        else {
                            System.out.println(ch + " harfi var ");
                            puan3+=10;
                            for (int w = idx; w < words.size(); w++) {
                                if (words.get(w).equals(ch)) {
                                    aranan.set(w, ch);
                                }
                            }
                        }
                        System.out.println(aranan);
                        if (!(aranan.contains("_"))){
                            System.out.println("****tebrikler***** oyun bitti!!!.");
                            i-=100;
                            break;
                        }
                    }else{
                        sira--;
                        break;
                        //System.out.println("kalan hakkınız= "+hak);
                    }
                }while (sira>0);
                System.out.println("el değişti");
            }else if (i==2){
                System.out.println("sıra 2  oyucuda");
                do {
                    System.out.println("\nbir harf giriniz.");
                    String ch=al.next().substring(0,1);
                    if (words.contains(ch)) {
                        int idx=words.indexOf(ch);
                        if (aranan.contains(ch)){
                            System.out.println("aynı harfi daha önce söylediniz.");
                            sira--;
                            break;
                            //System.out.println("kalan hakkınız= "+hak);
                        }
                        else {
                            System.out.println(ch + " harfi var ");
                            puan2+=10;
                            for (int w = idx; w < words.size(); w++) {
                                if (words.get(w).equals(ch)) {
                                    aranan.set(w, ch);
                                }
                            }
                        }
                        System.out.println(aranan);
                        if (!(aranan.contains("_"))){
                            System.out.println("****tebrikler***** oyun bitti!!!.");
                            i-=100;
                            break;
                        }
                    }else{
                        sira--;
                        break;
                        //System.out.println("kalan hakkınız= "+hak);
                    }
                }while (sira>0);
                System.out.println("el değişti");
            }else if (i==1){
                System.out.println("sıra 1 oyucuda");
                do {
                    System.out.println("\nbir harf giriniz.");
                    String ch=al.next().substring(0,1);
                    if (words.contains(ch)) {
                        int idx=words.indexOf(ch);
                        if (aranan.contains(ch)){
                            System.out.println("aynı harfi daha önce söylediniz.");
                            sira--;
                            break;
                            //System.out.println("kalan hakkınız= "+hak);
                        }
                        else {
                            System.out.println(ch + " harfi var ");
                            puan1+=10;
                            for (int w = idx; w < words.size(); w++) {
                                if (words.get(w).equals(ch)) {
                                    aranan.set(w, ch);
                                }
                            }
                        }
                        System.out.println(aranan);
                        if (!(aranan.contains("_"))){
                            System.out.println("****tebrikler***** oyun bitti!!!.");
                            i-=100;
                            break;
                        }
                        System.out.println("el değişti");
                    }else{
                        sira--;
                        break;
                        //System.out.println("kalan hakkınız= "+hak);
                    }
                }while (sira>0);
            }
            if (i==0){
                //System.out.println("başa bon");
                i+=4;
            }
        }
        System.out.println("3 oyuncu puanı: "+puan3);
        System.out.println("2 oyuncu puanı: "+puan2);
        System.out.println("1 oyuncu puanı: "+puan1);

    }
}
