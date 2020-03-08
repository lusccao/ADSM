package geometria;

public class Losangulo extends Poligono {

	public Losangulo(double base, double altura) {
		super(base, altura);
	}
	
	public double area() {
		return getBase()*getAltura();
	}

	@Override
	public double calculaDiagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 4*getBase();
	}

}
