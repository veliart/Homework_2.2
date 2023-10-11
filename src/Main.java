public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry", "Potter", 100, 100, 100, 100, 100);
        Gryffindor hermioneGranger = new Gryffindor("Hewrmione", "Granger", 100, 90, 100, 100, 90);
        Gryffindor ronWeasley = new Gryffindor("Ron", "Weasley", 90, 80, 100, 100, 90);
        Ravenclaw choChang = new Ravenclaw("Cho", "Chang", 70, 70, 90, 90, 90, 70);
        Ravenclaw padmaPatil = new Ravenclaw("Padma", "Patil", 75, 85, 80, 75, 75, 80);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus", "Belby", 65, 65, 65, 65, 65, 65);
        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias", "Smith", 70, 80, 60, 70, 90);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric", "Diggory", 95, 90, 90, 80, 100);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin", "Finch-Fletchley", 83, 83, 83, 83, 83);
        Slytherin dracoMalfoy = new Slytherin("Draco", "Malfoy", 80, 80, 90, 70, 100, 80, 100);
        Slytherin grahamMontague = new Slytherin("Graham", "Montague", 50, 50, 50, 50, 50, 50, 50);
        Slytherin gregoryGoyle = new Slytherin("Gregory", "Goyle", 1, 1, 1, 1, 1, 1, 1);

        Gryffindor.comparision(ronWeasley, hermioneGranger);
        Ravenclaw.comparision(choChang, padmaPatil);
        Hufflepuff.comparision(cedricDiggory, justinFinchFletchley);
        Slytherin.comparision(dracoMalfoy, gregoryGoyle);
        Hogwarts.comparisionMagicSkills(harryPotter, grahamMontague);
    }
}