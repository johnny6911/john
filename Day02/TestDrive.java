

public class TestDrive {

	// ���α׷��� ������
	public static void main(String[] args) {

		// ��ü (Object): yeEun, sangIl, sangHoon
		Person yeEun = 
			new Person(10, 163, "��" , 23, "������", "A");
		Person sangIl =
			new Person(10, 173, "��" , 45, "�����", "B");
		Person sangHoon =
			new Person(10, 177, "��" , 32, "������", "C");
	
		//�������� ���� �Դ´�
		String result1 = yeEun.eat("��");
		System.out.println(result1);

		//���Ͼ��� ħ�뿡�� �ܴ�
		String result2 = sangIl.sleep("ħ��");
		System.out.println(result2);
	
		//���ƾ��� �������� �ȴ´�
		sangHoon.walk("����");
		
		//���ƾ��� ��Ʈ������ �������Ѵ�
		sangHoon.think("��Ʈ����");

		//����� 12�� ����
		int result3 = yeEun. add(5, 7);
		System.out.println(result3);
	}
}