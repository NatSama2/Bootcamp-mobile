public class App {
    public static void main(String[] args) throws Exception {
  

        //  instancias de las clases
              Listado lis = new Listado();
              Usuario  us1, us2, us3, us4,us5;
              Cliente cl1, cl2;
              Administrativo ad;
              Profesional pro1, pro2;

           // Datos
        us1= new Usuario("Juan","123456789");
        cl1= new Cliente("1234","Juan","123456789");
        us2= new Usuario("Juan","123456789");
        cl2= new Cliente("4561","Pepe","987654321");
        us3= new Usuario("Jose","456456456");
        pro1= new Profesional("Programador","01-02-2020","Jose","456456456");
        us4= new Usuario("Carlos","25252525");
        pro2= new Profesional("Desarrollador","02-02-2020","Carlos","25252525");
        us5= new Usuario("Ana","787565");
        ad=new Administrativo("Recepcion","2 año","Ana","787565");




// Metodo para llenar la lista mediante un arreglo
System.out.println("Lista de Usuario");
System.out.println();
lis.agregarUsuario(us1);
lis.agregarUsuario(us2);
lis.agregarUsuario(us3);
lis.agregarUsuario(us4);
lis.agregarUsuario(us5);      
lis.mostrarUsuario();// Metodo para mostrar los datos de arreglo

System.out.println();
lis.setPr(pro1);// Seteo el objeto profesional con los valores 
lis.mostrarProfesional();// Muestro los valores
System.out.println();
lis.setPr(pro2);// Seteo el objeto profesional con los valores
lis.mostrarProfesional();// Muestro los valores

System.out.println();
lis.setCl(cl1); // Seteo el objeto cliente con los valores
lis.mostrarCliente();// Muestro los valores
System.out.println();
lis.setCl(cl2);// Seteo el objeto cliente con los valores
lis.mostrarCliente();

lis.setAd(ad);// Seteo el objeto Administrativo con los valores
System.out.println();
lis.mostrarAdministrativo();










    }
}
