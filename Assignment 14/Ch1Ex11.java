public class Ch1Ex11 {
    public static void main(String[] args) {
        double currentPopulation = 312032486;
        double secondsInYear = 365 * 24 * 60 * 60;
        double birthsPerYear = secondsInYear / 7.0;
        double deathsPerYear = secondsInYear / 13.0;
        double immigrantsPerYear = secondsInYear / 45.0;
        for (int i = 1; i <= 5; i++) {
            currentPopulation += birthsPerYear + immigrantsPerYear - deathsPerYear;
            System.out.println("Year " + i + " population: " + (int)currentPopulation);
        }
    }
}
