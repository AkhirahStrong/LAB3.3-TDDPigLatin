import java.util.Scanner;

public class PidLatin {
	
	//private static Scanner scan;

	public static void main(String[] args) {
		
		
		
	}
	
	
	
	//Translate input to PigLatin
		public static String translate(String trans) {
			
			String done ="";
			String splitVar = "\\s+";
			String [] inputU = trans.split(splitVar);
			
			for (int i=0; i< inputU.length; i++) {
				if(isVowel(inputU[i].toLowerCase().charAt(0))) {
					done += inputU[i] + "way";
				}else {
					done += inputU[i].substring(1) + inputU[i].substring(0,1) + "ay";
				}
			}return done;
			
		}
		

		//A boolean method of vowel set to true to 
		//allow "way" to be added to the end of a word
		//starting with a vowel. 
		private static boolean isVowel(char charVwl) {
			
			if(charVwl == 'a') 
				return true;
			if(charVwl == 'e') 
				return true;
			if(charVwl == 'i') 
				return true;
			if(charVwl == 'o') 
				return true;
			if(charVwl == 'u') 
				return true;
			
			return false;
		}

	}



