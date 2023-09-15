/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroaleatorio;

/**
 *
 * @author caio
 */
public class NumeroAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double aleatorio = Math.random();
        int n = (int)(50 + aleatorio * (100 - 50)); //numeros entre 50 e 100
                                                    //numero entre 0 e 100 poderia usar aletorio * 100
        System.out.println(n);
        
        
                }
    
}
