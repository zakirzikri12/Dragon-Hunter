/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dragon_Hunter;

import java.awt.event.MouseEvent;
/**
 *
 * @author HP-FSZ
 */
public class Credits extends DynamicBackground{
    public double orbitX = -50; /* x-coordinate in orbit's center */
    public double orbitY = -50; /* y-coordinate in orbit's center */
    public double orbitRadius = 20;

    @Override
    public void update(){
        radian = orbitSpeed * t;
        drawX = orbitX + orbitRadius * Math.cos(radian);
        drawY = orbitY + orbitRadius * Math.sin(radian);
        t+=1;
    }

    void mousePress(MouseEvent e){
        int mx = e.getX();
        int my = e.getY();

        if(mx>20 && mx<170 && my>700 && my<740){
           SoundEffect.makeSound("data/Sound/chooseButton.wav");
           Begin.State = "menu";
       }
    }
}
