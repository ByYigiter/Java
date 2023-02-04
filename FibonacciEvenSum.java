package myOwnWork;

public class FibonacciEvenSum {
    public static void main(String[] args) {
        int n=50;// n e kadar fibonaccilerin çift olanları topla
        int a=1;
        int b=1;
        int temp=0;
        int sum=0;
        while (a<n){
            if (a%2==0){
                sum+=a;
            }
            System.out.print(" "+a);
            temp=b;
            b=a;
            a+=temp;
        }
        System.out.println();
        System.out.println(sum);
        }



}
