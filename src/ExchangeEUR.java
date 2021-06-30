import java.util.Scanner;

public class ExchangeEUR {
	public void exchangeEUR() {
		final double exchangeRateEUR = 1349.52;
		Scanner sc = new Scanner(System.in);
		System.out.print("환전할 금액을 입력하세요.");
		int money = sc.nextInt();
		double EUR = money / exchangeRateEUR;
		int EURInt;
		int won = 0;
		EURInt = (int) EUR;
		won = (int) (money - (exchangeRateEUR * EURInt));
		won = won / 10 * 10;
		System.out.println();
		System.out.printf("환전 결과 유로는 %d유로, 거스름돈은 %d원 입니다", EURInt, won);
		System.out.println("\n");
		int EUR500 = EURInt / 500;
		int EUR200 = (EURInt - EUR500 * 500) / 200;
		int EUR100 = (EURInt - (EUR500 * 500 + EUR200 * 200)) / 100;
		int EUR50 = (EURInt - (EUR500 * 500 + EUR200 * 200 + EUR100 * 100)) / 50;
		int EUR20 = (EURInt - (EUR500 * 500 + EUR200 * 200 + EUR100 * 100 + EUR50 * 50)) / 20;
		int EUR10 = (EURInt - (EUR500 * 500 + EUR200 * 200 + EUR100 * 100 + EUR50 * 50 + EUR20 * 20)) / 10;
		int EUR5 = (EURInt - (EUR500 * 500 + EUR200 * 200 + EUR100 * 100 + EUR50 * 50 + EUR20 * 20 + EUR10 * 10)) / 5;
		System.out.println("<유로>");
		System.out.println("500유로: " + EUR500 + "개");
		System.out.println("200유로: " + EUR200 + "개");
		System.out.println("100유로: " + EUR100 + "개");
		System.out.println("50유로: " + EUR50 + "개");
		System.out.println("20유로: " + EUR20 + "개");
		System.out.println("10유로: " + EUR10 + "개");
		System.out.println("5유로: " + EUR5 + "개");
	}

}
