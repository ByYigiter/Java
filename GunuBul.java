package myOwnWork;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class GunuBul {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Bugün\t\t: "+now+"   " +now.getDayOfWeek());
        Scanner al = new Scanner(System.in);
       // System.out.println("Bugün Günlerden: "+now.getDayOfYear());
        System.out.print("Kac Gün sonrasını öğrenmek istiyorsunuz :");
        Long gungir=al.nextLong();
        now = now.plusDays(gungir);
        System.out.print(gungir + " gün sonra : "+now.plusDays(0)+"   "+now.getDayOfWeek());
        System.out.println();// yukarıda toplama yaptığımız için 2 toplama işlamni yapmıyoruz.
    }

}
