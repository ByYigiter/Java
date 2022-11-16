package myOwnWork;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        System.out.println("Enter your weight in kg : ");
        int weight =al.nextInt();
        System.out.println("Enter your height in meters : ");
        double height =al.nextDouble();
        double BSM=weight/(height*height);
        System.out.println("Your BSM is : "+BSM);
        if (BSM<18.5){
            System.out.println("you are weak");
        }else if (BSM<25&&BSM>=18.5){
            System.out.println("your weight is ideal");
        }else if (BSM<=30&&BSM>=25){
            System.out.println("you are fat");
        }else if (BSM>30){
            System.out.println("you are obese");
        }
    }
}
