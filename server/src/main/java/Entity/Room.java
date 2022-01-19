package Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roomName;

    @ManyToOne
    SeatOrder seatOrder;

    public Room() {
    }

    public Room(Long id, String roomName, SeatOrder seatOrder) {
        this.id = id;
        this.roomName = roomName;
        this.seatOrder = seatOrder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long roomId) {
        this.id = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
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
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return Objects.equals(id, room.id) && Objects.equals(roomName, room.roomName) && Objects.equals(seatOrder, room.seatOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roomName, seatOrder);
    }
}
