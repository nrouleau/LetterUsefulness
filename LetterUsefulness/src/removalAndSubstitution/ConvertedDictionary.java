package removalAndSubstitution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Scanner;

public class ConvertedDictionary {
	ConversionType conversionType;
	String removalString;
	String replaceString;
	Scanner wordInput;
	public enum ConversionType {
		NOCONVERSION, REMOVECHAR, REPLACECHAR, ADDCHARRANDOM
	}
	Hashtable<String, Integer> words;
	ConversionExperiment experiment;
	
	// Will use constructor overloading for more options
	public ConvertedDictionary(String filename, ConversionType conversionType, String removalString) {
		this(filename, conversionType, removalString, null);
	}
	public ConvertedDictionary(String filename, ConversionType conversionType, String removalString, String replaceString) {
		// Create a scanner from the filename
		Scanner wordInput = null;
		try {
			wordInput = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e.getMessage());
			System.exit(0);
		}
		this.wordInput = wordInput;
		this.conversionType = conversionType;
		this.removalString = removalString;
		this.replaceString = replaceString;
		this.words = new Hashtable<String, Integer>();
		this.experiment = new ConversionExperiment();
	}
	
	/**
	 * Takes input from the file specified in the constructor,
	 * converts each word into a new form as per the protocol specified in the constructor,
	 * places each word into the words HashTable, incrementing the value when any duplicates are found.
	 */
	public void takeInput() {
		int i = 0;
		while ((wordInput.hasNextLine())&&(i < 100)) {
			String nextWord = convertString(wordInput.nextLine());
			// Increment existing matches
			if (words.containsKey(nextWord)) { 
				words.put(nextWord, new Integer(words.get(nextWord).intValue()+1)); 
			} else { // Place new entries otherwise
				words.put(nextWord, new Integer(0));
			}
			System.out.println("line:"+nextWord+":"+words.get(nextWord));
			++i;
		}
		if (words.isEmpty()) { 
			System.err.println("Error: Hashtable is empty");
			System.exit(0);
		}
		wordInput.close();
	}
	
	/**
	 * Converts a string according to the dictionary's protocol
	 * @param unconverted - The string that will be converted before placement in dictionary
	 * @return converted - the converted string
	 */
	private String convertString(String unconverted) {
		if (unconverted == null) {
			System.err.println("Error: input unconverted string is null");
			System.exit(0);
		}
		String converted = null;
		switch(conversionType) {
		case NOCONVERSION:
			converted = unconverted;
			break;
		case REMOVECHAR:
			if (removalString == null) { 
				System.err.println("No removalString"); 
				System.exit(0);
			}
			converted = unconverted.replaceAll(removalString, "");
			break;
		case REPLACECHAR:
			if ((removalString == null)||(replaceString == null)) {
				System.err.println("No removalString or no replaceString");
				System.exit(0);
			}
			converted = unconverted.replaceAll(removalString, replaceString);
			break;
		case ADDCHARRANDOM:
			System.err.println("Error: Unsupported operation");
			System.exit(0);
			break;
		default:
			System.err.println("Error: Invalid conversion type");
			System.exit(0);
		}
		return converted;
	}
	
}
