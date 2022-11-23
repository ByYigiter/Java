package myOwnWork.binaryToDecimal;

public class Runner {
    public static void main(String[] args) {
        BinaryToDecimal btdecimal = new BinaryToDecimal();
        int sum =btdecimal.binaryToDecimal("1000100");
        System.out.println(sum);
        DecimalToBinary decimal = new DecimalToBinary();
        String str = decimal.decimalToBinary(174);
        System.out.print(str);
    }
}
