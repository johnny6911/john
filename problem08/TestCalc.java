public class TestCalc {

	public static void main (String[] args) {

		Calc a = new Calc();
		
		int c = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		
		int result = a.add(c, b);
		System.out.println(result);

		int result2 = a.sub(c, b);
		System.out.println(result2);

		int result3 = a.mul(c, b);
		System.out.println(result3);

		int result4 = a.div(c, b);
		System.out.println(result4);

		
		
	

	}

}