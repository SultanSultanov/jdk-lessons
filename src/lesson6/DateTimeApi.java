package lesson6;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class DateTimeApi {
    public static void main(String[] args) {
        // DateTime Api, начиная с 8 версии
        // потокобезопасны

        // работа с датой
        // текущая дата
        LocalDate dateNaw = LocalDate.now();
        System.out.println(dateNaw);

        LocalDate someDate = LocalDate.of(2019, Month.OCTOBER, 20);

        String strDate = "14/10/2017";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/MM/yyyy"); // форматирование строки

        LocalDate parseDate = LocalDate.parse(strDate, dtf);
        System.out.println(parseDate);

        System.out.println(parseDate.minusYears(1));
        System.out.println(parseDate.minusMonths(2));
        System.out.println(parseDate.minusDays(400));

        System.out.println(parseDate.plusDays(23));
        System.out.println(parseDate.plusWeeks(2));
        System.out.println(parseDate.plusMonths(7));
        System.out.println(parseDate.plusYears(4));

        DayOfWeek dayOfWeek = parseDate.getDayOfWeek();
        System.out.println(dayOfWeek);

        boolean isAfter = parseDate.isAfter(dateNaw);
        System.out.println(isAfter);

        boolean isBefore = parseDate.isBefore(dateNaw);
        System.out.println(isBefore);

        boolean isEqual = parseDate.isEqual(dateNaw);
        System.out.println(isEqual);

        List<LocalDate> dates = dateNaw.datesUntil(LocalDate.parse("2020-03-01")).collect(Collectors.toList());
        for (LocalDate date: dates) {
            System.out.println(date);
        }

        long between = ChronoUnit.MONTHS.between(parseDate, dateNaw);
        System.out.println(between);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime localTime1 = LocalTime.of(7,20);
        LocalTime localTime2 = LocalTime.of(22,20);

        long btn1 = ChronoUnit.HOURS.between(localTime1, localTime2);
        System.out.println(btn1);

        long btn2 = Duration.between(localTime1, localTime2).toMinutes();
        System.out.println(btn2);

        Set<String> allZone = ZoneId.getAvailableZoneIds();
        System.out.println(allZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy /   HH:mm");

        LocalDateTime localDateTime = LocalDateTime.of(2019, Month.NOVEMBER, 15, 16,20);

        System.out.println(formatter.format(localDateTime));

        ZonedDateTime msk = localDateTime.atZone((ZoneId.of("Europe/Moscow")));
        System.out.println(msk);

        ZonedDateTime ny = msk.withZoneSameInstant(ZoneId.of("America/New_York")).plusHours(4);
        System.out.println(ny);

        System.out.println();
        System.out.println();




        LocalDateTime time123 = LocalDateTime.of(2019,Month.DECEMBER,31,19,0);

        ZonedDateTime sydney = time123.atZone(ZoneId.of("Australia/Sydney"));
        System.out.println(sydney);

        ZonedDateTime ch = sydney.plusHours(15).plusMinutes(35).withZoneSameInstant(ZoneId.of("America/Chicago"));
        System.out.println(formatter.format(ch) + "Хьюстон");

        ZonedDateTime waitingInCh = ch.plusHours(1).plusMinutes(45);
        System.out.println(formatter.format(waitingInCh) + "Вылет из Хьюстона");

        ZonedDateTime vash = waitingInCh.plusHours(2).plusMinutes(49).withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(formatter.format(vash) + "Вышингтон");
        ZonedDateTime wiatVash = vash.plusHours(1).plusMinutes(6);

        System.out.println(formatter.format(wiatVash)+ "вылет из Вышингтона");

        ZonedDateTime ottawa = wiatVash.plusHours(1).plusMinutes(39).withZoneSameInstant(ZoneId.of("America/Toronto"));
        System.out.println(formatter.format(ottawa) + "Оттава");


        long result = ChronoUnit.MINUTES.between(sydney, ottawa);

        ZonedDateTime chistmas = LocalDateTime.of(2019,12,31,23,59)
                .atZone(ZoneId.of("America/Toronto"));
        System.out.println(formatter.format(chistmas.minusMinutes(result)
                .withZoneSameInstant(ZoneId.of("Australia/Sydney"))));


        // не потокобезопасны

        Date date = new Date();
        System.out.println(date);
        Date other = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd  MM  yyyy   HH:mm");

        System.out.println(sdf.format(date));
        System.out.println(date.before(other));
        System.out.println(date.after(other));
        System.out.println(date.compareTo(other));

        Calendar calendar1 = new GregorianCalendar();
        Calendar calendar2 = new GregorianCalendar(2016,Calendar.OCTOBER,12);
        calendar2.add(Calendar.DAY_OF_MONTH, 4);
        calendar2.add(Calendar.DAY_OF_MONTH, -90);

        System.out.println(calendar1.get(Calendar.MONTH));
        System.out.println(calendar1.getTime());  // вызвращает дату
        LocalDate localDateTime1 = calendar1.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // TODO: обратно
    }
}
