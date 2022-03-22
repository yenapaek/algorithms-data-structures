import java.time.LocalDate;
import java.util.*;

public class BirthdayParadox {
	
	private Random random = new Random();
	private final int NUMBER_OF_DAYS = 365; // don't need days and months to denote days of year
	
	public BirthdayParadox() {}
	
	public void runBirthdayTrials(int numOfBirthdays, int numOfTrials) {
		int numOfBirthdayDuplicates = 0;
		
		for (int i = 0; i < numOfTrials; i++) {
			ArrayList<Integer> listOfBirthdays = getRandomBirthdays(numOfBirthdays);
		
			if (hasSuccessfullyFoundDuplicates(listOfBirthdays)) {
				numOfBirthdayDuplicates++;
			}
		}
		
		printStatistics(numOfBirthdayDuplicates, numOfTrials);
	}
	
	private ArrayList<Integer> getRandomBirthdays(int numOfBirthdays){
		ArrayList<Integer> birthdays = new ArrayList<>();
		
		for (int i = 0; i<numOfBirthdays; i++) {
			birthdays.add(random.nextInt(NUMBER_OF_DAYS)+1); // random.nextInt(n) returns a random int between 0 (inclusive) -n (exclusive)
		}
		
		return birthdays;
	}
	
	 private boolean hasSuccessfullyFoundDuplicates(ArrayList<Integer> listOfBirthdays) {
//		 for (int i=0; i<listOfBirthdays.size(); i++) {
//			 for (int j=i+1; j<listOfBirthdays.size(); j++) {
//				 if (listOfBirthdays.get(i).equals(listOfBirthdays.get(j))) {
//					 return true;
//				 }
//			 }
//		 }
//		 return false;
		 
		 // if it can't add from the list of birthdays to the hashset return true
		 // remember hashsets can't have duplicates
		 
		 return !listOfBirthdays.stream().allMatch(new HashSet<>()::add);
	 }
	 
	 private void printStatistics(int numOfBirthdayDuplicates, int numOfTrials) {
		 System.out.println("The % of times matching birthdays for " + numOfTrials + " trials: " + (numOfBirthdayDuplicates * 100.0f)/numOfTrials + "%" + "\n");
	 }
	 
	 public static void main (String[] args) {
		 BirthdayParadox bp = new BirthdayParadox();
		 
		 for (int i = 0; i < 5; i++) {
			 bp.runBirthdayTrials(23, 20000);
		 }
		 
	 }

}
