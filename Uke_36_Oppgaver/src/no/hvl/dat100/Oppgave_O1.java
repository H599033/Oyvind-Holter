package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave_O1 
{

	public static void main(String[] args) 
	{

		String BrutInnTxt = showInputDialog("Bruttoinntekt");
		
		double BrutInn= Double.parseDouble(BrutInnTxt);
		double Prosent = 0;
		
		if(164101<BrutInn && 230950>BrutInn)
		{
			Prosent= 0.93;
			showMessageDialog(null,"Prosent = " + Prosent+"% " + "betalte skatt " +BrutInn*Prosent+ "Kr");
		}
		
		else if (230951<BrutInn && 580650>BrutInn)
		{
			Prosent=2.41;
			showMessageDialog(null,"Prosent =  " + Prosent+"% " + "betalte skatt " +BrutInn*Prosent+ "Kr");
		}
		
		else if (580651<BrutInn && 934050>BrutInn)
		{
			Prosent=11.51;
			showMessageDialog(null,"Prosent =  " + Prosent+"% " + "betalte skatt " +BrutInn*Prosent+ "Kr");
		}
		
		else if  (934051<BrutInn)
		{
			Prosent=14.52;
			showMessageDialog(null,"Prosent =  " + Prosent+"% " + "betalte skatt " +BrutInn*Prosent+ "Kr");
		}
		
		else
		{
			showMessageDialog(null,"Null skatt");
		}
	}

}
