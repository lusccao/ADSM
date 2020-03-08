package geometria;

public class Quadrado extends Poligono implements Diagonal{

	public Quadrado(double base, double altura) {
		super(base, altura);
	}
	
	public double area() {
		return getBase()*getAltura();
	}
	
	public double calculaDiagonal() {
		return getAltura()*Math.sqrt(2);
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 4*getBase();
	}

}
