package map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import items.Inventory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomTest {
    private Room room;

    @BeforeEach
    void runBefore() {
        room = new Room("name", "desc", -1, 0, 1, 2, new Inventory());
    }
    @Test
    void testGetDestinationFromDirection() {
        assertEquals(room.getNorth(), room.getDestinationFromDirection(Direction.NORTH));
        assertEquals(room.getSouth(), room.getDestinationFromDirection(Direction.SOUTH));
        assertEquals(room.getWest(), room.getDestinationFromDirection(Direction.WEST));
        assertEquals(room.getEast(), room.getDestinationFromDirection(Direction.EAST));
    }

    @Test
    void testGetNameDesc() {
        assertEquals("name", room.getName());
        assertEquals("desc", room.getDescription());
    }

    @Test
    void testGetInventory() {
        assertEquals(0, room.getInventory().getItems().size());
    }
}
