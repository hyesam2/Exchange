import java.util.Scanner;

public class ExchangeEUR {
	public void exchangeEUR() {
		final double exchangeRateEUR = 1349.52;
		Scanner sc = new Scanner(System.in);
		System.out.print("ȯ���� �ݾ��� �Է��ϼ���.");
		int money = sc.nextInt();
		double EUR = money / exchangeRateEUR;
		int EURInt;
		int won = 0;
		EURInt = (int) EUR;
		won = (int) (money - (exchangeRateEUR * EURInt));
		won = won / 10 * 10;
		System.out.println();
		System.out.printf("ȯ�� ��� ���δ� %d����, �Ž������� %d�� �Դϴ�", EURInt, won);
		System.out.println("\n");
		int EUR500 = EURInt / 500;
		int EUR200 = (EURInt - EUR500 * 500) / 200;
		int EUR100 = (EURInt - (EUR500 * 500 + EUR200 * 200)) / 100;
		int EUR50 = (EURInt - (EUR500 * 500 + EUR200 * 200 + EUR100 * 100)) / 50;
		int EUR20 = (EURInt - (EUR500 * 500 + EUR200 * 200 + EUR100 * 100 + EUR50 * 50)) / 20;
		int EUR10 = (EURInt - (EUR500 * 500 + EUR200 * 200 + EUR100 * 100 + EUR50 * 50 + EUR20 * 20)) / 10;
		int EUR5 = (EURInt - (EUR500 * 500 + EUR200 * 200 + EUR100 * 100 + EUR50 * 50 + EUR20 * 20 + EUR10 * 10)) / 5;
		System.out.println("<����>");
		System.out.println("500����: " + EUR500 + "��");
		System.out.println("200����: " + EUR200 + "��");
		System.out.println("100����: " + EUR100 + "��");
		System.out.println("50����: " + EUR50 + "��");
		System.out.println("20����: " + EUR20 + "��");
		System.out.println("10����: " + EUR10 + "��");
		System.out.println("5����: " + EUR5 + "��");
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
