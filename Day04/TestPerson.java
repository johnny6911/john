public class TestPerson {

	public static void main (String[] args) {

		Person sanghoon = new Person(861201, "정상훈", 32, "상도동");
		Person gildong = new Person(900420, "홍길동", 30, "서울");

		boolean isEqual = sanghoon.
		equals(gildong);
		System.out.println(isEqual);

		boolean isEqual2 = gildong.
		equals(sanghoon);
		System.out.println(isEqual2);

	}
}