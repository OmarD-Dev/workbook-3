package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        //Format 1
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(today.format(format));

        //Format 2
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(today.format(format2));

        //Format 3
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println(today.format(format3));

        //Format 4
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy hh:mm");
        System.out.println(today.format(format4));

        //Challenge Format
        DateTimeFormatter format5 =  DateTimeFormatter.ofPattern("hh:mm 'on' dd-MM-yyyy");
        System.out.println(today.format(format5));
    }

}