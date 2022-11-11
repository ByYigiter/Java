public class MaxSecondNumber {
    public static void main(String[] args) {
    /*
    1232,2345,5467,678,3454,2312,3451
    Arrays.sort () kullanmadan
     */
        int arr[]={12,55,23,54,68,57,12,01};
        int max=arr[0];
        int max2=arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i]>max){
                max2=max;
                max=arr[i];
            }
            else if (arr[i]>max2){
                max2=arr[i];
            }

        }
        System.out.println("max = " + max);
        System.out.println("max2 = " + max2);
    }
}
