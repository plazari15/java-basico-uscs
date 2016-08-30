/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Plazari
 */
public class VeiculoDemo {
    public static void main(String args[]) {
        veiculo minivan = new veiculo();
        int distancia;
        
        minivan.Passageiros = 7;
        minivan.litrosTanque = 16;
        minivan.kmPorLitro = 21;
        
        distancia = minivan.litrosTanque * minivan.kmPorLitro;
        
        System.out.println("Minivan pode levar " + minivan.Passageiros + "pessoas. A uma distancia de " + distancia);  
    }
}
