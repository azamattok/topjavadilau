package kz.dilau.topjava.model;

import java.time.LocalDateTime;

public class UserMeal {
    private final LocalDateTime dateTime;
    private final String descrition;
    private final int calories;

    public UserMeal(LocalDateTime dateTime, String descrition, int calories) {
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
}
