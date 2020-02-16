public class Calculator {

	public static int calculating(int first, int second, char sign) {
		int ans = first;

		switch (sign) {
			case '+':   ans = first + second;
					    break;
			case '-':   ans = first - second;
					    break;
			case '*':   ans = first * second;
					    break;
			case '/':   ans = first / second;
					    break;
			case '^':   ans = first * second;
					    int b = ans;
					    while (second > 1) {
						    ans *= b;
						    second--;
						} 
					    break;
			case '%':	ans = first % second;
					    break;	   
		}
		return ans;
	}
}
