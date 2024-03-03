package FitnessCalculator.FitnessCalculatorMaven;


import java.security.SecureRandom;
import java.util.ArrayList;

public class GeneratingNumber 
{
	public static void main( String[] args ) {
		GeneratingNumberClass GeneratingNumberClass = new GeneratingNumberClass();
		GeneratingNumberClass.GeneratingNumberResult();
    }
	
    public static class GeneratingNumberClass {
    	private int countNumber = 11;
    	private int rangeNumbersStart = 260;
    	private int rangeNumbersEnd = 500;
    	
    	public int getCountNumber() {
    		return countNumber;
    	}
    	
    	public ArrayList<Integer> GeneratingNumberResult() {
    		int count = 0;
    		String stringVariable1 = "";
    		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
    		SecureRandom random = new SecureRandom();
			while (count < countNumber) {
				stringVariable1 = String.valueOf(random.nextInt(rangeNumbersEnd));
				
				if (stringVariable1.indexOf(".") == -1) {
					if (Integer.valueOf(stringVariable1) >= rangeNumbersStart & Integer.valueOf(stringVariable1) <= rangeNumbersEnd) {
						arrayList1.add(count,Integer.valueOf(stringVariable1));
						count++;
//						System.out.println(Integer.valueOf(stringVariable1));
					}
				}
			}
			return arrayList1;
    	}
    }
}

