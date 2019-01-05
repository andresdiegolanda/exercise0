package com.adlanda.exercise0;

import java.util.HashMap;
import java.util.Map;

public class DAO {

	private static final DAO INSTANCE = new DAO();

	public static DAO getInstance() {
		return INSTANCE;
	}

	private DAO() {
		super();
	}

	private static Map<String, Fruit> fruits;
	// static initializer. Could be replaced by database reads on a real solution
	static {
		Fruit apple = new Fruit("apple", 60);
		Fruit orange = new Fruit("orange", 25);
		fruits = new HashMap<String, Fruit>();
		fruits.put("apple", apple);
		fruits.put("orange", orange);
	}

	public Map<String, Fruit> getFruits() {
		return fruits;
	}

}
