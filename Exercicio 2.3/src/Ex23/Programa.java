package Ex23;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Digite: ");
		DirecionadorFactory df = new DirecionadorFactory();
		df.gerarArq(a);
	}

}
