package Ex22;

public class ProvedoraFactoryMethod {

	public ProvedoraFactoryMethod(String senha) {
		Provedora p;
		if (senha.equals("senha")) {
			p = new ProvedoraConfidencial();
		} else {
			p = new ProvedoraPublica();
		}
		System.out.println(p.proverInfo());
	}
}
