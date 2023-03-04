package Chapter3;

import java.util.Random;
import java.util.Scanner;


public class InputandOutput {
    public static void main(String[] args) {
       //printfKullanimi();
        p41randomKullanimi();
    }
public static void p41randomKullanimi(){
    // pick a random number
    Random random = new Random();
    int number = random.nextInt(100)+1;//random 0-1 arasında seçer    (+1 yaparsak aralık 1-2 içinde seçer)  1-100 için +1 eklenir
    System.out.println(number);
}
    public static void p37printfKullanimi() {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.print("What is your age? ");
        int age = in.nextInt();
        System.out.printf("Hello %s, age %d\n", name, age);// name'i al %s ye koy, age'i al %d ye koy printf özelliği
        System.out.println("Hello "+ name+ ", age "+ age);


    }
}
