package com.adlanda.exercise0;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;

public class ScannerServiceTest {

	@Test
	public void shouldCountInstances() {
		String[] args = { "one", "two", "One", "oNe", "onE", "one", "two" };
		Map<String, Long> result = ScannerService.getInstance().scan(args);
		assertTrue(result.get("one").equals(5L));
		assertTrue(result.get("two").equals(2L));
	}

}
