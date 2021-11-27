public class Client {
    public static void main(String[] args) {
        // All sports teams
        Team Teakwondo          = new Team("Teakwondo", 10, 1);
        Team Waterpolo          = new Team("Waterpolo", 12, 2);
        Team ArtisticGymnastics = new Team("Artistic Gymnastics", 7, 0);
        Team Shooting           = new Team("Shooting", 9, 1);
        Team Cycling            = new Team("Cycling", 8, 0);
        Team Tennis             = new Team("Tennis", 4, 0);
        Team TableTennis        = new Team("Table Tennis", 6, 1);
        Team Football           = new Team("Football", 20, 0);
        Team AlpineSky          = new Team("Alpine Sky", 8, 2);
        Team Football2          = new Team("Football", 24,2);
        Team Swimming           = new Team("Swimming", 10, 3);

        // All olympic teams
        Composite Olympia           = new Composite();
        // Continent
        Composite AsiaTeam          = new Composite();
        Composite AfricaTeam        = new Composite();
        Composite EuropeTeam        = new Composite();
        Composite SouthAmericaTeam  = new Composite();
        // Countries
        Composite ChinaTeam         = new Composite();
        Composite AfghanistanTeam   = new Composite();
        Composite GermanyTeam       = new Composite();
        Composite ItalyTeam         = new Composite();
        // Gender
        Composite WomensTeamChina   = new Composite();
        Composite MensTeamChina     = new Composite();
        Composite WomensTeamGermany = new Composite();
        Composite MensTeamGermany   = new Composite();
        Composite WomensTeamItaly   = new Composite();
        Composite MensTeamItaly     = new Composite();

        // Add teams to the composite nodes
        Olympia.addTeam(AsiaTeam);
        Olympia.addTeam(AfricaTeam);
        Olympia.addTeam(EuropeTeam);
        Olympia.addTeam(SouthAmericaTeam);

        AsiaTeam.addTeam(ChinaTeam);
        AsiaTeam.addTeam(AfghanistanTeam);

        EuropeTeam.addTeam(GermanyTeam);
        EuropeTeam.addTeam(ItalyTeam);

        ChinaTeam.addTeam(WomensTeamChina);
        ChinaTeam.addTeam(MensTeamChina);

        GermanyTeam.addTeam(WomensTeamGermany);
        GermanyTeam.addTeam(MensTeamGermany);

        ItalyTeam.addTeam(WomensTeamItaly);
        ItalyTeam.addTeam(MensTeamItaly);

        WomensTeamChina.addTeam(Teakwondo);
        WomensTeamChina.addTeam(Waterpolo);
        WomensTeamChina.addTeam(ArtisticGymnastics);

        MensTeamChina.addTeam(Shooting);

        WomensTeamGermany.addTeam(Cycling);
        WomensTeamGermany.addTeam(Tennis);

        MensTeamGermany.addTeam(TableTennis);
        MensTeamGermany.addTeam(Football);

        WomensTeamItaly.addTeam(AlpineSky);

        MensTeamItaly.addTeam(Football2);
        MensTeamItaly.addTeam(Swimming);

        // Printing data
        System.out.println("Germany Men’s Team");
        MensTeamGermany.printNumberOfAthletes();
        System.out.println("Germany");
        GermanyTeam.printNumberOfGoldMedals();
        System.out.println("Asia’s Team");
        AsiaTeam.printNumberOfGoldMedals();
        System.out.println("Olympic 2024");
        Olympia.printNumberOfAthletes();
    }
}
