
class Student {
	int number;
	String name;
	int age;
	String major;
	int grade;

	public Student (int number, String name, int age, String major, int grade)
	{
	this.number = number;
	this.name = name;
	this.age = age;
	this.major = major;
	this.grade = grade;
	}

	void study() {
		System.out.println(this.name +"가" + this.major + "공부를 한다");
	}


	void introduce() {
		System.out.println("저는" + this.major + this.grade + "학년 재학중인" + this.name + "입니다");
	}
	

}
