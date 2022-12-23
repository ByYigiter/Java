package myOwnWork;

public class IndexOf3 {
    public static void main(String[] args) {
        String str = "merhaba hello";
        int start = 0;
        int count = 0;
        //int uzunluk = str.length();
        for (; ; ) {
            int index = str.indexOf("e", start);
            if (index >= 0) {
                count += 1;
                start = index + 1;

            } else
                break;
        }

        if (count > 1) {
            System.out.println("Belirtilen harf" + " " + count + " " + " defa yazıldı.");
        } else if (count == 1) {
            System.out.println("Belirtilen harf" + " " + count + " defa yazıldı");

        }else
        { System.out.println("Belirtilen harf hiç yazılmadı");
        }
    }

}
