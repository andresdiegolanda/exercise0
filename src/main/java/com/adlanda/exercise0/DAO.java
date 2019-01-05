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
		Fruit apple = new Fruit(Constants.APPLE, 60);
		Fruit orange = new Fruit(Constants.ORANGE, 25);
		Fruit banana = new Fruit(Constants.BANANA, 20);
		Fruit melon = new Fruit(Constants.MELON, 100);
		fruits = new HashMap<String, Fruit>();
		fruits.put(Constants.APPLE, apple);
		fruits.put(Constants.ORANGE, orange);
		fruits.put(Constants.BANANA, banana);
		fruits.put(Constants.MELON, melon);
	}

	public Map<String, Fruit> getFruits() {
		return fruits;
	}

}
