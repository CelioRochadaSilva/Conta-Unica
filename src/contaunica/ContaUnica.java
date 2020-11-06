/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contaunica;

import java.util.Scanner;

/**
 *
 * @author Celio_pc
 */
public class ContaUnica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in); // entrada de dados
        String aux;
        int opcao; // cri~ção de variavel opção
        double valor; 
         
        System.out.println("Digite o titula da conta");
        aux = in.nextLine();
        Conta c1 = new Conta(aux);
        
                
        do{
            System.out.println(" ");
            System.out.println(" --------- MENU --------- ");
            System.out.println("1) DADOS BANCARIOS ");
            System.out.println("2) DEPOSITO ");
            System.out.println("3) SAQUE ");
            System.out.println("0) SAIR ");
            
            System.out.print(" OPÇÃO ");
            opcao = in.nextInt();
            
            if(opcao == 1){
                c1.DadosBancarios();
                
            }else if(opcao == 2){
                System.out.println("Digite o valor do deposito");
                valor = in.nextDouble(); // vai receber o valor digitado
                c1.Depositar(valor);
            }else if(opcao == 3){
                System.out.println("Digite o valor do saque");
                valor = in.nextDouble(); // vai receber o valor digitado
                c1.Sacar(valor);
            }
            else if(opcao!= 0 ){
                System.out.println("Escolha uma opção válida !");
            }  
            System.out.println(" ");
        }while(opcao != 0);
        
    }
    }
    

