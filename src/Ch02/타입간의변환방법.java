package Ch02;

public class 타입간의변환방법 {

	public static void main(String[] args) {
		
		String str = "3";
		
		System.out.println('3' - '0');
		System.out.println('3' - '0' + 1);
		System.out.println(str.charAt(0) - '0');
		System.out.println("3".charAt(0) - '0');
		System.out.println("3" + "1");
		System.out.println(3 + "0");
		System.out.println(3 + '0');	// 0은 48을 의미
		System.out.println((char)(3 + '0'));

		
	}

}
