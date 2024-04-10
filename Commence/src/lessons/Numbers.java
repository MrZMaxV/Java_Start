package lessons;

import java.util.Arrays;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		int i;
		int[] numbers = new int[4];
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Введіть 4 числа: ");

			for (i = 0; i < 4; i++) {
				numbers[i] = scanner.nextInt();
			}
		}
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

}
