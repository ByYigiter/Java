package myOwnWork;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class YasFarkiBul {
    public static void main(String[] args) {
        LocalDate now =LocalDate.now();
        LocalDate dob =LocalDate.of(1987,8,8);
        Period diff =Period.between(dob,now);
        System.out.println(diff);
        Long diff2 = ChronoUnit.DAYS.between(dob,now);
        System.out.println(diff2);
    }

}
