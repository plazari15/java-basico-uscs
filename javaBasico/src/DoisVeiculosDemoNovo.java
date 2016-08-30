/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Plazari
 */
public class DoisVeiculosDemoNovo {
    
    public static void main(String args[]) {
        veiculo minivan = new veiculo ();
        veiculo sportcar = new veiculo ();
        int distancia, distancia2;
        
        minivan.Passageiros = 7;
        minivan.litrosTanque = 16;
        minivan.kmPorLitro = 21;
        
        sportcar.Passageiros = 2;
        sportcar.litrosTanque = 14;
        sportcar.kmPorLitro = 12;
        
        
        
        System.out.println("Minivan pode levar " + minivan.Passageiros + " pessoas. A uma distancia de " );
        minivan.distancia();
        
        System.out.println("Sportcar pode levar " + sportcar.Passageiros + " pessoas. A uma distancia de ");
        sportcar.distancia();
    }
    
}
