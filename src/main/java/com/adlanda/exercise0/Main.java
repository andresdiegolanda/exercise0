package com.adlanda.exercise0;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;

/**
 * Main class, list of fruit should be passed as program arguments e.g: java
 * Main apple apple orange apple melon melon banana
 *
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i <= args.length; i++) {
			String scanned[] = Arrays.copyOfRange(args, 0, i);
			Map<String, Long> fruitCounter = ScannerService.getInstance().scan(scanned);
			long result = CalculatorService.getInstance().calculate(fruitCounter, DAO.getInstance().getFruits());
			DecimalFormat df = new DecimalFormat("#.00");
			System.out.println("input:" + Arrays.toString(args));
			System.out.println("scanned:" + Arrays.toString(scanned));
			System.out.println("Aggregated input:" + fruitCounter);
			System.out.println("Result:£" + df.format(result / 100.0) + "\n\n");
			Thread.sleep(1000);
		}
	}

}
