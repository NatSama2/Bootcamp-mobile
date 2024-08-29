package empleados;

public class Repartidor extends Empleados implements ILista{

	private String disponibilidad;

	



	public Repartidor() {
		super();
	}


	public Repartidor(String nombre, String apellido, int edad, int salario, String disponibilidad) {
		super(nombre, apellido, edad, salario);
		this.disponibilidad = disponibilidad;
	}



	public String getDisponibilidad() {
		return disponibilidad;
	}


	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	
	

	@Override
	public String toString() {
		return "Repartidor [disponibilidad=" + disponibilidad + ", nombre=" 
				+ nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" 
				+ salario + "]";
	}


	public int calcularbono() {
			int pago= 0;
			if (edad < 30) 
				pago = (15000 +super.calcularbono());
			else pago = super.calcularbono();
		return pago;

		
	}
}
