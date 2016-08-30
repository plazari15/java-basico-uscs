/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Plazari
 */
public class Veiculo {
    int Passageiros;
    int litrosTanque;
    int kmPorLitro; 
    
    void distancia(){
        System.out.println("Distancia de " + litrosTanque * kmPorLitro);
    }
}
