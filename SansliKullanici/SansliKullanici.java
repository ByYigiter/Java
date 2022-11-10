package day14_Inhetitance;

import java.util.List;

/*
 Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak
     ekleyen ve sonrasında her dakikanın ilk 10 saniyesinde kaydolanları
     şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.
     Bunun için;
     1- Bir Kayit class'i oluşturun fields:  kullaniciDate (LocalDateTime cinsinden)
     2- Kayit isminde olusturdugunuz class'da kayitol() isminde bir method
     ekleyerek Kullanıcıdan kullanici ismini alarak ArrayList'e ekleyin
     3- SansliKullanici class'i olusturun.Bu class'ta kendine verilen
     ArrayListteki kullanicilardan her dakikanın ilk 10  saniyesinde kaydolanları
     yazdıran sansliKullanici() isminde bir metod  ekleyiniz.

 */
public class SansliKullanici {

    public void sanslilar(List sanslilar) {
        System.out.println("Kazananlar Listesi :  ");
        for (int i = 0; i < sanslilar.size(); i++) {
            int length = sanslilar.get(i).toString().length();
            Integer son = Integer.valueOf(sanslilar.get(i).toString().substring(length - 2));
            if (son <= 10) {
                System.out.println(sanslilar.get(i));
            }
        }
    }
}
