package ex81;

public class Programa {

	public static void main(String[] args) {
		Leitor leitor = new Leitor();
		Noticiario noticiario = new NoticiarioAssina(leitor);
		noticiario.notificaNoticia("Texto1", 1, 1, "TopicoA");
		noticiario.notificaNoticia("Texto2", 2, 1, "TopicoB");

	}

}
