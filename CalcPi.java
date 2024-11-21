// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    double pi = 1;
		double counter = 3;
		double fraction = 1 / counter;
		int a = Integer.parseInt(args[0]);
		for (int i = 1; i < a; i++) {
			if (i % 2 == 0) {
				pi = pi + fraction;
            } else {
				pi = pi - fraction;
			}
			counter = counter + 2;
			fraction = 1 / counter;
		}
		double benchmark = Math.PI;
		pi = pi * 4;
		System.out.println("pi according to Java: " + benchmark);
		System.out.println("pi, approximated:     " + pi);
	}

}
