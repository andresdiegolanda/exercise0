package com.adlanda.exercise0;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ScannerService {

	private static final ScannerService INSTANCE = new ScannerService();

	public static ScannerService getInstance() {
		return INSTANCE;
	}

	private ScannerService() {
		super();
	}

	/**
	 * @param args array of String
	 * @return Map with the occurrences of each String in the input
	 */
	public Map<String, Long> scan(String args[]) {
		Stream<String> inputStream = Arrays.stream(args);
		Map<String, Long> fruitCounter = inputStream
				.collect(Collectors.groupingBy(p -> p.toString().toLowerCase(), Collectors.counting()));
		return fruitCounter;

	}

}
