package myOwnWork;

public class sekilciztersucgen {
    public static void main(String[] args) {
        for (int i = 1; i <10;i++){
            for (int j = i; j < 10; j++){
                System.out.print(j+" ");
            }
            System.out.println();
            for (int bosluk = 1; bosluk < i+1; bosluk++){
                System.out.print(" ");
            }
        }
    }

}
