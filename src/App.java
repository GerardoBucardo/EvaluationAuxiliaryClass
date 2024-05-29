import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        ArrayList<Producto> listProducto = new ArrayList<>();
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);

        while (continuar){
            System.out.println("Ingrese el Id de Producto");
            int idPr = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese el nombre de Producto");
            String nombrePr = sc.nextLine();

            System.out.println("Ingrese el marca de Producto");
            String marcaPr = sc.nextLine();

            System.out.println("Ingrese el precio de Producto");
            int precioPr = sc.nextInt();
            sc.nextLine();

            Producto pr = new Producto(idPr, nombrePr, marcaPr, precioPr);
            listProducto.add(pr);

            System.out.println("Desea agregar otro registro? (s/n)");
            String respuesta = sc.nextLine();

            if(!respuesta.equalsIgnoreCase("n")){
                continuar = false;
            }
        }

        System.out.println("Lista de Estudiantes registrados: ");
        Iterator<Producto> iterator = listProducto.iterator();

        while (iterator.hasNext()){
            Producto producto = iterator.next();
            System.out.println(producto);
        }
    }
}
