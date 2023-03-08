package Chapter5;

public class ConditionalsandLogic {
    public static void main(String[] args) {

    p61countdown(3);
    }
    public static void p61countdown(int n) {

        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            p61countdown(n-1);
        }
    }
}
