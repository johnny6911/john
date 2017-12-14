public class ValueRef {


	public static void main(String[] args) {

		String hello01 = "hello";
		String hello02 = "hello";

		String hello03 = new String("Hello");

		System.out.println(hello01);
		System.out.println(hello02);
		System.out.println(hello03);

		// hello01과 hello02 변수간의 비교 (==)을 사용
		if (hello01 == hello02) {
			System.out.println("hello01과 hello02는 같다");
		}
		else {
			System.out.println("hello01과 hello02는 같지않다");
		}

		//hello01과 hello03 변수간의 비교 (==)을 사용
		if (hello01 == hello03) {
			System.out.println("hello01과 hello03는 같다");
		}
		else {
			System.out.println("hello01과 hello03는 같지않다");
		}
		
		//hello01과 hello03 변수간의 비교(equals 메소드)
		//헬로우01이라는 녀석이 이퀄스라는 녀석을 호출함
		if (hello01.equals("hello03")) {
			System.out.println("hello01과 hello03은 같다");
		}
		else {
			System.out.println("hello01과 hello03은 같지않다");
		}
	}
}