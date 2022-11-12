package myOwnWork;

import java.util.Arrays;

public class ArrayTerstenYazdir {
    public static void main(String[] args) {
        int numbers[]={2,5,9,4,8,4};
        int[] newnumbers=new int[numbers.length];
        System.out.println(Arrays.toString(numbers));
        int i=0;
            for (int j=numbers.length-1; j>=0; j--) {
                    newnumbers[j] = numbers[i];
                    i++;
            }
        System.out.println(Arrays.toString(newnumbers));
    }
}
