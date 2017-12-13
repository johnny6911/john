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
	}
}