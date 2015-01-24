package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExp {

	// [0-9] - Anu number
	// [A-Za-z] - any alphabet
	// [^A-G] -- not A to G
	// \\s seacrhing white space
	// \\S - not white space
	// {n,m} searching for somethimg minimum n and maximum m times
	// {n} = exact n times
	// {n,} minimum n, no maximum
	// \\w - any character
	//  \\d any number
	//  \\D -- no a number
	public static void regex(String therex, String main) {
		Pattern p = Pattern.compile(therex);
		
		Matcher rm = p.matcher(main);
		
		while(rm.find()){
			if(rm.group().length()>0){
				System.out.println(rm.group().trim());
			}
//			System.out.println(rm.start());
//			System.out.println(rm.end());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String longString = "sumit Jain (214)603-8685 TX 12345 sumi12june@gmail.com CA T amit uganda implement args";
		String strangeString = " 1Z aaa **** *** {{{{ {{  {    } ";

		// word that is 2 to 7 character in length
		regex("\\s[A-Za-z]{2}\\s", longString);
		regex("\\s\\d{2,10}\\s", longString);
		
		//find 2 characters, starts with T or C
		regex("\\sT[A-Z]\\s", longString);
		
		//get all words starts with vowel
		System.out.println("***********************get all words starts with vowel");
		regex("\\s[AEIOUaeiou][A-Za-z]+", longString);
		//Remove all the vowels from the string
		System.out.println(longString.replaceAll("[AEIOUaeiou]", ""));

	}

}
