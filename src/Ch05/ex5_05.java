package Ch05;

public class ex5_05 {

	public static void main(String[] args) {
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i = 0; i < ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length);
			int temp;
			
			temp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = temp;
		}
		
		// arraycopy(����, ������ ������ġ, ������, ����� ������ġ, ������ ����);
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		
		for(int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}
		System.out.println();
	}
}
