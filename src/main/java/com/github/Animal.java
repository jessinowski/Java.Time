package com.github;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Animal {
    // Bonus: Write a class Animal and add an attribute birthday and name to it.
    private String name;
    private LocalDate birthday;

    public long daysUntilNextBirthday(){
        LocalDate today = LocalDate.now();
        LocalDate nextBirthday = birthday.withYear(today.getYear());
        if (today.isAfter(nextBirthday)|| today.isEqual(nextBirthday)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        return ChronoUnit.DAYS.between(today,nextBirthday);
    }

    public Animal(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
