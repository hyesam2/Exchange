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
	}

}
