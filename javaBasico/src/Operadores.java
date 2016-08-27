/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Plazari
 */
public class Operadores {
  public static void  main(String args[]){
      double x, y;
      byte b;
      int i;
      char ch;
      x = 10.0;
      y= 3.0;
      
      i = (int) (x/y);
      System.out.println("inteiro de x/y é "+i);
      
      i=100;
      b = (byte) i;
      System.out.println("Value of B:"+b);
      
      i=257;
      b= (byte)i;
      System.out.println("Value of B:"+b);
      
      b=88;
      ch = (char) b;
      System.out.println("Value of CH:"+ch);
  }  
}
