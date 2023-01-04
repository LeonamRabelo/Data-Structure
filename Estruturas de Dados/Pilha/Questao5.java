package Pilha;

import Estruturas.*;
import java.util.Scanner;

public class Questao5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a expressão: ");
        String expressao = input.nextLine();

        //String expressao = "{2 + [(16 + 2 ∧ 3) - 4)} * 3"; //para teste caso necessario
        Stack<Character> s = new Stack<Character>();
        
        for(int i = 0; i < expressao.length(); i++){
            Character var = expressao.charAt(i);

            if(var == '{' || var == '[' || var == '('){
                s.push(var);
            }else if(var == '}' || var == ']' || var == ')'){
                if(var == '}'){
                    var = '{';
                }else if(var == ']'){
                    var = '[';
                }else if(var == ')'){
                    var = '(';
                }

                if(s.isEmpty()){
                    System.out.printf("Expressao Invalida\n\n");
                    System.exit(-1);
                }else if(var.compareTo(s.stackTop()) == 0){
                    s.pop();
                }else{
                    System.out.printf("Expressao Invalida\n\n");
                    System.exit(-1);
                }
            }
        }

        if(s.isEmpty()){
            System.out.printf("Expressao Valida\n\n");
        }else{
            System.out.printf("Expressao Invalida\n\n");
        }
    }
}
