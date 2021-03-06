package assigments;

public class ThrowKeyword {
	public static void main(String[] args) {

		int a = 45, b = 0, rs;

		try {
			System.out.println("Trying to divide "+a+" by "+b);
			if (b == 0)
				throw (new ArithmeticException("Exception thrown : Can't divide by zero."));
			else {
				rs = a / b;
				System.out.print("\n\tThe result is : " + rs);
			}
		} catch (ArithmeticException Ex) {
			System.out.print("\n\tError : " + Ex.getMessage());
		}

		System.out.print("\n\tEnd of program.");
	}
}
