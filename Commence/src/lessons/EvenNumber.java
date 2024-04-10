package lessons;

public class EvenNumber {

	public static void main(String[] args) {
		float i = 6;
		float j = 7;

		boolean evenNumber;

		if (i % 2 == 0) {
			evenNumber = true;
		} else {
			evenNumber = false;
		}

		System.out.println(evenNumber);
		
		if (j% 2 > 1) {
			evenNumber = true;
		} else {
			evenNumber = false;
		}

		System.out.println(evenNumber);
	}
}
