import java.util.Scanner;
public class Compras{
    public static void main(String Args[]){
        Scanner scn = new Scanner(System.in);
        int numClientes;
        Cliente[] losClientes = new Cliente[50];
        String identificacion, nombre, sucursal;
        double compra1, compra2, compra3, promedio = 0;
        
        System.out.println("Digite el numero de estudiantes: ");
        numClientes = scn.nextInt();
        
        for(int i = 0; i < numClientes; i++){
            System.out.println("\nDigite la identificacion del cliente");
            identificacion = scn.next();
            System.out.println("Digite el nombre del cliente");
            nombre = scn.next();
            System.out.println("Digite la sucursal del cliente");
            sucursal = scn.next();
            System.out.println("Digite la compra uno del clientes");
            compra1 = scn.nextDouble();
            System.out.println("Digite la compra dos del clientes");
            compra2 = scn.nextDouble();
            System.out.println("Digite la compra tres del clientes");
            compra3 = scn.nextDouble();
            Cliente unCliente = new Cliente(identificacion, nombre, sucursal, compra1, compra2, compra3);
            losClientes[i] = unCliente;
        }
        for(int i = 0; i < numClientes; i++){
            promedio = promedio + losClientes[i].calcularPromedio() / numClientes;
        }
        System.out.println("\n El promedio de notas es: " + promedio); 
    }
}