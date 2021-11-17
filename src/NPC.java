public class NPC extends PhysicObject {
    private Cloth.Hat hat;
    private Cloth.Jacket jacket;
    private Cloth.Leggings leggings;
    private Cloth.Boots boots;

    public NPC() {
    }

    public NPC(double temperature, int durability) {
        super(temperature, durability);
    }

    public NPC death(){
        super.setDurability(0);
        return this;
    }

    public boolean isLive(){
        return super.getDurability() > 0;
    }

    public Cloth.Hat getHat() {
        return hat;
    }

    public NPC setHat(Cloth.Hat hat) {
        this.hat = hat;
        return this;
    }

    public Cloth.Jacket getJacket() {
        return jacket;
    }

    public NPC setJacket(Cloth.Jacket jacket) {
        this.jacket = jacket;
        return this;
    }

    public Cloth.Leggings getLeggings() {
        return leggings;
    }

    public NPC setLeggings(Cloth.Leggings leggings) {
        this.leggings = leggings;
        return this;
    }

    public Cloth.Boots getBoots() {
        return boots;
    }

    public NPC setBoots(Cloth.Boots boots) {
        this.boots = boots;
        return this;
    }
}
