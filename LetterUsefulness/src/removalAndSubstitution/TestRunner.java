package removalAndSubstitution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Scanner;

public class TestRunner {

	public static void main(String[] args) {
		System.out.println("Hello, world!");
		Scanner wordInput = null;
		try {
			wordInput = new Scanner(new File("wordlist.txt" ));
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
			System.exit(0);
		}
		
		// Keys will be words in the English language in their converted form, 
		// values will be number of matches between converted words
		Hashtable<String, Integer> wordMatching = new Hashtable<String, Integer>();
		int i = 0;
		while ((wordInput.hasNextLine())&&(i < 100)) {
			String nextWord = wordInput.nextLine();
			System.out.println("line:"+nextWord+":");
			// Increment existing matches
			if (wordMatching.containsKey(nextWord)) { 
				wordMatching.put(nextWord, new Integer(wordMatching.get(nextWord).intValue())); 
			} else { // Place new entries otherwise
				wordMatching.put(nextWord, new Integer(0));
			}
			++i;
		}
		if (wordMatching.isEmpty()) { 
			System.out.println("Error: Hashtable is empty");
			System.exit(0);
		}
		
		
		
		wordInput.close();
	}

}
