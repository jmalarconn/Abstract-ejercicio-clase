import java.util.Scanner;

public abstract class Producto {
    protected String nombre;
    protected String marca;
    protected double precio;
    protected int cantidadStock;
    Scanner teclado = new Scanner(System.in);

    public Producto(){
    }

    public Producto(String nombre, String marca, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        System.out.println("ingresa el nombre del dispositivo");
        setNombre(teclado.nextLine());

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
        System.out.println("ingresa la marca del dispositivo");
        setMarca(teclado.nextLine());
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        System.out.println("ingresa el precio del dispositivo");
        setPrecio(teclado.nextDouble());
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
        System.out.println("Cantidad de dispositivos a ingresar en stock");
        setCantidadStock(teclado.nextInt());
    }
    public abstract void mostrarDetalles();

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantidadStock=" + cantidadStock +
                '}';
    }
}
