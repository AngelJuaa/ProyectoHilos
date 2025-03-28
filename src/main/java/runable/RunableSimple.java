/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runable;

import java.util.logging.Level;
import java.util.logging.Logger;
import threads.ThreadSimple;

/**
 *
 * @author Angel
 */
public class RunableSimple implements Runnable{

    private String nombre;
    
    public RunableSimple(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    @Override
    public void run() {
        System.out.println("se inicia el metodo run del hilo: "+getNombre());
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep((long)(Math.random()*1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadSimple.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("hilo" +getNombre());
        }
        System.out.println("hilo finalizado.."+getNombre());
    }

    
}
