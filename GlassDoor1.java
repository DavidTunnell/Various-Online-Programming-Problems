// You are given a list of integers, and you are to produce another list of the same length whose ith element 
// is the median of the first i elements of the original list. 
// http://www.glassdoor.com/Interview/You-are-given-a-list-of-integers-and-you-are-to-produce-another-list-of-the-same-length-whose-ith-element-is-the-median-of-QTN_386365.htm

import java.util.Arrays;

public class GlassDoor1 {
	public static void main(String[] args) {
		int[] givenList = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		newList(givenList, 6);

	}

	private static void newList(int[] list, int i) {
		if (i <= list.length) {
			int[] unsorted = list.clone();
			Arrays.sort(list);
			int median;
			int n, m;
			if (i % 2 == 0) {
				n = i / 2;
				m = i / 2 - 1;
				median = (list[n] + list[m]) / 2;
				unsorted[i - 1] = median;
				unsorted[i-2] = median;
			} else {
				n = (i / 2);
				median = list[n];
				unsorted[i - 1] = median;

			}

			System.out.println("List of Integers: ");
			for (int l = 0; l < unsorted.length; l++) {
				System.out.print(" " + unsorted[l]);
			}
		} else {
			System.out.println("Value i is too large.");
		}
	}
}