package Udemy;

import java.util.ArrayList;

public class FindUniqueNo {

	public static void main(String[] args) {

		/**
		 * create arryalist if array and arraylist no is match then add it into
		 * arraylist count the no print the no
		 * 
		 * 
		 */

		int a[] = { 4, 5, 4, 5, 5, 4, 7, 9, 7 };
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;

			if (!ar.contains(a[i])) {
				ar.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.println(a[i] + " " + k);
				if (k == 1) {
					System.out.println("unique no is = " + a[i]);
				}
			}

		}

	}

}
