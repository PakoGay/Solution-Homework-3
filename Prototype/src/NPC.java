public class NPC implements ICloneableGameEntity {
    private String name;
    public NPC(String name) { this.name = name; }
    public String getName() { return name; }
    public ICloneableGameEntity cloneEntity() { return new NPC(this.name + " (Clone)"); }
}
