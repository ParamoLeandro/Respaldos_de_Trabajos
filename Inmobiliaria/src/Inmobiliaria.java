//Ejercisio_4
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Inmobiliaria extends JFrame
{

	private static final long serialVersionUID = 1L;
	private int n=-1;
	
	private String nombre[]= new String[5];
	private float precio[] = new float[5];
	private float tamaño[]=  new float[5]; 
	private String direccion[]= new String[5];
	
	private JTextArea areaTexto = new JTextArea (20,30);
	Container contenedor = getContentPane();
	
	
	
	
	public Inmobiliaria()
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
			if (n<4)
			{
				String nomb= JOptionPane.showInputDialog("Ingrese la numeración del apartamento");
				if (n==-1)
				{
					n=n+1;
					nombre[n]= nomb;	
					direccion[n]=JOptionPane.showInputDialog("Ingrese la direccion del apartamento");
					precio[n]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del apartamento"));
					tamaño[n]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tamaño del apartamento en m² "));
					JOptionPane.showMessageDialog(null, "El apartamento " + nomb + " fue insertado");
				}
				else
				{
				int pos = Busca(nombre,nomb,n);
					
				if ((pos >= 0) && (nombre[0].compareTo(nomb)==0))
						JOptionPane.showMessageDialog(null, "El apartamento " + nomb +" ya esta ingresado en el sistema");
					else
					{
						n=n+1;
						pos= pos * (-1);
						for(int i=n; i>= (pos+1); i--)
						{
							nombre[i]=nombre[i-1];
							precio[i]=precio[i-1];
							direccion[i]=direccion[i-1];
							tamaño[i]=tamaño[i-1];
						}
						nombre[pos]= nomb;
						direccion[pos]=JOptionPane.showInputDialog("Ingrese la direccion del apartamento");
						precio[pos]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del apartamento"));
						tamaño[pos]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tamaño del apartamento en m² "));
						JOptionPane.showMessageDialog(null, "El apartamento "+ nomb +" fue insertado correctamente");
					}
				}
			}
			else
				JOptionPane.showMessageDialog(null, "No hay espacio disponible en el sistema de almcenamiento");
		}
	
		public void EliminarOrd()
		{
			if(n>-1)
			{
				String nomb= JOptionPane.showInputDialog("Ingrese el numero de apartamento para ser buscado");
				int pos = Busca(nombre,nomb,n);
				
				if (pos < 0)
					JOptionPane.showMessageDialog(null, "El apartamento " + nomb +" no esta registrado en el sistema");
				else
				{
					n=n-1;
					for(int i=pos; i<= n; i++)
					{
						nombre[i]=nombre[i+1];
						precio[i]=precio[i+1];
						direccion[i]=direccion[i+1];
						tamaño[i]=tamaño[i+1];
						}
					JOptionPane.showMessageDialog(null, "El apartamento "+ nomb +" fue eliminado sastifactoriamente del sistema");
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
				String nomb= JOptionPane.showInputDialog("Ingrese el nuemro del apartamento para ser buscado");
				int pos = Busca(nombre,nomb,n);
				
				if (pos < 0)
					JOptionPane.showMessageDialog(null,  "El apartamento "+ nomb +" no existe en el sistema");
				else
				{
					precio[pos]= Float.parseFloat(JOptionPane.showInputDialog("Actualize el precio del apartamento"));;
					JOptionPane.showMessageDialog(null, "El precio del apartamento ha sido modificado");
					direccion[pos]=JOptionPane.showInputDialog("Ingrese la nueva direccion del apartamento");
					JOptionPane.showMessageDialog(null, "La direccion se ha sido modificado");
					tamaño[pos]=Float.parseFloat(JOptionPane.showInputDialog("De el nuevo tamaño del apartamento"));
					JOptionPane.showMessageDialog(null, "El nuevo tamaño del apartamento ha sido almacenado en el sistema");
				}
			
				ImprimirR();
				
			}
			else
				JOptionPane.showMessageDialog(null, "Sin informacion en el sistema :c");
		}
			


		public void ImprimirR()
		{
			
			String sal="Nombre \t Precio \t Direccion \t Tamaño  \n";
			if (n > -1)
			{
				for(int i=0; i<= n; i++)
					sal+= nombre[i] + "\t" + precio[i] + "\t" + direccion[i] + "\t"+ tamaño[i]+ "\n";
				
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
			
			String sal="Nombre\t Precio \t Direccion \n Tamaño \n";
			if (n > -1)
			{
				String nomb= JOptionPane.showInputDialog("De el numero del apartamento a buscar");
				int pos = Busca(nombre,nomb,n);
				
				if (pos < 0)
					JOptionPane.showMessageDialog(null,  "El apartamento "+ nomb +" no existe");
				else
				{
					sal= sal+= nombre[pos] + "\t" + precio[pos] + "\t" + direccion[pos]+ "\t" + tamaño[pos];
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
			Inmobiliaria array = new Inmobiliaria();
			array.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JOptionPane.showMessageDialog(null,"Para buscar y eliminar un apartamento, antes nombrarles con un numero que se almacenara como un nombre");
		}
}

