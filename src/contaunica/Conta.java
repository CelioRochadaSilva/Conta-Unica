/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contaunica;

/**
 *
 * @author Celio_pc
 */
public class Conta {

    private int numero; // atributos da conta
    private String titular; // vai receber this.pTitular
    private double saldo;
    static int qtdcontas = 0; // atributos compartilhado do todos objetos com seus valores
    
    // criação construtor
    public Conta (String pTitular){ // o p refere-se ao para rametro do construtor
        this.titular = pTitular; // atribuir paramentro titular ao pTitular
        qtdcontas++ ; // inclementação a quantida de contas
        this.numero = qtdcontas; // vai ser auto inclemental
        this.saldo = 0; // valor inicial
    }
   // local em que tdos dados bancarios vai ser a aprsentatados 
    public void DadosBancarios(){
       System.out.println(" ");
       System.out.println("-- Dados Bancario--");
       System.out.println("--Números--"+this.numero);
       System.out.println("--Titular--"+this.titular);
       System.out.println("--Saldo--"+this.saldo);
       System.out.println("--Fim dados bancario--" ); 
       System.out.println(" " );
    }
    public void Depositar(double pValor){
        System.out.println(" ");
        System.out.println("--Realizando deposito--");
        System.out.println("--Saldo anterior--"+ this.saldo);
       
        this.saldo += pValor; // this.saldo = this.saldo + pValor
        
        System.out.println("--Saldo posterior--"+ this.saldo);
        System.out.println("--Fim do deposito--");
        System.out.println(" ");
       
    }
    public void Sacar(double pValor){
        System.out.println(" ");
        System.out.println("--Realisando saqui--");
        System.out.println("--Saldo anterior--"+ this.saldo);
        // condição que verifica se valor para sacar  é maior que saldo se for verdade essa linha não eecutara 
        if(pValor <= this.saldo){
        this.saldo -= pValor; // caso tenha saldo
        System.out.println("Saldo posterior  R$" +this.saldo);
        } // caso eu não tenha saldo
        else {System.out.println("--Saldo insuficiente--"); // executara se saldo for menor 
        }
        
        System.out.println("--Fim do saque--");
        System.out.println(" ");
    } 
}
