/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
       System.out.println("Informe o numero : ");
       int numero = sc.nextInt(); 
       
       String bin = Integer.toString(numero, 2);
       
       System.out.println("Seu numero em binario é : " + bin);
    }
    
}