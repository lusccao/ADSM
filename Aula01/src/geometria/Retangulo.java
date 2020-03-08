package geometria;

public class Retangulo extends Poligono implements Diagonal{

	public Retangulo(double base, double altura) {
		super(base, altura);
	}
	
	public double area() {
		return getBase()*getAltura();
	}
	
	public double calculaDiagonal() {
		return Math.sqrt(Math.pow(getBase(),2)+Math.pow(getAltura(),2));
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*getBase()+2*getAltura();
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

}
