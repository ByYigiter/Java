package myOwnWork.binaryToDecimal;

public class BinaryToDecimal {
    public int binaryToDecimal(String binary){
        System.out.print(binary+" :\t\t" +" Binary sayısının Decimal olarak yazılışı : ");
        int sum=0;
        int us=binary.length()-1;
        for (int i =0 ; i<binary.length(); i++) {
            if (binary.charAt(i) == '1')
            {
                sum+=Math.pow(2,us);
            }
            us--;
        }

        return sum;
    }

}
