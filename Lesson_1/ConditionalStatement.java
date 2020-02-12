public class ConditionalStatement {
	public static void main(String[] args) {
		
		int age = 30;
		if (age > 20) {
			System.out.println("You are old");
		}

		boolean isMan = true;
		if (isMan) {
			System.out.println("You are a man");
		} else if (!isMan) {
			System.out.println("You are a woman");
		}

		float heihgt = 1.77f;
		if (heihgt < 1.80) {
			System.out.println("You are low");
		} else {
			System.out.println("You are toll");
		}

		char firstChar = 'I';
		if (firstChar == 'M') {
			System.out.println("M");
		} else if (firstChar == 'I') {
			System.out.println("I");
		} else {
			System.out.println("Not M and not I");
		}
	}
}