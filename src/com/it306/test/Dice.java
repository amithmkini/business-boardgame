package com.it306.test;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
	int roll() {
		return ThreadLocalRandom.current().nextInt(1, 7);
	}
}
