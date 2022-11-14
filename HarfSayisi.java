package maps;

public class Q1_HarflerinSayisi {
    public static void main(String[] args) {
        String str ="Hellooo";
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
                System.out.print (str.substring(i - 1, i) + ":" + count+" - " );
            }

        }

    }
}
