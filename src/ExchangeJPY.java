import java.util.Scanner;

public class ExchangeJPY {
	public void exchangeJPY() {
		final double exchangeRateJPY = 1026.37;
		Scanner sc = new Scanner(System.in);
		System.out.print("ȯ���� �ݾ��� �Է��ϼ���.");
		int money = sc.nextInt();
		double JPY = money / exchangeRateJPY;
		int JPYInt;
		int won = 0;
		JPYInt = (int) JPY;
		won = (int) (money - (exchangeRateJPY * JPYInt));
		won = won / 10 * 10;
		System.out.printf("ȯ�� ��� ��ȭ�� %d��, �Ž������� %d�� �Դϴ�", JPYInt, won);
		System.out.println("\n");
		int JPY100 = JPYInt / 100;
		int JPY50 = (JPYInt - JPY100 * 100) / 500;
		int JPY20 = (JPYInt - (JPY100 * 100 + JPY50 * 50)) / 20;
		int JPY10 = (JPYInt - (JPY100 * 100 + JPY50 * 500 + JPY20 * 20)) / 10;
		System.out.println("<��ȭ>");
		System.out.println("100��: " + JPY100 + "��");
		System.out.println("50��: " + JPY50 + "��");
		System.out.println("20��: " + JPY20 + "��");
		System.out.println("10��: " + JPY10 + "��");
	}

}
