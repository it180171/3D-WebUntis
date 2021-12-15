package Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long subject;

    @ManyToOne
    Timetable timetable;

    public Subject() {
    }

    public Subject(Long subject, Timetable timetable) {
        this.subject = subject;
        this.timetable = timetable;
    }
}
