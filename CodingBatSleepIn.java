//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
//We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in. 
//
//sleepIn(false, false) → true
//sleepIn(true, false) → false
//sleepIn(false, true) → true
// 
public class CodingBatSleepIn {

	public static void main(String[] args) {
		System.out.println(sleepIn(false, false));
		System.out.println(sleepIn(true, false));
		System.out.println(sleepIn(false, true));
		System.out.println(sleepIn(true, true));
	}

	private static boolean sleepIn(boolean weekDay, boolean vacation) {
		if (weekDay == true && vacation == true) {
			return true;
		} else if (weekDay == false && vacation == false) {
			return true;
		} else if (weekDay == false && vacation == true) {
			return true;
		} else {
			return false;
		}
	}
}
