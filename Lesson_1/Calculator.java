public class Calculator {
	public static void main(String[] args) {
		System.out.println(calculating(3, 5,'*'));
	}

	public static int calculating(int first, int second, char sign) {
		int ans = first;
		if (sign == '+') {
			ans = first + second;
		} else if (sign == '-') {
			ans = first - second;
		} else if (sign == '*') {
			ans = first * second;
		} else if (sign == '/') {
			ans = first / second;
		} else if (sign == '^') {
			int b = ans;
			while (second > 1) {
				ans *= b;
				second--; 
			}
		} else if (sign == '%') {
			ans = first % second;
		}
		return ans;
	}
}
