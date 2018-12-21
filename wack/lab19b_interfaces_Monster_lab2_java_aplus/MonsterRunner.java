package lab19b_interfaces_Monster_lab2_java_aplus;

public class MonsterRunner {

    public static void main(String args[]) {
        Monsterold zero = new Monsterold();
        Monsterold one = new Monsterold(8);
        Monsterold sue = new Monsterold(9, 4);
        Monsterold harry = new Monsterold(1, 2, 3);
        System.out.println("\nzero Monster :: " + zero);
        System.out.println("\none Monster :: " + one);
        System.out.println("\nsue Monster :: " + sue);
        System.out.println("\nharry Monster :: " + harry);
        System.out.println("\nchanging harry's properties ");
        harry.setHeight(7);
        harry.setWeight(6);
        harry.setAge(5);
        System.out.println("\nharry Monster :: " + harry);
        System.out.println("\ncloning harry");
        sue = (Monsterold) harry.clone();
        System.out.println("\nsue Monster :: " + sue);

        Monsterold mOne = new Monsterold(33, 33, 11);
        Monsterold mTwo = new Monsterold(55, 33, 11);

        System.out.println("\nMonster 1 :: " + mOne);
        System.out.println("\nMonster 2 :: " + mTwo);
        System.out.print("\nmOne.equals(mTwo) == ");
        System.out.println(mOne.equals(mTwo));
        System.out.print("\nmOne.compareTo(mTwo) == ");
        System.out.println(mOne.compareTo(mTwo));
        System.out.print("\nmTwo.compareTo(mOne) == ");
        System.out.println(mTwo.compareTo(mOne));
    }
}
