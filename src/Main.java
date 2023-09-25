// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(150);
        boss.setHealth(600);
        Weapon dell = new Weapon();
        dell.setLiteMachineGan("LiteMachineGan");
        dell.setMachineGan("MachineGan");
        boss.setWeapon(dell);
        System.out.println("жизнь босса: " + boss.getHealth());
        System.out.println("урон босса: " + boss.getDamage());
        System.out.println("type of weapon - " + boss.getWeapon().getMachineGan());
        System.out.println("name of weapon - " + boss.getWeapon().getLiteMachineGan());


    }
}