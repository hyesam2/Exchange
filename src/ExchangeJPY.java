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
		System.out.println("\n<�Ž�����>");
		int won1000 = won / 1000;
		int won500 = (won - won1000 * 1000) / 500;
		int won100 = (won - (won1000 * 1000 + won500 * 500)) / 100;
		int won50 = (won - (won1000 * 1000 + won500 * 500 + won100 * 100)) / 50;
		int won10 = (won - (won1000 * 1000 + won500 * 500 + won100 * 100 + won50 * 50)) / 10;
		System.out.println("1000��: " + won1000 + "��");
		System.out.println("500��: " + won500 + "��");
		System.out.println("100��: " + won100 + "��");
		System.out.println("50��: " + won50 + "��");
		System.out.println("10��: " + won10 + "��");
		System.out.println("��� ȯ�� �Ͻðڽ��ϱ�? (0 ������ ����)");
	}

}
