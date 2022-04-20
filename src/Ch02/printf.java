package Ch02;

public class printf {

	public static void main(String[] args) {
		
		System.out.printf("%d\n", 15);
		System.out.printf("%#o\n", 15);	// 8진수
		System.out.printf("%#x\n", 15);	// 16진수
		System.out.printf("%s\n", Integer.toBinaryString(15)); // 2진수로
		
		System.out.printf("[%5d]\n", 1234567);
		System.out.printf("[%5d]\n", 10);
		System.out.printf("[%-5d]\n", 10);
		System.out.printf("[%05d]\n", 10);
		
		double d = 1.23456789;
		System.out.printf("%.6f\n", d);
		
		System.out.printf("[%s]", "www.codechobo.com");
	}

}
