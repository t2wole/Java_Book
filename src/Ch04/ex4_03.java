package Ch04;

public class ex4_03 {

	public static void main(String[] args) {
		
		int sum = 0;
		int total_sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			total_sum += sum;
		}
		System.out.println(total_sum);
	}

}
