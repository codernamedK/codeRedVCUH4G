import java.util.Scanner;

public class MainFrame {
    private static int numGoodDeeds = 0;
    private static int numBadDeeds = 0;
    private static int worldSustainability = 0;
    private final static int worldSustainabilityPerPercent = 2; // max for bar is 200 points


    /**
     *  Creates a visual bar to represent the world sustainability using the static variable
     *   world sustainability as an input.
     * @return a progress bar of the world sustainability as a String
     */
    public static String createSustainabilityBar() {
        String worldSustainabilityBar = "[";
        // progress bar progression: each "=" represents 5%
        int progress = worldSustainability / (worldSustainabilityPerPercent * 5);
        if (progress > 20) { // can have a score higher than 200, but the bar won't overfill
            progress = 20;
        }

        for (int i = 0; i < progress; i++) { // fill in bar with current progress
            worldSustainabilityBar += "=";
        }
        for (int i = 0; i < (20 - progress); i++) { // fill rest of progress bar with spaces
            worldSustainabilityBar += " ";
        }
        worldSustainabilityBar += "]";

        return worldSustainabilityBar;
    }

    /**
     *  Provides general background information about Pretty Planet's setting, as well as
     *   information regarding the player's number of good and bad deeds, the world's sustainability
     *   progress, the player's sustainability score, and options to resume the game or quit it.
     */
    public static void menu() {
        // background information
        System.out.println("Your planet is currently facing extinction. Bad weather," +
                " animals dying, global warming...");
        System.out.println("Start your path to make the planet pretty, or worsen its current condition.\n");

        // goods deeds & bad behavior log
        String worldSustainabilityBar = createSustainabilityBar();
        int personalSustainabilityScore = numGoodDeeds - numBadDeeds;
        System.out.println("Progress to World Sustainability: " + worldSustainabilityBar + " " +
                (worldSustainability / worldSustainabilityPerPercent) + "%");
        System.out.println("You have performed " + numGoodDeeds + " good deeds, and " + numBadDeeds +
                " bad deeds. Your sustainability score is " + personalSustainabilityScore + ".\n");

        // resume or exit options
        Scanner in = new Scanner(System.in);
        int choice = 0;
        while (choice == 0) {
            System.out.print("Enter '1' to Resume game, and '2' to Exit game. ");
            choice = in.nextInt();
            if (choice == 1) { // resume program
                // resume
            } else if (choice == 2) { // exit program
                System.exit(0);
            } else { // request proper input
                choice = 0;
                System.out.println("Improper input");
            }
        }
        in.close();
    }

    public static void main(String[] args) {
        worldSustainability = 175;
        menu();
    }
}