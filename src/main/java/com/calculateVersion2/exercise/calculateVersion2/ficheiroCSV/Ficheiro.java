package com.calculateVersion2.exercise.calculateVersion2.ficheiroCSV;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import com.calculateVersion2.exercise.calculateVersion2.operations.CalculateVersion2;

/* @Author : Maria Pereira
 **  @importFicheiro - importa o ficheiro csv
 */

public class Ficheiro {
	private String virgula = ",";
	CalculateVersion2 values = new CalculateVersion2();
	
	public void importFicheiro () throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader (new FileInputStream("calculatorDB.csv")));
		String linha = null;
		while ((linha = reader.readLine()) != null){
			String dado[] = linha.split(virgula);
			values.setValue1(Double.parseDouble(dado[0]));
			values.setValue2(Double.parseDouble(dado[1]));
			values.setOperation(dado[2]);
		}
		reader.close();	
	}
	
}
