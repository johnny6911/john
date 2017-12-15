public class TestPuppy {

	public static void main (String[] args) {

		PuppyAdv A = new PuppyAdv("husky","릴리",3,"boy");
		PuppyAdv B = new PuppyAdv("puddle","스퐁키",2,"girl");

		boolean isEqual = A.equals(B);
		

		if (isEqual) {
			System.out.println("같은 강아지이다.");
		}
		else {
			System.out.println("같은 강아지가 아니다.");
		}	
	}
}