public class TestPuppy {

	public static void main (String[] args) {

		PuppyAdv A = new PuppyAdv("husky","����",3,"boy");
		PuppyAdv B = new PuppyAdv("puddle","����Ű",2,"girl");

		boolean isEqual = A.equals(B);
		

		if (isEqual) {
			System.out.println("���� �������̴�.");
		}
		else {
			System.out.println("���� �������� �ƴϴ�.");
		}	
	}
}