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
			System.out.print("1�� 100 ������ ���� �Է� : ");
			input = sc.nextInt();
			
			if(n > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}
			else if(n < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}
			else {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ� Ƚ���� " + count + "���Դϴ�.");
				break;
			}
		}while(true);
	}

}
