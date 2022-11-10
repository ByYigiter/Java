package day14_Inhetitance;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kayit {
    static LocalDateTime kullaniciDate;

    public static List kayitOl() {
        List<String> kayit = new ArrayList<String>();
        do {
            Scanner al =new Scanner(System.in);
            System.out.print("Adınızı giriniz: ");
            String name = al.nextLine();
            System.out.print("Soyadınızı Giriniz: ");
            String surname = al.nextLine();
            System.out.print("Kayıt etmek istiyor musunuz E/H: ");
            char ch =al.next().charAt(0);
            kullaniciDate =LocalDateTime.now();
            DateTimeFormatter dtf =DateTimeFormatter.ofPattern("mm:ss");
            String time = dtf.format(kullaniciDate);
            //String minute = String.valueOf(kullaniciDate.getMinute());
            //String second = String.valueOf(kullaniciDate.getSecond());
            if (ch=='e'||ch =='E'){
                kayit.add("Name :"+name+" Surname :"+surname+" time :"+ time);
            }else
                break;
        }while (true);
return kayit;
    }
    public static void main(String[] args) {
        List<String> list =kayitOl();
        SansliKullanici sansliKullanici= new SansliKullanici();
        sansliKullanici.sanslilar(list);

    }
}
