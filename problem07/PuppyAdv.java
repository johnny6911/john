class PuppyAdv {

	//1. 인스턴스 변수
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
	//연산자 우선순위
	//0. &&: 논리곱, ||: 논리합
	// 1. + - * / 나누기는 /(슬레시다)
	// 비교 메소드 만들기
	boolean equals(PuppyAdv puppy) {

		if (this.sort == puppy.sort && this.name == puppy.name) {
			return true;
		}
		return false;
	}
}