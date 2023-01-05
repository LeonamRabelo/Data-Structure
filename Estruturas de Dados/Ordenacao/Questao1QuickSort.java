package Ordenacao;
import java.util.Comparator;
import java.util.Scanner;

public class Questao1QuickSort{
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
            QuickSort<Pessoa> passa1 = new QuickSort<>();

            Comparator<Pessoa> comparadorNome = (pessoa1, pessoa2) -> pessoa1.getNome().compareTo(pessoa2.getNome());
            passa1.quickSort(p, comparadorNome);
                for(int k=0; k<qntdPessoas; k++){
                    System.out.println("Nome: " + p[k].getNome() + " | Matricula: " + p[k].getMatricula() + " | Nota: "+ p[k].getNota());
                  }
                System.exit(-1);

            case 2:
            QuickSort<Pessoa> passa2 = new QuickSort<>();
            Comparator<Pessoa> comparadorMatricula = (pessoa1, pessoa2) -> Float.compare(pessoa1.getMatricula(), pessoa2.getMatricula());
            passa2.quickSort(p, comparadorMatricula);//passa a comparaçao como parametro
            for(int k=0; k<qntdPessoas; k++){
                System.out.println("Nome: " + p[k].getNome() + " | Matricula: " + p[k].getMatricula() + " | Nota: "+ p[k].getNota());
            }

            System.exit(-1);

            case 3:
            QuickSort<Pessoa> passa3 = new QuickSort<>();
            Comparator<Pessoa> comparadorNota = (pessoa1, pessoa2) -> Float.compare(pessoa1.getMatricula(), pessoa2.getMatricula());
            passa3.quickSort(p, comparadorNota);
            for(int k=0; k<qntdPessoas; k++){
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