package myOwnWork;
import java.util.Random;
import java.util.Scanner;
public class TasKagitMakas {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);

        System.out.println("1- Taş 2 kağıt 3- makas\t seçeneklerden birini giriniz");
        int seninpuanin =0;
        int pcpuani=0;
        do {
        int sen = al.nextInt();
        switch (sen) {
            case 1:
                System.out.println("taş");
                break;
            case 2:
                System.out.println("Kağıt");
                break;
            case 3:
                System.out.println("makas");
                break;
        }
        //Random rnd= new Random();
            int pc=(int )(11+ Math.random() * 3);
            System.out.println(pc);
           //int pc = 1 + rnd.nextInt(3);  //   150 -250   150+ random (500)
            System.out.println(pc);
        switch (pc) {
            case 1:
                System.out.println("taş");
                break;
            case 2:
                System.out.println("Kağıt");
                break;
            case 3:
                System.out.println("makas");
                break;
        }
        if (sen == 1&&pc==3 ||sen==2 &&pc==1||sen==3&&pc==2) {
            seninpuanin+=1;
        }else if (pc == 1&&sen==3 ||pc==2 &&sen==1||pc==3&&sen==2){
            pcpuani+=1;
        }
        else if(pc == 1 &&sen==1 ||pc==2 &&sen==2|| pc==3 &&sen==3){
                System.out.println( " beraber");
            }
            System.out.println("Sen\t:" + seninpuanin);
            System.out.println("Pc\t:" + pcpuani);

        if (seninpuanin==3||pcpuani==3) {
            System.out.println("oyun bitti");

            if (seninpuanin > pcpuani) {
                System.out.println(seninpuanin + " - " + pcpuani + " Kazandınız");
            } else System.out.println(pcpuani + " - " + seninpuanin + " Kaybettiniz");

            System.out.println(" Oyundan Çıkmak için Q harfine basınız");
            char ch=al.next().charAt(0);
          if (ch=='Q'||ch=='q'){
              break;
          }else {
              System.out.println("Oyuna devam");
              seninpuanin = 0;
              pcpuani = 0;
          }
        }
        }while (true);




    }


}
