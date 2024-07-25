package empleados;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
	
		
		Vendedor ven1 = new Vendedor ("Manuel", "santana", 34, 370000,  "01-09-1993");
		Repartidor rep1= new Repartidor ("criss", "santana",22, 370000,  "inmediata");
		
		Otro plantilla = new Otro();
		Otro.addEmpleado(ven1);
		Otro.addEmpleado(rep1);
		
		System.out.println(ven1);
		System.out.println(rep1);
		
		System.out.println(ven1.calcularbono());
		System.out.println(rep1.calcularbono());
		
		
	}

	

	
	
}
