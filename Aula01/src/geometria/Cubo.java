package geometria;

public class Cubo extends Figura {
	double altura;
	double comprimento;
	double largura;
	
	public Cubo(double altura, double comprimento, double largura) {
		super();
		this.altura = altura;
		this.comprimento = comprimento;
		this.largura = largura;
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
		return largura*comprimento*altura;
	}

}
