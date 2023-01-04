package Pilha;

import java.util.Random;
import Estruturas.*;

public class Questao4{
    public static void main(String[]args){
        //montar as 52 cartas do baralho (2 a 10, J, Q, K, A)
        String[] baralho = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A",
                                        "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A",
                                        "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A",
                                        "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A"};

            Stack<String> stack1 = new Stack<String>();
            Stack<String> stack2 = new Stack<String>();
            Stack<String> stack3 = new Stack<String>();

            Stack<String> stack4 = new Stack<String>(); //com as 52 cartas

            System.out.printf("Iniciando baralho: \n");
            for(int i = 0; i<52; i++){
                System.out.print(baralho[i] + ", ");
                if(i==51){
                    System.out.println("\n");
                }
            }

            Embaralha(stack1, baralho, 18);
            Embaralha(stack2, baralho, 17);
            Embaralha(stack3, baralho, 17);

            Merge(stack1, stack2, stack3, stack4);

            stack4.printList();//funcao em List.java, imprimindo a pilha
    }

    public static void Embaralha(Stack<String> s, String[] baralho, int tamanho){
        Random numero = new Random();

        int numRandom = numero.nextInt(52);

        for(int i = 0; i<tamanho; ){
            if(baralho[numRandom]!= "r"){//para nao ter posicoes repetidas
            s.push(baralho[numRandom]);
            baralho[numRandom] = "r";
            i++;
            }else{
                numRandom = numero.nextInt(52);
            }
        }
    }

    //juntar as 3 pilhas em uma usando MergeSort
    public static void Merge(Stack<String> s1, Stack<String> s2, Stack<String> s3, Stack<String> s4){
        Random numRandom = new Random();
        int sorteio; 

        while(s4.getSizeList() != 52){
            sorteio = numRandom.nextInt(3); //0 para pilha1; 1 para pilha2; 2 para pilha3

            switch (sorteio){
                case 0:
                    if(s1.getSizeList() != 0)    
                        s4.push(s1.pop());
                    else
                        sorteio = 1;
                    break;
                
                case 1:
                    if(s2.getSizeList() != 0)    
                        s4.push(s2.pop());
                    else
                        sorteio = 2;
                    break;

                case 2:
                    if(s3.getSizeList() != 0)    
                        s4.push(s3.pop());
                    else
                        sorteio = 0;
                    break;
                
                default:
                    System.out.println("Erro!!");
                    break;
            }
        }
    }
}
