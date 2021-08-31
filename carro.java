package Aula;

public class Carro {
	
	// Propriedades/Atributos 
	String marca;
	String modelo;
	String cor;
	int km;	
	
	// Métodos
	int calcularKm(int dist, int kmAtual ) {
		return dist + kmAtual;
	}
}
