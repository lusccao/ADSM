package geometria;

public abstract class Poligono extends Figura {
	private double altura;
	private double base;

	public Poligono(double base, double altura){
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

}
