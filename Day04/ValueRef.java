public class ValueRef {


	public static void main(String[] args) {

		String hello01 = "hello";
		String hello02 = "hello";

		String hello03 = new String("Hello");

		System.out.println(hello01);
		System.out.println(hello02);
		System.out.println(hello03);

		// hello01�� hello02 �������� �� (==)�� ���
		if (hello01 == hello02) {
			System.out.println("hello01�� hello02�� ����");
		}
		else {
			System.out.println("hello01�� hello02�� �����ʴ�");
		}

		//hello01�� hello03 �������� �� (==)�� ���
		if (hello01 == hello03) {
			System.out.println("hello01�� hello03�� ����");
		}
		else {
			System.out.println("hello01�� hello03�� �����ʴ�");
		}
		
		//hello01�� hello03 �������� ��(equals �޼ҵ�)
		//��ο�01�̶�� �༮�� ��������� �༮�� ȣ����
		if (hello01.equals("hello03")) {
			System.out.println("hello01�� hello03�� ����");
		}
		else {
			System.out.println("hello01�� hello03�� �����ʴ�");
		}
	}
}