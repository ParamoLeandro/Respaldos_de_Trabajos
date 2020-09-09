package leandro;

import javax.swing.JOptionPane;

public class Leandro {

    public static void main(String[] args) {
        int productos=0;
        float subtotal=0, IVA=0, total=0;
        String impresion = "              Tienda la bonita \n"
                + "Nombre del articulo             cantidad             precio             costo \n";
        
        productos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos productos se almacenarán"));
        int [] cantidad = new int[productos];
        String []nombre = new String[productos];
        float [] precio = new float[productos];
        float []costo = new float[productos];
        
        for(int i=0; i<precio.length; i++)
        {
            nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i+1) + ":");
            cantidad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto " + (i+1) + ":"));
            precio[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio unitario del producto " + (i+1) + ":"));
            
            costo[i] = cantidad[i] * precio[i];
            subtotal += costo[i];
            
            impresion += nombre[i] + "                                               " + cantidad[i] + "                      " + precio[i] + "                   " + costo[i] + "\n";
        }
        
        IVA = (float) (subtotal * 0.15);
        total = subtotal + IVA;
        
        impresion += "\n";
        impresion += "                                                                                          subtotal " + subtotal + "\n";
        impresion += "                                                                                          IVA(15%) " + IVA + "\n";
        impresion += "                                                                                          total " + total + "\n";
        
        JOptionPane.showMessageDialog(null, impresion);
        
        
    }
    
}