package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB5 {
	public static void main(String[] args) {
		int poeng; 
		
		for (int i = 0; i < 10; i++) {
			poeng = Integer.parseInt(showInputDialog("Poeng: "));
			if (poeng >= 0 && poeng <= 100) {
				if (poeng >= 90)
					showMessageDialog(null, "A\nkarakter nr. " + (i + 1));
				else if (poeng >= 80 && poeng <= 89) 
					showMessageDialog(null, "B\nkarakter nr. " + (i + 1));
				else if (poeng >= 60 && poeng <= 79) 
					showMessageDialog(null, "C\nkarakter nr. " + (i + 1));
				else if (poeng >= 50 && poeng <= 59) 
					showMessageDialog(null, "D\nkarakter nr. " + (i + 1));
				else if (poeng >= 40 && poeng <= 49) 
					showMessageDialog(null, "E\nkarakter nr. " + (i + 1));
				else 
					showMessageDialog(null, "F\nkarakter nr. " + (i + 1));	
			}
			else {
				i--;
				showMessageDialog(null, "Ulovlig poengsum, tast inn på nytt.");
			}
		}
	}

}
