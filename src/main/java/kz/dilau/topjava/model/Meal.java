package kz.dilau.topjava.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Meal {
    private Integer id;

    private final LocalDateTime dateTime;
    private final String descrition;
    private final int calories;

    public Meal(Integer id, LocalDateTime dateTime, String descrition, int calories) {
        this.id = id;
        this.dateTime = dateTime;
        this.descrition = descrition;
        this.calories = calories;
    }

    public Meal(LocalDateTime dateTime, String descrition, int calories) {
        this(null, dateTime, descrition, calories);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isNew() {
        return id==null;
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

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", description='" + descrition + '\'' +
                ", calories=" + calories +
                '}';
    }
}
