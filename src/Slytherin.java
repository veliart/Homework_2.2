public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    public Slytherin(String firstName, String lastName, int spellPower, int transgressionPower, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(firstName, lastName, spellPower, transgressionPower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                ", spellPower=" + spellPower +
                ", transgressionPower=" + transgressionPower +
                '}';
    }
    public static void comparision(Slytherin slytherinFirstStudent, Slytherin slytherinSecondStudent) {
        int skillTotalFirstStudent = slytherinFirstStudent.getCunning() + slytherinFirstStudent.getDetermination() + slytherinFirstStudent.getAmbition() + slytherinFirstStudent.getResourcefulness() + slytherinFirstStudent.getLustForPower();
        int skillTotalSecondStudent = slytherinSecondStudent.getCunning() + slytherinSecondStudent.getDetermination() + slytherinSecondStudent.getAmbition() + slytherinSecondStudent.getResourcefulness() + slytherinSecondStudent.getLustForPower();
        if (skillTotalFirstStudent > skillTotalSecondStudent) {
            System.out.println(slytherinFirstStudent.getFirstName() + " лучший слизеринец, чем " + slytherinSecondStudent.getFirstName());
        }
        else if (skillTotalFirstStudent < skillTotalSecondStudent){
            System.out.println(slytherinSecondStudent.getFirstName() + " лучший слизеринец, чем " + slytherinFirstStudent.getFirstName());
        }
        else {
            System.out.println(slytherinFirstStudent.getFirstName() + " и " + slytherinSecondStudent.getFirstName() + " равные по всяким слизеринским качествам слизеринцы");
        }
    }
}
