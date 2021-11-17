import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        NPC npc = new NPC(-20, 100)
                .setHat(new Cloth.Hat(100, 5))
                .setJacket(new Cloth.Jacket(100, 5))
                .setLeggings(new Cloth.Leggings(100, 3))
                .setBoots(new Cloth.Boots(100, 3));
        npc.setWeight(50);
        for(int i = 0; i < 20; i++){
            System.out.println("X: " + npc.getX() + " Y: " + npc.getY() + " VX: " + npc.getVx() + " VY: " + npc.getVy());
            Game.tick();
        }
    }
}
