package myOwnWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int ilk=1;
        int iki=1;
        int sonuc=fibonacci(ilk,iki);
        //System.out.println(sonuc);

    }
    public static int fibonacci(int a,int b){
        Scanner al = new Scanner(System.in);
        System.out.println(" fibonacci kac adet değer göstersin ");
        int fibonacci = al.nextInt();
        int sum=0;
        System.out.print(b);
        for (int i = 1; i < fibonacci; i++) {
            System.out.print(" " +a);
            sum=a+b;
            b=a;
            a=sum;
        }
        return b;
    }

}
