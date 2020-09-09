import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Parte_2 {

	public static void main(String args[]) {
		
		Parte_1 sal = new Parte_1();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas veces desea repetir el proceso?"));
		int radio=0;
		String imp = "Radio\tArea\t\tLongitud\n";
		
		for (int i=0;i<n;i++) {
			radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio"));
			sal.Set(radio);
		
			imp+= sal.Getradio()+"\t"+sal.area()+"\t"+sal.longitud()+"\n";
		}
		
		
		JTextArea tabla = new JTextArea();
		 tabla.setText(imp);
		 JOptionPane.showMessageDialog(null, tabla);
		 System.exit(0);
		
	} 
		
}
