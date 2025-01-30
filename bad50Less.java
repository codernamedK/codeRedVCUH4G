import java.util.Scanner;

public class mainframe {

	
	//method to update percent bar 
	//public static int changepercent() {
	//}
	
	//method to check status
	//public static void checkStatus() {
	//}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int userChoice = 0;
		//int progress = checkStatus(); use this method to check on status
		
		//when progress perct less than 50 
		if (progress <= 50 && progress > 30) {
			System.out.println("Planet isn't looking good friend!");
			System.out.println();
			System.out.println("Do you want to?..");
			System.out.println("      1. Turn on your sprinklers and water all your flowers?");
			System.out.println("Or    2. Don't water the lawn at all, it's raining tomorrow.");
			
			System.out.println("Type your option below ( 1 ) or ( 2 ) ");
			System.out.println();
			userChoice = sc.nextInt();
						
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
							userChoice = scnr.nextInt();
						}
			}
		else if (progress <= 30 && progress > 20) {
			System.out.println("Planet getting a little scary!");
			System.out.println();
			System.out.println("Do you want to?..");
			System.out.println("      1. Tidy up the storm basins (drains)?");
			System.out.println("Or    2. Throw away trash in public places");
			
			System.out.println();
			System.out.println();
			System.out.println("Type your option below ( 1 ) or ( 2 ) ");
			System.out.println();
			userChoice = sc.nextInt();
						
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
							userChoice = scnr.nextInt();
						}
			}
		
		else if (progress <= 20 && progress > 10) {
			System.out.println("Planet is on its way out, We gotta save it!!");
			System.out.println();
			System.out.println("Do you want to?..");
			System.out.println("      1. Throw away electronics improperly?");
			System.out.println("Or    2. Recycle your old electronics and batteries");
			
			System.out.println();
			System.out.println();
			System.out.println("Type your option below ( 1 ) or ( 2 ) ");
			System.out.println();
			userChoice = sc.nextInt();
						
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
							userChoice = scnr.nextInt();
						}
			}
		}
		else if(progress <= 10) {
			System.out.println("Planet done. Everyone is dead. And you are a disappointment");
			System.exit();
		}
		
		sc.close();
	}
}
