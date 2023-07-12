package implementaciones;
import clases.Cliente;
import clases.Producto;
import clases.Venta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        //Variables
        Scanner lector=new Scanner(System.in);
        int opcion;
        List<Cliente> clientes=new ArrayList();
        List<Producto> productos=new ArrayList();
        List<Venta> ventas=new ArrayList();

        //Opciones de menú
        do{
            System.out.println("Opciones \n 1. Registrar Cliente. \n 2. Registrar Producto. \n 3. Registrar Venta.");
            System.out.println(" 4. Listar Clientes. \n 5. Listar productos. \n 6. Listar ventas. \n 7. Salir.");
            System.out.println("Ingrese una opción: ");
            opcion=lector.nextInt();
            lector.nextLine();
            switch(opcion){
                case 1:
                    Cliente cliente = new Cliente();
                    System.out.println("Código del cliente: ");
                    cliente.setId(lector.nextInt());
                    lector.nextLine();
                    System.out.println("Nombre del cliente: ");
                    cliente.setNombre(lector.nextLine());
                    System.out.println("DNI del cliente: ");
                    cliente.setDni(lector.nextLine());
                    clientes.add(cliente);
                    break;
                case 2:
                    Producto producto=new Producto();
                    System.out.println("Código del producto: ");
                    producto.setId(lector.nextInt());
                    lector.nextLine();
                    System.out.println("Nombre del producto: ");
                    producto.setNombre(lector.nextLine());
                    System.out.println("Ingrese el precio de compra: ");
                    producto.setPrecioCompra(lector.nextDouble());
                    lector.nextLine();
                    System.out.println("Ingrese el precio de venta: ");
                    producto.setPrecioVenta(lector.nextDouble());
                    lector.nextLine();
                    break;
                case 4:
                    for (Cliente cli: clientes) {
                        System.out.println("ID: "+cli.getId()+ " - Nombre: "+cli.getNombre() + " - DNI: "+cli.getDni());
                        System.out.println("----------------------------------------------------");
                    }
                    System.out.println("###################################################");
                    break;
                case 5:
                    for (Producto pro: productos) {
                        System.out.println("ID: "+pro.getId()+ " - Nombre: "+pro.getNombre() + " - Precio Venta: "+pro.getPrecioVenta());
                        System.out.println("----------------------------------------------------");
                    }
                    System.out.println("###################################################");
                    break;
            }




        }while(opcion!=7);
    }
}
