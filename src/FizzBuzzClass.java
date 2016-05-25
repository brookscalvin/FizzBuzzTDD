
public class FizzBuzzClass {

	public static String fizzBuzzMethod(int input) {
		String output = "";
		if (isDiv(input, 3))
			output += "Fizz";

		if (isDiv(input, 5))
			output += "Buzz";

		return output.equals("")?Integer.toString(input):output;

	}

	public static boolean isDiv(int num, int div) {
		return (num % div == 0);
	}
}
