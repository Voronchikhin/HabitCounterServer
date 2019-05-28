package ru.nsu.fit.neofr.entity;

import javax.persistence.*;

@Entity
@Table(name = "ServerLog", schema = "dbo", catalog = "HabitCounter")
public class ServerLogEntity1 {
    /*private int logRecordId;
    private Date monthStart;
    private Integer counter;

    @Id
    @Column(name = "log_record_id")
    public int getLogRecordId() {
        return logRecordId;
    }

    public void setLogRecordId(int logRecordId) {
        this.logRecordId = logRecordId;
    }

    @Basic
    @Column(name = "month_start")
    public Date getMonthStart() {
        return monthStart;
    }

    public void setMonthStart(Date monthStart) {
        this.monthStart = monthStart;
    }

    @Basic
    @Column(name = "counter")
    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServerLogEntity1 that = (ServerLogEntity1) o;

        if (logRecordId != that.logRecordId) return false;
        if (monthStart != null ? !monthStart.equals(that.monthStart) : that.monthStart != null) return false;
        if (counter != null ? !counter.equals(that.counter) : that.counter != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = logRecordId;
        result = 31 * result + (monthStart != null ? monthStart.hashCode() : 0);
        result = 31 * result + (counter != null ? counter.hashCode() : 0);
        return result;
    }*/
}
