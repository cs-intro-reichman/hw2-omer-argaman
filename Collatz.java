// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int a = Integer.parseInt(args[0]);
		char c = args[1].charAt(0);
		int hailstone = 1;
		int counter = 2;
		int counter2 = 1;
		int b = a;
		if (c == 'v') {
			System.out.print(hailstone + " ");
			hailstone = 3 * hailstone + 1;
			while ( a != 0) {
				while (hailstone != 1) {
					System.out.print(hailstone + " ");
					if (hailstone % 2 == 0) {
                		hailstone = hailstone / 2;
            		} else {
                		hailstone = 3 * hailstone + 1;
            		}
            		counter++;
        	 	}
				System.out.print(hailstone + " ");
			 	System.out.println("(" + counter + ")");
			 	a = a - 1;
				counter = 1;
				counter2 = counter2 + 1;
				hailstone = counter2;
				}
		}
		System.out.println("");
		System.out.print("Every one of the first " + b + " hailstone sequences reached 1.");
		}
	}
