package removalAndSubstitution;

/**
 * Basically just a C struct - holds data about a particular ConvertedDictionary
 * @author Noah
 *
 */
public class ConversionExperiment {
	private int totalWords; // The total number of input words
	private int totalUniqueConvertedWords; // The number of unique words after conversion
	private int sumDuplicates; // The number of duplicate converted words
	private double duplicatesPerWord; // The number of duplicates per unconverted word
	private double duplicatesPerConvertedWord; // The number of duplicates per converted word
	private double varianceOfDuplication; // The variance of the number of duplicates in the converted words
	
	/*
	 * Constructor
	 */
	public ConversionExperiment() {
		// Default Values
		totalWords = -1;
		totalUniqueConvertedWords = -1;
		sumDuplicates = -1;
		duplicatesPerWord = -1;
		duplicatesPerConvertedWord = -1;
		varianceOfDuplication = -1;
	}
	
	/*
	 * Getters
	 */
	public int getTotalWords() {
		return totalWords;
	}
	public int getTotalUniqueConvertedWords() {
		return totalUniqueConvertedWords;
	}
	public int getSumDuplicates() {
		return sumDuplicates;
	}
	public double getDuplicatesPerWord() {
		return duplicatesPerWord;
	}
	public double getDuplicatesPerConvertedWord() {
		return duplicatesPerConvertedWord;
	}
	public double getVarianceOfDuplication() {
		return varianceOfDuplication;
	}
	
	/*
	 * Setters
	 */
	public void setTotalWords(int totalWords) {
		this.totalWords = totalWords;
	}
	public void setTotalUniqueConvertedWords(int totalUniqueConvertedWords) {
		this.totalUniqueConvertedWords = totalUniqueConvertedWords;
	}
	public void setSumDuplicates(int sumDuplicates) {
		this.sumDuplicates = sumDuplicates;
	}
	public void setDuplicatesPerWord(double duplicatesPerWord) {
		this.duplicatesPerWord = duplicatesPerWord;
	}
	public void setDuplicatesPerConvertedWord(double duplicatesPerConvertedWord) {
		this.duplicatesPerConvertedWord = duplicatesPerConvertedWord;
	}
	public void setVarianceOfDuplication(double varianceOfDuplication) {
		this.varianceOfDuplication = varianceOfDuplication;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
