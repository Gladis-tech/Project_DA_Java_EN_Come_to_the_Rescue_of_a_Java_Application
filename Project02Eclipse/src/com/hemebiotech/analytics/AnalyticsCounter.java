package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	private List<String> listS = new ArrayList<String>();
	TreeMap<String,Integer> mapTriee = new TreeMap<String,Integer>();
	
	public AnalyticsCounter() {
		super();
	}

	//lire  le ficher er recuperer  les syntoms
	public void ReadSymptoms()
	{
		ReadSymptomDataFromFile rs = new ReadSymptomDataFromFile("symptoms.txt");
		 listS = rs.GetSymptoms();
		 for (String symptom : listS) {
			 System.out.println(symptom);
			
		}
	}
	
	public void SortSymptoms()
	{		 
		 for (String symptom : listS) {
			if(mapTriee.containsKey(symptom))
			{
				int value = mapTriee.get(symptom) + 1;
				mapTriee.put(symptom, value);
			}
			else
			{
				mapTriee.put(symptom, 1);
			}
		}
	}
	
	public void WriteSymptoms()
	{
		FileWriter fw;
		try {
			fw = new FileWriter("result.out");
			for (Map.Entry<String ,Integer> entry : mapTriee.entrySet()) {
				System.out.println( entry.getKey() +" : " + entry.getValue() );
				 fw.write(entry.getKey() +" : " + entry.getValue() + "\n");																	
				 }
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
}
	
		
