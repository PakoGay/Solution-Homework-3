public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room originalRoom = new Room("Treasure Room");
        Room clonedRoom = (Room) originalRoom.cloneEntity();
        System.out.println("Original Room:" + originalRoom.getName());
        System.out.println("Cloned Room:" + clonedRoom.getName());
    }
}