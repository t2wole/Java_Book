package Ch06;

public class myPoint {
	int x;
	int y;
	
	myPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		return Math.sqrt((x-x1) * (x-x1) + (y-y1) * (y-y1));
	}
	
	public static void main(String[] args) {
		myPoint mp = new myPoint(1, 1);
		
		System.out.println(mp.getDistance(2, 2));
	}
}
