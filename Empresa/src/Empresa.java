//Ejercisio_2
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Empresa extends JFrame
{

	private static final long serialVersionUID = 1L;
	private int n=-1;
	
	private String nombre[]= new String[5];
	private int telefono[] = new int[5];
	private float saldo[]=  new float[5]; 
	private String mora[]= new String[5];
	
	private JTextArea areaTexto = new JTextArea (20,30);
	Container contenedor = getContentPane();
	
	
	
	
	public Empresa()
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
				String nomb= JOptionPane.showInputDialog("Nombre del cliente");
				if (n==-1)
				{
					n=n+1;
					nombre[n]= nomb;	
					telefono[n]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de telefono del cliente"));
					saldo[n]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el saldo actual del cliente"));
					mora[n]=JOptionPane.showInputDialog("¿Mora activa? Ingrese si o no segun sea el caso ");
					JOptionPane.showMessageDialog(null, "El cliente " + nomb + " fue insertado");
				}
				else
				{
				int pos = Busca(nombre,nomb,n);
					
				if ((pos >= 0) && (nombre[0].compareTo(nomb)==0))
						JOptionPane.showMessageDialog(null, "El cliente " + nomb +" ya esta ingresado en el sistema");
					else
					{
						n=n+1;
						pos= pos * (-1);
						for(int i=n; i>= (pos+1); i--)
						{
							nombre[i]=nombre[i-1];
							telefono[i]=telefono[i-1];
							saldo[i]=saldo[i-1];
							mora[i]=mora[i-1];
						}
						nombre[pos]= nomb;
						telefono[pos]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de telefono del cliente"));
						saldo[pos]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el saldo actual del cliente"));
						mora[pos]=JOptionPane.showInputDialog("¿Mora activa? Ingrese si o no segun sea el caso ");
						JOptionPane.showMessageDialog(null, "El cliente "+ nomb +" fue insertado correctamente en el sistema");
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
				String nomb= JOptionPane.showInputDialog("Ingrese el nombre del ciente para ser buscado");
				int pos = Busca(nombre,nomb,n);
				
				if (pos < 0)
					JOptionPane.showMessageDialog(null, "El cliente " + nomb +" no esta registrado en el sistema");
				else
				{
					n=n-1;
					for(int i=pos; i<= n; i++)
					{
						nombre[i]=nombre[i+1];
						telefono[i]=telefono[i+1];
						saldo[i]=saldo[i+1];
						mora[i]=mora[i+1];
						}
					JOptionPane.showMessageDialog(null, "El cliente "+ nomb +" fue eliminado sastifactoriamente del sistema");
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
				String nomb= JOptionPane.showInputDialog("Ingrese el nombre del cliente para ser buscado");
				int pos = Busca(nombre,nomb,n);
				
				if (pos < 0)
					JOptionPane.showMessageDialog(null,  "El cliente "+ nomb +" no existe en el sistema");
				else
				{
					telefono[pos]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de telefono del cliente"));
					JOptionPane.showMessageDialog(null, "El numero de telefono ha sido modificado");
					saldo[pos]=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo saldo del cliente"));
					JOptionPane.showMessageDialog(null, "El saldo se ha sido modificado correctamente");
					mora[pos]=JOptionPane.showInputDialog("¿Mora activa? Ingrese si o no segun sea el caso ");
					JOptionPane.showMessageDialog(null, "La nueva condicon de mora ha sido actualizada correctamente en el sistema");
				}
			
				ImprimirR();
				
			}
			else
				JOptionPane.showMessageDialog(null, "Sin informacion en el sistema :c");
		}
			


		public void ImprimirR()
		{
			
			String sal="Nombre \t telefono \t Saldo \t Mora Activa  \n";
			if (n > -1)
			{
				for(int i=0; i<= n; i++)
					sal+= nombre[i] + "\t" + telefono[i] + "\t" + saldo[i] + "\t"+ mora[i]+ "\n";
				
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
			
			String sal="Nombre\t Telefono \t Saldo \n Mora \n";
			if (n > -1)
			{
				String nomb= JOptionPane.showInputDialog("De el nombre del cliente a buscar");
				int pos = Busca(nombre,nomb,n);
				
				if (pos < 0)
					JOptionPane.showMessageDialog(null,  "El cliente "+ nomb +" no existe");
				else
				{
					sal= sal+= nombre[pos] + "\t" + telefono[pos] + "\t" + saldo[pos]+ "\t" + mora[pos];
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
			Empresa array = new Empresa();
			array.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
}

