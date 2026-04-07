public class PracticeProblem {

	public static void main(String args[]) {
    
	    System.out.println("sum Test 1: " + sum(5, 3));
        System.out.println("sum Test 2: " + sum(10, -2));
        System.out.println("sum Test 3: " + sum(0, 0));
        System.out.println("sum Test 4: " + sum(-5, -3));
        System.out.println("sum Test 5: " + sum(100, 200));

        System.out.println();

	    System.out.println("difference Test 1: " + difference(10, 4));
        System.out.println("difference Test 2: " + difference(5, 10));
        System.out.println("difference Test 3: " + difference(0, 0));
        System.out.println("difference Test 4: " + difference(-3, -5));
        System.out.println("difference Test 5: " + difference(20, 5));

        System.out.println();

		System.out.println("product Test 1: " + product(2.5, 4.0));
        System.out.println("product Test 2: " + product(3.0, -2.0));
        System.out.println("product Test 3: " + product(0.0, 5.5));
        System.out.println("product Test 4: " + product(-1.5, -2.0));
        System.out.println("product Test 5: " + product(10.0, 10.0));

        System.out.println();

		System.out.println("removeFirst Test 1: " + removeFirst("Hello"));
        System.out.println("removeFirst Test 2: " + removeFirst("World"));
        System.out.println("removeFirst Test 3: " + removeFirst("A"));
        System.out.println("removeFirst Test 4: " + removeFirst(""));
        System.out.println("removeFirst Test 5: " + removeFirst("Java"));
	}

	public static int sum(int num1, int num2) {
        return num1 + num2;
    }

	public static int difference(int num1, int num2) {
        return num1 - num2;
    }

	public static double product(double num1, double num2) {
        return num1 * num2;
    }

	public static String removeFirst(String str) {
        if (str.length() <= 1) {
            return "";
        }
        return str.substring(1);
    }
}
