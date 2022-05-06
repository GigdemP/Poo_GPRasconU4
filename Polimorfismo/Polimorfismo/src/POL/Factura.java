// para acomodar el codigo ALT + SHIFT + F 
//Se crea JavaClass Factura para hacer uso de interfaces 
package POL;
import POL.*;
public class Factura implements PorPagar{

    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    //Se crea constructor ASIGNACION ()
    public Factura(String pieza, String descripcion, int cuenta, double precio) {
        numeroPieza = pieza;
        descripcionPieza = descripcion;

        //Se llaman metodos
        establecerCantidad(cuenta);
        establecerPrecioPorArticulo(precio);

    }

    //Se desarrollan metodos get/set para el resto de las varialbes 
    public void establecerNumeroPieza(String pieza) {
        numeroPieza = pieza;
    }

    public String obtenerNumeroDePieza() {
        return numeroPieza;
    }

    public void establecerDescripcionPieza(String descripcion) {
        descripcionPieza = descripcion;
    }

    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }

    public void establecerCantidad(int cuenta) {
        if (cuenta >= 0) {
            cantidad = cuenta;
        } else {
            throw new IllegalArgumentException("LA CANTIDAD DEBE SER MAYOR O IGUAL A CERO");
        }
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    public void establecerPrecioPorArticulo(double precio) {
        if (precio >= 0.0) {
            precioPorArticulo = precio;
        } else {
            throw new IllegalArgumentException("EL PRECIO POR ARTICULO DEBE SER MAYOR O IGUAL A 0");
        }
    }

    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    @Override
    public String toString() {
        return String.format("%s \n%s: $%,.2f\n\n", "Factura", "Numero de Pieza", obtenerDescripcionPieza(), "Cantidad", obtenerCantidad(), "Precio por Articulo", obtenerPrecioPorArticulo());
    }

  
    @Override
    public double obtenerMontoPago() {
        //Se calcula en costo total
        return obtenerCantidad() * obtenerPrecioPorArticulo();
    }
    
    
}
