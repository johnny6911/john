class Person {

	int headSize; 	// 머리크기	(숫자)
	int height;   	// 키		(숫자)
	String gender;  // 성별		(문자)
	int age;	// 나이		(숫자)
	String name;	// 이름		(문자)
	String family;	// 가족		(문자)


	// 생성자 (Constructor, 속성 값 초기화)
	public Person(int headSize, int height, String gender, 
		int age, String name, String family) {

		this.headSize = headSize;
		this.height = height;
		this.gender = gender;
		this.age = age;
		this.name = name;
		this.family = family;
	}

	// 무엇을 먹는다 (배부르다, 배고프다) 메소드 (method)
	String eat(String food) {
		if (food.equals("빵")) {
			return this.name + "은(는) 배부르다.";
		}
		else {
			return this.name + "은(는) 배고프다.";
		}
	}

	// 어디에서 잔다 (꿀잠잤다, 피곤하다)
	String sleep(String where) {
		if (where.equals("땅바닥")) {
			return this.name + "은 피곤하다.";
		}
		else {
			return this.name + "은 꿀잠잤다";
		}
	}
	
	// 어디위로 걷는다
	void walk(String where) {
		System.out.println(this.name + "은" + where + "위로 걷는다. ");
	}

	// 무엇을 생각한다
	void think(String how) {
		System.out.println(this.name + "은" + how + "을(를) 생각한다.");
	}
	
	//숫자 a와 숫자b를 더하는 메서드
	int add(int a, int b) {
		return a + b;
	}
}