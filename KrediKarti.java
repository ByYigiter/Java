package myOwnWork;

public class KrediKarti {
    public static void main(String[] args) {
        System.out.println("isim soyisim ve kredi kartı numarasını giriniz");
        String kisi="yigit er 1234567891234567";
        String []str=kisi.split(" ");
        str[0]=str[0].substring(0,1).toUpperCase()+str[0].substring(1).replaceAll("[a-z]", "*");
        str[1]=str[1].substring(0,1).toUpperCase()+str[1].substring(1).replaceAll("[a-z]", "*");
        String yildiz="**** **** **** ";
        str[2]=yildiz + str[2].substring(str[2].length()-4);
        System.out.print(str[0]+" "+str[1]+"\n"+str[2]);
    }
}
