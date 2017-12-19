public class Array {

	public static void main(String[] args) {

		String mon = "월";
		String tue = "화";
		String wed = "수";
		String thr = "목";
		String fri = "금";
		String sat = "토";
		String sun = "일";

		System.out.print(mon);
		System.out.print(tue);
		System.out.print(wed);
		System.out.print(thr);
		System.out.print(fri);
		System.out.print(sat);
		System.out.print(sun);

		System.out.println();

		// 배열 (Array)
		String[] weeks = {"월","화","수","목","금","토","일", "놀토", "불금"};
		for (int i = 0; i < weeks.length; i++) {
			System.out.print(weeks[i]); //weeks 의 0번째는 월이다 1번쨰는 화
		}
		
		System.out.println();
		// 동적 배열
		String[] fruit = new String[4];
		fruit[0] = "사과";
		fruit[1] = "딸기";
		fruit[2] = "포도";
		fruit[3] = "키위";
		for (int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i]); // []안의 i를 index라고 함
		}	

		// 2차원 배열
		// 정적 배열
		String[][] person = {
				{"홍길동", "서울", "남"}, //배열안에 String 3칸 생성
				{"홍길순", "부산", "여"} //String 배열을 담는 2칸이 있는것임
				};
		//Person[] p = new Person[3]; String[][]person하고 같음

		String result1 = person[0] [0]; // 홍길동
		String result2 = person[0] [1]; // 서울
		String result3 = person[1] [2]; // 여

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		for (int i = 0; i < person.length; i++) {
			for (int j = 0; j < person[i].length; j++) {
				System.out.println(person[i][j]);
			}
		}

		// 동적배열 (과일 - 이름,품질, 개수, 맛)
		String[][] fruitArray = new String[3][4]; // 과일 3개에 값은 2개
		fruitArray[0][0] = "귤";
		fruitArray[0][1] = "상";
		fruitArray[0][2] = "10";
		fruitArray[0][3] = "상큼하다";
		
		fruitArray[1][0] = "사과";
		fruitArray[1][1] = "상";
		fruitArray[1][2] = "10";
		fruitArray[1][3] = "달다";

		fruitArray[2][0] = "배";
		fruitArray[2][1] = "상";
		fruitArray[2][2] = "10";
		fruitArray[2][3] = "넘친다";

		String request1 = fruitArray[0] [0];
		String request2 = fruitArray[0] [1];
		String request3 = fruitArray[0] [2];
		String request4 = fruitArray[0] [3];
		

		// 위 2차원 배열을 for,if문을 이용하여 출력하세요
		// 출력 형식:
		// 이름: 귤
		// 품질: 상
		// 개수: 10
		// 맛: 상큼하다
		for (int i = 0; i < fruitArray.length; i++) {
			for (int j = 0; j < fruitArray[i].length; j++){
				if (j == 0) {
				System.out.println("이름: " + fruitArray[i][j]);
				}
				if (j == 1) {
				System.out.println("품질: " + fruitArray[i][j]);
				}
				if (j == 2) {
				System.out.println("개수: " + fruitArray[i][j]);
				}
				if (j == 3) {
				System.out.println("맛: " + fruitArray[i][j]);
				}
			}	
		}
	}	
}