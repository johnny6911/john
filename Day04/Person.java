class Person {

	// �ν��Ͻ� ����,��� ����
	int ssn;	//�ֹι�ȣ
	String name; 	//�̸�
	int age;	//����
	String address; //�ּ�

	//������ (constructor)
	public Person(int ssn,String name, int age, String address) {

		this.ssn = ssn;
		this.name = name;
		this.age = age;
		this.address = address;
	}			

	// �ֹι�ȣ�� �������� �ؼ� �� ����� �������� ��
	//boolean = ���� ������ ��Ÿ���� ���� ���
	//==�� ���ϱ� ���� �����
	boolean equals(Person p) {
		if (this.ssn == p.ssn) {
			return true;
		}

		return false;
	}
}