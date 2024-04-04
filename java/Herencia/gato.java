/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Estudiantes
 */
public class gato extends animal{
    private String marcaArena;

    public gato(String nombre, String raza, String color, String tamano, String marcaArena) {
        super(nombre, raza, color, tamano);
        this.marcaArena=marcaArena;
    }
    
    public void imprimeMarcaArena(){
        System.out.println("La marca de arena es: "+marcaArena);
    }
    
}
