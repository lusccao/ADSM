package geometria;

public interface Diagonal {
	double calculaDiagonal();
	
	default double diagonal() {
		return calculaDiagonal();
	}

}
