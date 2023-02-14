package myOwnWork;

public class Ekok {

    public static void main(String[] args) {
        int a =8;
        int b=10;
        int ekok=a*b;
        boolean durum=true;
        int i=b;
        while (durum) {
            if (i%b==0&&i%a==0||i==ekok){
                ekok=i;
                System.out.println(ekok);
                break;
            }
            i++;
        }



    }



}
