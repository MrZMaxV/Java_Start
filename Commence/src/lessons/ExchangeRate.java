package lessons;

public class ExchangeRate {

	public static void main(String[] args) {
		int zlota_amount = 100;
		
		double exchanger1 = 9.5;
		double exchanger2 = 10.5;
		double exchanger3 = 8.75;
		
		double conversion_exchanger1 = zlota_amount*exchanger1;
		double conversion_exchanger2 = zlota_amount*exchanger2;
		double conversion_exchanger3 = zlota_amount*exchanger3;
		
		if (conversion_exchanger1 > conversion_exchanger2 && conversion_exchanger1 > conversion_exchanger3) {
			System.out.println("Найвигідніший курс в обміннику №1:\n Отримано " + conversion_exchanger1 + " грн.");
		} else if (conversion_exchanger2 > conversion_exchanger1 && conversion_exchanger2>conversion_exchanger3) {
			System.out.println("Найвигідніший курс в обміннику №2:\n Отримано " + conversion_exchanger2 + " грн.");
		} else if (conversion_exchanger3 > conversion_exchanger1 && conversion_exchanger3>conversion_exchanger2) {
			System.out.println("Найвигідніший курс в обміннику №3:\n Отримано " + conversion_exchanger3 + " грн.");
		} 
	}

}
