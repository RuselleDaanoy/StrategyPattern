public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character(new SwingSword(), new Shield(), new Dodge(), new CreateMagic());
        Character wizard = new Character(new CastSpell(), new CreateMagic());
        Character archer = new Character(new ShootArrow(), new Dodge());

        System.out.println("Knight:");
        knight.attack();
        knight.defend();

        System.out.println("\nWizard:");
        wizard.attack();
        wizard.defend();

        System.out.println("\nArcher:");
        archer.attack();
        archer.defend();
    }
}
