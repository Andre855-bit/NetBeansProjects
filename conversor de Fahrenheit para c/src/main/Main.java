
package main;

public class Main {

    public static void main(String[] args) { 
        double c = 0,far=50;   
        while(far<150){  
            c = (5*(far-32))/9;
            far++;
            System.out.println(c+"°");
        }
    }
    
}
