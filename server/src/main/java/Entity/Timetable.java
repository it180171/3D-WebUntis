package Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
public class Timetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long timeTableId;

    @ManyToOne
    SchoolClass schoolClass;

    public Timetable() {
    }

    public Timetable(Long timeTableId, SchoolClass schoolClass) {
        this.timeTableId = timeTableId;
        this.schoolClass = schoolClass;
    }
}
