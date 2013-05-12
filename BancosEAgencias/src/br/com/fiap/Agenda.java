package br.com.fiap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Agenda {
	//Apenas deixar este atributo global pq é a Agenda  
    static TreeMap<String, TreeSet> tMap = new TreeMap<String, TreeSet>();

	public static void main(String[] args) throws IOException {
		
		BufferedReader inReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String linha = "";

		while (true){
			
			linha = inReader.readLine();

			if(linha.trim().equals(":q")){ 
				break;
			}
			
			Agenda.setTreeCaracterAgenda(linha);						
		   }	
		
		}

	public static void setTreeCaracterAgenda(String x) {
			   
		//Não deixar esta classe global para previnir bug
		TreeSet<String> treeSet = null;
		
		if(! tMap.containsKey(x.substring(0,1))){
			treeSet = new TreeSet<String>();			
		} else {
			treeSet = tMap.get(x.substring(0,1));
		}
		
	   treeSet.add(x);	  
	   
	   tMap.put(x.substring(0,1), treeSet);
	   
	   System.out.println("Keys of tree map: " + tMap.keySet());
		// Rerieving all values
	   System.out.println("Values of tree map: " + tMap.values());

	}

}