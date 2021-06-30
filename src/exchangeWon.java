
public class exchangeWon {
	public void exchangeWon() {
		int won = 0;
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
