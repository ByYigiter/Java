package myOwnWork;

import java.util.Arrays;

public class EnBuyuktenEnkucugeSiralama {

    public static void main(String[] args) {
        int arr[] ={2,5,9,4,4,2,6,3};
        System.out.println(Arrays.toString(arr));

        int min=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++){
                if (arr[j-1]<arr[j]) {
                    min=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=min;
                }
            }


        }
        System.out.println(Arrays.toString(arr));
    }


}
