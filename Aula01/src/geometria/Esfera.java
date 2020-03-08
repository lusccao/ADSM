package geometria;

public class Esfera extends Figura {
	double raio;
	
	public Esfera(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculaDiagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double volume() {
		return ((4/3)*(Math.PI)*(Math.pow(raio, 3)));
	}

}
