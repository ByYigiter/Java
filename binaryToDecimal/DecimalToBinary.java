package myOwnWork.binaryToDecimal;

public class DecimalToBinary {
    public String decimalToBinary(int decimal) {
        System.out.print(decimal +" \t :\t\t"+ " Decimal sayısının Binary olarak yazılışı : ");
        String reversestr ="";
        String str="";

        for (int i =decimal ; i>0; i/=2) {
            if (i%2 == 0) {
                reversestr += 0;
            }
            else {
                reversestr += 1;
            }
        }
        for (int i =reversestr.length()-1;i>-1;i--){
            str += reversestr.charAt(i);
        }

        return  str;
    }
}
