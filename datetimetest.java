import java.time.LocalDateTime;

class DateTimeTest {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.of(+999_999_999, 12, 31, 23, 59, 59, 999_999_999));
        System.out.println(LocalDateTime.of(0000, 01, 01, 00, 00, 00, 000_000_000));
        System.out.println(LocalDateTime.of(-999_999_999, 01, 01, 00, 00, 00, 000_000_000));
        //System.out.println(LocalDateTime.of(+1_000_000_000,01,01,00,00,00));
        //System.out.println(LocalDateTime.of(-1_000_000_000, 01, 01, 00, 00, 00, 000_000_000));
    }
}
