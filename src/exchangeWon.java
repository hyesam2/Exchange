
public class exchangeWon {
	public void exchangeWon() {
		int won = 0;
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
