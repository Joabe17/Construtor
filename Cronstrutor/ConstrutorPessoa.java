package Cronstrutor;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		Pessoa pessa1 = new Pessoa();
		Pessoa pessa2 = new Pessoa("Messi",36);
		Pessoa pessa3 = new Pessoa("CR7");
		
		System.out.println(pessa2.getNome());
		System.out.println(pessa2.getIdade());
		
		System.out.println(pessa3.getNome());
		System.out.println(pessa3.getIdade());
		
		
	}

}
