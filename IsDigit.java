public class IsDigit {
    public static void main(String[] args) {
        /*
        Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

input : ade1r4d3

output : 8

         Hint :
         Use Character.isDigit()
         Integer.valueOf()
         */
        String str="ade1r4d3";
        int sum=0;
        for (int i=0; i<str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                int digit = Integer.valueOf(str.substring(i,i+1));
                sum+=digit;
            }
        }
        System.out.println( sum);
    }


}
