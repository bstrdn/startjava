public class MyFirstGame {
	public static void main(String[] args) {
		Secret(32, 45);
	}

	public static void Secret (int secretNumb, int numb) {
			if (numb == secretNumb) {
				System.out.println("You win");
			} else {
				if (numb < secretNumb) {
					System.out.println("You number is less");
				} else {
					System.out.println("You number is greater");
				}
			}
	}


}