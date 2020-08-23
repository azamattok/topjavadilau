package kz.dilau.topjava.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Meal {
    private final LocalDateTime dateTime;
    private final String descrition;
    private final int calories;

    public Meal(LocalDateTime dateTime, String descrition, int calories) {
        this.dateTime = dateTime;
        this.descrition = descrition;
        this.calories = calories;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescrition() {
        return descrition;
    }

    public int getCalories() {
        return calories;
    }

    public LocalDate getDate() {
        return getDateTime().toLocalDate();
    }

    public LocalTime getTime() {
        return getDateTime().toLocalTime();
    }
}
