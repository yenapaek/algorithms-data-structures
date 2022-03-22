import java.util.*;

public class SentencePunishment {
	
	
	public static String[] getRandomTypos(String str, int num) {
		Random random = new Random();
		StringBuilder tempStr;
		
		String[] typoStrings = new String[num];
		int typoIndex = 0;
		
		for (int i=0; i<num; i++) {
			tempStr = new StringBuilder(str);
			typoIndex = random.nextInt(str.length());
			tempStr.deleteCharAt(typoIndex);
			
			typoStrings[i] = tempStr.toString();
		}
		return typoStrings;	
	}

	public static void main(String[] args) {
		String template = "I will never spam my friends again.";
		List<String> list = new ArrayList<>();
		
		for (int i=0; i<92; i++) {
			list.add(template);
		}
		
		String[] typos = getRandomTypos(template, 8);
		
		for (String typoSentence : typos) {
			list.add(typoSentence);
		}
		
		Collections.shuffle(list);
		
		int i = 1;
		for (String sentence : list) {
			System.out.println(i++ + ". "+ sentence);
		}
		
	}

}
