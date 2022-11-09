package practice07;

import java.util.ArrayList;
import java.util.List;

public class Q02_UzunKelime {
    public static void main(String[] args) {
        /*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.
         */
        String str = "java is diff icult";
        List<String> strword=get(str);
        System.out.println("strword = " + strword);
    }
    public static List get(String str) {
        String []arr =str.split(" ");
        List<String> strword = new ArrayList<String>();
        int max=0;
        strword.add(arr[0]);
        for (String w:arr){
            if (max<w.length()){
                max=w.length();
                //strword.set(0,w);
            }
        }
        List <String> list2 = new ArrayList<String>();
        for (String k:arr){
            if (max==k.length()){
                list2.add(k);
            }
        }

        return list2;
    }
}
