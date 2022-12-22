package myOwnWork;

public class DizidekiTekSayi {
    public static void main(String[] args) {
      int single = 0;
      int count = 0;
        int []arr = {2,8,6,3,5,2,5,3,8};
      for (int i = 0; i < arr.length; i++) {
          count=0;
          for (int j = 0; j < arr.length; j++) {
              if(arr[i] ==arr[j] ) {
                  count++;
              }
          }
          if (count==1){
              single=arr[i];
          }
      }
        System.out.println(single);
    }
}
