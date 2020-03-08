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
		
		for(Figura fig:figuras){
			System.out.println(fig.perimetro());
			System.out.println("____________Espaço______________");
		}

	}

}
