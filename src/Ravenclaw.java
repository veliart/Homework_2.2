public class Ravenclaw extends Hogwarts {

    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(String firstName, String lastName, int spellPower, int transgressionPower, int mind, int wisdom, int wit, int creativity) {
        super(firstName, lastName, spellPower, transgressionPower);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                ", spellPower=" + spellPower +
                ", transgressionPower=" + transgressionPower +
                '}';
    }
    public static void comparision(Ravenclaw ravenclawFirstStudent, Ravenclaw ravenclawSecondStudent) {
        int skillTotalFirstStudent = ravenclawFirstStudent.getMind() + ravenclawFirstStudent.getWisdom() + ravenclawFirstStudent.getWit() + ravenclawFirstStudent.getCreativity();
        int skillTotalSecondStudent = ravenclawSecondStudent.getMind() + ravenclawSecondStudent.getWisdom() + ravenclawSecondStudent.getWit() + ravenclawSecondStudent.getCreativity();
        if (skillTotalFirstStudent > skillTotalSecondStudent) {
            System.out.println(ravenclawFirstStudent.getFirstName() + " лучший когтевранец, чем " + ravenclawSecondStudent.getFirstName());
        }
        else if (skillTotalFirstStudent < skillTotalSecondStudent){
            System.out.println(ravenclawSecondStudent.getFirstName() + " лучший когтевранец, чем " + ravenclawSecondStudent.getFirstName());
        }
        else {
            System.out.println(ravenclawSecondStudent.getFirstName() + " и " + ravenclawSecondStudent.getFirstName() + " равные по навыкам когтевранцы");
        }
    }
}
