// POLIMORFISMO: 1. Asignar valor fijo 2. Tomar o cambiar valor 
//To String () valores de OBJETO 
package POL;
//import .*;
// se antepone abstract

public abstract class Empleado implements PorPagar {

    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;

    // se crea constructor para aplicar polimorfismo
    public Empleado(String nombre, String apellido, String nss) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
    }

    public void establecerPrimerNombre(String nombre) {
        primerNombre = nombre;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public void establecerApellidoPaterno(String apellido) {
        apellidoPaterno = apellido;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public void establecerNumeroSeguroSocial(String nss) {
        numeroSeguroSocial = nss;
    }

    public String obtenerNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    //se sobreescribe metodos y devuelve el valor del objeto Empleado
    @Override
    public String toString() {
        return String.format("%s%s\nnumero de seguro social:  %s", obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial());
    }

    // se crea un  metodo abstracto sobrescrito por la clase hija (subclase)
    public abstract double ingresos();// aqui no hay implementacion

}
