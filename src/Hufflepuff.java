public class Hufflepuff extends Hogwarts {
    private final int hardwork;
    private final int loyality;
    private final int honor;

    public Hufflepuff(String firstName, String lastName, int spellPower, int transgressionPower, int hardwork, int loyality, int honor) {
        super(firstName, lastName, spellPower, transgressionPower);
        this.hardwork = hardwork;
        this.loyality = loyality;
        this.honor = honor;
    }

    public int getHardwork() {
        return hardwork;
    }

    public int getLoyality() {
        return loyality;
    }

    public int getHonor() {
        return honor;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hardwork=" + hardwork +
                ", loyality=" + loyality +
                ", honor=" + honor +
                ", spellPower=" + spellPower +
                ", transgressionPower=" + transgressionPower +
                '}';
    }

    public static void comparision(Hufflepuff hufflepuffFirstStudent, Hufflepuff hufflepuffSecondStudent) {
        int skillTotalFirstStudent = hufflepuffFirstStudent.getHardwork() + hufflepuffFirstStudent.getLoyality() + hufflepuffFirstStudent.getHonor();
        int skillTotalSecondStudent = hufflepuffSecondStudent.getHardwork() + hufflepuffSecondStudent.getLoyality() + hufflepuffSecondStudent.getHonor();
        if (skillTotalFirstStudent > skillTotalSecondStudent) {
            System.out.println(hufflepuffFirstStudent.getFirstName() + " лучший пуффендуец, чем " + hufflepuffSecondStudent.getFirstName());
        }
        else if (skillTotalFirstStudent < skillTotalSecondStudent){
            System.out.println(hufflepuffSecondStudent.getFirstName() + " лучший пуффендуец, чем " + hufflepuffFirstStudent.getFirstName());
        }
        else {
            System.out.println(hufflepuffFirstStudent.getFirstName() + " и " + hufflepuffSecondStudent.getFirstName() + " равные по качествам пуффендуйцы");
        }
    }
}
