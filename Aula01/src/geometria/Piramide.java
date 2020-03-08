package geometria;

public class Piramide extends Figura {
	
	double altura;
	double comprimento;
	double largura;
	
	public Piramide(double altura, double comprimento, double largura) {
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
		return (1/3)*largura*comprimento*altura;
	}

}
