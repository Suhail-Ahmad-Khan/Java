package com.bridgelabz.programs;

import java.util.HashMap;
import java.util.Map;

class LiftingStats {
	public String activity;
	public String weightType;
	public int weight;
	public double difficulty;

	public LiftingStats() {
		this.run();
	}

	public void run() {
		// code
		this.activity = "bench press";
		this.weightType = "Kg";
		this.weight = 100;
		this.difficulty = 8.5;
	}

}

class HashmapTrial extends LiftingStats {

	public void main(String[] args) {

		Map<String, LiftingStats> fitnessGoals = new HashMap<String, LiftingStats>();
	}

}
