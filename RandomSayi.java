package myOwnWork;

import java.util.Random;

public class Randomsayibulma {
    public static void main(String[] args) {
        /*
       --flag ve count ile ilgili bir soru;
Math.Random() classından 0 ile 1000 arasında üreteceğiniz sayılarda 0 ve 1'in kaç defa üretildiğini gösteren
 bir method create ediniz?
(Yani sıfır ile 1000 arasında kod 1000 defa çalışacak ve kaç kere sıfır kaç kere 1 geldiği hesaplanacak.)
        */
        System.out.println(rastgele());

    }

    public static String rastgele(){
        Random rnd =new Random();
        int counter0=0;
        int counter1=0;

        for (int i=0;i<100;i++){
            int sayi=rnd.nextInt(100); //Burada Random sinifini kullanmadan Math.Random()*1000 deseydik olurmuydu?
            if(sayi==0){
                counter0++;
            } else if (sayi==1) {
                counter1++;
            }
        }

        return "Sayi 0, "+counter0+" defa ve"+"\nsayi 1 ise "+counter1+" defa geldi. ";


    }
}
