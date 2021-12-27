public class LineComparison {
	public static void main(String arg[]) {
		int x1, x2, y1, y2;
		int p1, p2, t1, t2;
		double line1_length, line2_length;
		x1 = 4;
		y1 = 5;
		x2 = 5;
		y2 = 6;
		p1 = 5;
		p2 = 4;
		t1 = 7;
		t2 = 4;
		// formula for finding length
		line1_length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		line2_length = Math.sqrt(Math.pow(p2 - p1, 2) + Math.pow(t2 - t1, 2));
		System.out.println("Welcome To Line Comparison Computation");

		// convert double to string for used compareTo java method String s= String.valueOf(d);
		String length1 = String.valueOf(line1_length);
		String length2 = String.valueOf(line2_length);

		// used java equal method
		if (length1.equals(length2))
			System.out.println("both line are equal");
		else
			System.out.println("both line are unequal");

	}
}
