package Ch02;

public class 리터럴타입과접미사 {

	public static void main(String[] args) {
		
		final int score = 100;
		//score = 200;
		
		boolean power = true;
		
		byte b = 127; // -128 ~ 127
		
		int oct = 010; // 8진수 -> 10진수로 8
		int hex = 0x10; // 16진수 -> 10진수로 16
		
		System.out.println(oct);
		System.out.println(hex);
		
		long L = 10000000000L;
		
		// float < double
		float f = 3.14f;
		double d = 3.14;
		double dd = 3.14f;
		
		System.out.println(10.0);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3); // 10의 e승 -> e가 3임

		
	}

}
