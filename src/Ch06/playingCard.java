package Ch06;

public class playingCard {

		int kind;
		int num;
		
		static int width;
		static int height;
		
		playingCard(int k, int n) {
			this.kind = k;
			this.num = n;
		}
		
		public static void main(String[] args) {
			playingCard card = new playingCard(1, 1);
		}
}
