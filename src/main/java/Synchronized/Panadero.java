/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Synchronized;

import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author angel
 */
public class Panadero implements Runnable {
    private final Panaderia panaderia;
    public Panadero(Panaderia panaderia){
        this.panaderia = panaderia;
    }
    
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            panaderia.hornear("Pan nº: " + i);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
