public class RepeatPrint {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("명령 구문이 올바르지 않습니다");
			System.out.println("사용법: ");
			System.out.println("java RepeatPrint [-options]");
			System.out.println("-message <입력할 메시지 입력>");
			System.out.println("-repeat <메시지 출력 반복횟수>");
		}
		//args[0]은 message를 뜻한다
		else if (args.length == 4) {
			if (args[0].equals("-message")) {
				System.out.println(args[1]);
			if (args[2].equals("-repeat"))
				System.out.println(args[3]);
			}
	
		} 
		
	}
}