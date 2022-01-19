package Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Timetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long timeTableId;
    private Long day;
    private Long lessonTime;

    @ManyToOne
    SchoolClass schoolClass;

    @ManyToOne
    Subject subject;

    public Timetable() {
    }

    public Timetable(Long timeTableId, Long day, Long lessonTime, SchoolClass schoolClass, Subject subject) {
        this.timeTableId = timeTableId;
        this.day = day;
        this.lessonTime = lessonTime;
        this.schoolClass = schoolClass;
        this.subject = subject;
    }

    public Long getTimeTableId() {
        return timeTableId;
    }

    public void setTimeTableId(Long timeTableId) {
        this.timeTableId = timeTableId;
    }

    public Long getDay() {
        return day;
    }

    public void setDay(Long day) {
        this.day = day;
    }

    public Long getLessonTime() {
        return lessonTime;
    }

    public void setLessonTime(Long lessonTime) {
        this.lessonTime = lessonTime;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Timetable)) return false;
        Timetable timetable = (Timetable) o;
        return Objects.equals(timeTableId, timetable.timeTableId) && Objects.equals(day, timetable.day) && Objects.equals(lessonTime, timetable.lessonTime) && Objects.equals(schoolClass, timetable.schoolClass) && Objects.equals(subject, timetable.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeTableId, day, lessonTime, schoolClass, subject);
    }
}
