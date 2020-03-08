package geometria;

public class Cilindro extends Figura {
	double altura;
	double raio;
	
	public Cilindro(double altura, double raio) {
		super();
		this.altura = altura;
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
		return Math.PI*Math.pow(raio,3)*altura;
	}

}
