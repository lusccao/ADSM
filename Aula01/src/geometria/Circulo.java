package geometria;

public class Circulo extends Figura {

	double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	@Override
	public double calculaDiagonal() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*raio;
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

}
