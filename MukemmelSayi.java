package myOwnWork;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi = 28;
        int count = 0;
        int sum = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0){
                sum += i;
            }

        }
        System.out.println(sum);
        if (sum==sayi){
            System.out.println("MukemmelSayi: " + sayi);
        }else System.out.println("mukemmelSayi değil");
    }
}
