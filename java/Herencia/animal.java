
package Herencia;

public class animal {
    protected String nombre, raza, color, tamano;
    private String tipo;

    public animal(String nombre, String raza, String color, String tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.tamano = tamano;
        this.tipo = "TERRESTRE";
    }
    public void imprimeDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La raza es: "+raza);
        System.out.println("El color es: "+color);
        System.out.println("El tamaño es: "+ tamano);
        System.out.println("El tipo es: "+ tipo);
    }
}
