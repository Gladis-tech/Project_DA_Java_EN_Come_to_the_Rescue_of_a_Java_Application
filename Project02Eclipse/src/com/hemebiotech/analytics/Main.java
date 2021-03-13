package com.hemebiotech.analytics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnalyticsCounter ac = new AnalyticsCounter();
		ac.ReadSymptoms();
		ac.SortSymptoms();
		ac.WriteSymptoms();
	}

}
