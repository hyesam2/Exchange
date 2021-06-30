import java.util.Scanner;

public class ExchangeUSD {
	public void exchangeUSD() {
		final double exchangeRateUSD = 1133.10;
		Scanner sc = new Scanner(System.in);
		System.out.print("환전할 금액을 입력하세요.");
		int money = sc.nextInt();
		double USD = money / exchangeRateUSD;
		int USDInt;
		int won = 0;
		USDInt = (int) USD;
		won = (int) (money - (exchangeRateUSD * USDInt));
		won = won / 10 * 10;
		System.out.printf("환전 결과 달러는 %d달러, 거스름돈은 %d원 입니다", USDInt, won);
		System.out.println("\n");
		int USD100 = USDInt / 100;
		int USD50 = (USDInt - USD100 * 100) / 50;
		int USD20 = (USDInt - (USD100 * 100 + USD50 * 50)) / 20;
		int USD10 = (USDInt - (USD100 * 100 + USD50 * 50 + USD20 * 20)) / 10;
		int USD5 = (USDInt - (USD100 * 100 + USD50 * 50 + USD20 * 20 + USD10 * 10)) / 5;
		int USD2 = (USDInt - (USD100 * 100 + USD50 * 50 + USD20 * 20 + USD10 * 10 + USD5 * 5)) / 2;
		int USD1 = (USDInt - (USD100 * 100 + USD50 * 50 + USD20 * 20 + USD10 * 10 + USD5 * 5 + USD2 * 2)) / 1;
		System.out.println("<달러>");
		System.out.println("100달러: " + USD100 + "개");
		System.out.println("50달러: " + USD50 + "개");
		System.out.println("20달러: " + USD20 + "개");
		System.out.println("10달러: " + USD10 + "개");
		System.out.println("5달러: " + USD5 + "개");
		System.out.println("2달러: " + USD2 + "개");
		System.out.println("1달러: " + USD1 + "개");
		System.out.println("\n<거스름돈>");
		int won1000 = won / 1000;
		int won500 = (won - won1000 * 1000) / 500;
		int won100 = (won - (won1000 * 1000 + won500 * 500)) / 100;
		int won50 = (won - (won1000 * 1000 + won500 * 500 + won100 * 100)) / 50;
		int won10 = (won - (won1000 * 1000 + won500 * 500 + won100 * 100 + won50 * 50)) / 10;
		System.out.println("1000원: " + won1000 + "개");
		System.out.println("500원: " + won500 + "개");
		System.out.println("100원: " + won100 + "개");
		System.out.println("50원: " + won50 + "개");
		System.out.println("10원: " + won10 + "개");
		System.out.println("계속 환전 하시겠습니까? (0 누르면 종료)");
	}

}
