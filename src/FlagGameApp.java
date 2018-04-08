

public class FlagGameApp {

	public static void main(String[] args) {
	

		int flags = 0;
		int computerTurn = 0;
		int playerTurn = 0;
		boolean isPturn = false;
		boolean isCturn = true;
		String choice = "Y";
		while (choice.equalsIgnoreCase("Y")) {
			flags = Console.getInt("Enter number of flags: ");

			while(true) {
				System.out.println("Flags Remaining: " + flags);
				computerTurn = divByFour(flags);
				flags -= computerTurn;
				isCturn = true;
				System.out.println("Computer has taken " + computerTurn + " flags.");
				System.out.println("Flags Remaining: " + flags);
				if(flags == 0)break;
				isCturn = false;
				isPturn = true;
				playerTurn = Console.getInt("How many flags will yout take?");
				flags -= playerTurn;
				System.out.println("You have taken " + playerTurn + " flags.");
				System.out.println("Flags Remaining: " + flags);
				if(flags == 0)break;
				isPturn = false;


			}
			if(isCturn == true) {
				System.out.println("Computer Wins!");
			}else System.out.println("Player Wins");
			Console.getString("Continue? y/n: ", "Y", "N");
		}
	}

	public static int divByFour(int flags) {
		int computerTurn = 0;
		if ((flags-3) % 4 == 0) {
			computerTurn = 3;
		}else if ((flags - 2) % 4 == 0) {
			computerTurn = 2;
		}else if ((flags - 1) % 4 == 0) {
			computerTurn = 1;
		}else computerTurn = 1;

		return computerTurn;
	}

}
