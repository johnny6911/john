class PuppyAdv {

	//1. �ν��Ͻ� ����
	String sort;
	String name;
	int age;
	String gender;

	public PuppyAdv(String sort, String name,int age, String gender) {

	this.sort = sort;
	this.name = name;
	this.age = age;
	this.gender = gender;

	}
	//������ �켱����
	//0. &&: ����, ||: ����
	// 1. + - * / ������� /(�����ô�)
	// �� �޼ҵ� �����
	boolean equals(PuppyAdv puppy) {

		if (this.sort == puppy.sort && this.name == puppy.name) {
			return true;
		}
		return false;
	}
}