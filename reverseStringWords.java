//Reverse a String
//A typical programming interview question is “reverse a string, in place”. if you understand pointers, the solution is simple. even if you don’t, it can be accomplished using array indices. i usually ask candidates this question first, so they get the algorithm in their head. then i play dirty by asking them to reverse the string word by word, in place. for example if our string is “the house is blue”, the return value would be “blue is house the”. the words are reversed, but the letters are still in order (within the word).

public class reverseStringWords {
	public static void main(String[] args) {
		reverseWords("the house is blue");
	}

	private static void reverseWords(String string) {
		String backwards = "";
		String[] array = string.split(" ");
		for (int i = array.length - 1; i >= 0; i--) {
			backwards += " " + array[i];
		}
		System.out.println(backwards);
	}

}
