package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB4 {
	public static void main(String[] args) {
		int bruttoInntekt = Integer.parseInt(showInputDialog("Bruttoinntekt: "));
		
		double trinn1Sats = 0.93;
		double trinn2Sats = 2.41;
		double trinn3Sats = 11.52;
		double trinn4Sats = 14.52;
		
		if (bruttoInntekt > 164101 && bruttoInntekt <= 230950) {
			// Trinn 1: 
			showMessageDialog(null, bruttoInntekt * (trinn1Sats / 100));
		}
		else if (bruttoInntekt > 230951 && bruttoInntekt <= 580650) {
			// Trinn 2:
			showMessageDialog(null, bruttoInntekt * (trinn2Sats / 100));
		}
		else if (bruttoInntekt > 580651 && bruttoInntekt <= 20200323) {
			// Trinn 3:
			showMessageDialog(null, bruttoInntekt * (trinn3Sats / 100));
		}
		else if (bruttoInntekt > 934051) {
			// Trinn 4:
			showMessageDialog(null, bruttoInntekt * (trinn4Sats / 100));
		}
		else {
			// Trinn "0":
			showMessageDialog(null, bruttoInntekt);
		}
	}
}
