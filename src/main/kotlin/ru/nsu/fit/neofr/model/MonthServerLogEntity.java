package ru.nsu.fit.neofr.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "MonthServerLog", schema = "dbo", catalog = "HabitCounter")
public class MonthServerLogEntity {
    private int logRecordId;
    private Date actionDate;

    @Id
    @Column(name = "log_record_id")
    public int getLogRecordId() {
        return logRecordId;
    }

    public void setLogRecordId(int logRecordId) {
        this.logRecordId = logRecordId;
    }

    @Basic
    @Column(name = "actionDate")
    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MonthServerLogEntity that = (MonthServerLogEntity) o;

        if (logRecordId != that.logRecordId) return false;
        if (actionDate != null ? !actionDate.equals(that.actionDate) : that.actionDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = logRecordId;
        result = 31 * result + (actionDate != null ? actionDate.hashCode() : 0);
        return result;
    }
}
