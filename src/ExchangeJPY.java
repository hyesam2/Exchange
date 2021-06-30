import java.util.Scanner;

public class ExchangeJPY {
	public void exchangeJPY() {
		final double exchangeRateJPY = 1026.37;
		Scanner sc = new Scanner(System.in);
		System.out.print("환전할 금액을 입력하세요.");
		int money = sc.nextInt();
		double JPY = money / exchangeRateJPY;
		int JPYInt;
		int won = 0;
		JPYInt = (int) JPY;
		won = (int) (money - (exchangeRateJPY * JPYInt));
		won = won / 10 * 10;
		System.out.printf("환전 결과 엔화는 %d엔, 거스름돈은 %d원 입니다", JPYInt, won);
		System.out.println("\n");
		int JPY100 = JPYInt / 100;
		int JPY50 = (JPYInt - JPY100 * 100) / 500;
		int JPY20 = (JPYInt - (JPY100 * 100 + JPY50 * 50)) / 20;
		int JPY10 = (JPYInt - (JPY100 * 100 + JPY50 * 500 + JPY20 * 20)) / 10;
		System.out.println("<엔화>");
		System.out.println("100엔: " + JPY100 + "개");
		System.out.println("50엔: " + JPY50 + "개");
		System.out.println("20엔: " + JPY20 + "개");
		System.out.println("10엔: " + JPY10 + "개");
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
