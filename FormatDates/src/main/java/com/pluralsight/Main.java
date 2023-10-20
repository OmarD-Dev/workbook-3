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
        DateTimeFormatter date = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(today.format(date));

        //Format 2
        DateTimeFormatter date2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(today.format(date2));

        //Format 3
        DateTimeFormatter date3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println(today.format(date3));

        //Format 4
        DateTimeFormatter date4 = DateTimeFormatter.ofPattern("EEEE, MMM, d, yyyy HH:mm");
        System.out.println(today.format(date4));
    }

}