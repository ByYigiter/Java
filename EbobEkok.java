package myOwnWork;

public class EbobEkok {
    public static void main(String[] args) {
        int i = 12;
        int j = 10;
        int ebob = 1;
        int ekok=i*j;//  24
        int enkucuk = i;
        int enbuyuk=j;
        if (enkucuk > j) {
            enkucuk = j;
            enbuyuk=i;
        }
        for (int k = 1; k <= enkucuk; k++) {
            if (i % k == 0 && j % k == 0) {
                ebob = k;//2
            }
        }
        for ( int x=ekok; x >= enbuyuk; x--) {
            if (x%i == 0 && x%j == 0) {
                ekok = x;//24--12
            }
        }


        System.out.println("Ekok= " + ekok);
        System.out.println("Ebob= " + ebob);
    }
}

