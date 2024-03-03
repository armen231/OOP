package FitnessCalculator.FitnessCalculatorMaven;

import static org.junit.Assert.assertEquals;

import java.util.Objects;

import org.junit.BeforeClass;
import org.junit.Test;

import FitnessCalculator.FitnessCalculatorMaven.GeneratingNumber.GeneratingNumberClass;
import FitnessCalculator.FitnessCalculatorMaven.CreateArray.CreateArrayClass;

public class CreateArrayTest  {
	
	
	@BeforeClass
	public static void runBeforeClassCreateArrayClass() {
	}
	
	@Test
	public void CreateArrayClass() {
		CreateArrayClass CreateArrayClass = new CreateArrayClass();
		GeneratingNumberClass GeneratingNumberClass = new GeneratingNumberClass();
		int[] array1 = CreateArrayClass.CreateArrayResult();
		
		assertEquals(array1.length, GeneratingNumberClass.getCountNumber());
	}
	
	@Test
	public void CreateArrayClass2() {
		CreateArrayClass CreateArrayClass = new CreateArrayClass();
		GeneratingNumberClass GeneratingNumberClass = new GeneratingNumberClass();
		int[] array1 = CreateArrayClass.CreateArrayResult();
		int count = 0;
		for (int i1 = 0;i1 < array1.length;i1++) {
			if (Objects.isNull(array1[i1]) != true) {
				count++;
			}
		}
		
		assertEquals(count,GeneratingNumberClass.getCountNumber());
	}
}