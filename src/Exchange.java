import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExchangeUSD USD = new ExchangeUSD();
		ExchangeEUR EUR = new ExchangeEUR();
		ExchangeJPY JPY = new ExchangeJPY();
		
		int number;
		
		while (true) {
			while (true) {
				System.out.print("환전할 종류는? (1:USD, 2:EUR, 3:JPY) ");
				number = sc.nextInt();
				if (number > 3) {
					System.out.println("다시 입력하세요.");
				} else {
					break;
				}
			}
		
			switch (number) {
			case 1:
				USD.exchangeUSD();
				break;
			case 2:
				EUR.exchangeEUR();
				break;
			case 3:
				JPY.exchangeJPY();
				break;
			case 0:
				System.out.println("환전 프로그램 종료");
				return;
			default:
				break;
			}
			
			
			int terminate = sc.nextInt();
			if (terminate != 0) {

			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		sc.close();
	}
}
