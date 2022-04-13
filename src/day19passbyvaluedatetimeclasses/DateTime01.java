package day19passbyvaluedatetimeclasses;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.spi.LocaleNameProvider;

public class DateTime01 {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1.getTime()); //1646186845033//

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now(ZoneId.of("Asia/Tokyo")));

        System.out.println(LocalDate.now().plusDays(200));
        System.out.println(LocalDate.now().plusMonths(25));

        System.out.println(LocalDate.now().minusWeeks(7));
        System.out.println(LocalDate.now().plusYears(2).minusWeeks(5));

        System.out.println(LocalDate.now());



    }
}
