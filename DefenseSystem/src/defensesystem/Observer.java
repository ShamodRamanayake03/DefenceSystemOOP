/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defensesystem;

/**
 *
 * @author Shamod
 */
interface Observer {
    void update(boolean isChecked);
    void updateMsg(String message);
    //void updateMsgToMain(String message);
}
