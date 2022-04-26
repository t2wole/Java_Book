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
		
		// arraycopy(원본, 원본의 시작위치, 복사대상, 대상의 시작위치, 가져올 길이);
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		
		for(int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}
		System.out.println();
	}
}
