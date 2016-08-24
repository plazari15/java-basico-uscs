/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Plazari
 */
public class ScopeDemo {
    public static void main (String args[]){
        int x;
        int y;
        
        x=10;
        if(x==10){
            y = 20;
            
            System.out.println("x e y: "+x +" "+y);
            x = y*2;
        }
         y = 100;
        
        System.out.println("x é " + x);
    }
}
