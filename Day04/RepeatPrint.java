public class RepeatPrint {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("��� ������ �ùٸ��� �ʽ��ϴ�");
			System.out.println("����: ");
			System.out.println("java RepeatPrint [-options]");
			System.out.println("-message <�Է��� �޽��� �Է�>");
			System.out.println("-repeat <�޽��� ��� �ݺ�Ƚ��>");
		}
		//args[0]�� message�� ���Ѵ�
		else if (args.length == 4) {
			if (args[0].equals("-message")) {
				System.out.println(args[1]);
			if (args[2].equals("-repeat"))
				System.out.println(args[3]);
			}
	
		} 
		
	}
}