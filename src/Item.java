import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Item extends GameObject {
    private int durability;

    public static List<WeakReference<Item>> instances = new ArrayList<>();

    {
        instances.add(new java.lang.ref.WeakReference<>(this));
    }

    public Item(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    public Item setDurability(int durability) {
        this.durability = durability;
        return this;
    }
}
