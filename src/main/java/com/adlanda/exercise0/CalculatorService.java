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
		long totalApples = 0;
		long freeApples = 0;
		long totalBananas = 0;
		long freeBananas = 0;
		long totalOranges = 0;
		long totalMelons = 0;

		if (fruitCounter.get(Constants.APPLE) != null) {
			totalApples = fruitCounter.get(Constants.APPLE);
			freeApples = totalApples / 2;
		}
		if (fruitCounter.get(Constants.BANANA) != null) {
			totalBananas = fruitCounter.get(Constants.BANANA);
			freeBananas = (totalApples % 2 + totalBananas) / 2;
		}
		result += (totalApples - freeApples) * fruits.get(Constants.APPLE).getPrice();
		result += (totalBananas - freeBananas) * fruits.get(Constants.BANANA).getPrice();

		if (fruitCounter.get(Constants.ORANGE) != null) {
			totalOranges = fruitCounter.get(Constants.ORANGE);
		}
		result += (totalOranges / 3 * 2 + totalOranges % 3) * fruits.get(Constants.ORANGE).getPrice();

		if (fruitCounter.get(Constants.MELON) != null) {
			totalMelons = fruitCounter.get(Constants.MELON);
		}
		result += (totalMelons / 3 * 2 + totalMelons % 3) * fruits.get(Constants.MELON).getPrice();

		return result;
	}

}
