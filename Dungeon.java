import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();
    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }
    public void showInfo() {
        System.out.println("Dungeon:" + name);
        System.out.println("Rooms:");
        rooms.forEach(room -> System.out.println("  - " + room.getName()));
        System.out.println("NPCs:");
        npcs.forEach(npc -> System.out.println("  - " + npc.getName()));
    }
}