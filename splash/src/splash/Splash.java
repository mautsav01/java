/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package splash;


public class Splash {
    Splashscreen sc = new Splashscreen();

    public Splash() {
        Thread thread = new Thread(sc);
        thread.start();
        int i = 0;
        while (i <= 100) {
            sc.jp.setValue(i);
            
            i++;
            try {
                Thread.sleep(100);
                    
            } catch (InterruptedException ex) {
                //Logger.getLogger(splash.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        try {
            Thread.sleep(1000);
            sc.dispose(); //Destroy your frame
            
            
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
        
    }

    public static void main(String args[]) {
        new Splash();
    }}


