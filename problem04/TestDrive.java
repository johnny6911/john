
public class TestDrive {

	
	public static void main(String[] args) {

		
	Board A =
		new Board(Integer.parseInt (args[0]),args[1],args[2],args[3],args[4]);
	Board B =
		new Board(Integer.parseInt (args[0]),args[1],args[2],args[3],args[4]);
	Board C =
		new Board(Integer.parseInt (args[0]),args[1],args[2],args[3],args[4]);

		String result1 = A.printBoard();
		System.out.println(result1);
	
		String result2 = B.printBoard();
		System.out.println(result2);
		
		String result3 = C.printBoard();
		System.out.println(result3);
	
	}
}