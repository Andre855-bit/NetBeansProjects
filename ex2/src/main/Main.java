
package main;

import java.util.Scanner;


public class Main {

  
    public static void main(String[] args) {
       int resposta, total = 0;
       Scanner grava = new Scanner(System.in);
       
       
       System.out.println(" Responda qual é o nome do primeiro mestre protagonista de \"Naruto\"?\n" +
"\n" +"1 - Sasuke\n" +"2 - Naruto\n" +"3 - Sakura\n" +"4 - Kakashi\n");
       resposta = grava.nextInt();
       if(resposta >= 1 && resposta <= 4){
           if(resposta == 4){
               System.out.println("\nVocê acertou!\n");
               total++;             
           }else{
               System.out.println("\nVocê errou!\n");
           }
       }else{
               System.out.println("\nVocê pulou essa pergunta!\n");
               total--;               
       }
       
       System.out.println(" Em \"Dragon Ball\", qual é o nome do planeta natal de Goku?\n" +
"\n" +"1 - Terra\n" +"2 -  Namekusei\n" +"3 - Vegeta\n" +"4 - Sadala\n");
       resposta = grava.nextInt();
       if(resposta >= 1 && resposta <= 4){
           if(resposta == 3){
               System.out.println("\nVocê acertou!\n");
               total++;             
           }else{
               System.out.println("\nVocê errou!\n");
           }
       }else{
               System.out.println("\nVocê pulou essa pergunta!\n");
               total--;               
       }
       
       System.out.println(" Qual é o nome da organização secreta em \"One Piece\" que é liderada por um grupo de piratas conhecido como \"crocodile\"?\n" +
"\n" +"1 - Akatsuki\n" +"2 - Gotei 13\n" +"3 - Espada\n" +"4 - Shichibukai\n");
       resposta = grava.nextInt();
       if(resposta >= 1 && resposta <= 4){
           if(resposta == 4){
               System.out.println("\nVocê acertou!\n");
               total++;             
           }else{
               System.out.println("\nVocê errou!\n");
           }
       }else{
               System.out.println("\nVocê pulou essa pergunta!\n");
               total--;               
       }
       
       System.out.println(" Em \"Attack on Titan\", qual é o nome da muralha que protege a cidade dos Titãs?\n" +
"\n" +"1 - Muralha Maria\n" +"2 -  Muralha Rose\n" +"3 - Muralha Sina\n" +"4 -  Todas as anteriores\n");
       resposta = grava.nextInt();
       if(resposta >= 1 && resposta <= 4){
           if(resposta == 4){
               System.out.println("\nVocê acertou!\n");
               total++;             
           }else{
               System.out.println("\nVocê errou!\n");
           }
       }else{
               System.out.println("\nVocê pulou essa pergunta!\n");
               total--;               
       }
       
       System.out.println("  Qual é o nome da escola onde os personagens de \"My Hero Academia\" estudam para se tornar heróis?\n" +
"\n" +"1 - Escola de Heróis U.A.\n" +"2 - Escola Shinigami\n" +"3 - Academia Konoha\n" +"4 - Escola da Aliança\n");
       resposta = grava.nextInt();
       if(resposta >= 1 && resposta <= 4){
           if(resposta == 1){
               System.out.println("\nVocê acertou!\n");
               total++;             
           }else{
               System.out.println("\nVocê errou!\n");
           }
       }else{
               System.out.println("\nVocê pulou essa pergunta!\n");
               total--;               
       }
       
       System.out.println(" Em \"Death Note\", quem é o proprietário do caderno que pode matar pessoas?\n" +
"\n" +"1 -Light Yagami\n" +"2 -  L\n" +"3 - Ryuk\n" +"4 -  Near\n");
       resposta = grava.nextInt();
       if(resposta >= 1 && resposta <= 4){
           if(resposta == 1){
               System.out.println("\nVocê acertou!\n");
               total++;             
           }else{
               System.out.println("\nVocê errou!\n");
           }
       }else{
               System.out.println("\nVocê pulou essa pergunta!\n");
               total--;               
       }
       System.out.println(" Em \"Sword Art Online\", qual é o nome do protagonista que fica preso em um jogo de realidade virtual?\n" +
"\n" +"1 - Kirito\n" +"2 -  Asuna\n" +"3 - Klein\n" +"4 -  Sinon\n");
       resposta = grava.nextInt();
       if(resposta >= 1 && resposta <= 4){
           if(resposta == 1){
               System.out.println("\nVocê acertou!\n");
               total++;             
           }else{
               System.out.println("\nVocê errou!\n");
           }
       }else{
               System.out.println("\nVocê pulou essa pergunta!\n");
               total--;               
       }
       System.out.println(" Em \"Fullmetal Alchemist\", o que os irmãos Elric estão tentando recuperar?\n" +
"\n" +"1 -A Pedra Filosofal\n" +"2 -  A Alma de sua Mãe\n" +"3 - Seus Corpos\n" +"4 -  O Livro dos Alquimistas\n");
       resposta = grava.nextInt();
       if(resposta >= 1 && resposta <= 4){
           if(resposta == 3){
               System.out.println("\nVocê acertou!\n");
               total++;             
           }else{
               System.out.println("\nVocê errou!\n");
           }
       }else{
               System.out.println("\nVocê pulou essa pergunta!\n");
               total--;               
       }
       System.out.println(" Qual é o nome do pequeno dragão em \"Dragon Ball\" que pode realizar desejos?\n" +
"\n" +"1 - Shenlong\n" +"2 -  Porunga\n" +"3 -Ryu\n" +"4 -  Kuririn\n");
       resposta = grava.nextInt();
       if(resposta >= 1 && resposta <= 4){
           if(resposta == 1){
               System.out.println("\nVocê acertou!\n");
               total++;             
           }else{
               System.out.println("\nVocê errou!\n");           }
       }else{
               System.out.println("\nVocê pulou essa pergunta!\n");
               total--;               
       }
        System.out.println("Na triológia clássica de \"Star Wars\", qual é o nome da nave que a tripulação usa?\n" +
"\n" +"1 -  Bebop\n" +"2 -   Millennium Falcon\n" +"3 -Redtail\n" +"4 -  Outlaw Star\n");
       resposta = grava.nextInt();
       if(resposta >= 1 && resposta <= 4){
           if(resposta == 2){
               System.out.println("\nVocê acertou!\n");
               total++;             
           }else{
               System.out.println("\nVocê errou!\n");
           }
       }else{
               System.out.println("\nVocê pulou essa pergunta!\n");
               total--;               
       }
       if(total <= 0){
           System.out.println("\nSua pontuação foi "+total + ", você nem tentou, não é mesmo?\n");
       }else if(total <= 3){
           System.out.println("\nSua pontuação foi "+total + " precisa estudar mais, não sabe sobre o assunto\n");
       }else if(total <= 6){
            System.out.println("\nSua pontuação foi "+total + ", pontuação boa mas precisa melhorar\n");
       }else if(total <= 9){
            System.out.println("\nSua pontuação foi "+total + ", quase gabaritou , parabéns\n");
       }else {
            System.out.println("\nSua pontuação foi "+total + ", Você tem dominio sobre o assunto");
       }
       
    }
    
}
