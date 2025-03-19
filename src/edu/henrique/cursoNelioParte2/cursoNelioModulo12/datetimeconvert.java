package edu.henrique.cursoNelioParte2.cursoNelioModulo12;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class datetimeconvert {
    public static void application() {


        LocalDate d11 = LocalDate.parse("2022-03-19");
        LocalDateTime d12 = LocalDateTime.parse("2022-03-19T16:14:00");
        Instant d13 = Instant.parse("2022-03-19T16:14:00Z");


        LocalDate r1 = LocalDate.ofInstant(d13,ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d13,ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d13,ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d13,ZoneId.of("Portugal"));



        System.out.println("R1 =" + r1);
        System.out.println("R2 =" + r2);
        System.out.println("R3 =" + r3);
        System.out.println("R4 =" + r4);

        System.out.println("D11 dia= " + d11.getDayOfMonth());
        System.out.println("D11 mês= " + d11.getMonthValue());
        System.out.println("D11 ano= " + d11.getYear());

        System.out.println("D12 hora= " + d12.getHour());
        System.out.println("D12 minuto= " + d12.getMinute());
    }

}

/*

for(String s:  ZoneId.getAvailableZoneIds()){
           System.out.println(s);
       }//Nome dos fusos
 */