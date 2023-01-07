/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1fuia8_razas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author novel
 */
//
//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.
public class Ej1Fuia8_razas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList<>();
        String razita;
        String respuesta = "";
        do {
            System.out.println("Ingrese una raza de perro: ");
            razita = leer.next();
            razas.add(razita);
            System.out.println("Quiere seguir ingresando razas? Si/No");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("Si"));

        for (String raz : razas) {
            System.out.print("[ " + raz + " ]");
        }

        System.out.println("Ingrese un la raza de un perro que quiera encontrar: ");
        String findRaza = leer.next();

//    System.out.println("===================================");
//        System.out.println("Recorremos la lista con un iterator");
//        Iterator<String> it = razas.iterator();
//
//        while (it.hasNext()) {
//
//            System.out.println(it.next());
//
//        }
//         System.out.println("===================================");
//        System.out.println("Usamos el iterator para remover un elemento porque con el for each falla");
        Iterator<String> it2 = razas.iterator();

        while (it2.hasNext()) {

            if (it2.next().equals(findRaza)) { // Borramos si hay se encuentra la raza

                it2.remove();

                for (String raf : razas) {
//                    System.out.println("Se encontro el perro");
                    System.out.print("[ " + raf + " ]");
                }
            } else  {
                System.out.println("No se encontro la raza");
                for (String raza : razas) {
//                    
                    System.out.print("[ " + raza + " ]");
                }
            }

        }

    }
}

//    Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.

