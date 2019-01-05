package com.adlanda.exercise0;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CalculatorServiceTest {

	private static Map<String, Fruit> fruits;
	static {
		Fruit apple = new Fruit("apple", 60);
		Fruit orange = new Fruit("orange", 25);
		fruits = new HashMap<String, Fruit>();
		fruits.put("apple", apple);
		fruits.put("orange", orange);
	}

	@Test
	public void shouldReturnResultOk() {
		Map<String, Long> fruitCounter = new HashMap<String, Long>();
		fruitCounter.put("apple", 3L);
		fruitCounter.put("orange", 1L);
		long result = CalculatorService.getInstance().calculate(fruitCounter, fruits);
		assertTrue(result == 205);
	}

	@Test(expected = RuntimeException.class)
	public void shouldThrowRuntimeException() {
		Map<String, Long> fruitCounter = new HashMap<String, Long>();
		fruitCounter.put("apple", 3L);
		fruitCounter.put("peanut", 1L);
		CalculatorService.getInstance().calculate(fruitCounter, fruits);
	}

}
