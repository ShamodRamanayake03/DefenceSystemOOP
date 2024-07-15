/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defensesystem;

/**
 *
 * @author Shamod
 */
interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(boolean isChecked);
    void notifyObservers(String message);
    void notifyObserverState(Strength state);
    void getMessage(String message);
}

