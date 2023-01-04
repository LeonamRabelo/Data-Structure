package Pilha;

import Estruturas.*;
import java.util.Scanner;

public class Questao6{
    public static void main(String[]args){
        final int VAGAS = 10;
        String placaCarro;
        String EntradaSaida;
        String placaSaida;

        Stack<String> estacionamento = new Stack<String>();
        Stack<String> aux = new Stack<String>();

        Scanner input = new Scanner(System.in);

        while(estacionamento.getSizeList()<=VAGAS){
            int cont=0;
            System.out.printf("Digite E para entrada ou S para saída ('SAIR' para finalizar o programa): ");
            EntradaSaida = input.nextLine().toUpperCase(); //aceitar entradas e/s como verdade
            
            switch(EntradaSaida){
                case "E":
                if(estacionamento.getSizeList()<VAGAS){
                System.out.printf("Insira a placa do carro: ");
                placaCarro = input.nextLine();
                System.out.println("Carro entrando...\n");
                estacionamento.push(placaCarro);
                break;
                }else{
                    System.out.println("Estacionamento cheio, remova algum veiculo ou mete o pe...\n");
                    continue;
                }

                case "S":
                System.out.printf("Insira a placa do carro de saida: ");
                placaSaida = input.nextLine();

                while(estacionamento.stackTop().equals(placaSaida) != true){
                    aux.push(estacionamento.pop());
                    cont++;
                }
                estacionamento.pop();
                System.out.println("Quantidade de vezes ate sair: " + cont + "\n\n");
                while(cont != 0){
                    estacionamento.push(aux.pop());
                    cont--;
                }
                break;

                case "SAIR":
                System.out.println("Lista dos carros presentes no estacionamento: ");
                estacionamento.printList();
                System.out.println("\nAté mais!");
                System.exit(-1);
                
                default:
                System.out.println("Opção Invalida, digite E/S\n");
                continue;
            }
        }

    }
}