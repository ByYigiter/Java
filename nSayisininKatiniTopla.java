package myOwnWork;

public class SayininKatiOlanlariTopla {
    public static void main(String[] args) {
        int[] arr = {3, 8, 42, 15, 20, 4, 30, 24};
        int katiOlanSayi=4;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%katiOlanSayi==0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}