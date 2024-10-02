package ConstrutorAtv1;

public class ConstrutorAnimal {
	
	public static void main(String[] args) {
		Animal animal00 = new Animal ("azul",160);
		Animal animal02 = new Animal ("preto",40);
		Animal animal03 = new Animal ("branco",130);
		
		System.out.println(animal00.getCor());
		System.out.println(animal00.getTamanho());
		
		System.out.println(animal02.getCor());
		System.out.println(animal02.getTamanho());
		
		System.out.println(animal03.getCor());
		System.out.println(animal03.getTamanho());
		
	}

}
