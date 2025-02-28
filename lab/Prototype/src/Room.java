public class Room implements ICloneableGameEntity {
    private String name;
    public Room(String name) { this.name = name; }
    public String getName() { return name; }
    public ICloneableGameEntity cloneEntity() { return new Room(this.name );
    }
}

