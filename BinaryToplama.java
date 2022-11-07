package myOwnWork;

import java.util.Scanner;

public class BinaryToplama {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        System.out.print("1.sayı : ");
        String num1 = al.next();
        System.out.print("2.sayı : ");
        String num2 = al.next();
       int sum =0;
        for (int i =0 ; i<num1.length(); i++) {
            if (num1.charAt(i)== '1'){
              sum += Math.pow(2,num1.length()-1-i);
            }
        }
        for (int j =0 ; j<num2.length(); j++) {
            if (num2.charAt(j)== '1'){
                sum += Math.pow(2,num1.length()-1-j);
            }
        }
        String reversestr ="";
        String str="";
        for (int i =sum ; i>0; i/=2) {
            if (i%2 == 0) {
                reversestr += 0;
            }
            else {
                reversestr += 1;
            }
        }
        for (int i =reversestr.length()-1;i>-1;i--){
            str += reversestr.charAt(i);
        }
        System.out.println(str);


    }
}
