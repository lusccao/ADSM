package nomes;

public class Programa {

	public static void main(String[] args) {
		String[] lista = {"Arthur, Lucas", "Lusccao Lucosso", "Lispector, Larissa"};
		//se nada for passado como parâmetro
		if(args.length == 0) {
			args = lista;
		}
		Nomes nomes = new Nomes(args);
	}

}
