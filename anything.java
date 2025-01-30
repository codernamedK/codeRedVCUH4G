import java.util.Scanner;

public class MainFrame {
    public static void main (String[] args){
        goodPath();
    }

    public static int goodPath() {
        int behaviorCount = 0;

        System.out.print("Hi there! Your planet is currently improving, but there is still work to be done in your day to day...\n");
        Scanner in = new Scanner(System.in);
        int userChoice = 0;
        while (userChoice != 1 && userChoice != 2 && userChoice != 3) {
            System.out.print("Wow look at the time! You almost missed your doctors appointment. Would you like to walk (1), ride the bike (2), or drive (3)?\n");
            userChoice = in.nextInt();

            if (worldSustainability <= 75  && worldSustainability > 100){
            if (userChoice == 1 || userChoice == 2) {
                System.out.print("You just repaired a part of your Ozone layer. Now there's less smog and your planet is prettier!\n");
                worldSustainibility += 30; 
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
                    if(worldSustainability <= 50 && worldSustainability > 75){
                    System.out.print("Looks like you are thirsty! Buy a 40 pack of plastic water bottles(1) or drink fridge water(2)?\n");
                    int userThirdChoice = in.nextInt();

                    if (userThirdChoice == 1) {
                        System.out.print("Unfortunately your water bottles were not properly disposed of. The ocean now has over 70% of plastic waste in it making it difficult for species to survive.\n");
                        numBadDeeds;
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
        return behaviorCount;
    }
}
