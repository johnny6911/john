public class JavaType {

	public static void main(String[] args) {

		// 분류		자료형		상수
		// 정수형 	byte		-128 ~ 127
		// 정수형 	short		-32,768 ~ 32,767
		// 정수형	int(기본형)	10진수,8진수,16진수
		// 정수형 	long		32000L (숫자 뒤에 L은 붙임)
		// 실수형 	float		(+,-)1,4E-45 ~ 3.4028234E38 (숫자 뒤에 F를 붙임)
		// 실수형 	double(기본형)	(+, -)4.9E-324 ~1.7976931348623157E308
				//float보다 더 범위가 넓음
		// 문자열	String		큰 따옴표로 표기
		// 문자		char		작은 따옴표로 한글자만 표기 숫자도 입력가능
		// 부울		boolean		true, false


		// 정수형
		int intValue = 0;
		int num01 = 10;		// 10진수 0을 표기
		int num02 = 01750;	// 8진수 8을 표기 0은 8=10 을 나타남
		int num03 = 0x10;	// 16진수 16을 표기 0x(8의 배)은 16= 10을 나타냄
		byte bNum01 = -128;
		short sNum01 = -32768;
		long lNum01 =  -2132253424L;

		System.out.println(intValue);
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);
		System.out.println(bNum01);
		System.out.println(sNum01);
		System.out.println(lNum01);


		// 실수형
		float floatVal = 3.14F;
		double doubleVal = 256.12;
		System.out.println(floatVal);
		System.out.println(doubleVal);	

		String stringValue = "안녕하세요";
		String bye = "안녕히 계세요";
		System.out.println(stringValue);
		System.out.println(bye);

		// 문자
		char lol = 'A';
		char char01 = 65; // 'A'
		System.out.println(lol);	

		// 부울
		boolean trueVal = true;
		boolean falseVal = false;
		System.out.println(" " + true + 10);
		System.out.println(false);		

		boolean result = 1 == 2;
		boolean result2 = 1 != 2;
		System.out.println(result);
		System.out.println(result2);
		
		boolean isEqualNumber = 10 == 11;
		boolean isEqualName = "진도" == "은두";
		boolean isEqualtype = "허스키" == "허스키";
		if (isEqualNumber && isEqualName && isEqualtype) {

		}

		// 논리합 || - 둘중에서 하나라도 true면 true가 된다
		// false && true && false
		// false && false
		// false

		// 형변환
		// 인식이 안되면 기본적으로 int타입으로 인식한다(오류남!)
		// 바이트 타입은 127 이상의 숫자를 입력할경우 다시 -128부터 순환된다
		// (타입)을 앞에 넣어준다
		byte byteRes = (byte)128; //int형을 강제로 byte 타입으로 변경
		System.out.println(byteRes);

		short shortRes = (short)32768; //int -> short 형변환(shortRes는 변수명)
		System.out.println(shortRes);

		float floatVal01 = 12.34F;
		int intVal01 = (int)floatVal01; // float -> int 형변환 소수점 생략 double도 같음
		System.out.println(intVal01);

		int charNum = 'A';	// char -> int 형변환
		System.out.println(charNum);		
	}
}