package com.github;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        // Step 1: Write code to output the current date and time.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Aktuelle lokale Zeit: "+localDateTime);

        // Step 2: Add a timespan of 2 weeks to the current date and output the new date.
        LocalDateTime newDate = localDateTime.plusWeeks(2);
        System.out.println("Heute in zwei Wochen: "+newDate);

        // Step 3: Compare the current date with a specified future date
        // and output whether the current date is before or after the specified date.
        System.out.println("Vergleich zweier Daten mit .compareTo(): "+localDateTime.compareTo(newDate) + " Tage");
        System.out.println("Vergleich zweier Daten mit .isBefore(): "+localDateTime.isBefore(newDate));

        // Step 4: Calculate the difference in days between two arbitrary dates and output the result.
        LocalDateTime myNextBirthday = LocalDateTime.of(2024,4,18,0,0,0);
        long daysBetween = ChronoUnit.DAYS.between(localDateTime,myNextBirthday);
        System.out.println("Tage bis zu meinem nächsten Geburtstag: "+daysBetween);

        // Bonus:
        // Create an instance of the Animal class.
        // Print on the command line how many days are left until the next birthday of the animal.
        Animal animal = new Animal("Winnie Puuh", LocalDate.of(1990,2,21));
        System.out.println("Winnie Puuh hat in "+animal.daysUntilNextBirthday()+" Tagen Geburtstag");
    }
}