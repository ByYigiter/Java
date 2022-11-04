package myOwnWork.scrabble;

import java.util.ArrayList;
import java.util.List;

public class OyuncuSec extends  Scrabble {


    public  void  oyuncusec (int oyuncusirasi){
        System.out.println("\t\t\t"+(oyuncusirasi+1) +" . Oyuncu");

    }
    public void puandurumu(int puan,int oyuncusirasi,List puandurumu){

        puandurumu.set(oyuncusirasi - 1, (puan+(int)puandurumu.get(oyuncusirasi-1)));
        System.out.println(oyuncusirasi +" . Oyuncu Puanı ="+ puandurumu.get(oyuncusirasi-1));
        //System.out.println(puandurumu);

    }
    public void sonuc (int oyuncusirasi, List puandurumu){
        System.out.println(oyuncusirasi +" . Oyuncu Puanı ="+ puandurumu.get(oyuncusirasi-1));
    }


}
