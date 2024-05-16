import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CeilingFan ceilingFan = new CeilingFan();
		Scanner scanner = new Scanner(System.in);

		System.out.println("The date today is " + ceilingFan.getPresentDate() + "\n");

		// Instructions for the user
		System.out.println(
				"This is a ceiling fan. To turn the ceiling fan on, you need to pull the speed cord. Each time you pull speed cord, the speed of the fan will increase. The fan has four speeds, the fourth time you pull the speed cord, the speed of the fan will reset to 0.\nYou can also change the direction of the fan by pulling the direction cord. The fan does not operate on December 25.\n");
		// Initializing the option to quit as false
		boolean quit = false;

		// while loop with instructions for the user to change speed, direction or quit
		while (!quit && !ceilingFan.isOffDay()) {

			System.out.println(
					"The following are the options to control the ceiling fan \nPlease enter 1 to pull the speed cord.\nPlease enter 2 to pull the direction cord.\nPlease enter 3 to quit.\n");

			if (!scanner.hasNextInt()) {
				System.out.println("Invalid input. Please enter a number between 1 and 3.\n");
				scanner.next(); // Clear the invalid input
				continue;
			}

			int choice = scanner.nextInt();
			System.out.println("");

			switch (choice) {
				case 1:
					ceilingFan.pullFanSpeedCord();
					break;
				case 2:

					ceilingFan.pullFanDirectionCord();
					break;
				case 3:
					ceilingFan.setSpeed(0);
					quit = true;

					break;
				default:
					System.out.println("Invalid option. Please choose again.");
			}

			// letting the user know about the current state.
			System.out.println("Current speed: " + ceilingFan.getSpeed() + ", Direction: "
					+ (ceilingFan.isClockwiseDirection() ? "clockwise Direction"
							: "anti-clockwise direction"));
		}

		scanner.close();
	}
}
