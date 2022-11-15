package maps;

import java.util.Arrays;
import java.util.HashMap;

public class Q1_HarflerinSayisi {
    public static void main(String[] args) {
        String str ="eeHellooomerHabaa";
        System.out.println(str);
        String strsayisi ="";
        int count = 0;
        for (int i = 1; i <=str.length(); i++) {
            count=0;
            for (int j = 1; j <=str.length(); j++) {
                if (str.substring(i-1,i).equals(str.substring(j-1,j))){
                    count++;
                }
            }
            if (! strsayisi.contains(str.substring(i-1,i))) {
                strsayisi+=str.substring(i-1,i);
                System.out.print (str.substring(i - 1, i) + "=" + count+" - " );
            }
        }
        System.out.println("\n----------------------------------------------------------------");
        harfSayisiBul(str);
    }
    static void  harfSayisiBul(String str) {
        String arr[]=str.split("");
        HashMap <String,Integer> map = new HashMap<String,Integer>();
        System.out.println(Arrays.toString(arr));
        for (String w: arr){
            if (!map.containsKey(w)){
                map.put(w,1);
            }else {
                map.put(w,map.get(w)+1);
            }
        }
        System.out.println(map);
    }

}
