package ru.nsu.fit.neofr.entity;

import javax.persistence.*;

@Entity
@Table(name = "Habit", schema = "dbo", catalog = "HabitCounter")
public class HabitEntity1 {
    /*private int habitId;
    private String habitName;
    private String habitDescription;

    @Id
    @Column(name = "habit_id")
    public int getHabitId() {
        return habitId;
    }

    public void setHabitId(int habitId) {
        this.habitId = habitId;
    }

    @Basic
    @Column(name = "habit_name")
    public String getHabitName() {
        return habitName;
    }

    public void setHabitName(String habitName) {
        this.habitName = habitName;
    }

    @Basic
    @Column(name = "habit_description")
    public String getHabitDescription() {
        return habitDescription;
    }

    public void setHabitDescription(String habitDescription) {
        this.habitDescription = habitDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HabitEntity1 that = (HabitEntity1) o;

        if (habitId != that.habitId) return false;
        if (habitName != null ? !habitName.equals(that.habitName) : that.habitName != null) return false;
        if (habitDescription != null ? !habitDescription.equals(that.habitDescription) : that.habitDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = habitId;
        result = 31 * result + (habitName != null ? habitName.hashCode() : 0);
        result = 31 * result + (habitDescription != null ? habitDescription.hashCode() : 0);
        return result;
    }*/
}
