package Ch04;

import java.util.Scanner;

public class ex4_10 {

	public static void main(String[] args) {
		
		int n = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력 : ");
			input = sc.nextInt();
			
			if(n > input) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			else if(n < input) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			else {
				System.out.println("정답입니다.");
				System.out.println("시도 횟수는 " + count + "번입니다.");
				break;
			}
		}while(true);
	}

}
