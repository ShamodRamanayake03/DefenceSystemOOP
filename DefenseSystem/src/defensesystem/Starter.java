/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defensesystem;

import java.util.ArrayList;

/**
 *
 * @author Shamod
 */
public class Starter {
    public static void main(String[] args) {
        ArrayList <SuperDefence> defenceUnits = new ArrayList<>();
        
        MainController maincontroller1 = new MainController();
        
        Helicopter helicopter = new Helicopter();
        Submarine submarine = new Submarine();
        Tank tank = new Tank();
       
        
        defenceUnits.add(helicopter);
        defenceUnits.add(tank);
        defenceUnits.add(submarine);
        
        maincontroller1.addObserver(helicopter);
        maincontroller1.addObserver(tank);
        maincontroller1.addObserver(submarine);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                helicopter.setVisible(true);
                submarine.setVisible(true);
                tank.setVisible(true);
            }
        });
    }
}