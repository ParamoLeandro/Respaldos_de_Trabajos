//Ejercisio_1
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Escuela extends JFrame
{

	private static final long serialVersionUID = 1L;
	private int n=-1;
	int Tam = 5;
	private String nombre[]= new String[Tam];
	private int semestre[] = new int[Tam];
	private float promedio[]=  new float[Tam]; 
	private JTextArea areaTexto = new JTextArea (20,30);
	Container contenedor = getContentPane();
	
	
	
	
	public Escuela()
	{
		super("Escuela");
		contenedor.setLayout(new FlowLayout());
		
		JMenu menuAct = new JMenu("Actualizar");
		menuAct.setMnemonic('A');
	
		JMenuItem mIns = new JMenuItem("Ingresar");
		mIns.setMnemonic('I');
		menuAct.add(mIns);
		mIns.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evento)
				{
					InsertarOrd();
				}
			}
		);//fin de ActionListener
	
		JMenuItem mElim = new JMenuItem("Eliminar");
		mElim.setMnemonic('E');
		menuAct.add(mElim);
		
mElim.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evento)
				{
					EliminarOrd();
				}
			}
		);//fin de ActioneListener
		
		JMenuItem mMod = new JMenuItem("Cambiar Registro");
		mMod.setMnemonic('M');
		menuAct.add(mMod);
		mMod.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evento)
				{
					ModificarOrd();
				}
			}
		);//fin de ActioneListener
		
		JMenuItem mImpE = new JMenuItem("Imprimir un estudiante");
		mImpE.setMnemonic('p');
		menuAct.add(mImpE);
		mImpE.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evento)
				{
					ImprimirE();
				}
			}
		);//fin de ActionListener
			
		JMenuItem mImpTR = new JMenuItem("Imprimir todo");
		mImpTR.setMnemonic('T');
		menuAct.add(mImpTR);
		mImpTR.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evento)
				{
					ImprimirR();
				}
			}
		);//fin de ActionListener
		
		JMenuItem Salir = new JMenuItem("Salir");
		Salir.setMnemonic('S');
		menuAct.add(Salir);
		Salir.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evento)
				{
					System.exit(0);
				}
			}
		);//fin de ActionListener
		
		//crear barra de menu y adjuntarla 
		JMenuBar barra = new JMenuBar();
		setJMenuBar(barra);
		barra.add(menuAct);
		
		setSize(550,400);
		setVisible(true);
	}//fin constructor
	

		public int Busca(String nombre[], String nomb, int n)
		{
			int i=0;
			while ((i<=n) && (nombre[i].compareTo(nomb)< 0))
				i++;
			if ((i>n) || (nombre[i].compareTo(nomb)> 0))
				return (-i);
			else 
				return (i);
		}
	
		
		public void InsertarOrd()
		{
			if(n < (Tam - 1)){
				
				String nom = JOptionPane.showInputDialog("Nombre del alumno:");
				if(n == -1){
					n++;
					nombre[n] = nom;
					semestre[n] = Integer.parseInt(JOptionPane.showInputDialog("Numero de semestres cursados:"));
					promedio[n]=Float.parseFloat(JOptionPane.showInputDialog("Promedio Semestral"));
				}else{
					int i = 0;
					while((i <= n) && (nom.equalsIgnoreCase(nombre[i]))){
						i++;
					}
					if(i > n){
						JOptionPane.showMessageDialog(null, "El Alumno Ya existe");
					}else {
						n++;
						nombre[n] = nom;
						semestre[n] = Integer.parseInt(JOptionPane.showInputDialog("Numero de semestres cursados:"));
						promedio[n]=Float.parseFloat(JOptionPane.showInputDialog("Promedio Semestral"));
					}
				}
			}else{
				JOptionPane.showMessageDialog(null, "No hay espacio");
			}}
	
		public void EliminarOrd()
		{
			if(n>-1)
			{
				String nomb= JOptionPane.showInputDialog("Ingrese el nombre del estudiante para ser buscado");
				int pos = Busca(nombre,nomb,n);
				
				if (pos < 0)
					JOptionPane.showMessageDialog(null, "El estudiante " + nomb +" no esta registrado en el sistema");
				else
				{
					n=n-1;
					for(int i=pos; i<= n; i++)
					{
						nombre[i]=nombre[i+1];
						semestre[i]=semestre[i+1];
						promedio[i]=promedio[i+1];
						}
					JOptionPane.showMessageDialog(null, "El estudiante "+ nomb +" fue eliminado sastifactoriamente del sistema");
				}
				ImprimirR();
			}
			else
				JOptionPane.showMessageDialog(null, "El sistema no tiene informacion :c");
		}
		


		public void ModificarOrd()
		{
			if(n>-1)
			{
				String nomb= JOptionPane.showInputDialog("Ingrese el nombre del estudiante para ser buscado");
				int pos = Busca(nombre,nomb,n);
				
				if (pos < 0)
					JOptionPane.showMessageDialog(null,  "El cliente "+ nomb +" no existe en el sistema");
				else
				{
					semestre[pos]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantdad de semestre del estudiante"));
					JOptionPane.showMessageDialog(null, "El dato de semestre ha sido actualizado");
					promedio[pos]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo promedio del estudiante"));
					JOptionPane.showMessageDialog(null, "El promedio ha sido actualizado correctamente");
					}
			
				ImprimirR();
				
			}
			else
				JOptionPane.showMessageDialog(null, "Sin informacion en el sistema :c");
		}
			


		public void ImprimirR()
		{
			
			String sal="Nombre \t Semestre \t Promedio \n";
			if (n > -1)
			{
				for(int i=0; i<= n; i++)
					sal+= nombre[i] + "\t" + semestre[i] + "\t" + promedio[i] +"\n";
				
				areaTexto.setText(sal);
				areaTexto.repaint();
				contenedor.add(areaTexto);
				setVisible(true);
				
			}
			else
				JOptionPane.showMessageDialog(null, "Sin información en el sistema :c");

		}
		
		public void ImprimirE()
		{
			
			String sal="Nombre \t Semestre \t Promedio \n";
			if (n > -1)
			{
				String nomb= JOptionPane.showInputDialog("De el nombre del estudiante a buscar");
				int pos = Busca(nombre,nomb,n);
				
				if (pos < 0)
					JOptionPane.showMessageDialog(null,  "El estudiante "+ nomb +" no existe");
				else
				{
					sal= sal+= nombre[pos] + "\t" + semestre[pos] + "\t" + promedio[pos] +"\n";
					areaTexto.setText(sal);
					areaTexto.repaint();
					contenedor.add(areaTexto);
					setVisible(true);
				}
					
				
			}
			else
				JOptionPane.showMessageDialog(null, "Sin informacion en el sistema :c");

		}


		public static void main(String args[])
		{
			Escuela array = new Escuela();
			array.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
}

