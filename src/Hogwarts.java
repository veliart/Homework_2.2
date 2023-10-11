public abstract class Hogwarts {
    protected final String firstName;
    protected final String lastName;
    protected final int spellPower;
    protected final int transgressionPower;

    public Hogwarts(String firstName, String lastName, int spellPower, int transgressionPower) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.spellPower = spellPower;
        this.transgressionPower = transgressionPower;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public int getTransgressionPower() {
        return transgressionPower;
    }
    private int getMagicSkills() {
        return spellPower + transgressionPower;
    }

    public static void comparisionMagicSkills(Hogwarts firstStudent, Hogwarts secondStudent) {
        int magicSkillsFirstStudent = firstStudent.getMagicSkills();
        int magicSkillsSecondStudent = secondStudent.getMagicSkills();
        if (magicSkillsFirstStudent > magicSkillsSecondStudent) {
            System.out.println(firstStudent.getFirstName() + " обладает большей силой магии, чем " + secondStudent.getFirstName());
        }
        else if (magicSkillsFirstStudent < magicSkillsSecondStudent){
            System.out.println(secondStudent.getFirstName() + " обладает большей силой магии, чем " + secondStudent.getFirstName());
        }
        else {
            System.out.println(firstStudent.getFirstName() + " и " + secondStudent.getFirstName() + " равны по силе магии");
        }
    }
}
