package Number_System;

public class TwoD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array_2D();
		array_3D();
	}

	static void array_2D() {
		// int arr[][]=new int[4][4];
		int arr[][] = { { 100, 111 }, { 444, 555 }, { 666, 777 }, { 888, 999 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();

		}

	}

	static void array_3D() {
		int ar[][][] = { { { 0, 1 }, { 2, 3 } }, { { 4, 5 }, { 6, 7 } }, { { 8, 9 }, { 10, 11 } } };
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				for (int k = 0; k < ar[j].length; k++) {
					System.out.print(ar[i][j][k] + " ");

				}
				System.out.println();

			}

			System.out.println();

		}
	}

}
