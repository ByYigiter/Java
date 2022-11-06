package myOwnWork.bakkalkazanci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bakkal {
    public static void main(String[] args) {
        List<String> gunler= new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");
        List<Integer> gunlukkazanci= new ArrayList<>();
        gunkazanci(gunlukkazanci);
        for ( int w=1; w<gunler.size()+1; w++ ){
            System.out.println(w+". gün Kazancı: "+ gunlukkazanci.get(w-1));
        }
        double ort =ortalamakazanc(gunlukkazanci);
        System.out.println("Ortalama Kazancı: "+ ort);
        System.out.println("-----------------------------------------");
        System.out.println(ortalamaustu(gunler,gunlukkazanci,ort));
        System.out.println("-----------------------------------------");
        System.out.println(ortalamaalti(gunler,gunlukkazanci,ort));
    }
    public static List gunkazanci(List<Integer> gunlukkazanc) {

        int i = 1;
        while (i < 8) {
            Scanner al = new Scanner(System.in);
            System.out.println(i + ". günlük kazancını giriniz");
            int gunkari = al.nextInt();
            gunlukkazanc.add(gunkari);
            i++;
        }
    return gunlukkazanc;
    }
    public static Integer ortalamakazanc(List<Integer> ortalama){
        int ort=0;
        int sayisi=ortalama.size();
        for (Integer w: ortalama){
            ort=ort+w;
        }
        ort/=sayisi;
        return ort;
    }
    public static List ortalamaustu(List<String>gunler,List<Integer> ortalamaust,double ort){
        System.out.println("Ortalama Kazancın üstündeki Günler");
        List<String> ortalamaustugunler = new ArrayList<String>();
        int idx=0;
        for (int w=0; w<ortalamaust.size(); w++){
            if (ortalamaust.get(w)>ort){
                ortalamaustugunler.add(idx,gunler.get(w));
                idx++;
            }
        }
        return ortalamaustugunler;
    }
    public static List ortalamaalti(List<String>gunler,List<Integer> ortalamaalt,double ort){
        System.out.println("Ortalama Kazancın altıundaki Günler");
        List<String> ortalamaaltigunler = new ArrayList<String>();
        int idx=0;
        for (int w=0; w<ortalamaalt.size(); w++){
            if (ortalamaalt.get(w)<ort){
               ortalamaaltigunler.add(idx,gunler.get(w));
               idx++;
            }
        }
        return ortalamaaltigunler;
    }
}
