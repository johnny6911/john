public class Array {

	public static void main(String[] args) {

		String mon = "��";
		String tue = "ȭ";
		String wed = "��";
		String thr = "��";
		String fri = "��";
		String sat = "��";
		String sun = "��";

		System.out.print(mon);
		System.out.print(tue);
		System.out.print(wed);
		System.out.print(thr);
		System.out.print(fri);
		System.out.print(sat);
		System.out.print(sun);

		System.out.println();

		// �迭 (Array)
		String[] weeks = {"��","ȭ","��","��","��","��","��", "����", "�ұ�"};
		for (int i = 0; i < weeks.length; i++) {
			System.out.print(weeks[i]); //weeks �� 0��°�� ���̴� 1������ ȭ
		}
		
		System.out.println();
		// ���� �迭
		String[] fruit = new String[4];
		fruit[0] = "���";
		fruit[1] = "����";
		fruit[2] = "����";
		fruit[3] = "Ű��";
		for (int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i]); // []���� i�� index��� ��
		}	

		// 2���� �迭
		// ���� �迭
		String[][] person = {
				{"ȫ�浿", "����", "��"}, //�迭�ȿ� String 3ĭ ����
				{"ȫ���", "�λ�", "��"} //String �迭�� ��� 2ĭ�� �ִ°���
				};
		//Person[] p = new Person[3]; String[][]person�ϰ� ����

		String result1 = person[0] [0]; // ȫ�浿
		String result2 = person[0] [1]; // ����
		String result3 = person[1] [2]; // ��

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		for (int i = 0; i < person.length; i++) {
			for (int j = 0; j < person[i].length; j++) {
				System.out.println(person[i][j]);
			}
		}

		// �����迭 (���� - �̸�,ǰ��, ����, ��)
		String[][] fruitArray = new String[3][4]; // ���� 3���� ���� 2��
		fruitArray[0][0] = "��";
		fruitArray[0][1] = "��";
		fruitArray[0][2] = "10";
		fruitArray[0][3] = "��ŭ�ϴ�";
		
		fruitArray[1][0] = "���";
		fruitArray[1][1] = "��";
		fruitArray[1][2] = "10";
		fruitArray[1][3] = "�޴�";

		fruitArray[2][0] = "��";
		fruitArray[2][1] = "��";
		fruitArray[2][2] = "10";
		fruitArray[2][3] = "��ģ��";

		String request1 = fruitArray[0] [0];
		String request2 = fruitArray[0] [1];
		String request3 = fruitArray[0] [2];
		String request4 = fruitArray[0] [3];
		

		// �� 2���� �迭�� for,if���� �̿��Ͽ� ����ϼ���
		// ��� ����:
		// �̸�: ��
		// ǰ��: ��
		// ����: 10
		// ��: ��ŭ�ϴ�
		for (int i = 0; i < fruitArray.length; i++) {
			for (int j = 0; j < fruitArray[i].length; j++){
				if (j == 0) {
				System.out.println("�̸�: " + fruitArray[i][j]);
				}
				if (j == 1) {
				System.out.println("ǰ��: " + fruitArray[i][j]);
				}
				if (j == 2) {
				System.out.println("����: " + fruitArray[i][j]);
				}
				if (j == 3) {
				System.out.println("��: " + fruitArray[i][j]);
				}
			}	
		}
	}	
}