package edu.henrique.cursoNelioParte2.cursoNelioModulo12;

/*
 Data-[hora] local:Quando o momento exato não interessa a pessoas de outro fuso - Excel; Data da hora da venda; Data de nascimento...

 Data - hora global:Quando o momento exato interessa - Horário de sorteio; Inicio de evento...

 Padrão ISO 8601 - Como se representar horas em texto:

Data-[hora] local
 2022-07-21                  - Ano, mês, dia
 2022-07-21T14:52            - Ano, mês, dia, hora, minuto
 2022-07-21T14:52:09         - Ano, mês, dia, hora, minuto, segundos
 2022-07-21T14:52:09.4073    - Ano, mês, dia, hora, minuto, segundos e décimos

   -------------- // --------------
Data - hora global
  2022-07-23T14:52:09Z           - Ano, mês, dia,horário(T), hora, minuto, segundo, ZULU Time(Z)
  2022-07-23T14:52:09.254935Z    - Ano, mês, dia,horário(T), hora, minuto, segundo, décimo, ZULU Time(Z)
  2022-07-23T14:52:09-03:00      - Ano, mês, dia,horário(T), hora, minuto, segundo, fuso -03 (UTC)

Situações de uso de data-hora:

Instanciações:

Agora -> Data-hora -> Um registro de pedido de restaurante
Texto no ISO 8601  -> Requisição web de uma API
Texto formato customizado ->  Data-hora
*/
/*
Como aplicar data em JAVA?

Caso seja Data-hora local:

LocalDate
LocalDateTime


Caso seja Data-hora global:

Instant

Caso seja Duração:
Duration

Caso sejam outros:

Zoneld
ChronoUnit
 */

// Aprender Javadocs

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class datetime {
    public static void application(){
/*
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    LocalDate d01 = LocalDate.now(); //Dia do calendário atual
    LocalDateTime d02 = LocalDateTime.now(); // Dia do calendário atual + hora
    Instant d03 = Instant.now(); //Trás a hora do meridiano de Greenwich - London

    LocalDate d04 = LocalDate.parse("2022-03-19");
    LocalDateTime d05 = LocalDateTime.parse("2022-03-19T16:14:00");
    Instant d06 = Instant.parse("2022-03-19T16:14:00Z");
    Instant d07 = Instant.parse("2022-03-19T16:14:00-03:00");// Como tô usando o -03, pega Londres

    LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); // DateTimeFormatter - Instancio ele acima e uso como segundo parâmetro, assim como pode chamar direto tanmbém como abaixo:
        // LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    LocalDate d10 = LocalDate.of(2022,03,19);
    LocalDateTime d11 = LocalDateTime.of(2022,03,19,16,31);

        System.out.println();
        System.out.println("D01: " + d01);
        System.out.println("D02: " + d02);
        System.out.println("D03: " + d03);
        System.out.println("D04: " + d04);
        System.out.println("D05: " + d05);
        System.out.println("D06: " + d06);
        System.out.println("D07: " + d07);
        System.out.println("D08: " + d08);
        System.out.println("D01: " + d10);
        System.out.println("D01: " + d11);


        */



        LocalDate d11 = LocalDate.parse("2022-03-19");
        LocalDateTime d12 = LocalDateTime.parse("2022-03-19T16:14:00");
        Instant d13 = Instant.parse("2022-03-19T16:14:00Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // Cria o obj de formatação, porém considerando o fuso do sistema local do pc
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println("D11: " + d11.format(fmt1));
        System.out.println("D11: " + fmt1.format(d11));
        System.out.println("D11: " + d11.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // Instancia, formata e aplica, porém não pode ser reaflicado o fmt1
        // Três jeitos de aplicar

        System.out.println();
        System.out.println("D12: " + fmt1.format(d12));
        System.out.println("D12: " + fmt2.format(d12));
        System.out.println("D12: " + fmt4.format(d12));

        System.out.println("D13: " + fmt3.format(d13)); // Como o Instant não tem .format, usei o fmt3 para aplicar o format passando o datetime como parâmetro

    }
}
