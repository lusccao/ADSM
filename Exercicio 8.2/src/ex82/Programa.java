package ex82;

public class Programa {

	public static void main(String[] args) {
		ConsomeNoticia agragadorTopico = new AgregadorTopico("jogos");
		Noticiario noticiario = new NoticiarioAssina(agragadorTopico);
		noticiario.notificaNoticia("Fifa 20", 10, 1, "jogos");
		noticiario.notificaNoticia("Pes 20", 19, 2, "jogos");
		noticiario.notificaNoticia("God of War", 22, 2, "jogos");
		noticiario.notificaNoticia("Tetris", 31, 1, "jogos");
		noticiario.notificaNoticia("The Last of US II", 1, 4, "jogos");
		noticiario.notificaNoticia("Spider homem", 9, 6, "jogos");
		noticiario.notificaNoticia("Nossa quanto jogo", 1, 4, "jogos");
		noticiario.notificaNoticia("Não tenho mais ideia", 1, 4, "jogos");
		noticiario.notificaNoticia("F1 rs", 13, 4, "outro");
		noticiario.notificaNoticia("Sonic", 12, 5, "jogos");
		noticiario.notificaNoticia("Mario", 10, 6, "jogos");
		noticiario.notificaNoticia("King kong", 11, 7, "jogos");
		noticiario.notificaNoticia("Mario Kart", 21, 12, "jogos");
		
		System.out.println("///////////////////////////////////////");
		
		ConsomeNoticia agregadorMensal = new AgregadorMensal();
		noticiario = new NoticiarioAssina(agregadorMensal);
		noticiario.notificaNoticia("Fifa 20", 10, 1, "jogos");
		noticiario.notificaNoticia("Pes 20", 19, 2, "jogos");
		noticiario.notificaNoticia("God of War", 22, 2, "jogos");
		noticiario.notificaNoticia("Tetris", 31, 1, "jogos");
		noticiario.notificaNoticia("The Last of US II", 1, 4, "jogos");
		noticiario.notificaNoticia("Spider homem", 9, 6, "jogos");
		noticiario.notificaNoticia("Nossa quanto jogo", 1, 4, "jogos");
		noticiario.notificaNoticia("Não tenho mais ideia", 1, 4, "jogos");
		noticiario.notificaNoticia("F1 rs", 13, 4, "outro");
		noticiario.notificaNoticia("Sonic", 12, 5, "jogos");
		noticiario.notificaNoticia("Mario", 10, 6, "jogos");
		noticiario.notificaNoticia("King kong", 11, 7, "jogos");
		noticiario.notificaNoticia("Mario Kart", 21, 12, "jogos");

	}

}
