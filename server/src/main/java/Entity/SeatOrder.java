package Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class SeatOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    Seat seat;

    public SeatOrder() {
    }

    public SeatOrder(Long id, Seat seat) {
        this.id = id;
        this.seat = seat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SeatOrder)) return false;
        SeatOrder seatOrder = (SeatOrder) o;
        return Objects.equals(id, seatOrder.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
