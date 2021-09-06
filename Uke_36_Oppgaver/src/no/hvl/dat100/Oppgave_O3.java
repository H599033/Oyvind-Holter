package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave_O3 
{

	public static void main(String[] args) 
	{
		
		// Definerer variablene i koden.
		String TallEnTxt = showInputDialog("Tall ");
		
		int n = Integer.parseInt(TallEnTxt);
		int t =1;
		
		// Setter utregning innen for en "if" slik at vi kunne regner innen for godkjente tall.
		
		if(n >=0) 
		{
		// 
			for (int i=1; i<=n; i++) 
			{
				t= t*i;		
			}
		
			showMessageDialog (null,t);	
		}
		
		else 
		{
			showMessageDialog (null,"Trenger godkjent tall");	
		}
		
	}

}
