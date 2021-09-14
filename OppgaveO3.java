package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		  int i, fakultet = 1;  
		  
		  int tall = Integer.parseInt(showInputDialog("Tall: "));
		  
		  for(i = 1;i <= tall; i++){    
		      fakultet = fakultet * i;    
		  }    
		  System.out.println("Factorial of " + tall + " is: "+ fakultet);    

	}

}
