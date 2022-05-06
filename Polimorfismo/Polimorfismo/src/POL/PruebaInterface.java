package POL;

import polimorfismo.*;

public class PruebaInterface {

    public static void main(String[] args) {
        // 
        PorPagar[] objetosPorPagar = new PorPagar[4];

        //Se llama como arreglo con objetod que implementan la interfaz : " POR PAGAR "
        objetosPorPagar[0] = new Factura("0123", "Silla", 2, 375.00);
        objetosPorPagar[1] = new Factura("01234", "Escriorio", 3, 79.55);

        objetosPorPagar[2] = new EmpleadoAsalariado("Luis", "Escobar", "1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Luisa", "Reyes", "2222", 1800.00);

        System.out.println("FACTURAS Y EMPLEADOS PROCESADOS EN FORMA POLIMORFICA: \n");
        //Se procesan de forma generica cada elemento del arreglo "OBJETOS POR PAGAR" 

        for (PorPagar porPagarActual : objetosPorPagar) {
            // Se imprime por pagar actual y su monto de pago objPorPagar
            System.out.printf("%s \n%s: $%,.2\n\n", porPagarActual.toString(), "Pago vencido", PorPagar.obtenerMontoPago());

        }
    }

}
