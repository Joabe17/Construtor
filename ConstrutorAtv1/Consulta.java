package ConstrutorAtv1;

public class Consulta {
	String data;
	String nomePonte;
	String nomeDents;
	public Consulta() {
	}
	public Consulta(String data, String nomePonte, String nomeDents) {
		this.data = data;
		this.nomePonte = nomePonte;
		this.nomeDents = nomeDents;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getNomePonte() {
		return nomePonte;
	}
	public void setNomePonte(String nomePonte) {
		this.nomePonte = nomePonte;
	}
	public String getNomeDents() {
		return nomeDents;
	}
	public void setNomeDents(String nomeDents) {
		this.nomeDents = nomeDents;
	}

}
