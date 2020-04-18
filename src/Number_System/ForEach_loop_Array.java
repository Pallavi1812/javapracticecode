package Number_System;

public class ForEach_loop_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forEach();
	}

	
	static void forEach() {
		int a[][][]= {{{0,1},{2,3}},{{4,5},{6,7}},{{8,9},{10,11}}};
		for(int[][] s:a) {
			for(int[] s1:s) {
				for(int s2:s1) {
					System.out.print(s2+ " ");
				}
				System.out.println();
				
				
			}
			System.out.println();
		}
	}
}
