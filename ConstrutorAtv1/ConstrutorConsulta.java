package ConstrutorAtv1;

public class ConstrutorConsulta {
	
	public static void main(String[] args) {
		Consulta consulta1 = new Consulta("14/07","Osvaldo","Cleiton");
		Consulta consulta2 = new Consulta("27/07","Pedro","Joao");
		Consulta consulta3 = new Consulta("30/09","Lucas","Vitor");
		
		System.out.println(consulta1.getData());
		System.out.println(consulta1.getNomePonte());
		System.out.println(consulta1.getNomeDents());
		
		System.out.println(consulta1.getData());
		System.out.println(consulta2.getNomePonte());
		System.out.println(consulta2.getNomeDents());
		
		System.out.println(consulta1.getData());
		System.out.println(consulta3.getNomePonte());
		System.out.println(consulta3.getNomeDents());
	}

}
