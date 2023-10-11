public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String firstName, String lastName, int spellPower, int transgressionPower, int nobility, int honor, int bravery) {
        super(firstName, lastName, spellPower, transgressionPower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
    @Override
    public String toString() {
        return "Gryffindor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", spellPower=" + spellPower +
                ", transgressionPower=" + transgressionPower +
                '}';
    }
    public static void comparision(Gryffindor gryffindorFirstStudent, Gryffindor gryffindorSecondStudent) {
        int skillTotalFirstStudent = gryffindorFirstStudent.getNobility() + gryffindorFirstStudent.getHonor() + gryffindorFirstStudent.getBravery();
        int skillTotalSecondStudent = gryffindorSecondStudent.getNobility() + gryffindorSecondStudent.getHonor() + gryffindorSecondStudent.getBravery();
        if (skillTotalFirstStudent > skillTotalSecondStudent) {
            System.out.println(gryffindorFirstStudent.getFirstName() + " лучший гриффиндорец, чем " + gryffindorSecondStudent.getFirstName());
        }
        else if (skillTotalFirstStudent < skillTotalSecondStudent){
            System.out.println(gryffindorSecondStudent.getFirstName() + " лучший гриффиндорец, чем " + gryffindorFirstStudent.getFirstName());
        }
        else {
            System.out.println(gryffindorFirstStudent.getFirstName() + " и " + gryffindorSecondStudent.getFirstName() + " равные по чести и отваге гриффиндорцы");
        }
    }
}
