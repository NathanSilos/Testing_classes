package Aula;
public class Main {

	public static void main(String[] args) {
		
		Carro novoCarro = new Carro("VW", "Fox", "Azul", 15560, 50, 12, 28500);
//		novoCarro.setMarca("VW");
//		novoCarro.setModelo("Fox");
//		novoCarro.setCor("Azul");
//		// novoCarro.setKm(15560);
//		novoCarro.setCapacidadeTanque(50);
//		novoCarro.setKmPorLitro(12);
//		novoCarro.setPreco(28500);
		
		System.out.println("Marca: " + novoCarro.getMarca());
		System.out.println("Modelo: " + novoCarro.getModelo());
		System.out.println("Cor: " + novoCarro.getCor());
		System.out.println("Km: " + novoCarro.getKm());
		System.out.println("Capacidade Tanque: " + novoCarro.getCapacidadeTanque());
		System.out.println("Km Por Litro: " + novoCarro.getKmPorLitro());
		System.out.println("Rodagem do veículo: " + novoCarro.calcularKm());
		System.out.println("Preço: " + novoCarro.getPreco());
		System.out.println("Desconto: " + novoCarro.calcularDesconto(2.5,2));
		System.out.println("Valor do Carro: " + novoCarro.getValorComDesconto());
		
		System.out.println();
		
		Carro novoCarro2 = new Carro("Chevrolet", "Onix", "Preto", 20000, 45, 10, 30000);
//		novoCarro2.setMarca("Chevrolet");
//		novoCarro2.setModelo("Onix");
//		novoCarro2.setCor("Preto");
//		novoCarro2.setKm(22350);
//		novoCarro2.setCapacidadeTanque(45);
//		novoCarro2.setKmPorLitro(10);
//		novoCarro2.setPreco(30000);
		
		System.out.println("Marca: " + novoCarro2.getMarca());
		System.out.println("Modelo: " + novoCarro2.getModelo());
		System.out.println("Cor: " + novoCarro2.getCor());
		System.out.println("Km: " + novoCarro2.getKm());
		System.out.println("Capacidade Tanque: " + novoCarro2.getCapacidadeTanque());
		System.out.println("Km Por Litro: " + novoCarro2.getKmPorLitro());
		System.out.println("Rodagem do veículo: " + novoCarro2.calcularKm());
		System.out.println("Preço: " + novoCarro2.getPreco());
		System.out.println("Desconto: " + novoCarro2.calcularDesconto(2.5,2));
		System.out.println("Valor do Carro: " + novoCarro2.getValorComDesconto());
		
		System.out.println();
		
		Carro novoCarro3 = new Carro("Fiat", "Palio", "Prata", 0, 47, 14, 33650);
//		novoCarro3.setMarca("Fiat");
//		novoCarro3.setModelo("Palio");
//		novoCarro3.setCor("Prata");
//		novoCarro3.setKm(0);
//		novoCarro3.setKm(47);
//		novoCarro3.setKmPorLitro(14);
//		novoCarro3.setPreco(33650);
		
		System.out.println("Marca: " + novoCarro3.getMarca());
		System.out.println("Modelo: " + novoCarro3.getModelo());
		System.out.println("Cor: " + novoCarro3.getCor());
		System.out.println("Km: " + novoCarro3.getKm());
		System.out.println("Capacidade Tanque: " + novoCarro3.getCapacidadeTanque());
		System.out.println("Km Por Litro: " + novoCarro3.getKmPorLitro());		
		System.out.println("Rodagem do veículo: " + novoCarro3.calcularKm());
		System.out.println("Preço: " + novoCarro3.getPreco());
		System.out.println("Desconto: " + novoCarro3.calcularDesconto(2.5,2));
		System.out.println("Valor do Carro: " + novoCarro3.getValorComDesconto());
		
		System.out.println();
		
		Carro novoCarro4 = new Carro("Ford","Fiesta","Prata",7500,40,15,23380);
		
		System.out.println("Marca: " + novoCarro4.getMarca());
		System.out.println("Modelo: " + novoCarro4.getModelo());
		System.out.println("Cor: " + novoCarro4.getCor());
		System.out.println("Km: " + novoCarro4.getKm());
		System.out.println("Capacidade Tanque: " + novoCarro4.getCapacidadeTanque());
		System.out.println("Km Por Litro: " + novoCarro4.getKmPorLitro());		
		System.out.println("Rodagem do veículo: " + novoCarro4.calcularKm());
		System.out.println("Preço: " + novoCarro4.getPreco());
		System.out.println("Desconto: " + novoCarro4.calcularDesconto(2.5,2));
		System.out.println("Valor do Carro: " + novoCarro4.getValorComDesconto());

		
		System.out.println("----------------------------------------------");
		System.out.println("Total de carros registrados: " + Carro.getTotalCarros());
		System.out.println("Total de carros registrados: " + Carro.getPrecoTotal());
	}

}
