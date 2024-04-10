package lessons;

import java.util.Scanner;

public class TaskTime {

	public static void main(String[] args) {
		int timeEndDay = 86400;

		Scanner scanner = new Scanner(System.in);

		int time1, time2;
		do {
			System.out.println("Котра зараз година?");
			System.out.print("Впишіть години (від 0 до 23): ");
			time1 = scanner.nextInt();
		} while (time1 < 0 || time1 > 23);

		do {
			System.out.print("Впишіть хвилини (від 0 до 59): ");
			time2 = scanner.nextInt();
		} while (time2 < 0 || time2 > 59);

		System.out.print(String.format("%02d", time1));
		System.out.print(":");
		System.out.println(String.format("%02d", time2));

		int timeStartDay = ((time1 * 60) + time2) * 60;

		System.out.println("Пройшло секунд від початку доби: " + timeStartDay);
		System.out.println("Залишилось секунд до кінця доби: " + (timeEndDay - timeStartDay));

		scanner.close();
	}
}
