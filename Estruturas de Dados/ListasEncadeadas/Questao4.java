package ListasEncadeadas;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

import Estruturas.*;

public class Questao4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random numRandom = new Random();
        Node<String> nome = new Node<String>();

        String recebeNome="";
        int tamanho = 0;
        ArrayList<String> recNome = new ArrayList();
        List<String> soldados = new List<>();

        int n = numRandom.nextInt(5)+1;
        System.out.println("\nEntre com n (> 0): " + n);    //numero sorteado para contagem a partir do soldado

        System.out.println("Nome dos Soldados (digite 0 para encerrar):");
        while(!(recebeNome.equals("0"))){
            recebeNome = input.nextLine();
            if(recebeNome.equals("0")){
              recebeNome = "0"; 
              break;
            }
            recNome.add(recebeNome);
            nome = new Node<String>(recebeNome);
            tamanho++;
        }

        for(int i=0; i<tamanho; i++){
            soldados.setRearList(recNome.get(i));
            
        }

        //int ordemElimina = numRandom.nextInt(tamanho);
        //
        System.out.println("---------------------------------");
        System.out.printf("Ordem de saida: ");
        //String ordemSaida = nome.get(ordemElimina);
        //soldados.setTail(soldados.swapFirst(soldados.getTail(), ordemSaida));

        //aqui vou fazer a ordem de eliminacao

              //  System.out.printf(soldados.removeInPosition(n-1) + ", ");
    
           // }
            //Node<> nomeSoldado = nome.get(ordemElimina+(n-1));
            //soldados.findNode(soldados, nomeSoldado);
            //soldados.removeItem(nomeSoldado);

        //System.out.println(ordemSaida);
        soldados.printList();
        //aqui depois eu chamo a funcao de remover atraves do nome
        //aqui eu dou um printList(), ja que vai sobrar so um nome, sera o sorteado

    }
}
