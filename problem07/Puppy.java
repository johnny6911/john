class Puppy {

	//1. �ν��Ͻ� ����
	String sort;
	String name;
	int age;
	String gender;

	public Puppy(String sort, String name,int age, String gender) {

	this.sort = sort;
	this.name = name;
	this.age = age;
	this.gender = gender;

	}
	boolean equals(Puppy puppy) {
		if (this.sort == puppy.sort) {
			if (this.name == puppy.name) { 
				//puppy������ �̸��� �������
				return true; 
				//���⼭ boolean equals�� �ӹ��� �� ����
			}
			return false; //puppy�� ������ ������ �̸��� �ٸ����
		} 
		return false; // puppy ������ �ٸ��� �̸��� �ٸ����
	}
}