package clases;

import java.util.ArrayList;
import java.util.List;
public class Venta {
    private int id;
    private String numero;
    private String fecha;
    private Cliente cliente;
    private List<Producto> detalles;

    public Venta() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setNumero(String numero){
        this.numero=numero;
    }
    public String getNumero(){
        return this.numero;
    }
    public List<Producto> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Producto> detalles) {
        this.detalles = detalles;
    }
    public void imprimir(){
        System.out.println("Venta # "+this.numero);
        System.out.println("Cliente: "+cliente.getNombre());
        System.out.println("####PRODUCTOS####");
        for (Producto prod: detalles) {
            System.out.println(prod.getNombre() + " " + prod.getPrecioVenta());
        }
    }
}
