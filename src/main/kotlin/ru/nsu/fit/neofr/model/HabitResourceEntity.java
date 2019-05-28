package ru.nsu.fit.neofr.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Habit_Resource", schema = "dbo", catalog = "HabitCounter")
public class HabitResourceEntity {
    private Double resourcePerTime;

    @Basic
    @Column(name = "resource_per_time")
    public Double getResourcePerTime() {
        return resourcePerTime;
    }

    public void setResourcePerTime(Double resourcePerTime) {
        this.resourcePerTime = resourcePerTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HabitResourceEntity that = (HabitResourceEntity) o;

        if (resourcePerTime != null ? !resourcePerTime.equals(that.resourcePerTime) : that.resourcePerTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return resourcePerTime != null ? resourcePerTime.hashCode() : 0;
    }
}
