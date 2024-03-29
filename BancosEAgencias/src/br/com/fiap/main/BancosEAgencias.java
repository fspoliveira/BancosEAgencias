package br.com.fiap.main;

import java.util.*;

import br.com.fiap.bean.Agencia;
import br.com.fiap.bean.Banco;

class BancosEAgencias {

	@SuppressWarnings("rawtypes")
	static TreeMap<Banco, TreeSet> tMap = new TreeMap<Banco, TreeSet>();

	public static void main(String args[]) {

		/* Banco do Brasil com duas Agencias */
		Banco b1 = new Banco(1, "Branco do Brasil");

		Agencia a1 = new Agencia(001, "Paulista");
		BancosEAgencias.setAgencia(b1, a1);

		Agencia a2 = new Agencia(002, "Berrini");
		BancosEAgencias.setAgencia(b1, a2);

		/* Banco do Santander com 3 Agencias */
		Banco b2 = new Banco(2, "Santander");

		Agencia a3 = new Agencia(001, "Dom Antonio");
		BancosEAgencias.setAgencia(b2, a3);

		Agencia a4 = new Agencia(002, "Dom Bernardo");
		BancosEAgencias.setAgencia(b2, a4);

		Agencia a5 = new Agencia(003, "Osasco");
		BancosEAgencias.setAgencia(b2, a5);

		for (Banco treeKey : tMap.keySet()) {

			System.out.println("*************Banco**********");
			System.out.println(treeKey.getNomeBanco() + "\n");

			@SuppressWarnings("rawtypes")
			Iterator iterator = tMap.get(treeKey).iterator();

			while (iterator.hasNext()) {

				Agencia a = (Agencia) iterator.next();
				System.out.println("Id da agencia: " + a.getIdAgencia());
				System.out.println("Nome da Agência: " + a.getNomeAgencia());
			}

		}
	}

	@SuppressWarnings("unchecked")
	public static void setAgencia(Banco b, Agencia a) {

		TreeSet<Agencia> treeSet = null;

		treeSet = null;
		if (!tMap.containsKey(b)) {
			treeSet = new TreeSet<Agencia>();
		} else {
			treeSet = tMap.get(b);
		}

		treeSet.add(a);

		tMap.put(b, treeSet);
	}

}