package br.com.fiap.bean;

public class Agencia implements Comparable<Agencia> {
	
	private int idAgencia = 0;
	private String nomeAgencia = null;
	
	
	public Agencia(){
		
	}
	
	public Agencia(int idAgencia, String nomeAgencia){
		this.idAgencia = idAgencia;
		this.nomeAgencia = nomeAgencia;
	}
	
	public int getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}
	public String getNomeAgencia() {
		return nomeAgencia;
	}
	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	@Override
	public int compareTo(Agencia arg0) {
		 if (this.idAgencia < arg0.idAgencia) {
	            return -1;
	        }
	        if (this.idAgencia > arg0.idAgencia) {
	            return 1;
	        }
	        return 0;
	}

}
