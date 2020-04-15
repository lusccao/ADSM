package ex82;

public class Conteudo {
	String textoNoticia;
	int dia;
	int mes;
	String topico;
	
	public Conteudo(String textoNoticia, int dia, int mes, String topico) {
		this.textoNoticia = textoNoticia;
		this.dia = dia;
		this.mes = mes;
		this.topico = topico;
	}

	public String getTextoNoticia() {
		return textoNoticia;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public String getTopico() {
		return topico;
	}

	@Override
	public String toString() {
		return "Conteudo: " + dia + "/" + mes + ": " + topico + "->" + textoNoticia;
	}
	

}
