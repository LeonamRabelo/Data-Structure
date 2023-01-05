package Arvores;
import java.util.Scanner;

import Estruturas.*;

public class Questao3{
    public static void main(String[] args){
    Tree<Integer> arvore = new Tree<Integer>();
    Scanner input = new Scanner(System.in);
    int valor;
    String insere = "s";

        System.out.printf("Insira para iniciar sua arvore: ");
        valor = input.nextInt();
        input.nextLine();
        arvore.insertTree(valor);
        
        System.out.printf("\nDeseja inserir mais(s/n)? ");
        insere = input.nextLine();

            while(insere.toLowerCase().equals("s")){
                System.out.printf("Insira valor para a arvore: ");
                valor = input.nextInt();
                input.nextLine();
                arvore.insertTree(valor);

                System.out.printf("\nDeseja inserir mais(s/n)? ");
                insere = input.nextLine();
                
                    if(insere.toLowerCase().equals("n")){
                    System.out.printf("Sua arvore:\n");
                    arvore.printTreeAll();
                    System.out.println("Tamanho da arvore: " + arvore.heightTree());//funcao em Tree.java em Estruturas
                    }else if(!insere.toLowerCase().equals("s") && !insere.toLowerCase().equals("s")){
                    System.out.printf("\nDeseja inserir mais(s/n)? ");
                    insere = input.nextLine();
                    }
            }
    }
}