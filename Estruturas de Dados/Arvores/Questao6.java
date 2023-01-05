package Arvores;
import Estruturas.*;

public class Questao6{
    public static void main(String[] args){
        Tree<Integer> arvore = new Tree<Integer>();
        int valor;

        valor = 10;         //formando uma maxHeap, para retornar 1 e fazer teste
        arvore.insertTree(valor);

        valor = 8;
        arvore.insertL(valor);  //insere a esquerda

        valor = 7;
        arvore.insertR(valor);  //insere a direita

        System.out.println(arvore.isHeap());
    }
}