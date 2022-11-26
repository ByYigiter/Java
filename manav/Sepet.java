package myOwnWork.manav;

import java.util.ArrayList;
import java.util.List;

public class Sepet {

    public static double toplam;
    double araToplam;

    public void musteriSecimi(double urun, double miktar){

        List<Double> fiyatListesi = new ArrayList<>();
        fiyatListesi.add(2.5);
        fiyatListesi.add(4.5);
        fiyatListesi.add(5.0);
        fiyatListesi.add(1.5);
        fiyatListesi.add(1.0);
        System.out.println(fiyatListesi);


        for (int i = 0; i < fiyatListesi.size(); i++) {
            if(i==urun-1){
                araToplam=fiyatListesi.get(i)*miktar;
                toplam+=araToplam;
                break;
            }
        }



    }
}