package br.com.fiap.bean;

import java.util.ArrayList;


public class Banco  implements Comparable<Banco> {
	
	private int idBanco = 0;
	private String nomeBanco = null;
	
	public Banco(){
		
	}
	
	public Banco(int idBanco, String nomeBanco){
		this.idBanco = idBanco;
		this.nomeBanco = nomeBanco;
	}
	
	private ArrayList<Agencia> agenciaLista =  new ArrayList<Agencia>();
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public int getIdBanco() {
		return idBanco;
	}
	public void setIdBanco(int numero) {
		this.idBanco = numero;
	}
	public ArrayList<Agencia> getAgenciaLista() {
		return agenciaLista;
	}
	public void setAgenciaLista(ArrayList<Agencia> agenciaLst) {
		this.agenciaLista = agenciaLst;
	}
	
	public void addAgenciaLista(Agencia agencia){
		this.agenciaLista.add(agencia);
	}
	
	public Agencia putAgenciaLista(int idAgencia){
		Agencia agenciaRetorno = null;
		
		for (Agencia agencia : this.agenciaLista) {
			if(agencia.getIdAgencia()==idAgencia){
				agenciaRetorno = agencia;
				break;
			}
		}
		return agenciaRetorno;
	}
	
	public void listaAgencia(){
		for (Agencia agencia : this.agenciaLista) {
			System.out.println("Agencia:" + agencia.getIdAgencia() + " - " + agencia.getNomeAgencia());
		}
	}

	@Override
	public int compareTo(Banco arg0) {

		  if (this.idBanco < arg0.idBanco) {
	            return -1;
	        }
	        if (this.idBanco > arg0.idBanco) {
	            return 1;
	        }
	        return 0;
		
	}

}
