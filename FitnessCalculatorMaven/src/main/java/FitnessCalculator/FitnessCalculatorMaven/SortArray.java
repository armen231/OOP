package FitnessCalculator.FitnessCalculatorMaven;

import FitnessCalculator.FitnessCalculatorMaven.CreateArray.CreateArrayClass;

public class SortArray {
	public static void main(String[] arges) {
		SortArrayClass SortArrayClass = new SortArrayClass();
		SortArrayClass.SortArrayResult();
	}
	
	public static class SortArrayClass {
		public int[] SortArrayResult() {
			int variable1 = 0;
			CreateArrayClass CreateArrayClass = new CreateArrayClass();
			int[] array1 = CreateArrayClass.CreateArrayResult();
			for(int i1 = 0; 1 <= array1.length - i1;i1++) {
				for (int i2 = 0; i2 < array1.length -i1 - 1; i2++) {
					if (array1[i2] > array1[i2 + 1]) {
						variable1 = array1[i2 + 1];
						array1[i2 + 1] = array1[i2];
						array1[i2] = variable1;
					}
				}
			}
//			for (int i3 = 0; i3 < array1.length;i3++) {
//				System.out.print(array1[i3]+" ");
//			}
			
			return array1;
		}
	}
}
