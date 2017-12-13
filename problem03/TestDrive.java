public class TestDrive {

	public static void main(String[] args) {
		Student joy =
			new Student(13131313,"조이",23,"중문과",3);

		joy.study();
		joy.introduce();
	

		Student tim =
			new Student(13131314,"팀",22,"영문과",2);

		tim.study();
		tim.introduce();

		Student beke =
			new Student(13131315,"베케",21,"전자공학과",1);
		String result1 = beke.study1();
		System.out.println(result1);
		
		String result2 = beke.introduce1();
		System.out.println(result2);
				

	}
}