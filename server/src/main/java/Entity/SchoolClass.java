package Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
public class SchoolClass{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long schoolClassId;

    @ManyToOne
    SeatOrder seatOrder;

    public SchoolClass() {
    }

    public SchoolClass(Long schoolClassId, SeatOrder seatOrder) {
        this.schoolClassId = schoolClassId;
        this.seatOrder = seatOrder;
    }
}
