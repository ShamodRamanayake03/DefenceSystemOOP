/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defensesystem;

/**
 *
 * @author lunat
 */

import javax.swing.JFrame;

/**
 *
 * @author lunat
 */
abstract class SuperDefence extends JFrame {
    protected int soldierCount;
    protected int ammoCount;
    protected String message;


    public abstract void shoot();

    public String getMessage(String message) {
        this.message = message;
        return message;
    }
    
  
}