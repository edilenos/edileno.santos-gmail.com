package br.com.navita.avaliacaotecnica.exercises;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MainExerciseTest extends TestCase {
	
	public void testSolutionWhenNumberLessHundredMillionThenSucess() {
		Assert.assertEquals(321, MainExercise.solution(213));
	}
	
	public void testSolutionWhenNumberBiggerHundredMillionThenSucess() {
		Assert.assertEquals(-1, MainExercise.solution(100000001));
	}

}
