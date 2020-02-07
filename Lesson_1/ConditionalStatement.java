public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 30;
		boolean isMan = true;
		float heihgt = 1.77f;
		char firstChar = 'È';

		if (age > 20) {
			System.out.println("You are old");
		}

		if (isMan) {
			System.out.println("You are a man");
		} else {
			System.out.println("You are a woman");
		}

		if (heihgt < 1.80) {
			System.out.println("You are low");
		} else {
			System.out.println("You are toll");
		}

		if (firstChar == 'Ì') {
			System.out.println("M");
		} else if (firstChar == 'È') {
			System.out.println("I");
		} else {
			System.out.println("Not M and not I");
		}
	}
}