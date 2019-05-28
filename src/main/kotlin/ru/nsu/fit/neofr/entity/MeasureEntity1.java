package ru.nsu.fit.neofr.entity;

import javax.persistence.*;

@Entity
@Table(name = "Measure", schema = "dbo", catalog = "HabitCounter")
public class MeasureEntity1 {
    /*private int measureId;
    private String measureName;

    @Id
    @Column(name = "measure_id")
    public int getMeasureId() {
        return measureId;
    }

    public void setMeasureId(int measureId) {
        this.measureId = measureId;
    }

    @Basic
    @Column(name = "measure_name")
    public String getMeasureName() {
        return measureName;
    }

    public void setMeasureName(String measureName) {
        this.measureName = measureName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MeasureEntity1 that = (MeasureEntity1) o;

        if (measureId != that.measureId) return false;
        if (measureName != null ? !measureName.equals(that.measureName) : that.measureName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = measureId;
        result = 31 * result + (measureName != null ? measureName.hashCode() : 0);
        return result;
    }*/
}
