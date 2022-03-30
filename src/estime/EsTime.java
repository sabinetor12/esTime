/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estime;

/**
 *
 * @author Lenovo
 */
public class EsTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Time t = new Time(362,314,244);
        t.addSecondi(360);
        System.out.println(t);
    }
    
}
