package myOwnWork;

public class AlfabeYaz {
    public static void main(String[] args) {
        alfabeyazdir();
    }
    public static void alfabeyazdir(){
        for ( char ch = 'f'; ch>'a'; ch--){
            System.out.print(ch + " " );
            //ch--;// burası aktif olursa -2 yaparak döngü devam eder ==> f d b olur
        }
    }
}
