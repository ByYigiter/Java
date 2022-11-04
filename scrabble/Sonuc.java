package myOwnWork.scrabble;

import java.util.List;

public class Sonuc{
    public void sonuc (int oyuncusirasi, List puandurumu){
        System.out.println(oyuncusirasi +" . Oyuncu Puanı ="+ puandurumu.get(oyuncusirasi-1));
    }

}
