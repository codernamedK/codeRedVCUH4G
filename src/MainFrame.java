import java.util.Scanner;

public class MainFrame {
    private static int numGoodDeeds = 0;
    private static int numBadDeeds = 0;
    private static int worldSustainability = 0;
    private final static double worldSustainabilityPerPercent = 1.5; // max for bar is 150 points


    /**
     * Creates a visual bar to represent the world sustainability using the static variable
     * world sustainability as an input.
     *
     * @return a progress bar of the world sustainability as a String
     */
    private static String createSustainabilityBar() {
        String worldSustainabilityBar = "[";
        // progress bar progression: each "=" represents 5%
        double progress = worldSustainability / (worldSustainabilityPerPercent * 5);
        if (progress > 20) { // can have a score higher than 150, but the bar won't overfill
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
     * Provides general background information about Pretty Planet's setting, as well as
     * information regarding the player's number of good and bad deeds, the world's sustainability
     * progress, the player's sustainability score, and options to resume the game or quit it.
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
        worldSustainability = 51;
        int userChoice = 0;
        //int progress = checkStatus(); use this method to check on status


        System.out.print("Hi there! Your planet is currently improving, but there is still work to be done in your day to day...\n");
        Scanner in = new Scanner(System.in);
        while (userChoice != 1 && userChoice != 2 && userChoice != 3) {
            System.out.print("Wow look at the time! You almost missed your doctors appointment. Would you like to walk (1), ride the bike (2), or drive (3)?\n");
            userChoice = in.nextInt();

            if (worldSustainability <= 75 && worldSustainability > 100) {
                if (userChoice == 1 || userChoice == 2) {
                    System.out.print("You just repaired a part of your Ozone layer. Now there's less smog and your planet is prettier!\n");
                    worldSustainability += 30;
                    numGoodDeeds++;
                } else if (userChoice == 3) {
                    System.out.print("You drove your car. There is now extreme air pollution making it difficult to breathe.\n");
                    numBadDeeds++;
                } else {
                    System.out.print("Error. You must choose either 1,2, or 3.\n");
                }

            }


            while (worldSustainability <= 150) {
                System.out.print("Pick an option to better the environment(1) or stop playing(2)!/n");
                int userSecChoice = in.nextInt();
                if (userSecChoice == 1) {
                    while (true) {
                        if (worldSustainability <= 50 && worldSustainability > 75) {
                            System.out.print("Looks like you are thirsty! Buy a 40 pack of plastic water bottles(1) or drink fridge water(2)?\n");
                            int userThirdChoice = in.nextInt();

                            if (userThirdChoice == 1) {
                                System.out.print("Unfortunately your water bottles were not properly disposed of. The ocean now has over 70% of plastic waste in it making it difficult for species to survive.\n");
                                numBadDeeds++;
                                break;
                            } else if (userThirdChoice == 2) {
                                System.out.print("You just contributed to less plastic waste. There is less garbage in the ocean now! Your planet is prettier! \n");
                                worldSustainability += 20;
                                numGoodDeeds++;
                                break;
                            } else {
                                System.out.print("Error. You must choose either 1 or 2.\n");
                            }
                        }
                    }

                } else if (userSecChoice == 2) {
                    System.out.print("Thank you for playing! Goodbye!");
                    break;
                } else {
                    System.out.print("Error. You must choose either 1 or 2.");
                }
            }
            //when progress perct less than 50
            if (worldSustainability <= 50 && worldSustainability > 30) {
                System.out.println("Planet isn't looking good friend!");
                System.out.println();
                System.out.println("Do you want to?..");
                System.out.println("      1. Turn on your sprinklers and water all your flowers?");
                System.out.println("Or    2. Don't water the lawn at all, it's raining tomorrow.");

                System.out.println("Type your option below ( 1 ) or ( 2 ) ");
                System.out.println();
                userChoice = in.nextInt();

                while (userChoice != 3) {
                    switch (userChoice) {
                        case 1:
                            System.out.println();
                            System.out.println("Why not save that water for firefighters? -15%!!");
                            worldSustainability -= 15;
                            numBadDeeds += 1;
                            break;
                        case 2:
                            System.out.println();
                            System.out.println("Great work! Waiting for a rainy day is best for your wallet and the planet! +10%");
                            worldSustainability += 10;
                            numGoodDeeds += 1;
                            break;
                        default:
                            System.out.println("Invalid option. Please enter [1 or 2]");
                            break;
                    }

                    System.out.println();
                    userChoice = in.nextInt();
                }
            } else if (worldSustainability <= 30 && worldSustainability > 20) {
                System.out.println("Planet getting a little scary!");
                System.out.println();
                System.out.println("Do you want to?..");
                System.out.println("      1. Tidy up the storm basins (drains)?");
                System.out.println("Or    2. Throw away trash in public places");

                System.out.println();
                System.out.println();
                System.out.println("Type your option below ( 1 ) or ( 2 ) ");
                System.out.println();
                userChoice = in.nextInt();

                while (userChoice != 2) {
                    switch (userChoice) {
                        case 1:
                            System.out.println();
                            System.out.println("This will help keep public water clean and maybe help a nearby critter! +20%");
                            worldSustainability += 20;
                            numGoodDeeds += 1;
                            break;
                        case 2:
                            System.out.println();
                            System.out.println("Come on litter bug! That's not pretty at all! -25%");
                            worldSustainability -= 25;
                            numBadDeeds += 1;
                            break;
                        default:
                            System.out.println("Invalid option. Please enter [1 or 2]");
                            break;
                    }

                    System.out.println();
                    userChoice = in.nextInt();
                }
            } else if (worldSustainability <= 20 && worldSustainability > 10) {
                System.out.println("Planet is on its way out, We gotta save it!!");
                System.out.println();
                System.out.println("Do you want to?..");
                System.out.println("      1. Throw away electronics improperly?");
                System.out.println("Or    2. Recycle your old electronics and batteries");

                System.out.println();
                System.out.println();
                System.out.println("Type your option below ( 1 ) or ( 2 ) ");
                System.out.println();
                userChoice = in.nextInt();

                while (userChoice != 2) {
                    switch (userChoice) {
                        case 1:
                            System.out.println();
                            System.out.println("Now there is acid in the soil you jerk! -30%");
                            worldSustainability -= 30;
                            numBadDeeds += 1;
                            break;
                        case 2:
                            System.out.println();
                            System.out.println("Nice work, now those wires and hardware can be re-used! +30%");
                            worldSustainability += 30;
                            numGoodDeeds += 1;
                            break;
                        default:
                            System.out.println("Invalid option. Please enter [1 or 2]");
                            break;
                    }

                    System.out.println();
                    userChoice = in.nextInt();
                }
            }
        }
    }
}
