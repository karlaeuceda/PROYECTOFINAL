
package Clases;

public class Producto {
    
    private static String codigo;
    private static String nombre;
    
    public Producto(String codigo, String nombre)
    {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public Producto(){
        
    }
    public String getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
}
