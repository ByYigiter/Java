package myOwnWork;

import java.util.Arrays;

public class HouseRobber
{
    public static void main(String[] args) {
        int arr[] ={7,2,7,9,3,1};
        int maxMin = arr[0];
        int min;
        int max;
        int uclu;
        Arrays.sort(arr);
            if(arr[0]==maxMin){
                System.out.println(maxMin + arr[arr.length - 1]);
            }else if (arr[arr.length-1]==maxMin){
                max=maxMin;
                System.out.println(max+arr[0]);
            }else {
                uclu=maxMin+arr[0]+arr[arr.length-1];
                System.out.println(uclu);
            }
    }
}
