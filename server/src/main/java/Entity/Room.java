package Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long roomId;

    @ManyToOne
    SeatOrder seatOrder;

    public Room() {
    }

    public Room(Long roomId, SeatOrder seatOrder) {
        this.roomId = roomId;
        this.seatOrder = seatOrder;
    }
}
