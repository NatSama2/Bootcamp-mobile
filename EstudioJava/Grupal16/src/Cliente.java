public class Cliente  extends  Usuario{

    private String id;

    public Cliente(String id, String nombre, String rut) {
        super(nombre, rut);
        this.id = id;
    }



    public void mostrarCliente(){
            System.out.println("Datos del cliente:" + " "+id+" "+super.analizarUsuario());
    }
            

}
