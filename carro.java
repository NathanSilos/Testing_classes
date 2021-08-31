package Aula;

public class Main {

	public static void main(String[] args) {
		
		Carro novoCarro = new Carro();		
		novoCarro.marca = "VM";
		novoCarro.modelo = "Fox";
		novoCarro.cor = "Azul";
		novoCarro.km = 15560;	
		
		System.out.println("Marca: "+ novoCarro.marca);
		System.out.println("Modelo: "+ novoCarro.modelo);
		System.out.println("Cor: "+ novoCarro.cor);
		System.out.println("Km: "+ novoCarro.km);
		System.out.println("Calculo: "+ novoCarro.calcularKm(50, novoCarro.km));
		
		System.out.println();
		
		Carro novoCarro2 = new Carro();		
		novoCarro2.marca = "Chevrolet";
		novoCarro2.modelo = "Onix";
		novoCarro2.cor = "Petro";
		novoCarro2.km = 22350;	
		
		System.out.println("Marca: "+ novoCarro2.marca);
		System.out.println("Modelo: "+ novoCarro2.modelo);
		System.out.println("Cor: "+ novoCarro2.cor);
		System.out.println("Km: "+ novoCarro2.km);
		System.out.println("Calculo: "+ novoCarro2.calcularKm(50, novoCarro2.km));
		
		System.out.println();
		
		Carro novoCarro3 = new Carro();		
		novoCarro3.marca = "Fiat";
		novoCarro3.modelo = "Palio";
		novoCarro3.cor = "Prata";
		novoCarro3.km = 0;	
		
		System.out.println("Marca: "+ novoCarro3.marca);
		System.out.println("Modelo: "+ novoCarro3.modelo);
		System.out.println("Cor: "+ novoCarro3.cor);
		System.out.println("Km: "+ novoCarro3.km);
		System.out.println("Calculo: "+ novoCarro3.calcularKm(50, novoCarro3.km));
		
		System.out.println();
	}
}
