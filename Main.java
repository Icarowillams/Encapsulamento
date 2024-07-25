package ENCAPSULAMENTO;

public class Main {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(5, 3);

        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }
}
