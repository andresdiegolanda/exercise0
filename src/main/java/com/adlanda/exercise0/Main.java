package com.adlanda.exercise0;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;

public class Main {



	public static void main(String[] args) {
		Map<String, Long> fruitCounter = ScannerService.getInstance().scan(args);
		long result = CalculatorService.getInstance().calculate(fruitCounter, DAO.getInstance().getFruits());
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("input:" + Arrays.toString(args));
		System.out.println("Aggregated input:" + fruitCounter);
		System.out.println("Result:" + df.format(result / 100.0));
	}

}
