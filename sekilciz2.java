package myOwnWork;

public class sekilciz2 {
    public static void main(String[] args) {
    for (int i = 9 ; i >0; i--){
        for (int w =0; w<10-i; w++){
            System.out.print("  ");
        }
        for (int j = i ;j>0 ;j --){
            System.out.print(j+" ");
        }
        for (int k = 2 ; k < i+1 ; k++){
        System.out.print(k+" ");
    }
        System.out.println();
    }

}
}