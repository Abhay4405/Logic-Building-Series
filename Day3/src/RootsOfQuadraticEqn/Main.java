package RootsOfQuadraticEqn;

public class Main {
	public static double sqrt(double num , double guess) {
		double new_guess = (guess+num/guess)/2;
		if (new_guess == guess) {
			System.out.println(new_guess);
			return new_guess;
		}
		return sqrt(num, new_guess);
	}
public static void main(String[] args) {
	int a = 2; int b = 4; int c = 2; //ax^2 + bx + c = 0
	double discri = b*b - 4*a*c;
	double root1; double root2 = 0;
	if (discri > 0) {
		root1 = (-b + sqrt(discri, discri/2))/2*a;
		root1 = (-b - sqrt(discri, discri/2))/2*a;
		System.out.println(root1+" , "+root2);
	}
	else if (discri == 0) {
		root1 = root2 = -b/2*a;
		System.out.println(root1+" , "+root2);
	}
	else {
		System.out.println("Roots are imaginary.");
	}
}
}
