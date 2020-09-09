public class Parte_1_1 {

	private int pagoneto;

	 public Parte_1_1(){
		//Inicializamos_los_valores_en_1
		pagoneto=0;
	}
	 
	 //Se_valida
	 public void Set (int pagoneto) {
		 this.pagoneto = (pagoneto>0)? pagoneto:0;
		  }
	
	//Retornamos_el_valor_del_radio
	 public int Getpago() {
		 return pagoneto;
	 }
	 
	 public int GetINSS() {
		int inss;
		inss=(int)(pagoneto*0.07);
		//convertimos_para_devolver_enteros
		return inss;
	}
	
	public int GetIR() 
	{
		int ir=0,salarioanual=0;
		salarioanual=(this.pagoneto - this.GetINSS())*12;
		
		if(salarioanual>0 && salarioanual<100000) 
			ir=0;
		else
			if(salarioanual>100001 && salarioanual<=200000)
				ir=(int) ((salarioanual-100000)*0.15)/12;
			else
				if (salarioanual>200001 && salarioanual<=330000)
					ir=(int) (((salarioanual-200000)*0.20)+15000)/12;
				else
					if (salarioanual>330001 && salarioanual<=500000)
						ir=(int) (((salarioanual-350000)*0.25)+45000)/12;
					else
						if (salarioanual>=500001)
							ir=(int) (((salarioanual-500000)*0.30)+82000)/12;
		return ir;
	}

}