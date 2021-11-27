public class Team implements OlympicsTeam {
    String name;
    int numberOfAthletes;
    int numberOfGoldMedals;

    public Team(String name, int numberOfAthletes, int numberOfGoldMedals) {
        this.name = name;
        this.numberOfAthletes = numberOfAthletes;
        this.numberOfGoldMedals = numberOfGoldMedals;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name + "Number of athletes: " + numberOfAthletes + "Number of gold medals: " + numberOfGoldMedals);
    }

    @Override
    public void printNumberOfAthletes() {
        System.out.println("Name: " + name + ", Number of athletes: " + numberOfAthletes);
    }

    @Override
    public void printNumberOfGoldMedals() {
        System.out.println("Name: " + name + ", Number of gold medals: " + numberOfGoldMedals);
    }
}
