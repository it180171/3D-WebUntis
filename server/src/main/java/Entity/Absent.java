package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Absent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime timeStart;
    private LocalDateTime timeEnd;
    private Long lessonTime;

    public Absent() {
    }

    public Absent(Long id, LocalDateTime timeStart, LocalDateTime timeEnd, Long lessonTime) {
        this.id = id;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.lessonTime = lessonTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(LocalDateTime timeStart) {
        this.timeStart = timeStart;
    }

    public LocalDateTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(LocalDateTime timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Long getLessonTime() {
        return lessonTime;
    }

    public void setLessonTime(Long lessonTime) {
        this.lessonTime = lessonTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Absent)) return false;
        Absent absent = (Absent) o;
        return Objects.equals(id, absent.id) && Objects.equals(timeStart, absent.timeStart) && Objects.equals(timeEnd, absent.timeEnd) && Objects.equals(lessonTime, absent.lessonTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, timeStart, timeEnd, lessonTime);
    }
}
