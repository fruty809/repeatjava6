public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);

        Weapon bossWeapon = new Weapon();
        bossWeapon.setName("Diamond Sword");
        bossWeapon.setType(WeaponType.SWORD);
        boss.setWeapon(bossWeapon);

        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(200);
        skeleton1.setDamage(20);

        Weapon skeletonWeapon = new Weapon();
        skeletonWeapon.setName("Uncharted Axe");
        skeletonWeapon.setType(WeaponType.AXE);
        skeleton1.setArrowCount(50);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(150);
        skeleton2.setDamage(15);

        Weapon skeletonWeapon2 = new Weapon();
        skeletonWeapon2.setName("Electric Bow");
        skeletonWeapon2.setType(WeaponType.BOW);
        skeleton2.setWeapon(skeletonWeapon2);
        skeleton2.setArrowCount(30);

        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}