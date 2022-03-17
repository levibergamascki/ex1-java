/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Java1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        //o programa receber um numero inteiro
   
        System.out.print("Escreva um número: ");
        Scanner numero = new Scanner(System.in);
        int n;
        n = numero.nextInt();
        int s;
        s = 0;
        int s1;
        s1 = s++;
        int res= 0;
        while(s <= n){
            res += s;
            s++;
            
    
            
        
        }
        
        //retornar a soma dos valores anteriores
        System.out.println(res);
        
    }
    
}
