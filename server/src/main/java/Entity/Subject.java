package Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    SeatOrder seatOrder;

    public Subject() {
    }

    public Subject(Long id, SeatOrder seatOrder) {
        this.id = id;
        this.seatOrder = seatOrder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SeatOrder getSeatOrder() {
        return seatOrder;
    }

    public void setSeatOrder(SeatOrder seatOrder) {
        this.seatOrder = seatOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject)) return false;
        Subject subject = (Subject) o;
        return Objects.equals(id, subject.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
