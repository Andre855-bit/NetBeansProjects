
package main;

public class Main {

    public static void main(String[] args) {
        int ano =0;
        double joao = 1.5, maria = 1.1;   
        while(maria<joao){  
            maria += 0.03;
            joao += 0.02;
            ano++;
        }
        System.out.println("levou "+ano+" Para Maria passar joão em tamanho! Ela ficou com "+maria);
    }
    
}
