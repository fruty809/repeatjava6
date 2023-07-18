public class Skeleton extends Boss {
    private int arrowCount;

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    @Override
    public String printInfo() {
        String info = "Skeleton Information:\n";
        info += "Health: " + getHealth() + "\n";
        info += "Damage: " + getDamage() + "\n";
        info += "Weapon: " + getWeapon().getName() + " (" + getWeapon().getType() + ")\n";
        info += "Arrow Count: " + arrowCount + "\n";
        return info;
    }
}