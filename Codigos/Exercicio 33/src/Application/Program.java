import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {

        LocalDate data01 = LocalDate.now();
        LocalDateTime data02 = LocalDateTime.now();
        Instant data03 = Instant.now();

        LocalDate data04 = LocalDate.parse("2025-01-15");
        LocalDateTime data05 = LocalDateTime.parse("2025-01-15T01:30:34");
        Instant data06 = Instant.parse("2025-01-15T01:30:34Z");
        Instant data07 = Instant.parse("2025-01-15T01:30:34-03:00");

        LocalDate data08 = LocalDate.parse("15/01/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime data09 = LocalDateTime.parse("15/01/2025 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate data10 = LocalDate.of(2025, 01, 15);
        LocalDateTime data11= LocalDateTime.of(2025, 01, 15, 1, 30);

        System.out.println("data01 = " + data01);
        System.out.println("data02 = " + data02);
        System.out.println("data03 = " + data03);
        System.out.println("data04 = " + data04);
        System.out.println("data05 = " + data05);
        System.out.println("data06 = " + data06);
        System.out.println("data07 = " + data07);
        System.out.println("data08 = " + data08);
        System.out.println("data09 = " + data09);
        System.out.println("data10 = " + data10);
        System.out.println("data11 = " + data11);

    }
}
