import java.util.Scanner;

public class ExchangeUSD {
	public void exchangeUSD() {
		final double exchangeRateUSD = 1133.10;
		Scanner sc = new Scanner(System.in);
		System.out.print("ȯ���� �ݾ��� �Է��ϼ���.");
		int money = sc.nextInt();
		double USD = money / exchangeRateUSD;
		int USDInt;
		int won = 0;
		USDInt = (int) USD;
		won = (int) (money - (exchangeRateUSD * USDInt));
		won = won / 10 * 10;
		System.out.printf("ȯ�� ��� �޷��� %d�޷�, �Ž������� %d�� �Դϴ�", USDInt, won);
		System.out.println("\n");
		int USD100 = USDInt / 100;
		int USD50 = (USDInt - USD100 * 100) / 50;
		int USD20 = (USDInt - (USD100 * 100 + USD50 * 50)) / 20;
		int USD10 = (USDInt - (USD100 * 100 + USD50 * 50 + USD20 * 20)) / 10;
		int USD5 = (USDInt - (USD100 * 100 + USD50 * 50 + USD20 * 20 + USD10 * 10)) / 5;
		int USD2 = (USDInt - (USD100 * 100 + USD50 * 50 + USD20 * 20 + USD10 * 10 + USD5 * 5)) / 2;
		int USD1 = (USDInt - (USD100 * 100 + USD50 * 50 + USD20 * 20 + USD10 * 10 + USD5 * 5 + USD2 * 2)) / 1;
		System.out.println("<�޷�>");
		System.out.println("100�޷�: " + USD100 + "��");
		System.out.println("50�޷�: " + USD50 + "��");
		System.out.println("20�޷�: " + USD20 + "��");
		System.out.println("10�޷�: " + USD10 + "��");
		System.out.println("5�޷�: " + USD5 + "��");
		System.out.println("2�޷�: " + USD2 + "��");
		System.out.println("1�޷�: " + USD1 + "��");
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
