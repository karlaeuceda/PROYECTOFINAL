
package Clases;

public class Factura extends Producto{
    
    private static int numeroFactura;
    private static String fecha;
    private static Double precio;
    private static int cantidad;
    
    public Factura(String codigo, String nombre, int numeroFactura, String fecha, Double precio, int cantidad)
    {
        super(codigo, nombre);
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public Factura(){
        
    }
    
    public int getnumeroFactura(){
        return numeroFactura;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public Double getPrecio(){
        return precio;
    }
    
    public int getCantidad(){
        return cantidad;
    }
}
