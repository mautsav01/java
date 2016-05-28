/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package splash;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author USER
 */
class Splashscreen extends JFrame implements Runnable{
    
    JProgressBar jp=new JProgressBar(0,100);
    ImageIcon img=new ImageIcon(("D:\\pic\\others\\families.jpg"));
    Dimension dm=Toolkit.getDefaultToolkit().getScreenSize();
    @Override
    public void run() {
   setLayout(null);
        setVisible(true);
        setSize(1000, 600);
   
    
    //add(jp,Borderlayout.SOUTH);
    jp.setForeground(Color.red);
    JLabel jl=new JLabel(img);
 add(jl).setBackground(Color.GREEN);
 add(jl).setBounds(20, 0, 900, 700);
    add(jp).setBounds(20, 600, 1000, 30);
    jp.setSize(700, 50);
 //   add(jl).setBounds(0,0,700,400);
       }
}
