import java.util.ArrayList;

public class Composite implements OlympicsTeam {
    ArrayList<OlympicsTeam> Teams = new ArrayList<OlympicsTeam>();

    public void addTeam(OlympicsTeam team) {
        Teams.add(team);
    }

    public void removeTeam(OlympicsTeam team) {
        Teams.remove(team);
    }

    public void print() {
        for (OlympicsTeam team : Teams) {
            team.print();
        }
    }

    public void printNumberOfAthletes() {
        for (OlympicsTeam team : Teams) {
            team.printNumberOfAthletes();
        }
    }

    public void printNumberOfGoldMedals() {
        for (OlympicsTeam team : Teams) {
            team.printNumberOfGoldMedals();
        }
    }
}
