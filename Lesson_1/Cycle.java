public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		int i = 6;
		while (i >= -6) {
			System.out.print(i + " ");
			i -= 2;
		}
		System.out.println();

		int n = 9;
		do {
			n += 2;
			System.out.print(n +" ");
		} while (n < 19);
	}
}