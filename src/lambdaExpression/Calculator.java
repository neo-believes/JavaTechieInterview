package lambdaExpression;

interface Expression {

	void sum(int a, int b);
	// void switchOn();
}

public class Calculator {

	public static void main(String[] args) {

		Expression expression = (a, b) -> System.out.println(a + b);
		// Expression expression = () -> System.out.println("switchOn called");
		expression.sum(10, 20);
	}

}
