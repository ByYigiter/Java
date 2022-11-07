package myOwnWork;

public class Anagram {
    public static void main(String[] args) {
        String name= "mary";
        String name2= "ramy";
        boolean durum=true;
        if (name.length()==name2.length()){
            for (int i=0; i<name2.length(); i++) {
                if(!(name.contains(name2.substring(i,i+1)))){
                    durum=false;
                }
            }
            if (durum){
                System.out.println("Anagram");
            }else System.out.println("Anagram değil");
        }else System.out.println("Karakter sayısı aynı değil.");

    }
}
