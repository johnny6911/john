public class JavaType {

	public static void main(String[] args) {

		// �з�		�ڷ���		���
		// ������ 	byte		-128 ~ 127
		// ������ 	short		-32,768 ~ 32,767
		// ������	int(�⺻��)	10����,8����,16����
		// ������ 	long		32000L (���� �ڿ� L�� ����)
		// �Ǽ��� 	float		(+,-)1,4E-45 ~ 3.4028234E38 (���� �ڿ� F�� ����)
		// �Ǽ��� 	double(�⺻��)	(+, -)4.9E-324 ~1.7976931348623157E308
				//float���� �� ������ ����
		// ���ڿ�	String		ū ����ǥ�� ǥ��
		// ����		char		���� ����ǥ�� �ѱ��ڸ� ǥ�� ���ڵ� �Է°���
		// �ο�		boolean		true, false


		// ������
		int intValue = 0;
		int num01 = 10;		// 10���� 0�� ǥ��
		int num02 = 01750;	// 8���� 8�� ǥ�� 0�� 8=10 �� ��Ÿ��
		int num03 = 0x10;	// 16���� 16�� ǥ�� 0x(8�� ��)�� 16= 10�� ��Ÿ��
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


		// �Ǽ���
		float floatVal = 3.14F;
		double doubleVal = 256.12;
		System.out.println(floatVal);
		System.out.println(doubleVal);	

		String stringValue = "�ȳ��ϼ���";
		String bye = "�ȳ��� �輼��";
		System.out.println(stringValue);
		System.out.println(bye);

		// ����
		char lol = 'A';
		char char01 = 65; // 'A'
		System.out.println(lol);	

		// �ο�
		boolean trueVal = true;
		boolean falseVal = false;
		System.out.println(" " + true + 10);
		System.out.println(false);		

		boolean result = 1 == 2;
		boolean result2 = 1 != 2;
		System.out.println(result);
		System.out.println(result2);
		
		boolean isEqualNumber = 10 == 11;
		boolean isEqualName = "����" == "����";
		boolean isEqualtype = "�㽺Ű" == "�㽺Ű";
		if (isEqualNumber && isEqualName && isEqualtype) {

		}

		// ���� || - ���߿��� �ϳ��� true�� true�� �ȴ�
		// false && true && false
		// false && false
		// false

		// ����ȯ
		// �ν��� �ȵǸ� �⺻������ intŸ������ �ν��Ѵ�(������!)
		// ����Ʈ Ÿ���� 127 �̻��� ���ڸ� �Է��Ұ�� �ٽ� -128���� ��ȯ�ȴ�
		// (Ÿ��)�� �տ� �־��ش�
		byte byteRes = (byte)128; //int���� ������ byte Ÿ������ ����
		System.out.println(byteRes);

		short shortRes = (short)32768; //int -> short ����ȯ(shortRes�� ������)
		System.out.println(shortRes);

		float floatVal01 = 12.34F;
		int intVal01 = (int)floatVal01; // float -> int ����ȯ �Ҽ��� ���� double�� ����
		System.out.println(intVal01);

		int charNum = 'A';	// char -> int ����ȯ
		System.out.println(charNum);		
	}
}