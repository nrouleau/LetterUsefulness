package removalAndSubstitution;

public class TestRunner {

	public static void main(String[] args) {
		System.out.println("Hello, world!");
		
		// Create a simple dictionary where the "a" is from all words and duplicates are counted
		ConvertedDictionary simpleDictionary = 
				new ConvertedDictionary("wordlist.txt", ConvertedDictionary.ConversionType.REMOVECHAR, "a");
		simpleDictionary.takeInput();
		
		
	}

}
