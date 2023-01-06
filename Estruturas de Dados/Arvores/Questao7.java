package Arvores;
import java.util.Arrays;
import java.util.Scanner;

public class Questao7{
    static void heapfy(int[] vetor, int tamanho, int tipo){
        int i = 0;
        if(tipo == 1){//minHeap
            int menor = i;
            int esquerda = 2 * i + 1; //filho esquerda, i posicao
            int direita = 2 * i + 2;    //filho direita, i posicao
     
            if (esquerda < tamanho && vetor[esquerda] < vetor[menor])
                menor = esquerda;
    
            if (direita < tamanho && vetor[direita] < vetor[menor])
                menor = direita;
     
            if (menor != i) {
                int aux = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = aux;
            }
            System.out.println(Arrays.toString(vetor));

        }else if(tipo==2){//maxHeap
            int esquerda = 2 * i + 1;
            int direita = 2 * i + 2;
            int maior = i;
    
            if (esquerda < tamanho && vetor[esquerda] > vetor[maior])
                maior = esquerda;
    
            if (direita < tamanho && vetor[direita] > vetor[maior])
                maior = direita;
     
            if (maior != i) {
                int aux = vetor[i];
                vetor[i] = vetor[maior];
                vetor[maior] = aux;
            }
            System.out.println(Arrays.toString(vetor));
        }else{
            System.out.println("Tipo errado..."); 
            }

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetorToHeap  = {7, 9, 0, 4, 2};

        System.out.printf("Digite |1-MinHeap| |2-MaxHeap|: ");
        int tipo = input.nextInt();    
        input.nextLine();
        input.close();
        heapfy(vetorToHeap, vetorToHeap.length, tipo);
    }
}