class Puppy {

	//1. 인스턴스 변수
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
				//puppy종류와 이름이 같은경우
				return true; 
				//여기서 boolean equals의 임무는 다 끝남
			}
			return false; //puppy의 종류는 같은데 이름이 다른경우
		} 
		return false; // puppy 종류가 다르고 이름도 다른경우
	}
}