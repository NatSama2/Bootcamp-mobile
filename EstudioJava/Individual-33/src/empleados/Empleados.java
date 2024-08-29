package empleados;

public abstract class Empleados implements ILista{

	protected String nombre;
	protected String apellido;
	protected int edad;
	protected int salario;

	public Empleados() {
	}


	public Empleados(String nombre, String apellido, int edad, int salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}


	

	//method



	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", apellido=" + apellido +
				", edad=" + edad + ", salario=" + salario + "]";
	}


	@Override
	public void empleados() {
		// TODO Auto-generated method stub

	}

	public  int calcularbono() {
		int pago= salario;
		if (edad > 40)
			pago = pago + 100000;
		return pago;
		
	}
	
	
	
}





