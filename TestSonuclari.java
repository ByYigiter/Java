package day10_arrays;

import java.util.Arrays;

public class TestSonuclari {
    public static void main(String[] args) {
        /*
    Interwiew Sorusu
    Ogrencilerin test sonuclarini degerlendiren Java kodunu  yaziniz
    //10 sorumuz var
    //ogrencilerin cevaplari
    char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
    *
    * // cevap anahtari
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

    output:
    1 nolu ogrencinin dogru cevap sayisi :7
    2 nolu ogrencinin dogru cevap sayisi :6
    3 nolu ogrencinin dogru cevap sayisi :5
    4 nolu ogrencinin dogru cevap sayisi :4
    5 nolu ogrencinin dogru cevap sayisi :8
    6 nolu ogrencinin dogru cevap sayisi :7
    7 nolu ogrencinin dogru cevap sayisi :7
    8 nolu ogrencinin dogru cevap sayisi :7
*/
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        hesapla(answers, keys);
    }
        public static void hesapla ( char[][] cevaplar,char []keys){
            int ogrencisayisi = cevaplar.length;
            for (int i = 1; i <= ogrencisayisi; i++) {
                System.out.print(i + " nolu öğrencinin doğru cevap sayısı :" );
                int dogrusayisi = 0;
                int cevapsayisi = cevaplar[i - 1].length;
                for (int j = 0; j < cevapsayisi; j++) {
                    if (keys[j] == cevaplar[i - 1][j]) {
                        dogrusayisi++;
                    }
                }
                System.out.print(cevapsayisi+"/"+dogrusayisi);
                System.out.println();
            }
        }
}

