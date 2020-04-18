package OOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Abstract_Class {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader B = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter your colour");
		String carcolour=B.readLine();
		System.out.println("Enter your car count");
		int carcount = Integer.parseInt(B.readLine());

		 declareMethod dm=new defineMethods();
		 dm.CarColour(carcolour);
		 dm.CarCount(carcount);
	}
}

abstract class declareMethod {

	abstract void CarColour(String Colour);
	abstract void CarCount(int count);

}

class defineMethods extends declareMethod {
        void  CarColour(String Colour) {

		if (Colour.equals("Red")) {
			System.out.println("Available");
		}

		else if (Colour.equals("white")) {
			System.out.println("Not Available");

		} else if (Colour.equals("Blue")) {
			System.out.println("Available");
		}

		else {
			System.out.println("No this colour is not available! So Sorry");
		}

	}

	void CarCount(int count) {
		int s = count;

		if (s <= 10) {
			System.out.println("its available");
		} else {
			System.out.println("its not available");
		}
		
	}

}

