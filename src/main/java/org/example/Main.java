package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2025,8,21);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy", Locale.ENGLISH);
        System.out.println("Default Format: " + today);
        System.out.println("Custom Format 1: " + today.format(dtf1));
        System.out.println("Custom Format 2: " + today.format(dtf2));

        LocalTime now = LocalTime.of(16,45,30);
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("Default format: " + now);
        System.out.println("24-hour format: " + now.format(dtf3));
        System.out.println("12-hour format with AM/PM: " + now.format(dtf4));

        LocalDateTime event = LocalDateTime.of(2025,11,27,19,0,0);
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' hh:mm a");
        System.out.println("Default format: " + event);
        System.out.println("Custom format: " + event.format(dtf5));

        LocalDate startDate = LocalDate.of(2025,9,1);
        startDate.plusDays(10);
        System.out.println("Start date after trying to modify it: " + startDate);
        LocalDate endDate = startDate.plusDays(10);
        System.out.println("The original start date is still: " + startDate);
        System.out.println("The new end date is: " + endDate);

        LocalDateTime baseTime = LocalDateTime.of(2025, 10, 15, 10, 30, 0);
        LocalDateTime futureTime = baseTime.plusYears(1).plusMonths(3).plusHours(5);
        LocalDateTime pastTime = baseTime.minusWeeks(3).minusDays(3);
        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("Base time:   " + baseTime.format(dtf6));
        System.out.println("Future time: " + futureTime.format(dtf6));
        System.out.println("Past time:   " + pastTime.format(dtf6));


        LocalDate date1 = LocalDate.of(2024, 3, 15);
        LocalDate date2 = LocalDate.of(2026, 7, 20);

        Period period = Period.between(date1, date2);
        System.out.print("The period between the two dates is: ");
        System.out.print(period.getYears() + " years, ");
        System.out.print(period.getMonths() + " months, and ");
        System.out.println(period.getDays() + " days.");

    }
}