package myOwnWork;

import java.util.Scanner;

public class PasswordControl {
    /*
        kural  en az 8 karakte riçermeli  ve "  " içermemeli
        ilk harf "M" veya "m" olmalı
        son karakteri "?"olmalı
         */
    public static void main(String[] args) {
        Scanner al= new Scanner(System.in);
        System.out.println("Bir şifre Giriniz: ");
        String password=al.nextLine();
        int passlength=password.length();
        char passchar=password.charAt(0);
        char passlast=password.charAt(passlength-1);
        boolean passspace=!password.contains(" ");
        if (passlength>=8){
            if(passchar=='M'||passchar=='m'){
                if (passspace==true){
                    if(passlast=='?'){
                        System.out.println("şifre geçerli");
                    }else {
                        System.out.println("son karakter ? olmalı");
                    }
                }else {
                    System.out.println("boşluk içermemeli ");
                }
            }else {
                System.out.println("ilk harf M yada m ile başlamalı");
            }
        }else {
            System.out.println("en az 8 karakter olmalı");
        }
    }
}
