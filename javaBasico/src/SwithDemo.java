/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Plazari
 */
public class SwithDemo {

    public static void main(String args[]) {
        int i;
        for (i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                    System.out.println(i + "é zero");
                    break;

                case 1:
                    System.out.println(i + " é one");
                    break;

                case 2:
                    System.out.println(i + " é two");
                    break;

                case 3:
                    System.out.println(i + " é Three");
                    break;

                case 4:
                    System.out.println(i + " é Four");
                    break;

                default:
                    System.out.println(i + " é o maior valor de I");
                    break;
            }
        }
    }
}
