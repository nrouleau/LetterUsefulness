package removalAndSubstitution;

public class TestRunner {

	public static void main(String[] args) {
		System.out.println("Hello, world!");
		
		ConvertedDictionary simpleDictionary = new ConvertedDictionary("wordlist.txt", 0);
		simpleDictionary.takeInput();
	}

}
