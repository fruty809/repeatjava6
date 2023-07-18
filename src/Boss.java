public class Boss extends GameEntity{
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        String info = "Boss Information:\n";
        info+="Health "+ getHealth()+"\n";
        info+="Damage "+ getDamage()+"\n";
        info += "Weapon: " + weapon.getName() + " (" + weapon.getType() + ")\n";
        return info;
    }
}
