package ex81;

public class Leitor implements ConsomeNoticia {

	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println("Leitor leo sobrbe: " + topico);
		
	}

}
