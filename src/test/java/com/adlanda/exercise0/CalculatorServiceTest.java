package com.adlanda.exercise0;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CalculatorServiceTest {

	private static Map<String, Fruit> fruits;
	static {
		Fruit apple = new Fruit(Constants.APPLE, 60);
		Fruit orange = new Fruit(Constants.ORANGE, 25);
		Fruit banana = new Fruit(Constants.BANANA, 20);
		fruits = new HashMap<String, Fruit>();
		fruits.put(Constants.APPLE, apple);
		fruits.put(Constants.ORANGE, orange);
		fruits.put(Constants.BANANA, banana);
	}

	@Test
	public void shouldReturnResultOk() {
		Map<String, Long> fruitCounter = new HashMap<String, Long>();
		fruitCounter.put(Constants.APPLE, 3L); // should pay two
		fruitCounter.put(Constants.ORANGE, 4L); // should pay three
		long result = CalculatorService.getInstance().calculate(fruitCounter, fruits);
		assertTrue(result == 195);
	}

	@Test
	public void shouldReturnResultOk2() {
		Map<String, Long> fruitCounter = new HashMap<String, Long>();
		fruitCounter.put(Constants.APPLE, 3L); // should pay two
		fruitCounter.put(Constants.ORANGE, 4L); // should pay three
		fruitCounter.put(Constants.BANANA, 1L); // should pay zero
		long result = CalculatorService.getInstance().calculate(fruitCounter, fruits);
		assertTrue(result == 195);
	}


	@Test
	public void shouldReturnResultOk3() {
		Map<String, Long> fruitCounter = new HashMap<String, Long>();
		fruitCounter.put(Constants.APPLE, 3L); // should pay two
		fruitCounter.put(Constants.ORANGE, 3L);// should pay two
		fruitCounter.put(Constants.BANANA, 2L); // should pay one
		long result = CalculatorService.getInstance().calculate(fruitCounter, fruits);
		assertTrue(result == 190);
	}

}
