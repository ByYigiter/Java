package myOwnWork;

public class HarmonikSayi {
    public static void main(String[] args) {
        int num=5;
        double sum=0;

        for (int i=1; i<=num; i++) {
              sum +=(double) 1/i;
        }
        System.out.println(sum);
    }
}
