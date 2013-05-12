package br.com.fiap;

import java.util.*;

class TreeMapDemo {

	static TreeMap<Banco, TreeSet> tMap = new TreeMap<Banco, TreeSet>();

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {

		/*Banco do Brasil */
		Banco b1 = new Banco(1, "Branco do Brasil");	

		Agencia a1 = new Agencia(001, "Paulista");
		TreeMapDemo.setAgencia(b1, a1);

		Agencia a2 = new Agencia(002, "Berrini");
		TreeMapDemo.setAgencia(b1, a2);	
		
		/*Banco do Santander */
		Banco b2 = new Banco(2, "Santander");
		
		Agencia a3 = new Agencia(001, "Dom Antonio");
		TreeMapDemo.setAgencia(b2, a3);	
		
		Agencia a4 = new Agencia(002, "Dom Bernardo");
		TreeMapDemo.setAgencia(b2, a4);	

	}

	public static void setAgencia(Banco b, Agencia a) {

		TreeSet<Agencia> treeSet = null;

		if (!tMap.containsKey(b)) {
			treeSet = new TreeSet<Agencia>();
		} else {
			treeSet = tMap.get(b);
		}

		treeSet.add(a);

		tMap.put(b, treeSet);

		System.out.println("Keys of tree map: " + tMap.keySet());
		// Rerieving all values
		System.out.println("Values of tree map: " + tMap.values());

	}

}