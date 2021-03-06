package geometria;
import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Triangulo(4.0,3.2));
		figuras.add(new Quadrado(10.0,10.0));
		figuras.add(new Retangulo(20.0,10.0));
		figuras.add(new Losangulo(15.0,10.0));
		figuras.add(new Circulo(2));
		figuras.add(new Cubo(2,2,2));
		figuras.add(new Piramide(2,2,2));
		figuras.add(new Esfera(5));
		figuras.add(new Cilindro(3,7));
		
		for(Figura fig:figuras){
			System.out.println(" Area: " + fig.area());
			System.out.println("\n Perimetro: " + fig.perimetro());
			System.out.println("\n Diagonal: " + fig.calculaDiagonal());
			System.out.println("\n Volume: " + fig.volume());
			System.out.println("____________Espa�o______________");
		}

	}

}
