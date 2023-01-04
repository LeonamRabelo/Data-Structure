package Fila;

import Estruturas.*;
import java.util.Scanner;

public class Questao4{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o numero: ");
        int numero = input.nextInt();
        input.nextLine();
        System.out.println("\n");

        Queue<Integer> q = new Queue<Integer>();
        Queue<Integer> q2 = new Queue<Integer>();

        for(int i=2; numero!=1 ;){
            if(verificaPrimo(i) && ((numero%i) == 0)){
                numero = numero / i;
                q.enqueue(i);
            }else{
                i++;
            }
        }

        int tamaho1 = q.qSize();
        int tamanho2 = q.qSize();

        for(int i = 0; i < tamaho1; i++){
            for(int j = 0; j < tamaho1; j++){
                if(j == tamanho2 - 1){
                    q2.enqueue(q.qFront());
                    tamanho2--;
                }
                q.enqueue(q.dequeue());
            }
        }

        while(!q2.isEmpty()){
            System.out.printf(q2.dequeue() + "*");
        }
    }

    public static boolean verificaPrimo(int n){
        if(n == 2 || n == 3){  
            return true;
        }else if((n % 2) == 0){
            return false;
        }else{
            for(int i = 3; i < n; i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}