package removalAndSubstitution;

public class TestRunner {

	public static void main(String[] args) {
		
		/*
		// Create a simple dictionary where the "a" is from all words and duplicates are counted
		System.out.println("Gathering results for a dictionary where \"a\" is removed from all words");
		ConvertedDictionary simpleDictionary = 
				new ConvertedDictionary("wordlist.txt", ConvertedDictionary.ConversionType.REMOVECHAR, "a");
		simpleDictionary.takeInput();
		simpleDictionary.computeDuplicationVariance();
		simpleDictionary.getExperiment().print();
		*/
		
		ConvertedDictionary removalDictionary = null;
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", 
				"q", "r", "s", "t", "u", "v", "w", "x", "y", "x"};
		
		for (String removeString : alphabet) {
			removalDictionary = new ConvertedDictionary("wordsEn.txt", 
							ConvertedDictionary.ConversionType.REMOVECHAR, removeString);
			removalDictionary.takeInput();
			ConversionExperiment experiment = removalDictionary.getExperiment();
			System.out.println("English with the letter " + removeString 
					+ " removed has " + experiment.getSumDuplicates() + " duplicates");
		}
	}

}
