package Ch06;

public class abs {

	public static int abs(int value) {
		return value >= 0 ? value : -value;
	}
	
	public static void main(String[] args) {

		int value = 5;
		System.out.println(value + "�� ���밪: " + abs(value));
		
		value = -10;
		System.out.println(value + "�� ���밪: " + abs(value));
	}
}
