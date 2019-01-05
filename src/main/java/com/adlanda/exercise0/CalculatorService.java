package com.adlanda.exercise0;

import java.util.Map;

public class CalculatorService {

	private static final CalculatorService INSTANCE = new CalculatorService();

	public static CalculatorService getInstance() {
		return INSTANCE;
	}

	private CalculatorService() {
		super();
	}

	/**
	 * @param fruitCounter Map with the occurrences of each fruit in the input
	 * @param fruits       Map with the prices of all available fruits
	 * @return value of all the fruit in the input
	 */
	public long calculate(Map<String, Long> fruitCounter, Map<String, Fruit> fruits) {
		int result = 0;
		for (Map.Entry<String, Long> entry : fruitCounter.entrySet()) {
			String fruitName = entry.getKey();
			Long fruitQuantity = entry.getValue();
			if (fruits.get(fruitName) != null) {
				if (fruitName.equalsIgnoreCase("apple")) {
					fruitQuantity = fruitQuantity / 2 + fruitQuantity % 2;
				} else if (fruitName.equalsIgnoreCase("orange")) {
					fruitQuantity = fruitQuantity / 3 * 2 + fruitQuantity % 3;
				}
				result += fruits.get(fruitName).getPrice() * fruitQuantity;
			} else {
				throw new RuntimeException("No value found for fruit:" + fruitName);
			}
		}
		return result;
	}

}
