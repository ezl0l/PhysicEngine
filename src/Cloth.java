public class Cloth extends Item {
    private final int heatingTemperature;
    private int damageAbsorption;

    public Cloth(int durability, int heatingTemperature) {
        super(durability);
        this.heatingTemperature = heatingTemperature;
    }

    public Cloth(int durability, int heatingTemperature, int damageAbsorption) {
        super(durability);
        this.heatingTemperature = heatingTemperature;
        this.damageAbsorption = damageAbsorption;
    }

    public int getHeatingTemperature() {
        return heatingTemperature;
    }

    public int getDamageAbsorption() {
        return damageAbsorption;
    }

    public Cloth setDamageAbsorption(int damageAbsorption) {
        this.damageAbsorption = damageAbsorption;
        return this;
    }

    public static class Hat extends Cloth {
        public Hat(int durability, int heatingTemperature) {
            super(durability, heatingTemperature);
            setUnlocalizedName("an ordinary Hat");
        }
    }

    public static class Jacket extends Cloth {
        public Jacket(int durability, int heatingTemperature) {
            super(durability, heatingTemperature);
            setUnlocalizedName("an ordinary Jacket");
        }
    }

    public static class Leggings extends Cloth {
        public Leggings(int durability, int heatingTemperature) {
            super(durability, heatingTemperature);
            setUnlocalizedName("an ordinary Leggings");
        }
    }

    public static class Boots extends Cloth {
        public Boots(int durability, int heatingTemperature) {
            super(durability, heatingTemperature);
            setUnlocalizedName("an ordinary Boots");
        }
    }
}
