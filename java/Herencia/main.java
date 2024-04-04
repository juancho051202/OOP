/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class main {
    private static String nombrep;
    private static String razap;
    private static String colorp;
    private static String tamanop;
    private static String nombreg;
    private static String razag;
    private static String colorg;
    private static String tamanog;
    private static String marcaCroquetas;
    private static String marcaArena;
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite el nombre del perro: ");
        nombrep = teclado.nextLine();
        System.out.println("Digite la raza del perro: ");
        razap = teclado.nextLine();
        System.out.println("Digite el color del perro: ");
        colorp = teclado.nextLine();
        System.out.println("Digite el tamaño del perro: ");
        tamanop = teclado.nextLine();
        System.out.println("Ingrese la marca de croquetas del perro: ");
        marcaCroquetas = teclado.nextLine();
        perro p = new perro (nombrep, razap, colorp, tamanop, marcaCroquetas);
        p.imprimeDatos();
        p.imprimeMarcaCroquetas();
        System.out.println("Digite el nombre del gato: ");
        nombreg = teclado.nextLine();
        System.out.println("Digite la raza del gato: ");
        razag = teclado.nextLine();
        System.out.println("Digite el color del gato: ");
        colorg = teclado.nextLine();
        System.out.println("Digite el tamaño del gato: ");
        tamanog = teclado.nextLine();
        System.out.println("Ingrese la marca de arena del gato: ");
        marcaCroquetas = teclado.nextLine();
        gato g = new gato (nombreg, razag, colorg, tamanog, marcaArena);
        g.imprimeDatos();
        g.imprimeMarcaArena();
    }
}
