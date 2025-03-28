/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.edu.itses.aaja.hilos;

import threads.ThreadSimple;

/**
 *
 * @author Angel
 */
public class Hilos {

    public static void main(String[] args) {
        Thread hilo = new ThreadSimple("Angel");
        Thread hilo2 = new ThreadSimple("Andres");
        hilo.start();
        hilo2.start();
        
        System.out.println(hilo.getState());
        System.out.println(hilo2.getState());
       
    }
}
