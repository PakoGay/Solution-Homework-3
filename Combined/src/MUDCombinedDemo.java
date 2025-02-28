public class MUDCombinedDemo {
    public static void main(String[] args) {
        Room baseRoom = new Room("Corridor");
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Haunted Castle")
                .addRoom(baseRoom)
                .addRoom((Room) baseRoom.cloneEntity())
                .addNPC(new NPC("Ghost"))
                .build();
        dungeon.showInfo();
    }
}