package empleados;

public class Vendedor extends Empleados implements ILista{

	private String inicioEmpresa;


	public Vendedor() {
		super();
	}



	public Vendedor(String nombre, String apellido, int edad, int salario, String inicioEmpresa) {
		super(nombre, apellido, edad, salario);
		this.inicioEmpresa = inicioEmpresa;
	}


	public String getInicioEmpresa() {
		return inicioEmpresa;
	}



	public void setInicioEmpresa(String inicioEmpresa) {
		this.inicioEmpresa = inicioEmpresa;
	}



	@Override
	public String toString() {
		return "Vendedor [inicioEmpresa=" + inicioEmpresa + ", nombre=" + nombre + ", apellido=" + apellido + ", edad="
				+ edad + ", salario=" + salario + "]";
	}



	@Override
	public  int calcularbono() {
		int pago= 50000 ;
			pago  = (pago+super.calcularbono());
	return pago;
	}

	


}