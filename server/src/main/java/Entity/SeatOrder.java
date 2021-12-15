package Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
public class SeatOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long seatOrderId;

    public SeatOrder() {
    }

    public SeatOrder(Long seatOrderId) {
        this.seatOrderId = seatOrderId;
    }
}
