/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmajorprogram2;

/**
 *
 * @author saqua
 */
public class SpringMajorProgram2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MainGui g = new MainGui();//Calls the Gui
        g.setTitle("Course/Person Manager");
        g.setVisible(true);
       
       
        g.setLocationRelativeTo(null);
    }
    
}
