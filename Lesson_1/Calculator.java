public class Calculator {
	public static int answer (int first, int second, char sign) {
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
				ans = ans * b;
				second--; 
			}
		} else if (sign == '%') {
			ans = first % second;
		}
	return ans;
	}
}
