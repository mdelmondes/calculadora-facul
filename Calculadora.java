package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {
	
	public static void main(String[] args) {

		int num1=0;
		int num2=0;
		int total;
		int i=0;
		String aux;
		String tpoperacao = null;
		
		aux = JOptionPane.showInputDialog ("Digite um numero");
		num1 = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog ("Digite a operacao");
		tpoperacao = aux;
		
		aux = JOptionPane.showInputDialog("Digite outro numero");
		num2 = Integer.parseInt(aux);

		if(tpoperacao.equals ("+"))
		{
			total = num1+num2;
			JOptionPane.showMessageDialog(null,"A soma e: "+total);
		}
		else if (tpoperacao.equals ("-"))
		{
			total = num1-num2;
			JOptionPane.showMessageDialog(null,"A subtracao e: "+total);
		}
		else if (tpoperacao.equals ("*"))
		{
			total = num1*num2;
			JOptionPane.showMessageDialog(null,"A multiplicacao e: "+total);
		}	
		else 
		{
			total = num1/num2;
			JOptionPane.showMessageDialog(null,"A divisao e: "+total);
		}		
	}
}
