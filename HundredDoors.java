//100 Doors in a Row
//Problem: you have 100 doors in a row that are all initially closed. you make 100 passes by the doors starting with the first door every time. the first time through you visit every door and toggle the door (if the door is closed, you open it, if its open, you close it). the second time you only visit every 2nd door (door #2, #4, #6). the third time, every 3rd door (door #3, #6, #9), etc, until you only visit the 100th door.
//
//question: what state are the doors in after the last pass? which are open which are closed?

import java.util.Arrays;

public class HundredDoors {

	public static void main(String[] args) {
		// false == closed
		boolean[] array = new boolean[100];
		Arrays.fill(array, false);
		for (int i = 1; i <= 100; i++) {
			for (int n = i; n <= 100; n = n + i) {
				array[n - 1] = !array[n - 1];
			}
		}
		System.out.print("The open doors are:");
		for (int x = 0; x < 100; x++) {
			if (array[x])
				System.out.print(" " + (x+1));
		}
	}
}
