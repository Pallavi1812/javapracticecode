package random_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Random_number {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		puzzle(); // Calling the method puzzle into main method

	}

	// Create a random method
	public static int random() {
		Random rand = new Random();
		int randomnumber = rand.nextInt(50);
		System.out.println(randomnumber);
		return randomnumber;// Returning a value randomly
		// comparison(Value);

	}

	// Create a method in which taking a value from user through bufferreader
	public static int Userinput() throws NumberFormatException, IOException {
		BufferedReader B = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please provide your value for Comparison");
		int guessnumber = Integer.parseInt(B.readLine());
		return guessnumber;
		// comparison(value1);

	}

	// Create a method in which comparing both the values
	public static void comparison(int randomnumber) throws NumberFormatException, IOException {
		boolean S = false;
		// int guessnumber=Userinput();
		int i = 0;

		while (S == false) {
			// int i=0;

			int guessnumber = Userinput();
			i++;

			if (randomnumber == guessnumber) {
				System.out.println("you have guessed a correct number");
				S = true;

				System.out.println("Your number of attempts is  " + i);

			} else if (randomnumber > guessnumber) {

				System.out.println("Please select a bigger value ");

			} else if (randomnumber < guessnumber) {

				System.out.println("Please select a smaller value");

			}

		}

	}

	public static void puzzle() throws NumberFormatException, IOException {
		int a = random();
		comparison(a);
	}
}
