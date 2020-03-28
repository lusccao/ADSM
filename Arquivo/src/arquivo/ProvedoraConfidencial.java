package arquivo;

public class ProvedoraConfidencial implements Provedora {

	@Override
	public String proverInfo() {
		return lerArquivo("confidencial.txt");
	}

}
