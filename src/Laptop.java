public class Laptop extends Producto implements Vendible{
    private String procesador;
    private String memoriaRam;

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public Laptop(String nombre, String marca, double precio, int cantidadStock, String procesador, String memoriaRam) {
        super(nombre, marca, precio, cantidadStock);
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;

    }

    @Override
    public void mostrarDetalles(){
        System.out.println("La laptop registrada tiene las siguientes caractisticas");
        System.out.println("nombre : "+nombre);
        System.out.println("marca : "+marca);
        System.out.println("precio : "+precio);
        System.out.println("cantidad de Stock : "+cantidadStock);
        System.out.println("procesador : "+procesador);
        System.out.println("memoria Ram : "+memoriaRam);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Laptop{" +
                "procesador='" + procesador + '\'' +
                ", memoriaRam='" + memoriaRam + '\'' +
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
