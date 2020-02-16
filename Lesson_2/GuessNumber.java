public class GuessNumber {

	private int secretNumb;

	public GuessNumber () {
		secretNumb = (int)(Math.random() * 100);
	}

	public boolean move(Player player) {

		if (player.getNumber() == secretNumb) {
			System.out.println(player.getName() + " win its " + secretNumb);
			return true;
		} else if (player.getNumber() > secretNumb) {
			System.out.println("This number is less");
		} else {
			System.out.println("This number is bigger");
		}
		return false;
	}
}