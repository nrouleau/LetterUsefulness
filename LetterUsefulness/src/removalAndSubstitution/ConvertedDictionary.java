package removalAndSubstitution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Scanner;

public class ConvertedDictionary {
	Hashtable<String, Integer> words;
	ConversionType conversionType;
	char removalLetter;
	char replaceLetter;
	Scanner wordInput;
	public enum ConversionType {
		REMOVECHAR, REPLACECHAR, ADDCHARRANDOM
	}
	
	// Will use constructor overloading for more options
	public ConvertedDictionary(String filename, ConversionType conversionType) {//, char removalLetter) {
		// Create a scanner from the filename
		Scanner wordInput = null;
		try {
			wordInput = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
			System.exit(0);
		}
		this.wordInput = wordInput;
		this.conversionType = conversionType;
		//this.removalLetter = removalLetter;
		this.words = new Hashtable<String, Integer>();
	}
	
	public void takeInput() {
		int i = 0;
		while ((wordInput.hasNextLine())&&(i < 100)) {
			String nextWord = wordInput.nextLine();
			System.out.println("line:"+nextWord+":");
			// Increment existing matches
			if (words.containsKey(nextWord)) { 
				words.put(nextWord, new Integer(words.get(nextWord).intValue())); 
			} else { // Place new entries otherwise
				words.put(nextWord, new Integer(0));
			}
			++i;
		}
		if (words.isEmpty()) { 
			System.out.println("Error: Hashtable is empty");
			System.exit(0);
		}
		wordInput.close();
	}
	
}
