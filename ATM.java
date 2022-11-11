package myOwnWork;

import java.util.Scanner;

public class SwitchCaseATM {
    public static void main(String[] args) {
        System.out.println("***********HOŞGELDİNİZ***************");
        Scanner al=new Scanner(System.in);
        System.out.println("Bakiye miktarını giriniz:");
        double bakiye=al.nextDouble();
        System.out.println("yapılacak işlemi lütfen seçiniz: ");
        System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama");
        byte islem=al.nextByte();
        switch (islem){
            case 1:
                System.out.println("yatırılacak miktrı giriniz: ");
                double yatmiktari=al.nextDouble();

                bakiye+=yatmiktari;
                System.out.println("Yeni bakiyeniz "+bakiye);
               break;
            case 2:
                System.out.println("Çekilecek miktrı giriniz: ");
                double cekmiktari=al.nextDouble();
                if (bakiye>=cekmiktari){
                    System.out.println("Lütfen bekleyiniz İşleminiz GErçekleştiriliyor");
                    bakiye-=cekmiktari;
                    System.out.println("Yeni bakiyeniz "+bakiye);
                }else {
                    System.out.println("Bakiye yetersiz:");
                    System.out.println("Yeni bakiyeniz "+bakiye);
                }
                break;
            case 3:
                System.out.println("Toplam Bakiyeniz= "+bakiye);
                break;
            default:
                System.out.println("hatalı işlem yaptınız: Tekrar Deneyiniz.");
        }


    }

}
