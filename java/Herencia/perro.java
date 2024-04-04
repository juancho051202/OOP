/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Estudiantes
 */
public class perro extends animal{
    private String marcaCroquetas;

    public perro(String nombre, String raza, String color, String tamano, String marcaCroquetas) {
        super(nombre, raza, color, tamano);
        this.marcaCroquetas=marcaCroquetas;
    }
    
    public void imprimeMarcaCroquetas(){
        System.out.println("La marca de croquetas es: "+marcaCroquetas);
    }
}
