class Main {
  public static void main(String[] args) {
    // Cria objeto novoCarro
    Carro novoCarro = new Carro();

    // Atributos do Objeto(novoCarro)
    novoCarro.marca = "BMW";
    novoCarro.modelo = "X1";
    novoCarro.cor = "Preto";
    novoCarro.km = 0;

    // Print localização na memória (ponteiro)
    System.out.println(novoCarro);
    // Print atributo
    System.out.println(novoCarro.marca);
  }
}