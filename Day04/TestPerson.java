public class TestPerson {

	public static void main (String[] args) {

		Person sanghoon = new Person(861201, "������", 32, "�󵵵�");
		Person gildong = new Person(900420, "ȫ�浿", 30, "����");

		boolean isEqual = sanghoon.
		equals(gildong);
		System.out.println(isEqual);

		boolean isEqual2 = gildong.
		equals(sanghoon);
		System.out.println(isEqual2);

	}
}