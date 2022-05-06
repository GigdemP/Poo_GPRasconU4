package polimorfismo;

import POL.*;

public class Polimorfismo {

    public static void main(String[] args) {
        System.out.println("Se procesan empleados por separado (sin polimorfismo)");
        EmpleadoAsalariado ea = new EmpleadoAsalariado("Daira", "Rodriguez", "111", 800.00);
        EmpleadoBaseMasComision ebyc = new EmpleadoBaseMasComision("Jorge", "Rios", "222", 5000, .04, 300);
        EmpleadoPorComision ec = new EmpleadoPorComision("Laura", "Estrada", "333", 1000, 0.6);
        EmpleadoPorHoras eh = new EmpleadoPorHoras("Daniel", "Jaquez", "444", 16.75, 40);

        System.out.printf("%s \n%s: $%,.2f\n\n", ea, "Ingresos", ea.ingresos());
        System.out.printf("%s \n%s: $%,.2f\n\n", ebyc, "Ingresos", ebyc.ingresos());
        System.out.printf("%s \n%s: $%,.2f\n\n", ec, "Ingresos", ec.ingresos());
        System.out.printf("%s \n%s: $%,.2f\n\n", eh, "Ingresos", eh.ingresos());

        //Se crea un arreglo tamaño 4
        Empleado[] empleados = new Empleado[4];
        empleados[0] = ea;
        empleados[1] = ebyc;
        empleados[2] = ec;
        empleados[3] = eh;

        for (Empleado empleadoActual : empleados) {
            //Se invoca el metodo toString (Nos ayuda a obtener los valores del objeto) 
            System.out.println(empleadoActual);
            if (empleadoActual instanceof EmpleadoBaseMasComision) {
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
                empleado.establecerSalarioBase(1.10 * empleado.obtenerSalarioBase());
                System.out.printf("El nuevo salario Base con 10%% de incremento es: $%,.2f\n", empleado.obtenerSalarioBase());

            }

            System.out.printf("Ingresos $%,.2f\n\n", empleadoActual.ingresos());

            //Se crea un for para obener el nombre del tipo de cada objeto en el arreglo empleado             
            for (int i = 0; i < empleados.length; i++) {
                System.out.printf("El empleado %d es un %s\n", i, empleados[i].getClass().getName());
            }
        }
    }
}
