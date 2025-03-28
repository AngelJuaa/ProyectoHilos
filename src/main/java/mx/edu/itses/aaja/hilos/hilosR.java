/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.aaja.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import runable.RunableSimple;
import threads.ThreadSimple;

/**
 *
 * @author Angel
 */
public class hilosR {
    public static void main(String[] args) throws InterruptedException {
        Thread main = Thread.currentThread();
        Runnable hilo =() ->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i +" " + Thread.currentThread().getName());
            }try{
                Thread.sleep((long)(Math.random *100));
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println("");
   
                
            
        };             
                
                
        Thread.currentThread().getState();
        System.out.println(Thread.currentThread().getName());
        Thread hilo1 =  new Thread(hilo,"Carrera de Caballos 1");
        Thread hilo2 =  new Thread(hilo,"Carrera de Caballos 1");
        Thread hilo3 =  new Thread(hilo,"Carrera de Caballos 1");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        hilo1.join();
        hilo2.join();
        hilo3.join();
        Thread.sleep(1000);
        System.out.println("continuando "+Thread.currentThread());
        /*
        new Thread(hilo,"Carrera de Caballos 2").start();
        new Thread(hilo,"Carrera de Caballos 3").start();
        
        new Thread(new RunableSimple("Carrera de Caballos 2")).start();
        new Thread(new RunableSimple("Carrera de Caballos 3")).start();
*/
    }
}
