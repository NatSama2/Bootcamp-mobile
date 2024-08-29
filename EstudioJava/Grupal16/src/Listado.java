
import java.util.ArrayList;

public class Listado {

    ArrayList<Usuario> us = new ArrayList();

    Profesional pr;
    Cliente cl;
    Administrativo ad;

    // agregar Usuario
    public void agregarUsuario(Usuario nuevoUsuario) {
        us.add(nuevoUsuario);
    }

    // mostrarUsuario
    public void mostrarUsuario() {

        for (Usuario tempUsuario : us) {
            System.out.println(tempUsuario.analizarUsuario());

        }
    }

    public void mostrarAdministrativo() {

        System.out.println(ad.mostrarAdministrativo());

    }

    public void mostrarCliente() {

        cl.mostrarCliente();

    }

    public void mostrarProfesional() {

        pr.mostrarProfesional();

    }

    public ArrayList<Usuario> getUs() {
        return us;
    }

    public Profesional getPr() {
        return pr;
    }

    public Cliente getCl() {
        return cl;
    }

    public Administrativo getAd() {
        return ad;
    }

    public void setUs(ArrayList<Usuario> us) {
        this.us = us;
    }

    public void setPr(Profesional pr) {
        this.pr = pr;
    }

    public void setCl(Cliente cl) {
        this.cl = cl;
    }

    public void setAd(Administrativo ad) {
        this.ad = ad;
    }

}
