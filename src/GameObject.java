public class GameObject {
    private CharSequence unlocalizedName;

    public GameObject() {
    }

    public GameObject(CharSequence unlocalizedName) {
        this.unlocalizedName = unlocalizedName;
    }

    public CharSequence getUnlocalizedName() {
        return unlocalizedName;
    }

    public GameObject setUnlocalizedName(CharSequence unlocalizedName) {
        this.unlocalizedName = unlocalizedName;
        return this;
    }
}
