package Arvores;
import java.util.Scanner;

import Estruturas.*;

public class Questao3{
    public static void main(String[] args){
    Tree<Integer> arvore = new Tree<Integer>();
    Scanner input = new Scanner(System.in);
    int valor;
    String insere = "s";
    String decide="s";

        do{
            if(decide.toLowerCase().equals("s")){
            System.out.printf("\nDeseja inserir em sua arvore(s/n)? ");
            insere = input.nextLine();
            }
            if(insere.toLowerCase().equals("s")){
            System.out.printf("Insira um valor para sua arvore: ");
            valor = input.nextInt();
            input.nextLine();
            arvore.insertTree(valor);
            decide = "s";
            }
            if(insere.toLowerCase().equals("n")){
                System.out.printf("Sua arvore:\n");
                arvore.printTreeAll();
                System.out.println("Tamanho da arvore: " + arvore.heightTree());//funcao em Tree.java em Estruturas
            }
            if(!insere.toLowerCase().equals("s") && !insere.toLowerCase().equals("n")){
                decide = "s";
                insere = "s";
            }
        }while(insere.toLowerCase().equals("s"));
    }
}