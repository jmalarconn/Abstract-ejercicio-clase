import java.util.Scanner;

public class Celular extends Producto implements Vendible {

    Scanner teclado = new Scanner(System.in);
    private int capacidadBateria;
    private String resolucionCamara;

    public Celular(String nombre, String marca, double precio, int cantidadStock, int capacidadBateria, String resolucionCamara) {
        super(nombre, marca, precio, cantidadStock);
        this.capacidadBateria = capacidadBateria;
        this.resolucionCamara = resolucionCamara;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
        System.out.println("ingresa la capacidad de bateria del celular");
        setCapacidadBateria(teclado.nextInt());
    }

    public String getResolucionCamara() {
        return resolucionCamara;
    }

    public void setResolucionCamara(String resolucionCamara) {
        this.resolucionCamara = resolucionCamara;
        System.out.println("ingresa la resolucion de la camara del celular");
        setResolucionCamara(teclado.nextLine());
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("El celular registrado tiene las siguientes caractisticas");
        System.out.println("nombre : "+nombre);
        System.out.println("marca : "+marca);
        System.out.println("precio : "+precio);
        System.out.println("cantidad de Stock : "+cantidadStock);
        System.out.println("capacidad de bateria : "+capacidadBateria);
        System.out.println("resolucion de camara : "+resolucionCamara);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Celular{" +
                "capacidadBateria=" + capacidadBateria +
                ", resolucionCamara='" + resolucionCamara + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantidadStock=" + cantidadStock +
                '}';
    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        double total = precio * cantidad;
        if (cantidad > 5) {
            total *= 0.9;
        }
        return total;
    }
}
