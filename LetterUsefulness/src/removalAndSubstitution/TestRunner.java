package removalAndSubstitution;

public class TestRunner {

	public static void main(String[] args) {
		System.out.println("Hello, world!");
		
		ConvertedDictionary simpleDictionary = 
				new ConvertedDictionary("wordlist.txt", ConvertedDictionary.ConversionType.REMOVECHAR, "a");
		simpleDictionary.takeInput();
	}

}
