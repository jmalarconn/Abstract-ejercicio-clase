import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op;
        boolean continuar = true;

        do {
            op = teclado.nextInt();
            switch(op)
            {
                case 1->{

                }
                case 2 ->{
                    System.out.println(" ");
                }
                default ->
                        System.out.println("El dato ingresado no existe");

            }
        }while(continuar);
    }
}