package br.com.navita.avaliacaotecnica.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class MainExercise {

	private static final int MAXIMUM_RESULT_NUMBER = 100000000;
	private static final int ERROR_RESULT_NUMBER = -1;

	/**
	 * Retorna o maior número na família de N
	 * 
	 * @param n
	 * @return
	 */
	public static int solution(int n) {

		// Converte n para array e o ordena em ordem decrescente
		int[] sorted = Integer.toString(n).chars().map(c -> Character.getNumericValue(c)).boxed()
				.sorted(Collections.reverseOrder()).mapToInt(i -> i).toArray();

		// Converte array em int
		int result = Integer.parseInt(Arrays.stream(sorted).mapToObj(String::valueOf).collect(Collectors.joining()));

		// Deve retornar -1 se o resultado exceder 100.000.000
		if (result > MAXIMUM_RESULT_NUMBER)
			return ERROR_RESULT_NUMBER;

		return result;
	}
}
