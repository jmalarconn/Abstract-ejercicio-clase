import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente{
    private String nombre;
    private String correo;
    List<Producto> lstProductos = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);

    public Cliente(String nombre, String correo, List<Producto> lstProductos) {
        this.nombre = nombre;
        this.correo = correo;
        this.lstProductos = lstProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        System.out.println("ingresa el nombre del cliente");
        setNombre(teclado.nextLine());
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
        System.out.println("ingresa el correo del cliente");
        setCorreo(teclado.nextLine());
    }

    public List<Producto> getLstProductos() {
        return lstProductos;
    }

    public void setLstProductos(List<Producto> lstProductos) {
        this.lstProductos = lstProductos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", lstProductos=" + lstProductos +
                '}';
    }
}
