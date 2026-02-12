package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse("25/06/2018");

        LocalDate data04 = LocalDate.parse("2025-01-15");
        LocalDateTime data05 = LocalDateTime.parse("2025-01-15T01:30:34");
        Instant data06 = Instant.parse("2025-01-15T01:30:34Z");

        LocalDate pastWeekLocalDate = data04.minusDays(7);
        LocalDate nextWeekLocalDate = data04.plusDays(7);

        System.out.println("pastWeeklocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = data05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = data05.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = data06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = data06.plus(7, ChronoUnit.DAYS);

        LocalDate r1 = LocalDate.ofInstant(data06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(data06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(data06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(data06, ZoneId.of("Portugal"));

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter format4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter format5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("data04 = " + data04.format(format1));
        System.out.println("data04 = " + format1.format(data04));
        System.out.println("data05 = " + data05.format(format1));
        System.out.println("data05 = " + data05.format(format2));
        System.out.println("data05 = " + data05.format(format4));
        System.out.println("data06 = " + format3.format(data06));
        System.out.println("data06 = " + format5.format(data06));

        System.out.println("r1 =" + r1);
        System.out.println("r2 =" + r2);
        System.out.println("r3 =" + r3);
        System.out.println("r4 =" + r4);

        System.out.println("data04 dia = " + data04.getDayOfMonth());
        System.out.println("data04 dia = " + data04.getMonthValue());
        System.out.println("data04 dia = " + data04.getYear());

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstsnt = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), data04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, data05);
        Duration t3 = Duration.between(pastWeekInstant, data06);
        Duration t4 = Duration.between(data06, pastWeekInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());


    }
}
