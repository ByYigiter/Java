package myOwnWork;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Kronometre2 {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time = LocalTime.of(0, 0,10);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm:ss");
        for (int i = 0; i <=time.getSecond(); i++) {
            Thread.sleep(1000);
            System.out.print(""+dtf.format(time.minusSeconds(i))+" ");
        }
        System.out.println();
        System.err.println("SÜRE DOLDU...");

    }
}
