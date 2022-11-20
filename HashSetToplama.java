package myOwnWork;

import java.util.HashSet;
import java.util.Set;

public class HashSet_TumElemanlariTopla {
    public static void main(String[] args) {
        HashSet<Double> list = new HashSet<>();
        setOlustur(list);
        System.out.println(list);// hashset ler rasgele sıralar index yoktur. bu nedenle tum elemena toplamak için set yaparız
        toplaminiAl(list);
    }
    public static HashSet<Double> setOlustur(HashSet list){
        list.add(3.23);
        list.add(3.10);
        list.add(5.12);
        list.add(10.12);
        list.add(23.12);
        return list;
    }
    public static void toplaminiAl(HashSet list){
        double sum = 0;
        Set <Double> set = new HashSet<>();
        set.addAll(list);
        for(Double w:set){
            sum +=w;
        }

        System.out.println("sum = " + sum);
    }


}
