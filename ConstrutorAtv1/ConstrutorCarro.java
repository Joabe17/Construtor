package ConstrutorAtv1;

public class ConstrutorCarro {

	public static void main(String[] args) {
		Caroo carro1 = new Caroo("fed-2f33",12323);
		Caroo carro2 = new Caroo("tri-2e22",23221);
		Caroo carro3 = new Caroo("fre-fe32",55432);

		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getNumChassi());

		System.out.println(carro2.getPlaca());
		System.out.println(carro2.getNumChassi());

		System.out.println(carro3.getPlaca());
		System.out.println(carro3.getNumChassi());
	}

}
