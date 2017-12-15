public class TestCalc {

	public static void main (String[] args) {


		Calc a = new Calc();
		Calc b = new Calc();
		
		int result1 = a.add(2, 2);
		System.out.println(result1);

		int result2 = a.sub(2, 2);
		System.out.println(result2);

		int result3 = b.mul(2, 2);
		System.out.println(result3);

		int result4 = b.div(2, 2);
		System.out.println(result4);

		
		
	

	}

}