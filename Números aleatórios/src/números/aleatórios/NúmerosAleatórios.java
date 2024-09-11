
package números.aleatórios;

import java.util.Random;

public class NúmerosAleatórios {

    public static void main(String[] args) {
        Random gera = new Random();
        for(int i = 0; i < 20; i++){
            int valor =  gera.nextInt(999)+1000;
            if(valor % 11 == 5){
                System.out.println(valor);
            }
        }
    }
    
}
