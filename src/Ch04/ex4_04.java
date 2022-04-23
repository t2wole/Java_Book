package Ch04;

public class ex4_04 {

	public static void main(String[] args) {

		int sum = 0;
		int change = 1;
		int n = 0;
		
		for(int i = 1; true; i++, change = -change) {
			n = change * i;
			sum += n;
			
			if(sum >= 100) 
				break;
		}
		System.out.println("n=" + n);
		System.out.println("sum=" + sum);
	}

}
