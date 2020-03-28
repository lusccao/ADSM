package arquivo;

public class ProvedoraPublica implements Provedora {

	@Override
	public String proverInfo() {
		return lerArquivo("publico.txt");
	}


}
