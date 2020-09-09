package leandro;

import javax.swing.*;
import java.awt.Graphics;

public class ejercisio3 extends JApplet {
	
	public void init() {
 
   	}
	
	//@Override
	public void paint(Graphics i) {
		
		i.drawString("Dinero en la cuenta inicial:",45,15);
		i.drawString("Jose: $1000.00",55,100);
		i.drawString("Pedro: $12000.00",55,115);
		i.drawRect(45,85,120,35);
		
		i.drawString("Dinero en la cuenta despues de un año:",45,150);
		i.drawString("Jose: $1050.00",55,170);
		i.drawString("Pedro: $1218.00",55,190);
		
		i.drawString("Dinero en la cuenta despues de dos años:",45,220);
		i.drawString("Jose: $1102.50",55,240);
		i.drawString("Pedro: $1236.27",55,260);
		
		i.drawString("Dinero en la cuenta despues de tres años:",45,290);
		i.drawString("Jose: $1157.63",55,310);
		i.drawString("Pedro: $1254.81",55,330);
		
		i.drawString("Dinero en la cuenta despues de cuatro años:",45,360);
		i.drawString("Jose: $1215.51",55,380);
		i.drawString("Pedro: $1273.63",55,400);
		
		i.drawString("Dinero en la cuenta despues de cinco años:",45,430);
		i.drawString("Jose: $1276.29",55,450);
		i.drawString("Pedro: $1292.73",55,470);
		
		i.drawString("Dinero en la cuenta despues de seis años:",45,500);
		i.drawString("Jose: $1340.10",55,520);
		i.drawString("Pedro: $1312.12",55,540);
		
		i.drawString("La cuenta de Jose supera a la de Pedro despues de seis años.",45,570);
		
	}
	
}