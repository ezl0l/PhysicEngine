import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class PhysicObject extends GameObject{
    private double x = 0;
    private double y = 0;
    private double vx;
    private double vy;
    private double weight;
    private double temperature;
    private int durability;

    public static List<WeakReference<PhysicObject>> instances = new ArrayList<>();

    private java.lang.ref.WeakReference<PhysicObject> objectWeakReference;
    {
        objectWeakReference = new java.lang.ref.WeakReference<>(this);
        instances.add(objectWeakReference);
    }

    public PhysicObject() {
    }

    public PhysicObject(double temperature, int durability) {
        this.temperature = temperature;
        this.durability = durability;
    }

    public boolean destroy(){
        return instances.remove(objectWeakReference);
    }

    public void tick(int dt){
        x += vx;
        y += vy;
    }

    public void tick(){
        tick(1);
    }

    public double getX() {
        return x;
    }

    public PhysicObject setWeight(double weight) {
        if(weight >= 0)
            this.weight = weight;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public PhysicObject setVx(double vx) {
        if(vx > 0)
            this.vx = vx;
        return this;
    }

    public double getVx() {
        return vx;
    }

    public double getVy() {
        return vy;
    }

    public PhysicObject setVy(double vy) {
        if(vy > 0)
            this.vy = vy;
        return this;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
