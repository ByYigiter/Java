package myOwnWork.scrabble;

public class Oyun extends  OyuncuSec {
    public  int basla(){
        do {
            System.out.print("Kelime Giriniz: ");
            String kelime = input.next();
            kontrol = kelimeKontrol(kelime);
            if (kontrol) {
                puan += kelime.length();
            }

        } while (kontrol);

        return puan;
    }
    public static boolean kelimeKontrol(String kelime) {

        System.out.print("Kelime Geçerli mi ? E/H :");

        char ch = input.next().charAt(0);
        if (ch == 'e'||ch == 'E') {
            return true;
        } else {
            return false;
        }
    }
}
