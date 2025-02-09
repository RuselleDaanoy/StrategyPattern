public class Character {
    private AttackStrategy attackStrategy;
    private DefenseStrategy[] defenseStrats;

    //constructor for knight with 3 def and other 2 chars
    public Character(AttackStrategy attackStrategy, DefenseStrategy def1, DefenseStrategy def2, DefenseStrategy def3) {
        this.attackStrategy = attackStrategy;
        this.defenseStrats = new DefenseStrategy[]{def1, def2, def3};
    }

    public Character(AttackStrategy attackStrategy, DefenseStrategy def1) {
        this.attackStrategy = attackStrategy;
        this.defenseStrats = new DefenseStrategy[]{def1};
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        for (DefenseStrategy defense : defenseStrats) {
            defense.defend();
        }
    }
}