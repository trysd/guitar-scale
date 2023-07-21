package com.github.trysd;

// https://pleiades.io/help/idea/add-a-gradle-library-to-the-maven-repository.html

import java.util.Arrays;
import java.util.stream.Collectors;

public class GuitarScale {
	public static void main(String[] argv) {
		GuitarScale gs = new GuitarScale();
		int[] res = gs.getScaleStructureByScaleName(ScaleBase.MitsuruMetal);
		System.out.println(gs.toStringIntArr(res));
	}

	private String toStringIntArr(int[] intArr) {
		return Arrays.stream(intArr)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining());
	}

	public int[][] getFingerBoard(ScaleBase scale) {
		GuitarScale gs = new GuitarScale();
		int[] res = gs.getScaleStructureByScaleName(ScaleBase.MitsuruMetal);


		// 始まり 0 7 3 10 5 0
		// 201010101010
		// → 弦別にループ

		//

		return null;
	}

	public int[] getScaleStructureByScaleName(ScaleBase scale) {
		return scale.getStructure();
	}

}
