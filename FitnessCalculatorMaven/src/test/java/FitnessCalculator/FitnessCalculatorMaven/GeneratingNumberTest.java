package FitnessCalculator.FitnessCalculatorMaven;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import FitnessCalculator.FitnessCalculatorMaven.GeneratingNumber.GeneratingNumberClass;

public class GeneratingNumberTest {
	
	@Test
	public void GeneratingNumberClass() {
		ArrayList<Integer> List1 = new ArrayList<Integer>();
		int count = 0;
		GeneratingNumberClass GeneratingNumberClass = new GeneratingNumberClass();
		List1 = GeneratingNumberClass.GeneratingNumberResult();
		
		for (int i1 = 0; i1 < List1.size();i1++) {
			if (List1.get(i1) >= 260 & List1.get(i1) <= 500 & String.valueOf(List1.get(i1)).indexOf(".") == -1) {
				count++;
			}
		}

		assertEquals(count, GeneratingNumberClass.getCountNumber());
	}
}
