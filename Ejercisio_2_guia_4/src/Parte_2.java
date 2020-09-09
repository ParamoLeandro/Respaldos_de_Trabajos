import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Parte_2 {

	public static void main(String args[]) {
		
		Parte_1 sal = new Parte_1();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas veces desea repetir el proceso?"));
		int base=1, altura=1;
		String imp = "Altura\tBase\tPerimetro\tArea\n";
		
		for (int i=0;i<n;i++) {
			base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
			 sal.Set(base, altura);
		
			imp+= sal.Getaltura()+"\t"+sal.Getbase()+"\t"+sal.perimetro()+"\t"+sal.area()+"\n";
		}
		
		
		JTextArea tabla = new JTextArea();
		 tabla.setText(imp);
		 JOptionPane.showMessageDialog(null, tabla);
		 System.exit(0);
		
	} 
		
}
