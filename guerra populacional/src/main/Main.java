
package main;

public class Main {

    public static void main(String[] args) {
        int ano =0;
        double pol1 = 5000000, pol2 = 7000000;   
        while(pol1<pol2){  
            pol1 = pol1*1.03;
            pol2 = pol2*1.02;
            ano++;
        }
        System.out.println("levou "+ano+" anos para a população do país A ultrapassar a população do país B");
    }
    
}
