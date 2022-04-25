
public class TDDPigLatin {

	public static void main(String[] args) {
		System.out.println(translate("pig"));
		

	}
	
	public static String translate(String strg) {
		
		String done ="";
		String wordSplit = "\\s+";
		String[] word = strg.split(wordSplit);
		
		for (int i = 0; i < word.length; i++) {
			if(isVowel(word[i].toLowerCase().charAt(0))) {
				done += word[i] + "way\t";
			}else {
				done += word[i].substring(1) + word[i].substring(0,1) + "ay\t";
			}
		}
		return done;
		
	}
	
	
	public static boolean isVowel(char charVowel) {
		
		if(charVowel == 'a') 
			return true;
		if(charVowel == 'e') 
			return true;
		if(charVowel == 'i') 
			return true;
		if(charVowel == 'o') 
			return true;
		if(charVowel == 'u') 
			return true;
		return false;
		
		
	}

}
