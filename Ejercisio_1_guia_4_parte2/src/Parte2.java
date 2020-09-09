import javax.swing.*;

public class Parte2 {
	
	public void init()
	 {
		maincra sal = new maincra();
		
		String imp="Numero 1 \t\t Numero 2 \t\t Suma \t\t Resta \t\t Multiplicación \t\t División \n";
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nº 1"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nº 2"));
		sal.set(num1,num2);

		
		imp +=sal.GETnum1() + "\t" + sal.GETnum2() + "\t" + sal.suma() + "\t" + sal.Resta() + "\t" + sal.multi() + sal.divi()+"\n";
		
		JTextArea tabla = new JTextArea();
		tabla.setText(imp);
		JOptionPane.showMessageDialog(null, imp);
		System.exit(0);
	 
	 }//Final_del_init
	

}//fin_de_todo
