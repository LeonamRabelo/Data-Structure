package Ordenacao;
import java.util.Scanner;

public class Questao1MergeSort{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int escolha, qntdPessoas, cont=0;
        String nomes;
        
        System.out.printf("Quantas pessoas vao ser adicionadas? ");
        qntdPessoas = input.nextInt();
        input.nextLine();

        Pessoa[] p = new Pessoa[qntdPessoas];
        while(cont<qntdPessoas){
            System.out.printf("Digite o nome do aluno: ");
            nomes = input.nextLine();

            p[cont] = new Pessoa(nomes, cont+1, cont);
            cont++;
        }

        System.out.printf("Ordenar por:\n1-Nome 2-Matricula 3-Nota (0-Sair do programa)\n");
        escolha = input.nextInt();
        input.nextLine();
        while(escolha!=0){
        switch(escolha){
            case 1:
                MergeSort passa1 = new MergeSort();
                passa1.mergeSort(0, qntdPessoas, p, 1);
                for(int k=0; k<qntdPessoas; k++) {
                    System.out.println("Nome: " + p[k].getNome() + " | Matricula: " + p[k].getMatricula() + " | Nota: "+ p[k].getNota());
                  }
                System.exit(-1);

            case 2:
            MergeSort passa2 = new MergeSort();
            passa2.mergeSort(0, qntdPessoas, p, 2);
            for(int k=0; k<qntdPessoas; k++) {
                System.out.println("Nome: " + p[k].getNome() + " | Matricula: " + p[k].getMatricula() + " | Nota: "+ p[k].getNota());
              }
            System.exit(-1);

            case 3:
            MergeSort passa3 = new MergeSort();
            passa3.mergeSort(0, qntdPessoas, p, 3);
            for(int k=0; k<qntdPessoas; k++) {
                System.out.println("Nome: " + p[k].getNome() + " | Matricula: " + p[k].getMatricula() + " | Nota: "+ p[k].getNota());
              }
            System.exit(-1);

            default:
            System.out.println("Opcao invalida, digite outra");
            continue;
            
        }
        }

    }
      
}