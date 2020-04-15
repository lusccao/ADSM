package ex81;

public class NoticiarioAssina extends Noticiario {
	Leitor leitor;
	public NoticiarioAssina(Leitor leitor) {
		this.leitor = leitor;
	}

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println("Noticiario: Produzimos uma nova noticia");
		System.out.println(dia + "/" + mes + ":" + topico + "->" + textoNoticia);
		leitor.consomeNoticia(textoNoticia, dia, mes, topico);
	}

}
