public class Wolf {
	private boolean sex;
	private String name;
	private int weight;
	private int age;
	private String color;

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Incorrect age");
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

	public void walk() {

	}

	public void sit() {

	}

	public void run() {

	}

	public void cry() {

	}

	public void hunt() {

	}
}